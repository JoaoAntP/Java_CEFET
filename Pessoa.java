// Pessoa.java
public class Pessoa {
    String nome;
    int idade;
}

// Principal.java
public class Principal {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.nome = "Maria"; // Acesso direto - não recomendado
        p.idade = 18; // Acesso direto - não recomendado
        System.out.println("Nome: " + p.nome + "\nIdade: " + p.idade);
    }
}