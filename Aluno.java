package aaa;

public class Aluno {

	private String nome;
	private int matri; 
    private double nota1, nota2, media;

	public Aluno(String nome, int matri, double nota1, double nota2) {
		super();
		this.nome = nome;
		this.matri = matri;
		this.nota1 = nota1;
		this.nota2 = nota2;
        calcularMedia();
	}

    private void calcularMedia (){
        this.media = (this.nota1 + this.nota2)/2;
    }
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMatri() {
		return matri;
	}
	public void setMatri(int matri) {
		this.matri = matri;
	}
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public double getMedia() {
		return media;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", matri=" + matri + ", nota1=" + nota1 + ", nota2=" + nota2 + ", media=" + media
				+ "]";
	}
	
	
}
