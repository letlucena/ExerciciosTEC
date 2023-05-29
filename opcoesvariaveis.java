import java.util.Scanner;

public class opcoesvariaveis {
    public static void main(String[]args) {
        int opcao;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Opção 1: LANCHE NATURAL.");
        System.out.println("Opção 2: SALGADINHO.");
        System.out.println("Opção 3: BOLINHO.");
        System.out.println("\nSelecione sua Refeição:");
        System.out.println("Opção: ");
        opcao = scanner.nextInt();
        scanner.close();

        switch (opcao) {
        case 1:
                 System.out.println("\nOpção 1 LANCHE NATURAL.");
            break;
        case 2: 
             System.out.println("\nOpção 2 SALGADINHO. ");
             break;
        case 3:
             System.out.println("\nOpção 3 BOLINHO.");
             break;
             default:
             System.out.println("\nOpção invalida");
             break;
        }
      }

}

