package br.com.ntconsult.exercicios.exercicio1;

public class ImprimaNumerosPares {
    public static void main(String[] args){
        int valor= 100;
        for(int i=0; i<valor; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
