package br.npi.ufc.qxd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.npi.ufc.qxd.services.JogadorService;

@Controller
@RequestMapping(path="/jogadores/")
public class JogadorController {
	
	@Autowired
	JogadorService jogadorService;
	
	@RequestMapping(path="/")
	public ModelAndView index(){
		ModelAndView model = new ModelAndView("jogadores");
		model.addObject("jogadores", jogadorService.getTodosJogadores());
		return model;
	}
	
	@RequestMapping(path="/salvar", method=RequestMethod.POST)
	public String salva(@RequestParam String nomeJogador, @RequestParam Integer idadeJogador){
		jogadorService.salvarJogador(nomeJogador, idadeJogador);
		
		return "redirect:/jogadores/";
	}
}
