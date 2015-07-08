package ima.sp.gov.br.java.modelos;


/**
 * Classe respons�vel pela representa��o sistemica de pessoa. Esta classe dever�
 * <strong>sempre</strong> ser instanciada no sistema
 * 
 * Variav�is do tipo <code> boolean</code> s�o <code>true or false</code>
 * 
 * <i>a documenta��o do java aceita formata��o html</i>
 * 
 * <h2>E possui tamb�m suas pr�prias palavras reservadas:</h2>
 * <p>
 * As palavras reservadas nos coment�rios s�o denonimandas <i>annotations</i> e
 * iniciam sempre pelo caractere: <b>'@'</>
 * </p>
 * <p>
 * <i>Annotations</i> S�o respons�veis por descrever m�todos, variav�is e
 * classes, podendo tamb�m descrever seu comportamento a uma api. � possiv�l em
 * tempo de execu��o recuperar uma annotation. Exemplo de annotations: Autor da
 * classe:
 * 
 * @author Leonardo Lopes 
 *
 */
public abstract class Pessoa implements IAtivista{
	// Declara��o de atributos:
	private String nome;
	private int idade;
	private String genero;
	private boolean vivo = true;
	public static final int MEDIA_DE_VIDA_EM_ANOS = 120;
	private int atividadeCorrente;
	private int for�aPersonagem;
	private int velocidadePersonagem;


	
	/**
	 * Construtor b�sico para criar uma instancia de pessoa.
	 * @param nome
	 * @param idade
	 * @param genero
	 * @param vivo
	 * @param atividadeCorrente
	 * @param for�aPersonagem
	 * @param velocidadePersonagem
	 */
	public Pessoa(String nome, int idade, String genero, boolean vivo,
			int atividadeCorrente, int for�aPersonagem, int velocidadePersonagem) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.genero = genero;
		this.vivo = vivo;
		this.atividadeCorrente = atividadeCorrente;
		this.for�aPersonagem = for�aPersonagem;
		this.velocidadePersonagem = velocidadePersonagem;
	}

	// m�todos.
	/**
	 * Recupera o nome cadastrado da pessoa
	 * 
	 * @return O nome da pessoa armazenado no banco de dados.
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * imprime no console os atributos da pessoa.
	 */
	public void imprimeOsAtributosDaPessoa() {
		System.out.println("Atributos da pessoa:genero  " + genero);
		System.out.println("Atributos da pessoa:idade  " + idade);
		System.out.println("Atributos da pessoa:nome  " + nome);
	}


	/**
	 * @return o idade
	 */
	public int getIdade() {
		return idade;
	}

	/**
	 * @param idade
	 *            o idade a ser configurado
	 */
	public void setIdade(int idade) {
		this.idade = idade;
	}

	/**
	 * @return o genero
	 */
	public String getGenero() {
		return genero;
	}

	/**
	 * @param genero
	 *            o genero a ser configurado
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}

	/**
	 * @return o vivo
	 */
	public boolean isVivo() {
		return vivo;
	}

	/**
	 * @param vivo
	 *            o vivo a ser configurado
	 */
	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}

	/**
	 * @param nome
	 *            o nome a ser configurado
	 */
	public void setNome(String nome) {
		System.out.println("Passando pelo m�todo comum de nome...");
		this.nome = nome;
	}

	/**
	 * @param nome
	 *            o nome a ser configurado
	 */
	public void setNome(char[] nome) {
		System.out
				.println("Passando pelo m�todo que recebe array de char primitivo");
		this.nome = new String(nome);
	}

	public void setNome(Character[] nome) {
		System.out.println("Passando pelo m�todo que recebe char Objeto");
		this.nome = new String(nome.toString());
	}

	public void setNome(String nome, String sobreNome) {
		System.out.println("Passando pelo m�todo que recebe nome e sobreNome");
		this.nome = nome + " " + sobreNome;
	}

	public void setNome(Object[] nome) {
		System.out
				.println("Passando pelo m�todo que recebe um array de Object");
		for (int i = 0; i < nome.length; i++) {
			this.nome += nome[i];
		}
	}

	public void setNome(String... sobrenome) {
		System.out
				.println("Passando pelo m�todo que recebe um varArgs de String");
		this.nome += nome;
		for (int i = 0; i < sobrenome.length; i++) {
			this.nome += sobrenome[i];
		}
	}

	public void setNome(int codNome) {
		System.out.println("Passando pelo m�todo que recebe um inteiro");
		String[] nomes = { "pedro", "Jo�o", "Maria" };
		this.nome = nomes[codNome];
	}


	/**
	 * @return the atividadeCorrente
	 */
	public int getAtividadeCorrente() {
		return atividadeCorrente;
	}


	/**
	 * @param atividadeCorrente the atividadeCorrente to set
	 */
	public abstract void setAtividadeCorrente(int atividadeCorrente) ;


	/**
	 * @return the for�aPersonagem
	 */
	public int getFor�aPersonagem() {
		return for�aPersonagem;
	}


	/**
	 * @param for�aPersonagem the for�aPersonagem to set
	 */
	public abstract void setFor�aPersonagem(int for�aPersonagem) ;


	/**
	 * @return the velocidadePersonagem
	 */
	public int getVelocidadePersonagem() {
		return velocidadePersonagem;
	}


	/**
	 * @param velocidadePersonagem the velocidadePersonagem to set
	 */
	public abstract void setVelocidadePersonagem(int velocidadePersonagem) ;
	
	
}
