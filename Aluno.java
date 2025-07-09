public class Aluno {

	private int matr;

	private String nome;

	private double nota1;

	private double nota2;

	

	public Aluno(int matr, String nome, double nota1, double nota2) {

		this.matr = matr;

		this.nome = nome;

		this.nota1 = nota1;

		this.nota2 = nota2;

	}

	public double calcularMedia() {

		return (this.nota1 + this.nota2) / 2;

	}

	public void exibirSituacao(double md) {

		if(md >= 6)

			System.out.println("Aprovado");

		else

			System.out.println("Reprovado");

	}

	public void exibirDados(double med) {

		System.out.println("Matrícula: " + this.matr);

		System.out.println("Nome: " + this.nome);

		System.out.println("Primeira nota: " + this.nota1);

		System.out.println("Segunda nota: " + this.nota2);

		System.out.println("Média: " + med);

	}

}



package stugui;



public class Endereco {

	private String tipo;

	private String nome;

	private int num;

	private int apto;

	private String compl;

	public Endereco(String tipo, String nome, int num, String compl) {

		this.tipo = tipo;

		this.nome = nome;

		this.num = num;

		this.compl = compl;

	}

	public Endereco(String tipo, String nome, int num, int apto) {

		this.tipo = tipo;

		this.nome = nome;

		this.num = num;

		this.apto = apto;

	}

	public Endereco(String tipo, String nome, int num, int apto, String compl) {

		this.tipo = tipo;

		this.nome = nome;

		this.num = num;

		this.apto = apto;

		this.compl = compl;

	}

	public Endereco(String tipo, String nome, int num) {

		this.tipo = tipo;

		this.nome = nome;

		this.num = num;

	}

	public void exibir() {

		System.out.print("Endereco: " + tipo + " ");

		System.out.print(nome + ", ");

		System.out.print(num);

		if(apto!=0) {

			System.out.print("/"+apto);

		}

		if(compl!=null) {

			System.out.print("-"+compl);

		}

	}



}



package stugui;



public class Pessoa {

	private String nome;

	private Endereco ender;

	public Pessoa(String nome, Endereco ender) {

		this.nome = nome;

		this.ender = ender;

	}

	public void setnome(String nome) {

		this.nome = nome;

	}

	public String gethome() {

		return this.nome;

	}

	public void exibir() {

		System.out.print("Nome: " +nome);

		ender.exibir();

	}

}



package stugui;

import java.util.Scanner;

public class Principal {
	public static Endereco leCriaCasa(Scanner sca) {
		System.out.println("Digite tipo logradouro: ");
		String tipo = sca.nextLine();
		System.out.println("Digite o nome do logradouro: ");
		String nome = sca.nextLine();
		System.out.println("Digite número logradouro: ");
		int num = sca.nextInt();
		Endereco end = new Endereco(tipo, nome, num);
		return end;
	}
	public static Endereco leCriaApto(Scanner sca) {
		System.out.println("Digite tipo logradouro: ");
		String tipo = sca.nextLine();
		System.out.println("Digite o nome do logradouro: ");
		String nome = sca.nextLine();
		System.out.println("Digite número logradouro: ");
		int num = sca.nextInt();
		System.out.println("Digite apartamento: ");
		int apto = sca.nextInt();
		Endereco end = new Endereco(tipo, nome, num, apto);
		return end;
	}
	public static Endereco leCriaCasaCompl(Scanner sca) {
		System.out.println("Digite tipo logradouro: ");
		String tipo = sca.nextLine();
		System.out.println("Digite o nome do logradouro: ");
		String nome = sca.nextLine();
		System.out.println("Digite número logradouro: ");
		int num = sca.nextInt();
		System.out.println("Digite complemento: ");
		String compl = sca.nextLine();
		Endereco end = new Endereco(tipo, nome, num, compl);
		return end;
	}
	public static Endereco leCriaAptoCompl(Scanner sca) {
		System.out.println("Digite tipo logradouro: ");
		String tipo = sca.nextLine();
		System.out.println("Digite o nome do logradouro: ");
		String nome = sca.nextLine();
		System.out.println("Digite número logradouro: ");
		int num = sca.nextInt();
		System.out.println("Digite apartamento: ");
		int apto = sca.nextInt();
		System.out.println("Digite complemento: ");
		String compl = sca.nextLine();
		Endereco end = new Endereco(tipo, nome, num, apto, compl);
		return end;
	}
	public static int menu(Scanner sca) {
		System.out.println("1 - Casa");
		System.out.println("2 - apto");
		System.out.println("3 - Casa+compl");
		System.out.println("4 - apto+compl");
		System.out.println("Digite um número");
		int opc = sca.nextInt();
		sca.nextLine();
		return opc;
	}
		public static void main(String[] args) {
			Scanner ent = new Scanner(System.in);
			Endereco end;
			Pessoa pessoa;
			int opc;
			String nome;
			opc = menu(ent);
			while(opc < 5) {
				System.out.println("Digite seu nome");
				nome = ent.nextLine();
				if(opc==1)
					end = leCriaCasa(ent);
				else
				if(opc==2)
					end = leCriaApto(ent);
				else
				if(opc==3)
					end = leCriaCasaCompl(ent);
				else
					end = leCriaAptoCompl(ent);
				pessoa = new Pessoa(nome, end);
				pessoa.exibir();
				opc = menu(ent);
			}
			ent.close();
		}
}


