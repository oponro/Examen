package com.petSmile.ReservaHora;

public class Mascota {
	
	private String idMascota;
	private String rutPropietario;
	private String tipoMascota;
	private int edad;
	private String nombreMascota;
	
	
	
	public Mascota(String idMascota, String nombreMascota, int edad, String tipoMascota, String rutPropietario) {
		if(idMascota.trim().equals("") || idMascota == null) {
			throw new IllegalArgumentException("Ingrese Id de la mascota");
		}
	
		this.idMascota = idMascota;
		this.rutPropietario = rutPropietario;
		this.tipoMascota = tipoMascota;
		this.edad = edad;
		this.nombreMascota = nombreMascota;
				
	}
	
	public Mascota(String string) {
		// TODO Auto-generated constructor stub
	}

	public String getIdMascota() {
		return idMascota;
	}
	
	public String getRutPropietario() {
		return rutPropietario;
	}
	
	public String getTipoMascota() {
		return tipoMascota;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public String getNombreMascota() {
		return nombreMascota;
	}
	
}
