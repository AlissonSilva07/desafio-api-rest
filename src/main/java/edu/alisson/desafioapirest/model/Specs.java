package edu.alisson.desafioapirest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Specs {
    @Id
    private Integer specsId;
    private String processador;
    private String memoriaRam;
    private String armazenamento;

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public String getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
    }
}
