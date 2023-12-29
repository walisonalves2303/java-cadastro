import java.util.Scanner;
public class Cadastro {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		
		String nome;
		String imail;
		int idade;
		double peso;
		String telefone;
		
		System.out.print("Digite seu Nome: ");
		nome = Sc.nextLine();
		
		System.out.print("Digite seu Imail:");
		imail = Sc.nextLine();
		
		System.out.print("Digite seu Telefone:");
		telefone = Sc.nextLine();
		
		System.out.print("Digite sua Idade:");
		idade = Sc.nextInt();
		
		System.out.print("Digite seu Peso:");	
		peso = Sc.nextDouble();
		System.out.println("\n");
		
		System.out.println("CLIENTE CADASTRADO COM SUCESSO!");
		
		System.out.printf("Nome: "+nome+ "\nImail:"+imail+ "\nFone: "+telefone + "\nIdade: "+idade+ " Anos\nPeso: %.2f%n" ,peso);
		
	
		
		Sc.close();

	}

}
