

class Chevrolet {}
class Monza extends Chevrolet {}
 
	class Fabrica { 
		public static void main(String [] args) {
			Monza m1 = new Monza();
			Chevrolet chev1 = new Chevrolet();
			Chevrolet chev2 = m1;
			//insira seu código aqui
			
			Monza m2 = (Monza) chev1; 
		}
	}


