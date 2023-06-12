import java.util.Scanner;
public class aplicativo {
    public static void main (String[] args){
        
///ESCREVER UMA VARIÁVEL PARA SER DIGITADA, DEPOIS ESCREVER NA TELA PARA DIGITAR DEPOIS 
///ESCREVER PARA ARMAZENAR O QUE FOI ESCRITO 
/// NÃO O CONTRÁRIO ARMAZENAR E DEPOIS ESCREVER, O "NOME" É A VARIÁVEL DO NOMEUSUÁRIO É COMO SE 
//FOSSE UMA 
///PASTINHA
       String nome;
       System.out.print("\nescreva seu nome completo");
       Scanner nomedousuario = new Scanner(System.in); 
      // Scanner nomedousuário = new Scanner(System.in); 
       nome = nomedousuario.nextLine();
       System.out.print("\nOla, " + nome);
      
       String CPF;
       System.out.print("\nDigite seu CPF (Certificado de Pessoa Física)");
       Scanner numerodeCPF = new Scanner(System.in);
       CPF = numerodeCPF.nextLine();
       System.out.print("\nSeu Número de CPF é," + CPF);

       String DataDeNascimento;
       System.out.print("\nEscreva sua Data de Nascimento (FORMATO: DD/MM/AAAA)");
       Scanner DATA  = new Scanner(System.in);
       DataDeNascimento = DATA.nextLine();
       System.out.print("\n Você nasceu dia," + DataDeNascimento );

       String EndereçoResidencial;
       System.out.print("\nescreva seu endereço estado/cidade/rua/número da casa se morar em apartamento escreva o nome e núemro do prédio,bloco, e número do apartamento (ambos ponto de referência)");
       Scanner Endereço = new Scanner(System.in);
       EndereçoResidencial = Endereço.nextLine();
       System.out.print("\nSeu endereço é," + EndereçoResidencial);


       int SenhadeAcesso;
       int confere;
       System.out.print("\nDigite uma senha com até 6 digitos");
       Scanner senha = new Scanner(System.in);
       SenhadeAcesso = senha.nextInt();
       System.out.print("\nConfirme sua senha: ");
       confere = senha.nextInt();

      if (SenhadeAcesso == confere) {
        System.out.println("Senha Válida cadastrada, registro concluído.");
      } else {
        System.out.println("Senha inválida, tente se cadastrar novamente.");
        System.out.println("Concluido");
    }

    }
} 