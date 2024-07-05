public class Aluguel {
    public static void main(String[] args) {
        // Valor do aluguel
        double valorAluguel = 1000.0;
        // Dias de atraso
        int diasAtraso = 32;
        // Juros mensal de 2%
        double jurosMensal = 0.02;
        // Juros de mora diário de 0.14%
        double jurosMoraDiario = 0.0014;

        // Cálculo dos juros mensais proporcionais
        double jurosMensalProporcional = (jurosMensal / 30) * diasAtraso * valorAluguel;

        // Cálculo dos juros de mora diários
        double jurosMora = jurosMoraDiario * valorAluguel * diasAtraso;

        // Cálculo do valor total do aluguel atrasado
        double valorTotal = valorAluguel + jurosMensalProporcional + jurosMora;

        // Exibindo os resultados
        System.out.printf("Valor do aluguel: R$ %.2f%n", valorAluguel);
        System.out.printf("Juros mensal proporcional: R$ %.2f%n", jurosMensalProporcional);
        System.out.printf("Juros de mora diário: R$ %.2f%n", jurosMora);
        System.out.printf("Valor total do aluguel atrasado: R$ %.2f%n", valorTotal);
    }
}