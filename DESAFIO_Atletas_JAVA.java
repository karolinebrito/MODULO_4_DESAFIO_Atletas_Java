import java.util.Scanner;

public class DESAFIO_Atletas_JAVA {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a quantidade de atletas? ");
		int n = sc.nextInt();
		System.out.println();
		
		String nome = null, pessoa_mais_alta = null;
		char sexo;
		double altura, peso = 0;
		double total_homens = 0, total_mulheres = 0, peso_total = 0, mais_alto = 0;
		double altura_total_mulheres = 0;
		
		for (int i=1;i<=n;i++) {
			System.out.println("Digite os dados do atleta numero " + i);
			sc.nextLine();
			System.out.print("Nome: ");
			nome = sc.nextLine();
			System.out.print("Sexo: ");
			sexo = sc.next().charAt(0);
			while ((sexo != 'F') && (sexo != 'M')) {
				System.out.print("Valor invalido! Favor digitar F ou M: ");
				sexo = sc.next().charAt(0);
			}
			System.out.print("Altura: ");
			altura = sc.nextDouble();
			while (altura <= 0) {
				System.out.print("Valor invalido! Favor digitar um valor positivo: ");
				altura = sc.nextDouble();
			}
			System.out.print("Peso: ");
			peso = sc.nextDouble();
			while (peso <= 0) {
				System.out.print("Valor invalido! Favor digitar um valor positivo: ");
				peso = sc.nextDouble();
			}
			peso_total += peso;
			if (sexo == 'F') {
				total_mulheres += 1;
				altura_total_mulheres += altura;
			}
			else {
				total_homens += 1;
			}
			if (altura > mais_alto) {
				mais_alto = altura;
				pessoa_mais_alta = nome;
			}
			else {
				
			}

		}
		
		System.out.println();
		System.out.println("RELATÓRIO: ");
		System.out.println("Peso médio dos atletas: " + String.format("%.2f", (((double) peso_total)/((double) n))));
		System.out.println("Atleta mais alto: " + pessoa_mais_alta);
		System.out.println("Porcentagem de homens: " + String.format("%.2f", (((double)total_homens)/((double) n))*100) + " %");
		if (total_mulheres == 0) {
			System.out.println("Não há mulheres cadastradas");
		}
		else {
			System.out.println("Altura média das mulheres: " + String.format("%.2f", (((double) altura_total_mulheres)/((double) total_mulheres))));

		}
		
		sc.close();

	}

}
