package com.gts.expersoft.repositories;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.gts.expersoft.models.Login;
import com.gts.expersoft.models.Menus;
import com.gts.expersoft.models.Utilisateur;
import com.gts.expersoft.sql.mappers.LoginRowMapper;
import com.gts.expersoft.sql.mappers.MenuRowMapper;
import com.gts.expersoft.sql.mappers.UtilisateurRowMapper;
import com.gts.expersoft.utils.DateFormatPatterns;
import com.gts.expersoft.utils.FormattingUtilitiy;
import com.gts.expersoft.utils.SQLQueryConstants;
import com.gts.expersoft.utils.XPLogger;


@Repository
public class UserRepositoryImpl implements UserRepository{
	private static final Class<UserRepositoryImpl> CLASSNAME = UserRepositoryImpl.class;

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public long getProfileId(long uid){
		long id = 0l;
		try{
			id = getJdbcTemplate().queryForObject(
					SQLQueryConstants.GET_PROFILE_ID, new Object[] {uid}, Long.class);
		}catch(Exception e){
			XPLogger.error(CLASSNAME,"getProfileId",e);
			return id;
		}
	
		return id;	
	}

	public Utilisateur getUserInfo(String username, String password) {
		Utilisateur u = null;
		try{
			u = getJdbcTemplate().queryForObject(
					SQLQueryConstants.GET_USER_ID, new Object[] {username,password}, 
					new UtilisateurRowMapper());
			
			if(u != null){
				Login l = getJdbcTemplate().queryForObject(SQLQueryConstants.GET_LAST_LOGIN, 
						new Object[]{u.getId()}, new LoginRowMapper());
				
				if(l != null){
					
					List<Login> list = new ArrayList<Login>();
					list.add(l);
					u.setLogins(list);
				}
			}
		}catch(Exception e){
			XPLogger.error(CLASSNAME,"getUserInfo",e);
			return u;
		}
	
		return u;	
	}

	public void registerLogin(long uid) {
		int flag = 0;
		try{
			flag = getJdbcTemplate().update(
				    SQLQueryConstants.REGISTER_LOGIN,
				    FormattingUtilitiy.longFormattedDate(new Date().getTime(), DateFormatPatterns.PATTERN_3), uid);
			//LOGGER.debug(String.valueOf(flag));
		}catch(Exception e){
			//System.err.println(e.getMessage());
			XPLogger.error(CLASSNAME,"registerLogin",e);
		}	
	}
	
	public List<Menus> getMenus(long pid) {
		
		List<Menus> list = new ArrayList<Menus>();
		List<Menus> sousMenus = new ArrayList<Menus>();
		List<Menus> sousMenus2 = new ArrayList<Menus>();
		
		List<Menus> all = new ArrayList<Menus>();

		try{
			list = getJdbcTemplate().query(SQLQueryConstants.GET_MENU_LIST, 
					new Object[]{pid}, new MenuRowMapper());
			
			if(list != null && list.size() > 0){
				all.addAll(0,list);
				for(Menus m : list){
					sousMenus = getJdbcTemplate().query(SQLQueryConstants.GET_SOUSMENU_LIST, 
							new Object[]{pid, m.getId(),1}, new MenuRowMapper());
					
					if(sousMenus != null && sousMenus.size() > 0){
						m.setSubmenus(sousMenus);
						//all.addAll(all.size(), sousMenus);
						
						for(Menus m2 : sousMenus){
							sousMenus2 = getJdbcTemplate().query(SQLQueryConstants.GET_SOUSMENU_LIST, 
									new Object[]{pid, m2.getId(),2}, new MenuRowMapper());
							
							if(sousMenus2 != null && sousMenus2.size() > 0){
								//all.addAll(all.size(), sousMenus2);
								m2.setSubmenus(sousMenus2);
							}
						}
					}
					
				}
			}

		}catch(Exception e){
			XPLogger.error(CLASSNAME,"getMenus",e);
		}
		
		return all;
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public static void main(String[] args){
		AbstractApplicationContext appContext =
		    	  new FileSystemXmlApplicationContext("src/main/webapp/WEB-INF/spring-config.xml");
      UserRepositoryImpl uri = (UserRepositoryImpl) appContext.getBean("userRepository");
      
      //System.out.println(uri.getUserInfo("okaoui","123").toString());
      
      //uri.registerLogin(1);
      
      List<Menus> list = uri.getMenus(12);
      System.out.println(list.size());
      for(Menus m : list){
    	  System.out.println(m.toString());
    	 // System.out.println(m.getSubmenus().size());
      }
      
      //System.out.println(uri.getUserInfo("admin", "123").getLogins().get(0).getLoginDate());
      
      appContext.close();
      
	}

}
