package builder;

public class Curso {
	
	String nome;
	String codigo;
	String disciplina;
	String livro;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	public String getLivro() {
		return livro;
	}
	public void setLivro(String livro) {
		this.livro = livro;
	}
	
	public String toString() {
		String s ="\n";
	
		s += "nome: " + this.nome + "\n";
		s += "codigo: " + this.codigo + "\n";
		s += "disciplina: " + this.disciplina + "\n";
		s += "livro: " + this.livro + "\n";
		
		return s;
	}	
	
	


}
