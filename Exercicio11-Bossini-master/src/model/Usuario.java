package model;

import java.io.Serializable;

public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;
	private String username;
	private byte [] password;
	
	public byte[] getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password.getBytes();
	}
	public void setPassword(byte []password) {
		this.password = password;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Override
	public String toString() {
		return "Usuario [username=" + username + ", password=" + password+ "]";
	}
}