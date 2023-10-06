package edu.alisson.desafioapirest.model;

public enum Setor {
    ADP("ADP"),
    ATENDIMENTO("ATENDIMENTO"),
    CAIXA("CAIXA"),
    CERTIDOES("CERTIDÕES"),
    CONFERENCIA("CONFERÊNCIA"),
    GDO("GDO"),
    HOMEOFFICE("HOME-OFFICE"),
    IMPRESSAO("IMPRESSÃO"),
    PENDENCIA("PENDÊNCIA"),
    QUALIDADE("QUALIDADE"),
    RESERVA("RESERVA"),
    SECRETARIA("SECRETARIA"),
    SENHAS("SENHAS"),
    TELEFONE("TELEFONE"),
    TI("TI");

    private String descricao;

    Setor(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
