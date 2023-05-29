import java.util.Scanner;

  public class NOMEusuariodois {
    public static void main( String[]args) {
    
        int idade;
        Scanner NOMEusuariodois = new Scanner (System.in);

        System.out.print("como você se chama?");
        String nome = NOMEusuariodois.nextLine();
        System.out.print("Olá" + nome + "!");
        System.out.print("Quantos anos você tem?");
        idade = NOMEusuariodois.nextInt();
        System.out.print("eu também tenho" +idade + "anos");
        
    }
}
