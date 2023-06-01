package atividade_1;

public enum Genero {
    MASCULINO("Masculino"),
    FEMININO("Feminino"),
    MACHO("Macho");

    protected final String texto;

    Genero(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
}
