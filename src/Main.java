import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite até que número deseja ir na sequencia Fibonacci!");
        int num = ler.nextInt();
        System.out.println(Fibonacci.Math(num));
        }
    }
