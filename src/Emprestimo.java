import java.util.Scanner;

public class Emprestimo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int porcentagem = 14;
        double valorEmprestimo = 0;
        double valorFinal = 0;

        System.out.println("Digite valor do emprestimo: ");
        valorEmprestimo = scan.nextDouble();

        valorFinal = (valorEmprestimo * porcentagem)/100;
        valorFinal = valorEmprestimo + valorFinal;
        System.out.println(valorFinal);
    }
}
