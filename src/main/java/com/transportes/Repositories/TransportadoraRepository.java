package com.transportes.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.transportes.Models.Transportadora;

@Repository
public interface TransportadoraRepository extends JpaRepository<Transportadora, Integer> {

}
