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
	
	@RequestMapping(value="/registrarAlumno")
	public String registerStudent()
	{
		return "registerStudent";
	}
	
	@RequestMapping(value="/verAlumnos")
	public String viewStudents()
	{
		return "viewStudents";
	}
}
