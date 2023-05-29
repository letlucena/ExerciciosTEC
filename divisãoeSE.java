import java.util.Scanner;

public class divisãoeSE {
    public static void main(String[] args) {
        double num1, num2, soma;
        Scanner scanner = new Scanner (System.in);
     
        System.out.print("Digite um número inteiro: ");
        num1 = scanner.nextInt();
        System.out.print("Digite Outro número inteiro:");
        num2 = scanner.nextInt();


        if (num2 == 0) { // o símbolo com dois iguais ( == ) representa uma comparação
            System.out.println("se o divisor foi 0 a divisão não ocorre");
        } else {
        soma = num1 / num2;
        System.out.println("\nO número digitado foi: " + num1);
        System.out.println("O número didgitado foi: " + num2);   
        System.out.println("\nA divisão entre eles é " + soma);

   }
}
}