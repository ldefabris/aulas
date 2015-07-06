package ima.sp.gov.br.java.modelos;

import java.util.Date;

/**
 * Classe representativa para informar a possibilidade de realizar uma ação,
 * todas as suas filas podem realizar ações em seu tempo livre.
 * 
 * @author lfabris
 *
 */
public abstract class Ativista {

	/**
	 * Imprime no console o programa favorito do ativista.
	 */
	abstract void getProgramaFavorito();

	/**
	 * Tenta matar um personagem.
	 * 
	 * @return <code>true</code> quando o personagem pode ser morto.
	 */
	public boolean morrer() {
		boolean tempoDeVidaValido = aindaDeveriaEstarVivo(new Date());
		if (!tempoDeVidaValido) {
			matarPersonagem();
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Rotina para matar o personagem.
	 */
	protected abstract void matarPersonagem();

	/**
	 * Calcula com base na data enviada se a Pessoa ainda deveria estar viva.
	 * 
	 * @param date
	 *            data que será validado a idade com o tempo de vida.
	 * @return <code> true </code> Quando o tempo de vida ainda não excedeu o
	 *         seu limite!
	 */
	protected abstract boolean aindaDeveriaEstarVivo(Date date);

}
