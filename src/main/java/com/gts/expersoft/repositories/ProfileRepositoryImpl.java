package com.gts.expersoft.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;

import com.gts.expersoft.models.Menus;
import com.gts.expersoft.models.Profile;
import com.gts.expersoft.sql.mappers.ProfileRowMapper;
import com.gts.expersoft.utils.SQLQueryConstants;

public class ProfileRepositoryImpl implements ProfileRepository {

	private static Logger LOGGER = LoggerFactory.getLogger(UserRepositoryImpl.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private UserRepository userRepository;
	
	public long getMaxProfileId() {
		long id = 0l;
		try{
			id = getJdbcTemplate().queryForObject(
					SQLQueryConstants.GET_MAX_PROFILE_ID, Long.class);
		}catch(EmptyResultDataAccessException e){
			return id;
		}
	
		return id;	
	}
	
	public List<Profile> list() {

		List<Profile> list = new ArrayList<Profile>();

		
		try{
			list = getJdbcTemplate().query(SQLQueryConstants.GET_PROFILE_LIST, new ProfileRowMapper());

		}catch(Exception e){
			LOGGER.debug(e.getMessage());
		}
		return list;
	}


	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public UserRepository getUserRepository() {
		return userRepository;
	}

	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public void create(int[] menuIds, final String nom) {
		GeneratedKeyHolder holder = new GeneratedKeyHolder();
		jdbcTemplate.update(new PreparedStatementCreator() {
			
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				PreparedStatement statement = con.prepareStatement(SQLQueryConstants.INSERT_NEW_PROFILE, 
						java.sql.Statement.RETURN_GENERATED_KEYS);
		        statement.setString(1, "");
		        statement.setString(2, nom);
		        return statement;
			}
		}, holder);

		long primaryKey = holder.getKey().longValue();
		
		for(int i = 0; i < menuIds.length; i++){
			jdbcTemplate.update(
				    SQLQueryConstants.INSERT_PROFILE_MENU,
				    primaryKey, menuIds[i]);
		}
	}

	public Profile get(int pid) {
		List<Menus> list = userRepository.getMenus(6);
		List<Menus> mList = userRepository.getMenus(pid);
		
		for(Menus m : list){
			List<Menus> submenus11 = m.getSubmenus();
			for(Menus m2 : mList){
				List<Menus> submenus1 = m2.getSubmenus();
				if(m.getId() == m2.getId()){
					m.setChecked(true);
				}
				if(submenus11 != null && submenus11.size() > 0 && submenus1 != null){
					for(Menus m3 : submenus11){
						List<Menus> submenus22 = m3.getSubmenus();
						for(Menus m4 : submenus1){
							List<Menus> submenus2 = m4.getSubmenus();
							if(m3.getId() == m4.getId()){
								m3.setChecked(true);
							}
							
							if(submenus22 != null && submenus22.size() > 0 && submenus2 != null){
								for(Menus m5 : submenus22){
									for(Menus m6 : submenus2){
										if(m5.getId() == m6.getId()){
											m5.setChecked(true);
										}
									}
								}
							}
						}
						
					}
				}
				
			}
		}
		
		Profile p = new Profile();
		String pName = (String) jdbcTemplate.queryForObject(
	            SQLQueryConstants.GET_PROFILE_NAME, new Object[] { pid }, String.class);

		p.setNom(pName);
		p.setId(pid);
		p.setMenuses(list);
		
		return p;
	}

	
	public static void main(String[] args){
		AbstractApplicationContext appContext =
		    	  new FileSystemXmlApplicationContext("src/main/webapp/WEB-INF/spring-config.xml");
      ProfileRepositoryImpl pri = (ProfileRepositoryImpl) appContext.getBean("profileRepository");
      UserRepositoryImpl uri = (UserRepositoryImpl) appContext.getBean("userRepository");

      pri.setUserRepository(uri);
      
      //System.out.println(pri.getMaxProfileId());
      
      //uri.registerLogin(1);
      
     
      List<Menus> list = pri.get(4).getMenuses();
      for(Menus m : list){
    	  System.out.println(m.toString());
      }
      //System.out.println(uri.getUserInfo("admin", "123").getLogins().get(0).getLoginDate());
      
      appContext.close();
      
	}



	


}
