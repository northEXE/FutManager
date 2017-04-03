package br.npi.ufc.qxd.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.npi.ufc.qxd.bean.Time;
import br.npi.ufc.qxd.repositories.TimeRepository;

@Service
public class TimeService {
	
	@Autowired
	TimeRepository timeRepo;
	
	public Time salvarTime(String nome){
		Time time = new Time();
		time.setNome(nome);
		timeRepo.save(time);
		return time;
	}
	
	public List<Time> getTodosTimes(){
		return timeRepo.findAll();
	}
}
