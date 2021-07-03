package com.petSmile.ReservaHora;

import javax.xml.crypto.Data;

public class Agenda {
	
	private String id;
	private String idMascota;
	private String rutPropietario;
	private String nombreMascota;
	private int hora;
	private Data fecha;
	
	public Agenda(String id, String idMascota, String rutPropietario, String nombreMascota, int hora, Data fecha) {
		if(id.trim().equals("") || id == null) {
			throw new IllegalArgumentException("Ingrese Id");
		}
	
		this.id = id;
		this.idMascota = idMascota;
		this.rutPropietario = rutPropietario;
		this.nombreMascota = nombreMascota;
		this.hora = hora;
		this.fecha = fecha;
						
	}
	
	public Agenda(String string) {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}
	
	public String getIdMascota() {
		return idMascota;
	}
	
	public String getRutPropietario() {
		return rutPropietario;
	}
	
	public String getNombreMascota() {
		return nombreMascota;
	}
	
	public int getHora() {
		return hora;
	}
	
	public Data getFecha() {
		return fecha;
	}
	

}
