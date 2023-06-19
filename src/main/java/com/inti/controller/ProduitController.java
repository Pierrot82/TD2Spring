package com.inti.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("produit")
public class ProduitController {
	
	@GetMapping("affichage")
	public String affichageProduit(@RequestParam(value ="nom", defaultValue = "???", required = true) String nom) {
		
		return "affichageProduit";
	}
	
	@GetMapping("prix")
	public String affichagePrixProduit(@RequestParam(value ="prix", defaultValue = "0.00", required = true) double prix,
			@RequestParam(value ="nom", defaultValue = "???", required = true) String nom) {
		
		return "affichageProduit";
	}
	
	@GetMapping("calcul")
	public String calcul(@RequestParam(value ="nom", defaultValue = "???", required = true) String nom
			,@RequestParam(value ="prix", defaultValue = "0.00", required = true) double prix, Model m) {
		
		double prixTTC = prix*1.2;
		m.addAttribute("prixTTC", prixTTC);
		
		return "affichageProduit";
	}

}
