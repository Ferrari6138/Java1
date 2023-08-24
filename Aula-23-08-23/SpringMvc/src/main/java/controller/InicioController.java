package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import persistence.DaoSpring;

@Controller
@RequestMapping("/inicio")
public class InicioController {

	
	@RequestMapping(method = RequestMethod.GET)
	public String inicio(ModelMap model) {
		
		DaoSpring daoSpring = new DaoSpring();
		String fraseSpring = daoSpring.buscarSpringinicio();
		
		model.addAttribute("inicioMensagem", fraseSpring);
		
		
		return "inicio";
	}
}