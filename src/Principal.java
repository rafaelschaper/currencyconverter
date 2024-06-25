import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        Menu menu = new Menu();

        try {
            while (true) {
                menu.exibeMenu();
                int opcao = Integer.parseInt(scanner.nextLine());
                if (opcao == 0) {
                    System.out.println("Saindo...");
                    return;
                }
                menu.processaOpcao(opcao);
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
