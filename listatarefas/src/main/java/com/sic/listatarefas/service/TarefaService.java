package com.sic.listatarefas.service;

import com.sic.listatarefas.model.Tarefa;
import com.sic.listatarefas.repository.TarefaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefaService {

    final TarefaRepository repo;

    public TarefaService(TarefaRepository repo){this.repo = repo;}

    public List<Tarefa> getAll(){return repo.findAll();}

    public Tarefa getById(Integer id) {return repo.findById(id).orElse(null);}

    public Tarefa save(Tarefa tarefa){return repo.save(tarefa);}

    public void deleteById(Integer id){repo.deleteById(id);}

}
