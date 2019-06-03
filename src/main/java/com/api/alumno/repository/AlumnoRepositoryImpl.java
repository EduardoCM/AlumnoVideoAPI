package com.api.alumno.repository;

import java.util.ArrayList;
import java.util.List;

import com.api.alumno.model.Alumno;

public class AlumnoRepositoryImpl implements AlumnoRepository {

	private static List<Alumno> alumnos = new ArrayList<>();

	static {
		Alumno eduardo = new Alumno("Eduardo Castillo", "Cloud Native Developer", "ecm@gmail.com");
		alumnos.add(eduardo);
	}

	@Override
	public Alumno addAlumno(Alumno alumno) {
		alumnos.add(alumno);
		return alumno;
	}

	@Override
	public List<Alumno> getAlumnos() {
		return alumnos;
	}

}
