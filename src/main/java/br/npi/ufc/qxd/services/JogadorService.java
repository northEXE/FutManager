package br.npi.ufc.qxd.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.npi.ufc.qxd.bean.Jogador;
import br.npi.ufc.qxd.repositories.JogadorRepository;

@Service
public class JogadorService {
	
	@Autowired
	JogadorRepository jogadorRepo;
	
	public Jogador salvarJogador(String nome, int idade){
		Jogador jogador = new Jogador();
		jogador.setNome(nome);
		jogador.setIdade(idade);
		jogadorRepo.save(jogador);
		
		return jogador;
	}
	
	public List<Jogador> getTodosJogadores(){
		return jogadorRepo.findAll();
	}
}
