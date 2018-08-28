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
	public String addAlumno(@ModelAttribute("alumno") Alumno a)
	{
		System.out.println(a.getNombre() + a.getApellido());
		//service.addEntity(a);
		return "registroExitoso";
		
	}
}
