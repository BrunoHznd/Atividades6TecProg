package Agregacao;

import java.util.Scanner;

public class aaaaa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = scanner.nextLine();

        Aluno aluno = new Aluno(nomeAluno);

        System.out.print("Digite o nome da disciplina: ");
        String nomeDisciplina = scanner.nextLine();

        System.out.print("Digite a carga horária da disciplina: ");
        int cargaHorariaDisciplina = scanner.nextInt();

        Disciplina disciplina = new Disciplina(nomeDisciplina, cargaHorariaDisciplina);
        aluno.setDisciplina(disciplina);

        System.out.println("\nDados do Aluno:");
        System.out.println(aluno);
        
        scanner.close();
    }
}