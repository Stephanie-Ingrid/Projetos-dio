import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a;
        int b;

        System.out.println("Digite o primeiro valor: ");
        a = scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        b = scan.nextInt();

        int soma = soma(a, b);
        int subtrair = subtrair(a,b);
        int multiplicar = multiplicar(a,b);
        double dividir = dividir(a,b);

        System.out.println(soma);
        System.out.println(subtrair);
        System.out.println(multiplicar);
        System.out.println(dividir);

    }
    public static int soma (int a, int b) {
        return (a + b);
    }
    public static int subtrair (int a, int b){
        return (a - b);
    }
    public static int multiplicar (int a, int b){
        return (a * b);
    }
    public static double dividir (double a, double b){

        return (a / b);
    }


}