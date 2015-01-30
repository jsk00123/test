package net.hwanee.www.bean;

import java.util.Collection;

import org.springframework.security.core.authority.SimpleGrantedAuthority;

public class Users {

	public String username;
	public String userPwd;
	public Collection<SimpleGrantedAuthority> roles;
	
	public Users(String username, String userPwd,Collection<SimpleGrantedAuthority> roles) {
		this.username=username;
		this.userPwd=userPwd;
		this.roles=roles;
	}
	
}
