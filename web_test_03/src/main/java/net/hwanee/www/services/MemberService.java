package net.hwanee.www.services;

import java.util.ArrayList;
import java.util.Collection;

import net.hwanee.www.bean.Users;
import net.hwanee.www.dao.MainDao;

import org.springframework.security.core.authority.SimpleGrantedAuthority;

public class MemberService {

	private MainDao mainDao;
	
	public Users loadUserByUsername(String username){
		String userPwd = mainDao.getUserPwd(username);
		
		Collection<SimpleGrantedAuthority> roles = new ArrayList<SimpleGrantedAuthority>();
		roles.add(new SimpleGrantedAuthority("ROLE_USER"));
		
		Users user = new Users(username, userPwd, roles);
		return user;
	}
	
}
