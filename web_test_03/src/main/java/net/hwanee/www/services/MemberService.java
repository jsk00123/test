package net.hwanee.www.services;

import java.util.ArrayList;
import java.util.Collection;

import net.hwanee.www.HomeController;
import net.hwanee.www.dao.MainDao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class MemberService implements UserDetailsService{

	private MainDao mainDao;
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	public void setMainDao(MainDao mainDao){
		this.mainDao = mainDao;
	}
	
	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		String userPwd = mainDao.getUserPwd(username);
		
		logger.info("username : " + username);
		logger.info("password" + userPwd);
		
		Collection<SimpleGrantedAuthority> roles = new ArrayList<SimpleGrantedAuthority>();
		roles.add(new SimpleGrantedAuthority("ROLE_USER"));
		
		UserDetails user = new User(username, userPwd, roles);
		return user;
	}
	
}
