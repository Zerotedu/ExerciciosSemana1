package br.com.ntconsult.exercicios.exercicio2;

public class ImprimaNumerosPrimos {
    // Função para verificar se um número é primo
    public static boolean verificaPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Números primos de 0 a 1000:");
        for (int numeroAtual = 0; numeroAtual <= 1000; numeroAtual++) {
            if (verificaPrimo(numeroAtual)) {
                System.out.println(numeroAtual);
            }
        }
    }
}