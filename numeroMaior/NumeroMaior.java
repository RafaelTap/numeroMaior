package numeroMaior;

import java.util.Scanner;

public class NumeroMaior {

	// Um programa que lê três números inteiros e mostra o maior deles, caaso
	// contrário mostra um erro.

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o primeiro número.");
		int n1 = entrada.nextInt();

		System.out.println("Digite o segundo número.");
		int n2 = entrada.nextInt();

		System.out.println("Digite o terceiro número.");
		int n3 = entrada.nextInt();

		if (n1 > n2 && n1 > n3) {
			System.out.println("O maior número é: " + n1);

		} else if (n2 > n1 && n2 > n3) {
			System.out.println("O maior número é: " + n2);

		} else if (n3 > n1 && n3 > n2) {
			System.out.println("O maior número é: " + n3);

		} else {
			System.out.println("Impossível verificar o maior número.");
		}

		entrada.close();
	}

}
