import java.util.Date;

public class Pessoa {
	
	protected String nome;
	protected  Date dataNasc;
	
	public Pessoa(String nm, Date data)
	{
		this.nome = nm;
		this.dataNasc = data;
	}
	public Pessoa()
	{
	}
	
	public String getNome()
	{
		return this.nome;
	}
	
	public Date getDataNasc()
	{
		return this.dataNasc;
	}
	
	public void setNome(String nm)
	{
		this.nome = nm;
	}
	
	public void setDataNasc (Date data)
	{
		this.dataNasc = data;
	}
	
	void andar() { System.out.println("Pessoa andando"); }
	
}

