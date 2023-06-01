package atividade_1;

public enum Setor {
    ENGENHARIA("Engenheiro"),
    SAUDE("Saúde"),
    JURIDICO("Juridico"),
    FINANCEIRO("Financeiro"),
    RECURSOS_HUMANOS("Recursos Humanos"),
    ADMINISTRATIVO("Administrativo"),
    OPERACOES("Operações");

    protected final String sector;

    Setor(String sector) {
        this.sector = sector;
    }

    public String getSector() {
        return sector;
    }
}
