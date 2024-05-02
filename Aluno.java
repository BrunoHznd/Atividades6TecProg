package Agregacao;

public class Aluno {

	 private String nome;
	    private Disciplina disciplina;

	    public Aluno(String nome) {
	        this.nome = nome;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public Disciplina getDisciplina() {
	        return disciplina;
	    }

	    public void setDisciplina(Disciplina disciplina) {
	        this.disciplina = disciplina;
	    }

	    @Override
	    public String toString() {
	        return "Aluno " + " nome:  '" + nome  + disciplina;
	    }
	
}
