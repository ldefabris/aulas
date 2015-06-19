import javafx.scene.control.TextFormatter;

public class ClasseBasica {

	@SuppressWarnings("all")
	public static void main(String[] args) {
		Double numero = Double.valueOf("5");
		numero = Double.valueOf(5.0);
		double numeroPrimitivo = numero.longValue();
		double numeroPrimitivoDeTexto = numero.valueOf("5");
		Double resultado = numero / 8 + 3 * numeroPrimitivo
				- numeroPrimitivoDeTexto;
		System.out.println("O Resultado é " + resultado);
		Double salarioIdeal = Double.valueOf("Infinity");
		System.out.println("O salario de desenv java deveria ser: "
				+ salarioIdeal + " = " + salarioIdeal.longValue());
	}
}
