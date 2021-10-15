package com.artco.co.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="artistas")
public class Artista {
	
	@Id
	@Column(name="id_artista")
	private Integer idArtista;
	
	@Column(name = "nombre_artista")
	private String nombre;
	
	@Column(name = "apellido_artista")
	private String apellido;
	
	@Column(name = "edad_artista")
	private Integer edad;
	
	@Column(name = "medio_artista")
	private String medio;
	
	@Column(name = "direccion_artista")
	private String direccion;
	
	@Column(name="telefono_artista")
	private String telefono;
	
	@Column(name="email_artista")
	private String email;
	
	@Column(name="estado_artista")
	private String estado;
	
	
	public Integer getIdArtista() {
		return idArtista;
	}

	public void setIdArtista(Integer idArtista) {
		this.idArtista = idArtista;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getMedio() {
		return medio;
	}

	public void setMedio(String medio) {
		this.medio = medio;
	}
	
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	@Override
	public String toString() {
		return "Artista [idArtista=" + idArtista + ", nombre=" + nombre + ", apellido=" + apellido + ",edad="+edad+",medio="+medio+", direccion="
				+ direccion + ", telefono=" + telefono + ",email="+email+",estado="+estado+"]";
	}

}
