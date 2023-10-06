package edu.alisson.desafioapirest.service;

import edu.alisson.desafioapirest.model.Workstation;

public interface WorkstationRepository {
    Iterable<Workstation> buscarTodos();
    Workstation buscarPorId(Long id);
    void inserir(Workstation workstation);
    void atualizar(Long id, Workstation workstation);
    void deletar(Long id);
}
