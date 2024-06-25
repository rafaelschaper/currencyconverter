public class Menu {
    private final ConversorMoedas conversor = new ConversorMoedas();

    public void exibeMenu() {
        System.out.println("****************************************************");
        System.out.println("----------------Conversor de Moedas-----------------");
        System.out.println("1-> Dólar (USD) para Real (BRL)");
        System.out.println("2-> Real (BRL) para Dólar (USD)");
        System.out.println("3-> Euro (EUR) para Real (BRL)");
        System.out.println("4-> Real (BRL) para Euro (EUR)");
        System.out.println("5-> Euro (EUR) para Dólar (USD)");
        System.out.println("6-> Dólar (USD) para Euro (EUR)");
        System.out.println("7-> Real (BRL) para Peso Argentino (ARS)");
        System.out.println("8-> Peso Argentino (ARS) para Real (BRL)");
        System.out.println("9-> Dólar (USD) para Peso Argentino (ARS)");
        System.out.println("10-> Peso Argentino (ARS) para Dólar (USD)");
        System.out.println("0-> Sair");
        System.out.println("****************************************************");
        System.out.println("Escolha uma opção");
    }

    public void processaOpcao(int opcao) {
        switch (opcao){
            case 1:
                conversor.converteMoeda("USD", "BRL");
                break;
            case 2:
                conversor.converteMoeda("BRL", "USD");
                break;
            case 3:
                conversor.converteMoeda("EUR", "BRL");
                break;
            case 4:
                conversor.converteMoeda("BRL", "EUR");
                break;
            case 5:
                conversor.converteMoeda("EUR", "USD");
                break;
            case 6:
                conversor.converteMoeda("USD", "EUR");
                break;
            case 7:
                conversor.converteMoeda("BRL", "ARS");
                break;
            case 8:
                conversor.converteMoeda("ARS", "BRL");
                break;
            case 9:
                conversor.converteMoeda("USD", "ARS");
                break;
            case 10:
                conversor.converteMoeda("ARS", "USD");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}
