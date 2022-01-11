
import java.io.*;

class Primo{
	
	public static void main(String args[]){
		

		BufferedReader teclado =  new BufferedReader (new InputStreamReader (
                   System.in));
		boolean invalido = false;
		int valor=0;

		do{
			try{
				System.out.println("Digite um numero inteiro");
				valor = Integer.parseInt(teclado.readLine());	
				invalido = false;	
				
				}catch(IOException erro)
			{
			invalido = true;
				System.err.println(erro.getMessage());
			}
			catch (NumberFormatException erro)
			{
				invalido = true;
				System.err.println("Input invalid, por favor digite um numero inteiro");
			}

	
}while(invalido);

			if(valor < 2){
				System.out.println("O numero: "+valor+", nao e um numero primo.");
				}else{
		int div = 0;
		for (int i = 1; i<= valor;i++ )
		{
			if(valor % i == 0){
			div++;
				}
		}
		if(div == 2){
		System.out.println("O numero: "+valor+", e um numero primo.");
		}else{
		System.out.println("O numero: "+valor+", nao e um numero primo.");
		}
		}



}
}
