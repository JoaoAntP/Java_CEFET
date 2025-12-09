public class Principal {
    public static void main(String[] args) {
        // Exemplo 1: Usando construtor padrão + setters
        Pessoa p1 = new Pessoa();
        p1.setNome("Maria");
        p1.setIdade(18);
        System.out.println("Pessoa 1:");
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Idade: " + p1.getIdade());
        
        System.out.println("\n----------\n");
        
        // Exemplo 2: Usando construtor com parâmetros
        Pessoa p2 = new Pessoa("João", 25);
        System.out.println("Pessoa 2:");
        System.out.println("Nome: " + p2.getNome());
        System.out.println("Idade: " + p2.getIdade());
    }
}