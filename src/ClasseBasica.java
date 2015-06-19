import javafx.scene.control.TextFormatter;

public class ClasseBasica {

	@SuppressWarnings("all")
	public static void main(String[] args) {
		int[] numeros = {5 ,8, 10 ,30};
		System.out.println("Média: "+ calculaMedia(numeros));
	}

	/**
	 * Calcula a média simples dos números informados
	 * @param numeros valores para obter a média
	 * @return média simples.
	 */
	private static Integer calculaMedia(int[] numeros) {
		int soma = 0;
		for (int i : numeros) {
			soma += i;
		}
		return soma/numeros.length;
	}
}
