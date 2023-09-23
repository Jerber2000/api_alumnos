package com.api_alumnos.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table (name ="alumno")


public class Alumno {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name ="Idalumnos")
	public int Idalumnos;
	public String nombre;
	public String apellido;
	public String sexo;
	public Date fecha_nac;
	public String tipo_persona;
	public Float sueldo;
	public String email;
	public Date fecha_crea;
	public String estatus;
	
}
