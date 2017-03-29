package br.npi.ufc.qxd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="/times/")
public class TimesController {
	
	@RequestMapping(path="/")
	public String index(){
		return "times";
	}
	
	@RequestMapping(path="{id}")
	public String detalhesTime(@PathVariable Integer id){
		return "detalhestime";
	}
}
