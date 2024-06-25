import java.util.Scanner;

public class ConversorMoedas {
    private final ApiConnection consultaCotacao = new ApiConnection();

    public void converteMoeda(String moedaInicial, String moedaFinal){
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o valor em " + moedaInicial + ": ");
            double valor = Double.parseDouble(scanner.nextLine());

            double taxa = consultaCotacao.taxaDeCambio(moedaInicial, moedaFinal);
            double resultado = valor * taxa;
            System.out.println("Valor em " + moedaFinal + ": " + resultado + "\n");
        }catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
