import java.util.Date;
public class Professor extends Pessoa {
	private int codigoProfessor;
	
	public Professor(int cdProf)
	{
		super("",new Date());
		this.codigoProfessor = cdProf;
	}
	
	public Professor(String nome , Date data, int cdProf)
	{
		super(nome,data);
		this.codigoProfessor = cdProf;
	}
	
	public void setcdProf(int cdProf)
	{
		this.codigoProfessor = cdProf;
	}
	
	public int getcdProf()
	{
		return this.codigoProfessor;
	}
	
	void andar() { 
		System.out.println("Pessoa andando"); 
		}
	
}

