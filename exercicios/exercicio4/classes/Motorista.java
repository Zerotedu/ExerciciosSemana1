package br.com.ntconsult.exercicios.exercicio4.classes;

public class Motorista extends Funcionario {
    private int cnh;
    private String placaVeiculo;

    public int getCnh() {
        return cnh;
    }

    public void setCnh(int cnh) {
        this.cnh = cnh;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public void setPlacaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }
}
