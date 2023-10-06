package edu.alisson.desafioapirest.service.implementacao;

import edu.alisson.desafioapirest.model.Workstation;
import edu.alisson.desafioapirest.repository.SpecsRepository;
import edu.alisson.desafioapirest.repository.WorkstationRepository;
import edu.alisson.desafioapirest.service.WorkstationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkstationImpl implements WorkstationService {
    @Autowired
    private WorkstationRepository workstationRepository;
    @Autowired
    private SpecsRepository specsRepository;
    @Override
    public Iterable<Workstation> buscarTodos() {
        return workstationRepository.findAll();
    }

    @Override
    public Workstation buscarPorId(Long id) {
        return null;
    }

    @Override
    public void inserir(Workstation workstation) {
        workstationRepository.save(workstation);
    }

    @Override
    public void atualizar(Long id, Workstation workstation) {

    }

    @Override
    public void deletar(Long id) {

    }
}
