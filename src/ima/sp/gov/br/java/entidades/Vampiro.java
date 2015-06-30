package ima.sp.gov.br.java.entidades;

import ima.sp.gov.br.java.modelos.Pessoa;

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

	/**
	 * Sobrecarga, novo método com novo paramêtro, que tem o comportamento novo.
	 * 
	 * @param vampiro
	 */
	public void imprimeOsAtributosDaPessoa(boolean vampiro) {
		if (vampiro) {
			System.out
					.println("===========================  Comportamento exclusivo de vampiros");
			System.out.println("Atributos da pessoa:idade  " + this.idade);
			System.out.println("Atributos da pessoa:nome  " + getNome());

		} else {
			super.imprimeOsAtributosDaPessoa();
		}
	}
	
	@Override
	public void getProgramaFavorito() {
		System.out.println("Caçar Humanos e roubar Sangue.");
	}

}
