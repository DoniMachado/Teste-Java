import java.util.Date;
public class Estudante extends Pessoa {
	int codigoMatricula;
	int codigoTurma;
	
	public Estudante(int Turma, int Mat)
	{
		super("",new Date());
		this.codigoTurma = Turma;
		this.codigoMatricula = Mat;
	}
	public Estudante(String nome, Date data, int Turma, int Mat)
	{
		super(nome,data);
		this.codigoTurma = Turma;
		this.codigoMatricula = Mat;
	}
	public Estudante()
	{
	}
	
	public void setcdMat(int Mat)
	{
		this.codigoMatricula = Mat;
	}
	
	public void setcdTurma (int Turma)
	{
		this.codigoTurma = Turma;
	}
	
	public int getMat()
	{
		return this.codigoMatricula;
	}
	
	public int getTurma()
	{
		return this.codigoTurma;
	}
	
	void andar() { System.out.println("Estudante andando"); }
	void andar(String percurso) { System.out.println("Percurso="+percurso); }

	
}

