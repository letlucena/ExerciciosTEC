import java.util.Scanner;

public class operaçãomultiplicação {
    public static void main(String[] args ) {
    int num1, num2, multiplicação;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite um núemro inteiro:");
    num1 = scanner.nextInt();
    System.out.print("Digite Outro número inteiro: ");
    num2 = scanner.nextInt();

    multiplicação = num1 * num2;
    System.out.println("\nO número digitado foi:"+ num1);
    System.out.println("O número digitado foi: " + num2);
    System.out.println("\nA multiplicação entre eles é " + multiplicação);
 
  }
}


