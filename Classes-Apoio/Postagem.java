class Selos
{
	
	public static int[] getSelosMin (int valorCentavos) throws Exception
	{
		if(valorCentavos <8) throw new Exception ("valor invalido, deve ser um valor maior ou igual a 8 centavos");
		
		int qtdSelo5 = 0;
		int qtdSelo3 = 0;
		int qtdSelo1 = 0;
		
		//X.selo5 + Y.selo3 + Z.selo1;
		while(valorCentavos >= 5)
		{
			valorCentavos = valorCentavos - 5;
			qtdSelo5++;
			
		}
		
		while(valorCentavos >= 3)
		{
			valorCentavos = valorCentavos - 3;
			qtdSelo3++;
			
		}
		
		while(valorCentavos >= 1)
		{
			valorCentavos = valorCentavos - 1;
			qtdSelo1++;
			
		}
		
		
		int[] temp = new int[3];
		temp[0] = qtdSelo5;
		temp[1] = qtdSelo3;
		temp[2] = qtdSelo1;
		
		return temp;
	}
}


public class Postagem {
	
	public static void main (String[] args) {
		try{
			int[] temp = Selos.getSelosMin(70);
			System.out.println("Quantidade de selos de 5 centavos: "+temp[0]);
			System.out.println("Quantidade de selos de 3 centavos: "+temp[1]);
			System.out.println("Quantidade de selos de 1 centavo: "+temp[2]);
			}catch(Exception e)
			{
				System.err.println(e.getMessage());
			}
		
	}
}

