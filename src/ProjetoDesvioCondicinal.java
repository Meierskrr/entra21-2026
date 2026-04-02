import java.util.Scanner;
import static java.lang.Math.*;
public class ProjetoDesvioCondicinal {
	static void Ex01() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int n = s.nextInt();
		
		System.out.println("");
		
		System.out.print(n%2==0 ? "O número é par":"O número é ímpar");	
		
		s.close();
	}
	
	static void Ex02() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int n1 = s.nextInt();
		
		System.out.println("");
		
		System.out.print("Digite outro número: ");
		int n2 = s.nextInt(), soma = n1+n2;
		
		System.out.println("");
		
		System.out.printf("Soma = %d", soma);	
		
		s.close();
	}
	
	static void Ex03() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int n = s.nextInt();
		
		System.out.println("");
		
		if (n>0) {
			System.out.println("Número positivo");
		} 
		
		else if (n==0) {
			System.out.println("Zero");
		}
		
		else {
			System.out.println("Número negativo");
		}
		
		s.close();
	}
	
	static void Ex04() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Digite um número de 0 a 10: ");
		int n = s.nextInt();
		
		System.out.println("");
		
		System.out.print(n>=6 ? "Aprovado":"Reprovado");	
		
		s.close();
	}
	
	static void Ex05() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Informe sua idade: ");
		int n = s.nextInt();
		
		System.out.println("");
		
		System.out.print(n>=16 ? "Pode votar":"Não pode votar");
		
		s.close();
		
	}

	static void Ex06() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int n = s.nextInt();
		
		System.out.println("");
		
		System.out.print("Digite um número: ");
		int n2 = s.nextInt();
		
		System.out.println("");
		
		System.out.print("Digite um número: ");
		int n3 = s.nextInt();
		
		System.out.println("");
		
		if (n>n2 && n>n3) {
			System.out.printf("O número %d é o maior", n);
		} 
		
		else if (n2>n && n2>n3) {
			System.out.printf("O número %d é o maior", n2);
		} 
		
		else {
			System.out.printf("O número %d é o maior", n3);
		}
		
		s.close();
	
	}
	
	static void Ex07() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Digite um número de 0 a 10: ");
		int n = s.nextInt();
		
		System.out.println("");
		
		if  (n>=9) {
			System.out.println("Excelente");	
		}
		
		else if  (n>=7) {
			System.out.println("Bom");	
		}
		
		else if  (n>=5) {
			System.out.println("Regular");	
		}
		
		else {
			System.out.println("Insuficiente");	
		}
		
		s.close();
	}
		
	static void Ex08() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int n = s.nextInt();
		
		System.out.println("");
		
		System.out.print("Digite um número: ");
		int n2 = s.nextInt();
		
		System.out.println("");
		
		System.out.print("Digite um número: ");
		int n3 = s.nextInt();
		
		System.out.println("");
		
		System.out.println(n+n2>n3 && n2+n3>n && n+n3>n2 ? "O triângulo existe":"O triângulo não existe");
		
		s.close();
		}
		
	
	static void Ex09() {
		Scanner s = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int n = s.nextInt();
		System.out.println("");
		System.out.print("Digite um número: ");
		int n2 = s.nextInt();
		System.out.println("");
		System.out.print("Digite um número: ");
		int n3 = s.nextInt();
		System.out.println("");
		
		if (n==n2 && n==n3) {
			System.out.println("Equilátero");	
		}
		
		else if (n!=n2 && n!=n3 && n2!=n3) {
			System.out.println("Escaleno");	
		}
		
		else {
			System.out.println("Isósceles");
		}	
	}
		
	static void Ex10() {
		Scanner s = new Scanner(System.in);
		
		String u = "Matheus";
		
		int S = 150707;
		
		System.out.print("Usuário: ");
		String usuario = s.next();
		
		System.out.println("");
		
		System.out.print("Senha: ");
		int senha= s.nextInt();
		
		System.out.println("");
		
		System.out.println(u.equals(usuario) && S==senha ? "Acesso permitido":"Acesso negado");
	
		s.close();
	}
		
	static void Ex11() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Ano: ");
		int ano = s.nextInt();
		
		System.out.println("");
		
		if (ano%100==0 && ano%400==0) {
			System.out.println("Ano bissexto");
		}
		
		else if (ano%4 == 0) {
			System.out.println("Ano bissexto");	
		}
		
		else {
			System.out.println("Ano não é bissexto");		
		}
		s.close();		
	}
	
	static void Ex12() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		float n1 = s.nextFloat();
		
		System.out.println("");
		
		System.out.print("Digite outro número: ");
		float n2 = s.nextFloat();
		
		System.out.println("");
		
		System.out.print("Escolha a operação [+. -, *, /]: ");
		String operacao = s.next();
		
		System.out.println("");
		
		if (operacao.equals("+")) {
			float soma = n1 + n2;
			System.out.printf("Soma: %.2f", soma);
		}
		
		if (operacao.equals("-")) {
			float sub = n1 - n2;
			System.out.printf("Soma: %.2f", sub);
		}
		
		if (operacao.equals("*")) {
			float multiplicacao = n1 * n2;
			System.out.printf("Multiplicação: %.2f", multiplicacao);
		}
		
		else {
			float div = n1/n2;
			System.out.printf("Divisão: %.2f", div);
		}
		
		s.close();	
	}
	
	static void Ex13() {
	Scanner s = new Scanner(System.in);
	
	System.out.print("Informe o seu salário: R$ ");
	float sal = s.nextFloat();
	
	System.out.println("");
	
	String imposto;
	
	if (sal>=3000) {
		imposto = "10%";
	}
	
	else if (sal<=6500) {
		imposto = "15%";
	}
	
	else if (sal<=10000) {
		imposto = "20%";
	}
	
	else {
		imposto = "25%";
	}
	
	System.out.printf("O seu imposto será de %s em relação ao salário", imposto);
	s.close();	
	}
	
	static void Ex14() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Informe o preço do produto: R$ ");
		float p = s.nextFloat();
		
		System.out.println("");
		
		String desconto;
		
		if (p<=100) {
			desconto = "Sem desconto";
		}
		
		else if (p<=500) {
			desconto = "10%";
		}
		
		else {
			desconto = "20%";
		}
		
		System.out.printf("O valor do desconto é: %s", desconto);
		s.close();
			
	}
		
	static void Ex15() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Idade: ");
		int i = s.nextInt();
		
		System.out.println("");
		
		String c;
		
		if (i<=12) {
			c = "Criança";
		}
		
		else if (i<=17) {
			c = "Adolescente";
		}
		
		else if (i<=59){
			c = "Adulto";
		}
		
		else {
			c = "Idoso";
		}
		
		System.out.printf("A sua classificação é: %s", c);
		s.close();		
	}
	
	static void Ex16() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Primeira nota: ");
		float n1 = s.nextFloat();
		
		System.out.println("");
		
		System.out.print("Segunda nota: ");
		float n2 = s.nextFloat();
		
		System.out.println("");
		
		System.out.print("Terceira nota: ");
		float n3 = s.nextFloat();
		
		System.out.println("");
		
		float media = (n1+n2+n3)/3;
		
		if(media>=7) {
			System.out.println("Aprovado");
		}
		
		else if (media>=4) {
			System.out.println("Recuperação");	
		}
		
		else {
			System.out.println("Reprovado");
		}
		
		s.close();
	}
		
	static void Ex17() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Valor salário: R$ ");
		float salario = s.nextFloat();
		
		System.out.println("");
		
		System.out.print("Valor das parcelas: R$ ");
		float parcela = s.nextFloat();
		
		System.out.println(""); 
		
		if (parcela <= salario * 0.5f) {
			System.out.println("Empréstimo aprovado");	
		}
		
		else {
			System.out.println("Empréstimo não aprovado");
		}
		
		s.close();		
	}
		
	static void Ex18() {
		
	Scanner s = new Scanner(System.in);
	
	System.out.print("Tente adivinhar o meu número: ");
	int numero_usuario = s.nextInt();
	
	System.out.println("");
	int numero_sistema = 59;
	
	if (numero_usuario>numero_sistema) {
		System.out.println("Estou pensando em um número menor");
	}
	
	else if (numero_usuario<numero_sistema) {
		System.out.println("Estou pensando em um número maior");
	}
	
	else {
		System.out.println("Parabéns! Voce adivinhou o número que eu estava pensando.");
	}
	
	s.close();
		
	}
	
	static void Ex19() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Peso [KG]: ");
		float peso = s.nextFloat();
		
		System.out.println("");
		
		System.out.print("Altura [m]: ");
		float altura = s.nextFloat();
		
		System.out.println(""); 
		
		float imc = (float) (peso/(Math.pow(altura, 2)));
		
		if (imc>=30) {
			System.out.println("Obeso");
		}
		
		if (imc>=25) {
			System.out.println("Sobrepeso");
		}
		
		else {
			System.out.println("Normal");
		}
		
		s.close();
			
	}
	
	static void Ex20() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Senha: ");
		String senha = s.next();
		
		String senha_correta = "Matheus";
		int tentativas = 1;
		
		System.out.println("");
		
		if (senha.equals(senha_correta)) {
			System.out.println("Acesso permitido");
		}
		
		else {
			while (true) {
				System.out.println("Senha incorreta. Tente novamente.");
				System.out.print("Senha: ");
				senha = s.next();
				tentativas += 1;
				
				if (tentativas>3) {
					System.out.println("Acesso negado");
					break;
				}
				
				else if (senha.equals(senha_correta)) {
					System.out.println("Acesso permitido");
					break;	
				}	
			}		
		}
		
		s.close();
	}
	
	
	

	public static void main(String[] args) {
		
	}

}
