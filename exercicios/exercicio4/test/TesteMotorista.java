package br.com.ntconsult.exercicios.exercicio4.test;

import br.com.ntconsult.exercicios.exercicio4.classes.Motorista;

public class TesteMotorista {

    public static void main(String[] args){
        Motorista motorista1 = new Motorista();
        motorista1.setNome("Eduardo");
        motorista1.setCargo("Motorista");
        motorista1.setPlacaVeiculo("ABC123D4");

        Motorista motorista2 = new Motorista();
        motorista2.setNome("Paulo");
        motorista2.setCargo("Motorista");
        motorista2.setPlacaVeiculo("DCB432A1");

        System.out.println(motorista1.getNome());
        System.out.println(motorista1.getCargo());
        System.out.println(motorista1.getPlacaVeiculo());
        System.out.println("---------------------");
        System.out.println(motorista2.getNome());
        System.out.println(motorista2.getCargo());
        System.out.println(motorista2.getPlacaVeiculo());
    }
}
