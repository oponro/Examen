package com.petSmile.ReservaHora;

public class Usuario {
	private String id;
	private String username;
	private String password;
	
	public Usuario(String id, String username, String password) {
		if(id.trim().equals("") || id == null) {
			throw new IllegalArgumentException("Ingrese Id");
		}
			
		this.id = id;
		this.username = username;
		this.password = password;
	}
	
	public Usuario(String string) {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}

}
