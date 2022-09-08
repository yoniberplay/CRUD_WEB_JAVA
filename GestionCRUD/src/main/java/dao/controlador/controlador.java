package dao.controlador;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dao.modelo.ClienteDAO;
import dao.modelo.cliente;
import dao.modelo.loggin_entity;

@Controller
@RequestMapping("/cliente")
public class controlador {
	
	
	@InitBinder
	public void mibinder(WebDataBinder binder) {
		StringTrimmerEditor nopermitirespacios = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, nopermitirespacios);
	}
	
	
	@RequestMapping("/iniciar")
	public String iniciar(Model modelo) {
		loggin_entity ol = new loggin_entity();
		modelo.addAttribute("obj_loggin", ol);
		return "loggin";
	}
	
	@RequestMapping("/loggin")
	public String loggin(@Valid @ModelAttribute("obj_loggin") loggin_entity ol,BindingResult resultadovalidacion,Model modelo) {
		
	if (resultadovalidacion.hasErrors()) {
		return "loggin";
	}else {
		
		if (clientedao.validateloggin(ol.getUsuario(),ol.getClave())) {
			Estado.loggin=true;
			return "redirect:/cliente/lista";
		}else {
			modelo.addAttribute("msj","Email o clave invalida.");
			return "loggin";
		}
	}
	}
	
	@RequestMapping("/sesionoff")
	public String sesionoff(Model modelo) {
		Estado.loggin=false;
		loggin_entity ol = new loggin_entity();
		modelo.addAttribute("obj_loggin", ol);
		return "loggin";
	}
	
	@RequestMapping("/lista")
	public String listaClientes(Model modelo) {
		if (Estado.loggin) {
			List<cliente> lista = clientedao.getcClientes();
			modelo.addAttribute("lista",lista);
			return "lista-clientes";
		}else {
			loggin_entity ol = new loggin_entity();
			modelo.addAttribute("obj_loggin", ol);
			return "loggin";
		}
		
	}
	
	@RequestMapping("/insertar")
	public String insertarclientes(Model modelo) {
		if (Estado.loggin) {
			cliente cl = new cliente();
			modelo.addAttribute("objcliente", cl);
			return "Insertar";
		}
		else {
			loggin_entity ol = new loggin_entity();
			modelo.addAttribute("obj_loggin", ol);
			return "loggin";
		}
		
	}
	
	@PostMapping("/insertandocliente")
	public String insertandocliente(@Valid @ModelAttribute("objcliente") cliente cl,BindingResult resultadovalidacion) {
		
		if (resultadovalidacion.hasErrors()) {
			return "Insertar";
		}else {
			clientedao.insetarcliente(cl);
			return "redirect:/cliente/lista";
		}
		
	}
	
	
	@RequestMapping("/actulizarForm")
	public String actulizarForm(@RequestParam(name = "clienteid") int id, Model modelo) {
		
		if (Estado.loggin) {
			cliente up = new cliente();
			up = clientedao.getcliente(id);
			modelo.addAttribute("updateclient", up);
			return "actulizarForm";
		}
		else {
			loggin_entity ol = new loggin_entity();
			modelo.addAttribute("obj_loggin", ol);
			return "loggin";
		}

	}
	
	@PostMapping("/updatingclient")
	public String updatingclient(@Valid @ModelAttribute("updateclient") cliente cl,BindingResult resultadovalidacion) {
		
		if (resultadovalidacion.hasErrors()) {
			return "actulizarForm";
		}else {
			clientedao.updatecliente(cl);
			return "redirect:/cliente/lista";
		}
		
	}
	
	@RequestMapping("/eliminarcliente")
	public String eliminarcliente(@RequestParam(name = "clienteid") int id,Model modelo) {
		
		clientedao.deletecliente(id);
		
		return "redirect:/cliente/lista";
	}
	

	@Autowired
	private ClienteDAO clientedao;
}
