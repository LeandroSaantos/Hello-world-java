
public class Aluno {
	String nome;
	private double nota1;
	private double nota2;
	
public void setNome (String nome) {
	this.nome = nome;
}

public void setNota1 (double nota1) {
	this.nota1 = nota1;
}

public void setNota2 (double nota2) {
	this.nota2 = nota2;
}

public double getMedia () {
	double media = (this.nota1 + this.nota2) / 2;
	return media;
}

}
