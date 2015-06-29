package ima.sp.gov.br.java.entidades;

/**
 * 
 */

/**
 * Tipo especial de pessoa - Imortal.
 *
 */
public class Vampiro extends Pessoa {
	private long idade;

	public Vampiro(String nome, long idade) {
		super(nome, 0, null);
		this.idade = idade;

	}


}
