import java.util.Scanner;

public class nomeUsuario {
    public static void main(String[] args) {
        Scanner nomeUsuario = new Scanner(System.in);

        System.out.print("Como você chama?");
        String nome = nomeUsuario.nextLine();
        System.out.print("Olá" + nome +"!");

    }
}
