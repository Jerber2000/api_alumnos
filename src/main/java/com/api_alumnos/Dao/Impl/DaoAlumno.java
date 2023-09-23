package com.api_alumnos.Dao.Impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.api_alumnos.Daos.IDaoAlumno;
import com.api_alumnos.Entity.Alumno;
@Repository
@Transactional
public class DaoAlumno implements IDaoAlumno{
	@PersistenceContext
	private EntityManager em;
	@Override
	public List<Alumno> findAll() {
		try {
			List<Alumno> ListaAlumnos=em.createQuery("FROM Alumno",Alumno.class).getResultList();
			return ListaAlumnos;
					
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}

	@Override
	public Alumno guardar(Alumno alumno) {
		try {
			em.persist(alumno);
			return alumno;
			
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
		
		
	}

	@Override
	public Alumno actualizar(Alumno alumno) {
		
		try {
			em.merge(alumno);
			return alumno;
			
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}
	

}
