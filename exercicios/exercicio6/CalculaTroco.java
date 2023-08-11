package br.com.ntconsult.exercicios.exercicio6;

public class CalculaTroco {
    public static void main(String[] args) {
        calcularTroco(20, 17.00);
    }

    public static void calcularTroco( double pagamento, double custo) {
        double troco = pagamento - custo;
        System.out.println("Valor do troco: R$ " + troco);
        System.out.println("Troco em menor quantidade de notas e moedas possíveis:");

        int[] valorMoedasENotas = {
                10000, // R$100
                5000,  // R$50
                2000,  // R$20
                1000,  // R$10
                500,   // R$5
                200,   // R$2
                100,   // R$1
                50,    // 50 centavos
                25,    // 25 centavos
                10,    // 10 centavos
                5,     // 5 centavos
                1      // 1 centavo
        };

        String[] descricaoDasMoedasENotas = {
                "nota de 100 reais",
                "nota de 50 reais",
                "nota de 20 reais",
                "nota de 10 reais",
                "nota de 5 reais",
                "nota de 2 reais",
                "moeda de 1 real",
                "moeda de 50 centavos",
                "moeda de 25 centavos",
                "moeda de 10 centavos",
                "moeda de 5 centavos",
                "moeda de 1 centavo"
        };

        // Aqui converte o troco para centavos
        int trocoEmCentavos = (int) (troco * 100);

        for (int i = 0; i < valorMoedasENotas.length; i++) {
            int quantidade = trocoEmCentavos / valorMoedasENotas[i];
            if (quantidade > 0) {
                System.out.println(quantidade + " - " + descricaoDasMoedasENotas[i]);
                trocoEmCentavos %= valorMoedasENotas[i];
            }
        }
    }
}