// Pessoa.java
public class Pessoas {
    private String nome; // Deveria ser private para encapsulamento
    private int idade;   // Deveria ser private para encapsulamento
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getIdade() {
        return this.idade;
    }
    
    public String getNome() {
        return this.nome;
    }
}

// Principal.java (COM ERROS - corrigido abaixo)
public class Principal {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("Maria"); // Corrigido: setNome em vez de setHome
        p.setIdade(18);
        System.out.println("Nome: " + p.getNome() + "\nIdade: " + p.getIdade()); // Corrigido: getNome
    }
}