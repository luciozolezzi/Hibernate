package gonza.integracionWeb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import gonza.integracionWeb.model.Alumno;
import gonza.integracionWeb.services.AlumnoService;
import gonza.integracionWeb.services.ManagerService;

@Controller
public class MainController {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index()
	{
		return "inicio";
	}
	
	@RequestMapping(value="/alumnos/registrarAlumno", method=RequestMethod.GET)
	public String registerStudent(Model model)
	{
		model.addAttribute("alumno", new Alumno());
		return "registrarAlumno";
	}
	
	@RequestMapping(value="/alumnos/verAlumnos", method=RequestMethod.GET)
	public String viewStudents(Model model)
	{
		ManagerService manager = new AlumnoService();
		model.addAttribute("alumnos",manager.getAllEntities());
		return "viewStudents";
	}
	@RequestMapping(value="/alumnos/verUnAlumno", method=RequestMethod.GET)
	public String viewOneStudent(Model model)
	{
		AlumnoService manager = new AlumnoService();
		model.addAttribute("alumno", manager.getEntity(1L));
		return "viewOneStudent";
	}
}
