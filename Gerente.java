package atividade_1;

import java.time.LocalDate;

public class Gerente extends CargoDeConfianca{
    public Gerente(String nome, String cpf, String rg, Genero genero, Setor setor, double salarioBase, LocalDate dataAdmissao, Bonificacao bonificacao) {
        super(nome, cpf, rg, genero, setor, salarioBase, dataAdmissao, bonificacao);
    }

    @Override
    public double getSalarioFinal() {
        return salarioBase + (salarioBase * super.bonificacao.numero);
    }

    @Override
    public String toString() {
        return "Gerente: " +
                super.toString() +
                "\n bonificacao: " + bonificacao ;

    }
}
