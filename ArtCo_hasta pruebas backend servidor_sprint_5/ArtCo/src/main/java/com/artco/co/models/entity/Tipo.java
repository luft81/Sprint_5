package com.artco.co.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tipos")
public class Tipo {
	
	@Id
	@Column(name="id_tipo")
	private Integer idTipo;
	
	@Column(name="nombre_tipo")
	private String nombre;

	@Column(name="descripcion_tipo")
	private String descripcion;
	
	public Integer getIdTipo(){
		return idTipo;
	}

	public void setIdTipo(Integer idTipo) {
		this.idTipo = idTipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString(){
		return "Tipo [idTipo="+idTipo+",nombre="+nombre+",descripcion="+descripcion+"]";
	}
}
