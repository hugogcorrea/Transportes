package com.transportes.Services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transportes.Models.Transportadora;
import com.transportes.Repositories.TransportadoraRepository;

@Service
public class TransportadoraService implements TransportadoraServiceInterface{

	
	@Autowired
	TransportadoraRepository repository;
	@Autowired
	TransportadorasWsInterface getTransportadoras;

	@Override
	public List<Transportadora> findAll() {
		return repository.findAll();
	}

	@Override
	public Optional<Transportadora> findOne(Integer id) {
		return repository.findById(id);
	}
	
	@Override
	public List<Transportadora>  findAllWithWS() {

		Transportadora[] transpWS = getTransportadoras.listarTodas();

		List<Transportadora> retornoWS = Arrays.asList(transpWS);
		List<Transportadora> retornoBD = repository.findAll();
		List<Transportadora> retorno = new ArrayList<Transportadora>();
		retorno.addAll(retornoBD);
		retorno.addAll(retornoWS);	
		return retorno;
	}

}
