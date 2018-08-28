package gonza.integracionWeb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index()
	{
		return "inicio";
	}
	
	@RequestMapping(value="/alumnos/registrarAlumno", method=RequestMethod.GET)
	public String registerStudent()
	{
		return "registrarAlumno";
	}
	
	@RequestMapping(value="/alumnos/verAlumnos", method=RequestMethod.GET)
	public String viewStudents()
	{
		return "viewStudents";
	}
}
