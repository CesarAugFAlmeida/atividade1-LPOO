package aaa;

import java.util.Scanner;

public class Principal {
	
	static Scanner scan = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		int opcao = 0;
		System.out.println("Digite o tamanho do vetor: ");
		int tam = scan.nextInt();
		Aluno vetAluno [] = new Aluno[tam]; 
		do {
			System.out.println("Digite a opção que deseja: \n"
								+ "1 - Cadastrar\n"
								+ "2 - Imprimir um aluno\n"
								+ "3 - Imprimir todos os alunos\n"
								+ "4 - Alterar nota1\n"
								+ "5 - Alterar nota 2\n"
								+ "6 - Sair");
			opcao = scan.nextInt();
			
			switch (opcao) {
			case 1:
				cadastrar(vetAluno);
				break;
			case 2:
				imprimirAluno(vetAluno);
				break;
			case 3:
				imprimirAlunos(vetAluno);
				break;
			case 4:
				alterarNota1(vetAluno);
				break;
			case 5:
				alterarNota2(vetAluno);
				break;
			case 6:
				System.out.println("Saindo...");
				break;
			default:
				System.err.println("Opção inválida, escolha um valor disponível.");
			}
		}while (opcao != 6);

	}
	
	public static void cadastrar(Aluno [] vet) {
			for (int i = 0; i <= vet.length-1 ; i++) {
				if (vet[i] == null) {
					System.out.println("Digite o nome do aluno: ");
					scan.next();
					String nome = scan.nextLine();
					System.out.println("Digite a matricula do aluno: ");
					int matri = scan.nextInt();
					System.out.println("Digite a nota 1 do aluno:");
					double nota1 = scan.nextDouble();
					System.out.println("Digite a nota 2 do aluno:");
					double nota2 = scan.nextDouble();
					Aluno aluno = new Aluno(nome, matri, nota1, nota2);
					vet[i] = aluno;
					System.out.println("Aluno cadastrado com sucesso!");
					break;
				}else {
					System.out.println("O vetor está cheio");
				}
			}
		}
	
	public static void imprimirAluno(Aluno [] vet) {
		if (vet[0] == null) {
			System.out.println("O vetor está vazio");
		}else {
			System.out.println("Digite o nome do aluno: ");
			scan.next();
			String nome = scan.nextLine();
			for (int i = 0; i <= vet.length; i++) {
				if (vet[i] != null && vet[i].getNome().equalsIgnoreCase(nome)) {
					System.out.println("Nome: "+vet[i].getNome()
									+ "\nMédia: "+vet[i].getMedia());
					break;
				}else {
					System.out.println("Aluno não encontrado. Tente novamente.");
				}
			}
		}
	}
	
	public static void imprimirAlunos(Aluno [] vet) {
		if (vet[0] == null) {
			System.out.println("O vetor está vazio");
		}else {
			for (int i = 0; i <= vet.length; i++) {
				while (vet[i] != null) {
					System.out.println("Nome: "+vet[i].getNome()
							+ "\nNota 1: "+vet[i].getNota1()
							+ "\nNota 2: " +vet[i].getNota2()
							+ "\nMédia: "+vet[i].getMedia());
				}
				break;
			}
		}
	}
	
	public static void alterarNota1(Aluno [] vet) {
		if (vet[0] == null) {
			System.out.println("O vetor está vazio");
		}else {
			System.out.println("Digite o nome do aluno: ");
			scan.next();
			String nome = scan.nextLine();
			for (int i = 0; i <= vet.length; i++) {
				if (vet[i] != null && vet[i].getNome().equalsIgnoreCase(nome)) {
					System.out.println("Nome: "+vet[i].getNome()
							+ "\nNota 1: "+vet[i].getNota1());
					System.out.println("Digite a nova nota: ");
					double nota = scan.nextDouble();
					vet[i].setNota1(nota);
					System.out.println("Nota alterada com sucesso!");
					System.out.println("Nome: "+vet[i].getNome()
							+ "\nNota 1: "+vet[i].getNota1());
					break;
				}else {
					System.out.println("Aluno não encontrado. Tente novamente.");
				}
			}
		}
	}
	
	public static void alterarNota2(Aluno [] vet) {
		if (vet[0] == null) {
			System.out.println("O vetor está vazio");
		}else {
			System.out.println("Digite o nome do aluno: ");
			scan.next();
			String nome = scan.nextLine();
			for (int i = 0; i <= vet.length; i++) {
				if (vet[i] != null && vet[i].getNome().equalsIgnoreCase(nome)) {
					System.out.println("Nome: "+vet[i].getNome()
							+ "\nNota 2: "+vet[i].getNota2());
					System.out.println("Digite a nova nota: ");
					double nota = scan.nextDouble();
					vet[i].setNota2(nota);
					System.out.println("Nota alterada com sucesso!");
					System.out.println("Nome: "+vet[i].getNome()
							+ "\nNota 2: "+vet[i].getNota2());
					break;
				}else {
					System.out.println("Aluno não encontrado. Tente novamente.");
				}
			}
		}
	}
	
	
	}

