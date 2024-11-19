import Reto2.Funciones1;
import Reto2.Funciones2;

public class claseMain {

	public static void main(String[] args) {

		int resultado = 0;
		double n1 = 0;
		double n2=0;
		do {
			System.out.println("Selecciona tipo de conversión :");
			System.out.println("1. longuitud");
			System.out.println("2. Peso");
			System.out.println("0. Peso");
			switch (resultado) {
			case 2:
				System.out.println(
						"El resultado de conversión de longuitud  de millas a kilometros es :" + Funciones1.m(n1));
				System.out.println("El resultado de conversión de  kilometros a millas es :" + Funciones1.k(n1));
			case 2:
				System.out.println(
						"El resultado de conversión de  kilogramos a libras es :" + funciones1.KL(n2));
			case 3:
				System.out.println(
						"El resultado de conversión de  kilogramos a libras es :" + funciones2.LibrasKilos(n2));
				

			}

		} while (!(resultado >= 0 && resultado < 4));


	}

}
