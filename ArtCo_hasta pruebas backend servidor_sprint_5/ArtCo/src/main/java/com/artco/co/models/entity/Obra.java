package com.artco.co.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="obras")
public class Obra {
	
	@Id
	@Column(name="id_obra")
	private Integer idObra;
	
	@Column(name="titulo_obra")
	private String titulo;
	
	@Column(name="autor_obra")
	private String autor;
	
	@Column(name="tipo_obra")
	private Integer tipo;
	
	@Column(name="tecnica_obra")
	private String tecnica;
	
	@Column(name="año_obra")
	private Integer año;
	
	@Column(name="estado_obra")
	private String estado;
	
	@Column(name="dimensiones_obra")
	private String dimensiones;
	
	@Column(name="ubicacion_obra")
	private String ubicacion;
	
	@Column(name="avaluo_obra")
	private Integer avaluo;
	
	@Column(name="id_artista")
	private Integer idArtista;
	

	public Integer getIdObra(){
		return idObra;
	}
	
	public void setIdObra(Integer idObra) {
		this.idObra = idObra;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}

	public String getTecnica() {
		return tecnica;
	}

	public void setTecnica(String tecnica) {
		this.tecnica = tecnica;
	}

	public Integer getAño() {
		return año;
	}

	public void setAño(Integer año) {
		this.año = año;
	}
	

	public String getDimensiones() {
		return dimensiones;
	}

	public void setDimensiones(String dimensiones) {
		this.dimensiones = dimensiones;
	}
	
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public Integer getAvaluo() {
		return avaluo;
	}

	public void setAvaluo(Integer avaluo) {
		this.avaluo = avaluo;
	}

	public Integer getIdArtista() {
		return idArtista;
	}

	public void setIdArtista(Integer idArtista) {
		this.idArtista = idArtista;
	}

	
	@Override
	public String toString(){
		return "Obra [idObra="+idObra+",titulo="+titulo+",autor="+autor+",tipo="+tipo+",tecnica="+tecnica+",año="+año+",dimensiones="+dimensiones+",estado"+estado+",ubicacion="+ubicacion+",avaluo="+avaluo+",idArtista="+idArtista+"]";
	}

}
