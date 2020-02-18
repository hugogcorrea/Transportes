package com.transportes.Models;

import java.util.List;
import java.util.Map;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "transportadora")
public class Transportadora {
	@Id
	@SequenceGenerator(name = "_id", sequenceName = "_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "_id")
	private Integer _id;
	@ElementCollection
	private Map<String, Float> valor_km;
	@ElementCollection
	private List<String> tipo_transporte;
	@ElementCollection
	private Map<String, Float> tempo_medio;
}
