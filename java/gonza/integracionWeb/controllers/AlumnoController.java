package gonza.integracionWeb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import gonza.integracionWeb.model.Alumno;
import gonza.integracionWeb.services.AlumnoService;
import gonza.integracionWeb.services.ManagerService;

@Controller
public class AlumnoController {
	
	private ManagerService service = new AlumnoService();
	
	@RequestMapping(value="/alumnos/register", method=RequestMethod.POST)
	public String addAlumno(@ModelAttribute Alumno a)
	{
		System.out.println("NOMBRE = " + a.getNombre());
		System.out.println("APELLIDO = " + a.getApellido());
		System.out.println("LEGAJO = " + a.getLegajo());
		System.out.println("REGIONAL = " + a.getRegional());
		service.addEntity(a);
		return "registroExitoso";	
	}
	
}
