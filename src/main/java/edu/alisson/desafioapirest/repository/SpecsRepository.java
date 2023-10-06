package edu.alisson.desafioapirest.repository;

import edu.alisson.desafioapirest.model.Specs;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecsRepository extends CrudRepository<Specs, Long> {
}
