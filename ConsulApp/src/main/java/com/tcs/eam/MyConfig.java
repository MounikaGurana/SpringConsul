package com.tcs.eam;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties
public class MyConfig {
	
	private String username;
	private String password;
	private String privilege;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPrivilege() {
		return privilege;
	}
	public void setPrivilege(String privilege) {
		this.privilege = privilege;
	}

	
	
}
