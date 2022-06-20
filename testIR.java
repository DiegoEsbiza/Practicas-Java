//De 1900.0 a 2800.0, el IR es de 7.5% y puede deducir de la declaración el monto de 142.
//De 2800.01 a 3751.0, el IR es del 15% y puede deducir 350.
//De 3751.01 a 4664.00, el IR es 22.5% y puede deducir 636.
public class testIR {

	public static void main(String[] args) {

		double salario = 3300.0;

		if (salario > 1900 && salario <= 28000) {
			salario = salario - 142;
			System.out.println(salario);
		} else {
			if (salario > 28000 && salario <= 3751.01) {
				salario = salario - 350;
				System.out.println(salario);
			}else {
				if (salario > 3751.01 && salario <= 4664.00) {
					salario = salario - 636;
					System.out.println(salario);
				}
			}
		}
	}
}
