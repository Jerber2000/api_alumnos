package com.api_alumnos.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api_alumnos.Daos.IDaoAlumno;
import com.api_alumnos.Entity.Alumno;

@RestController
@RequestMapping (value ="/api")
public class AlumnoController {
	@Autowired
	private IDaoAlumno daoalumno;
	@GetMapping (value ="/alumno",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Alumno> listarAlumno(){
		return daoalumno.findAll();
	}

	@PostMapping (value ="/alumno",consumes = MediaType.APPLICATION_JSON_VALUE, produces =MediaType.APPLICATION_JSON_VALUE)
	public Alumno guardarAlumno(@RequestBody Alumno alumno) {
		return daoalumno.guardar(alumno);
	}
	@PutMapping (value="/alumno", consumes= MediaType.APPLICATION_JSON_VALUE,produces =MediaType.APPLICATION_JSON_VALUE)
	public Alumno actualizarAlumno (@RequestBody Alumno alumno) {
		return daoalumno.actualizar(alumno);
	}
}
