import java.util.Scanner;

public class MediaApp {

	public static void main (String [] Args) {
		//entrada
		Scanner teclado = new Scanner (System.in);
		System.out.print ("Digite o nome do aluno: ");
		String nome = teclado.nextLine();
		
		System.out.println("Digite a primeira nota: ");
		double nota1 = teclado.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		double nota2 = teclado.nextDouble();
		
		//processamento
		Aluno aluno = new Aluno();
		aluno.setNota1(nota1);
		aluno.setNota2(nota2);
		
		//saida
		System.out.println("Media: " + aluno.getMedia());
		teclado.close();
	}
}
