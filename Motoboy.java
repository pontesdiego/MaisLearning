package atividade_1;

import java.time.LocalDate;

public class Motoboy extends Funcionario{
    private String placaDaMoto;

    public Motoboy(String nome, String cpf, String rg, Genero genero, Setor setor, double salarioBase, LocalDate dataAdmissao, String placaDaMoto) {
        super(nome, cpf, rg, genero, setor, salarioBase, dataAdmissao);
        this.placaDaMoto = placaDaMoto;
    }

    @Override
    public double getSalarioFinal() {
        return salarioBase;
    }

    public String getPlacaDaMoto() {
        return placaDaMoto;
    }

    public void setPlacaDaMoto(String placaDaMoto) {
        this.placaDaMoto = placaDaMoto;
    }

    @Override
    public String toString() {
        return "Motoboy: " +
                super.toString() +
                "\n Placa Da Moto: '" + placaDaMoto + '\'' ;
    }
}
