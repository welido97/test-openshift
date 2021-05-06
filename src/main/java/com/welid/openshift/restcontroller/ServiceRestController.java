package com.welid.openshift.restcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.welid.openshift.model.Contatto;

@RestController
public class ServiceRestController {
	@RequestMapping("test")
	public List<Contatto> serviceTest() {
		List<Contatto> lista = new ArrayList<Contatto>();
		lista.add(new Contatto("Welid", "Oueslati", "welido97"));
		lista.add(new Contatto("Vanessa", "Rossini", "vanee"));
		lista.add(new Contatto("Max", "Verdi", "max"));
		lista.add(new Contatto("Paolo", "Bianchi", "paul"));
		return lista;
	}
}
