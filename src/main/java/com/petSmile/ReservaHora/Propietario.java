package com.petSmile.ReservaHora;

public class Propietario {
	
		private String rut;
		private String nombre;
		private String apellido;
		private String direccion;
		private String correo;
		private int telefono;
		private String nombreMascota;
		
		
		public Propietario(String rut, String nombre, String apellido, String direccion, String correo, int telefono, String nombreMascota) {
			if(rut.trim().equals("") || rut == null) {
				throw new IllegalArgumentException("Ingrese Rut");
			}
		
			this.rut = rut;
			this.nombre = nombre;
			this.apellido = apellido;
			this.direccion = direccion;
			this.correo = correo;
			this.telefono = telefono;
			this.nombreMascota = nombreMascota;
			
		}
		
		public Propietario(String string) {
			// TODO Auto-generated constructor stub
		}

		public String getRut() {
			return rut;
		}
		
		public String getNombre() {
			return nombre;
		}
		
		public String getApellido() {
			return apellido;
		}
		
		public String getDireccion() {
			return direccion;
		}
		
		public String getCorreo() {
			return correo;
		}
		
		public int getTelefono() {
			return telefono;
		}
		
		public String getNombreMascota() {
			return nombreMascota;
		}

}
