package ima.sp.gov.br.java.entidades;

import ima.sp.gov.br.java.modelos.Pessoa;

public class Funcionario extends Pessoa {
	


	public Funcionario(String nome, int idade, String genero, boolean vivo,
			int atividadeCorrente, int forçaPersonagem, int velocidadePersonagem) {
		super(nome, idade, genero, vivo, atividadeCorrente, forçaPersonagem,
				velocidadePersonagem);
		
		// TODO Auto-generated constructor stub
	}

	private String dataDeAdmissao;
	private double salario;

	/**
	 * @return o dataDeAdmissao
	 */
	public String getDataDeAdmissao() {
		return dataDeAdmissao;
	}

	/**
	 * @param dataDeAdmissao
	 *            o dataDeAdmissao a ser configurado
	 */
	public void setDataDeAdmissao(String dataDeAdmissao) {
		this.dataDeAdmissao = dataDeAdmissao;
	}

	/**
	 * @return o salario
	 */
	public double getSalario() {
		return salario;
	}

	/**
	 * @param salario
	 *            o salario a ser configurado
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	@Override
	public void getProgramaFavorito() {
		System.out.println("Trabalhar mais de 12 horas por dia, e quando sobra tempo: ");
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
