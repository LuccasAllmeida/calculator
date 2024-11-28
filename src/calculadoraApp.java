import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class calculadoraApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Double valorUm ;
        Double valorDois ;
        String operacao ;
        boolean continuar;

        try {
            do {
                System.out.println("Digite o valor um: ");
                valorUm = scanner.nextDouble();

                System.out.println("Digite a operação (+, -, /, *): ");
                operacao = scanner.next();

                System.out.println("Digite o valor dois: ");
                valorDois = scanner.nextDouble();

                System.out.println("Resultado: " + realizarCalculo(valorUm, valorDois, operacao));

                continuar = verificarNovaOperacao();

            } while(continuar);
        } catch (InputMismatchException ex) {
            System.out.println("Os valores para calculos devem ser númericos");
        }


    }

    public static boolean verificarNovaOperacao(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Deseja realizar uma nova operação ? (S ou N): ");
        return sc.nextLine().toUpperCase(Locale.ROOT).equals("N");
    }


    public static Double realizarCalculo(Double valorUm, Double valorDois, String operacao){

        Double resultado = 0.0;

        switch (operacao){
            case "+":
               resultado = valorUm + valorDois;
               break;

            case "-":
                resultado = valorUm - valorDois;
                break;

            case  "*":
                resultado = valorUm * valorDois;
                break;

            case "/":
                resultado = valorUm / valorDois;
                break;

            default: System.out.println("Opção invalida");
        }

        return resultado;
    }
}