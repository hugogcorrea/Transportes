package com.transportes.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.transportes.Models.Transportadora;
import com.transportes.Services.TransportadoraServiceInterface;

@Controller
public class ControllerPrincipal {

	@Autowired
	TransportadoraServiceInterface getTransportadorasBanco;

	@GetMapping("/transportadora")
	@ResponseBody
	public List<Transportadora> listar() {
		return getTransportadorasBanco.findAllWithWS();
	}

}
