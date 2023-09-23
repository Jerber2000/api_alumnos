package com.api_alumnos.Daos;

import java.util.List;

import com.api_alumnos.Entity.Alumno;

public interface IDaoAlumno  {
	
	public List<Alumno> findAll();
	public Alumno guardar(Alumno alumno);
	public Alumno actualizar(Alumno alumno);
	

}
