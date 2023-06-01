package atividade_1;

import java.time.LocalDate;

public abstract class CargoDeConfianca extends Funcionario {
    protected Bonificacao bonificacao;

    public CargoDeConfianca(String nome, String cpf, String rg, Genero genero, Setor setor, double salarioBase, LocalDate dataAdmissao, Bonificacao bonificacao) {
        super(nome, cpf, rg, genero, setor, salarioBase, dataAdmissao);
        this.bonificacao = bonificacao;
    }

    public Bonificacao getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }


}
