package edu.alisson.desafioapirest.repository;

import edu.alisson.desafioapirest.model.Workstation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkstationRepository extends CrudRepository<Workstation, Long> {
}
