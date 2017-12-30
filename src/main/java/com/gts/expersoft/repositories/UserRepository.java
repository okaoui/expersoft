package com.gts.expersoft.repositories;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.gts.expersoft.models.User;
import com.gts.expersoft.utils.ApplicationConstants;
import com.gts.expersoft.utils.SQLQueryConstants;


@Repository
public class UserRepository{
	private static Logger LOGGER = LoggerFactory.getLogger(UserRepository.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public User findByUsername(String username){
		User user = null;
		try{
			user = (User)getJdbcTemplate().queryForObject(
					SQLQueryConstants.FIND_USER_BY_USERNAME_AND_PASSWORD_QUERY, 
					new Object[] { username}, new UserRowMapper());
		}catch(Exception e){
			LOGGER.error("Failed to save user!", e);
			//e.printStackTrace();
		}
		

		return user;
		
	}
	
	public User findByFullName(String firstname, String lastname){
		User user = null;
		
		try{
			user = (User)getJdbcTemplate().queryForObject(
					SQLQueryConstants.FIND_USER_BY_FULLNAME, 
					new Object[] { firstname.toLowerCase(),lastname.toLowerCase() }, new UserRowMapper());
		}catch(Exception e){
			if(e instanceof IncorrectResultSizeDataAccessException){
				LOGGER.info("User "+firstname+" "+lastname+" not found in database.");
			}else{
				LOGGER.error("Exception in findByFullName! ", e);
				//e.printStackTrace();
			}
			
		}
		
		return user;
	}
	
	public boolean save(User user){
			// the user either a non-tech user or developer
			int nonTech = 0;
			boolean saved = false;
			if(user.getProfile().equals(ApplicationConstants.NON_TECH)){
				nonTech = 1;
			}
			try{
				jdbcTemplate.update(SQLQueryConstants.INSERT_USER_RECORD, new Object[] { user.getUsername(),user.getPassword(),
						nonTech,user.getFirstName(),user.getLastName(),user.getEmail(), user.getMobile(),user.getGender(),user.getOccupation(),user.getBirthday()
					});
				saved = true;
			}catch(Exception e){
				LOGGER.error("Failed to save user in database!", e);
				//e.printStackTrace();
			}
		return saved;	
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
