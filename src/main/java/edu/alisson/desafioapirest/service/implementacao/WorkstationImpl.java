package edu.alisson.desafioapirest.service.implementacao;

import edu.alisson.desafioapirest.model.Workstation;
import edu.alisson.desafioapirest.service.WorkstationRepository;

public class WorkstationImpl implements WorkstationRepository {
    @Override
    public Iterable<Workstation> buscarTodos() {
        return null;
    }

    @Override
    public Workstation buscarPorId(Long id) {
        return null;
    }

    @Override
    public void inserir(Workstation workstation) {

    }

    @Override
    public void atualizar(Long id, Workstation workstation) {

    }

    @Override
    public void deletar(Long id) {

    }
}
