package com.transportes.Services;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.transportes.Models.Transportadora;

@Service
public class TransportadorasWs implements TransportadorasWsInterface {

	public Transportadora[] listarTodas() {

		RestTemplate restTemplate = new RestTemplate();

		ResponseEntity<Transportadora[]> response = restTemplate
				.getForEntity("http://localhost:9000/transportadora/",
				Transportadora[].class);
		Transportadora[] transportadoras = response.getBody();

		return transportadoras;
	}
}
