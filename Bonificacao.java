package atividade_1;

public enum Bonificacao {
    GERENTE(0.2),
    DIRETOR(0.4);
    protected final double numero;

    Bonificacao(double numero) {
        this.numero = numero;
    }

    public double getNumero() {
        return numero;
    }
}
