import java.util.*;


class Motorista
{
	Date anoNasc;
	char sexo;
	int procedencia;
	
	public Motorista(Date ano, char s, int p)throws Exception
	{
		if( (p < 0) || (p>2)) throw new Exception ("Procedencia invalida");
		
		if("MF".indexOf(Character.toUpperCase(s)) == -1)throw new Exception ("Sexo invalido");
		
		
		this.anoNasc = ano;
		this.sexo = Character.toUpperCase(s);
		this.procedencia = p;
	}
	
	public Date getNasc()
	{
		return this.anoNasc;
	}
	public char getSexo ()
	{
		return this.sexo;
	}
	public int getProcedencia()
	{
		return this.procedencia;
	}
}

class Historico
{
		Vector<Motorista> hist;
		
		public Historico()
		{
			this.hist = new Vector<Motorista>();
		}
		
		public void addMot(Motorista m)
		{
			hist.add(m);
		}
		
		public int menos21()
		{
			int qts =0;
			
			for(int i = 0; i<this.hist.size();i++)
			{
				Motorista temp = this.hist.get(i);
				Date ref = new Date();
				ref.setYear(ref.getYear()-21);
				boolean status = temp.getNasc().after(ref);
				if(status){qts++;}
					
			}
			
			return qts;
		}
		
		public int qntsPessoas (char s, int p) throws Exception
		{
			if( (p < 0) || (p>2)) throw new Exception ("Procedencia invalida");
		
			if("MF".indexOf(Character.toUpperCase(s)) == -1)throw new Exception ("Sexo invalido");
			
			int qts = 0;
			
			for(int i = 0; i<this.hist.size();i++)
			{
				Motorista temp = this.hist.get(i);
				if( (temp.getSexo() ==Character.toUpperCase(s)) && (temp.getProcedencia()== p) )
				{
					qts++;
				}
					
			}
			
			
			return qts;
		}
		
		public int mais60 (int p) throws Exception
		{
			if( (p < 0) || (p>2)) throw new Exception ("Procedencia invalida");
			
			int qts =0;
			
			for(int i = 0; i<this.hist.size();i++)
			{
				Motorista temp = this.hist.get(i);
				if(temp.getProcedencia()==p){
					Date ref = new Date();
					ref.setYear(ref.getYear()-60);
					boolean status = temp.getNasc().before(ref);
					if(status){qts++;}
					}
					
			}
			
			return qts;
		}
}

public class MainAcidentes {
	
	public static void main (String[] args) {
		try{
			Motorista mt = new Motorista(new Date(97,1,12),'M',1);
			Historico hs = new Historico();
			hs.addMot(mt);
			
			mt = new Motorista(new Date(101,1,12),'M',1);
			hs.addMot(mt);
			
			mt = new Motorista(new Date(87,1,12),'f',1);
			hs.addMot(mt);
			
			mt = new Motorista(new Date(78,1,12),'f',1);
			hs.addMot(mt);
			
			mt = new Motorista(new Date(105,1,12),'M',1);
			hs.addMot(mt);
			
			mt = new Motorista(new Date(105,1,12),'F',0);
			hs.addMot(mt);
			mt = new Motorista(new Date(32,1,12),'F',1);
			hs.addMot(mt);
			
			System.out.println("Qtd pessoas com mais de 60 anos: "+hs.mais60(1));
			
			}catch(Exception erro)
			{
				System.err.println(erro.getMessage());
			}
	}
}

