
public class ejemploCondicionales2 {
	public static void main(String[] args) {
		System.out.println("Hello World");

		int edad = 21;
		int cantidadDePersonas = 2;
		
		boolean esPareja = cantidadDePersonas >= 2;

		if (edad >= 18 && esPareja == true) {
			System.out.println("Bienvenido, Sr mayor");
		} else {
			System.out.println("raje de aca, pichon");
		}

	}
}
