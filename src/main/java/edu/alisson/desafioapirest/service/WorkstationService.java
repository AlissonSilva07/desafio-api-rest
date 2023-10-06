package edu.alisson.desafioapirest.service;

import edu.alisson.desafioapirest.model.Workstation;
import org.springframework.stereotype.Service;

public interface WorkstationService {
    Iterable<Workstation> buscarTodos();
    Workstation buscarPorId(Long id);
    void inserir(Workstation workstation);
    void atualizar(Long id, Workstation workstation);
    void deletar(Long id);
}
