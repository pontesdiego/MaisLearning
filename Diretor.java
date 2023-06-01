package atividade_1;

import java.time.LocalDate;

public class Diretor extends CargoDeConfianca{
    private double premio;

    public Diretor(String nome, String cpf, String rg, Genero genero, Setor setor, double salarioBase, LocalDate dataAdmissao, Bonificacao bonificacao, double premio) {
        super(nome, cpf, rg, genero, setor, salarioBase, dataAdmissao, bonificacao);
        this.premio = premio;
    }

    @Override
    public double getSalarioFinal() {
        return  salarioBase + (salarioBase * super.bonificacao.numero) + (salarioBase * premio);
    }

    public double getPremio() {
        return premio;
    }

    public void setPremio(double premio) {
        this.premio = premio;
    }

    @Override
    public String toString() {
        return "Diretor: " +
                super.toString() +
                "\n premio: " + premio ;
    }
}
