
public class ejercicioTablaMultiplicacion {
	public static void main(String[] args) {
		
		for(int tabla = 1; tabla <= 10; tabla++) {
			for(int multiplicacion = 1; multiplicacion <= 10; multiplicacion++) {
				System.out.print(tabla*multiplicacion);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
