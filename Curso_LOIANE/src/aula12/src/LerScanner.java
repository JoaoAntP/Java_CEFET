package aula12.src;

import java.util.Scanner;
public class LerScanner {
    public static void main(String []args){

        Scanner scan = new Scanner(System.in);

       /* System.out.println("Digite seu nome completo");
        String nomeCompleto = scan.nextLine();
        System.out.println("Seu nome completo e : " + nomeCompleto);

        System.out.println("Digite seu nome ");
        String nome = scan.next();
        System.out.println("Seu nome completo e : " + nome);*/

        /*System.out.println("Digite sua idade:");
        int idade = scan.nextInt();
        System.out.println("Sua idade é : " + idade);*/

        System.out.println("Digite o seu primeiro nome, idade, quantidade de filhos, altura e se tem bichinho de estimação");
        String primeiroNome = scan.next();
        int idade = scan.nextInt();
        byte qtdFilhos = scan.nextByte();
        float altura = scan.nextFloat();
        boolean temPet = scan.nextBoolean();

        System.out.println("Digite seu Primeiro Nome: " + primeiroNome);
        System.out.println("Sua idade é: " + idade);
        System.out.println("Sua quantidade de filhos é:" + qtdFilhos);
        System.out.println("Sua alutra e de " + altura +"m");
        System.out.println("Sua resposta pra pet foi " + temPet);

    }
}
