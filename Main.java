package atividade_1;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Motoboy("Diego", "8493485", "83932213", Genero.MACHO,
                Setor.ADMINISTRATIVO, 1200, LocalDate.of(2020, Month.DECEMBER, 30), "4540064");

        System.out.println(funcionario1);
    }
}
