package aula.hello;
import java.util.Scanner;
public class Exercicio29 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double valor1;
		double quant1;
		double valor2;
		double quant2;
		double IPI;

		System.out.println("Informe o CÓDIGO da peça 1: ");
		double cod1 = sc.nextDouble();
		
		System.out.println("Informe o VALOR UNITÁRIO da peça 1: ");
		valor1 = sc.nextDouble();
		
		System.out.println("Informe a QUANTIDADE de peças 1: ");
		quant1 = sc.nextDouble();
		
		System.out.println("Informe o CÓDIGO da peça 2: ");
		double cod2 = sc.nextDouble();
		
		System.out.println("Informe o VALOR UNITÁRIO da peça 2: ");
		valor2 = sc.nextDouble();
		
		System.out.println("Informe a QUANTIDADE de peças 2: ");
		quant2 = sc.nextDouble();
		
		System.out.println("Informe o percentual de IPI (SEM \"%\"): ");
		IPI = sc.nextDouble();
		double formula = (valor1*quant1 + valor2*quant2)*((IPI/100) + 1);

		System.out.println("A quantidade de IPI a ser acrescido no valor das peças: " + formula);

	}
}
