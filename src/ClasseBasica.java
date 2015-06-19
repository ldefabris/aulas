import javafx.scene.control.TextFormatter;

public class ClasseBasica {

	@SuppressWarnings("all")
	public static void main(String[] args) {
		int[] numeros = {5 ,8, 10 ,30};
		System.out.println("M�dia: "+ calculaMedia(numeros));
	}

	/**
	 * Calcula a m�dia simples dos n�meros informados
	 * @param numeros valores para obter a m�dia
	 * @return m�dia simples.
	 */
	private static Integer calculaMedia(int[] numeros) {
		int soma = 0;
		for (int i : numeros) {
			soma += i;
		}
		return soma/numeros.length;
	}
}
