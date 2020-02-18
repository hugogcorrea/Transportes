package com.transportes.Services;

import java.util.List;
import java.util.Optional;

import com.transportes.Models.Transportadora;

public interface TransportadoraServiceInterface {

	public List<Transportadora> findAll();

	public Optional<Transportadora> findOne(Integer id);
	
	public List<Transportadora> findAllWithWS();
}
