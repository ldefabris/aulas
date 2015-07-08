package ima.sp.gov.br.java.entidades;

import ima.sp.gov.br.java.modelos.Pessoa;
import ima.sp.gov.br.java.padroes.IAtividades;
import ima.sp.gov.br.java.padroes.IForca;
import ima.sp.gov.br.java.padroes.IVelocidades;

/**
 * 
 */

/**
 * Tipo especial de pessoa - Imortal.
 *
 */
public class Vampiro extends Pessoa {
	public Vampiro(String nome, int idade, String genero, boolean vivo,
			int atividadeCorrente, int forçaPersonagem, int velocidadePersonagem) {
		super(nome, idade, genero, vivo, atividadeCorrente, forçaPersonagem,
				velocidadePersonagem);
		// TODO Auto-generated constructor stub
	}

	private long idade;

	
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

	@Override
	public void setAtividadeCorrente(int atividadeCorrente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setForçaPersonagem(int forçaPersonagem) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setVelocidadePersonagem(int velocidadePersonagem) {
		// TODO Auto-generated method stub
		
	}

}
