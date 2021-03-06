package com.ismaelmasegosa.salerev.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "recursos")
public class Recurso {

	@Id
	public String id;

	public String nombre;
	
	public String tipo;
	
	public String datos;
	
	public String incidencia;
	
	public String capacidad;

	public Recurso(String id, String nombre, String tipo, String datos, String incidencia, String capacidad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
		this.datos = datos;
		this.incidencia = incidencia;
		this.capacidad = capacidad;
	}

	public Recurso() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDatos() {
		return datos;
	}

	public void setDatos(String datos) {
		this.datos = datos;
	}

	public String getIncidencia() {
		return incidencia;
	}

	public void setIncidencia(String incidencia) {
		this.incidencia = incidencia;
	}

	public String getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(String capacidad) {
		this.capacidad = capacidad;
	}

	@Override
	public String toString() {
		return "Recurso [id=" + id + ", nombre=" + nombre + ", tipo=" + tipo + ", datos=" + datos + ", incidencia="
				+ incidencia + ", capacidad=" + capacidad + "]";
	}
	
	
}
