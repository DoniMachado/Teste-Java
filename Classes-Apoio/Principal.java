
import java.util.*;

public class Principal {
 
public static void main(String[] args) {
	


double nota1 = 0, nota2 = 0, nota3 = 0, media;
int qtsAlunos = 1;
Vector<Double> meuVetor = new Vector<Double>(30);
do{
	try{
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Aluno: "+qtsAlunos+", Entre com a primeira nota:");	
		nota1 = ler.nextDouble();		
		System.out.println("Aluno: "+qtsAlunos+", Entre com a segunda nota:");			
		nota2 = ler.nextDouble();		
		System.out.println("Aluno: "+qtsAlunos+", Entre com a terceira nota:");		
		nota3 = ler.nextDouble();
		
		
		media = (nota1+nota2+nota3)/3;
		

		if(media >= 7) {
		System.out.println("Aprovado com media "+media);
		}
		else if(media >=5) {
		System.out.println("Recuperacao com media "+media);
		}
		else {
		System.out.println("Reprovado com media "+media);
		}
		
		meuVetor.add(nota1);
		meuVetor.add(nota2);
		meuVetor.add(nota3);
		
		qtsAlunos++;
		
		}catch(InputMismatchException  erro)
		{
			System.err.println("Input de formato invalido, por favor digite um numero");
			
			
		}
		catch(Exception erro)
		{
			System.err.println("Erro: "+erro.getMessage());		
			
		}
}while(qtsAlunos <= 10);


double mediaFinal = 0;

for(int i = 0 ; i<meuVetor.size();i++)
{
	mediaFinal = mediaFinal+ meuVetor.get(i);
}


mediaFinal = mediaFinal/meuVetor.size();

System.out.println("Media geral de toda a classe: "+mediaFinal);



}
}
