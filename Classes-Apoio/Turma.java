class Turma{

private String descricao;
private int codigoTurma;
private int codigoProfessor;

	public Turma(String desc,int cdTurma, int cdProf)
	{
		this.descricao = desc;
		this.codigoTurma = cdTurma;
		this.codigoProfessor = cdProf;
	}
	
	public void setDesc (String desc)
	{
		this.descricao = desc;
	}
	
	public void setcdTurma (int cdTurma)
	{
		this.codigoTurma = cdTurma;
	}
	
	public void setcdProf (int cdProf)
	{
		this.codigoProfessor = cdProf;
	}
	
	public String getDesc()
	{
		return this.descricao;
	}
	
	public int getcdTurma()
	{
		return this.codigoTurma;
	}
	
	public int getcdProf()
	{
		return this.codigoProfessor;
	}
	
	
	}
