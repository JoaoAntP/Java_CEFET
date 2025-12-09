import java.util.Scanner;

public class ExemploString {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o nome completo: ");
        entrada.nextLine(); // Limpa o buffer se necessário
        String nome = entrada.nextLine(); // Corrigido: nextLine() em vez de nextline()
        
        System.out.println("Digite o sobrenome: ");
        String sobrenome = entrada.next();
        
        System.out.println("Valores lidos: \n" + nome + "\n" + sobrenome);
        entrada.close();
    }
}