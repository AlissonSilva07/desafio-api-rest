package edu.alisson.desafioapirest.controller;

import edu.alisson.desafioapirest.model.Workstation;
import edu.alisson.desafioapirest.service.WorkstationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("workstation")
public class WorkstationController {
    @Autowired
    private WorkstationService workstationService;

    @GetMapping
    public ResponseEntity<Iterable<Workstation>> buscarTodos() {
        return ResponseEntity.ok(workstationService.buscarTodos());
    }

    @GetMapping
    @RequestMapping("/{id}")
    public ResponseEntity<Workstation> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(workstationService.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<Workstation> inserir(@RequestBody Workstation workstation) {
        workstationService.inserir(workstation);
        return ResponseEntity.ok(workstation);
    }

}
