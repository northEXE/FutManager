package br.npi.ufc.qxd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.npi.ufc.qxd.bean.Time;
import br.npi.ufc.qxd.services.TimeService;

@Controller
@RequestMapping(path = "/times/")
public class TimesController {

	@Autowired
	TimeService service;

	@RequestMapping(path = "/")
	public ModelAndView index() {
		
		ModelAndView model = new ModelAndView("times");
		List<Time> times = service.getTodosTimes();

		model.addObject("times", times);	
		return model;
	}

	@RequestMapping(path = "/{id}")
	public String detalhesTime() {
		return "detalhes-time";
	}

	@RequestMapping(path = "/salvar", method = RequestMethod.POST)
	public String salvarTime(@RequestParam String nomeTime) {
		service.salvarTime(nomeTime);
		return "redirect:/times/";
	}

}
