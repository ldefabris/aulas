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
public class Pessoa extends Ativista{
	// Declara��o de atributos:
	private String nome;
	private int idade;
	private String genero;
	private boolean vivo = true;
	public static final int MEDIA_DE_VIDA_EM_ANOS = 120;

	protected Pessoa() {
	}

	// Bloco de inicializa��o
	{
		System.out
				.println("=========================================================");
		System.out
				.println("Entrou no bloco de inicializa��o, atributos receber�o valores padr�es agora...");

		vivo = true;
		nome = "Preencha o nome";
		idade = 21;
		genero = "Preencha o genero";
		System.out
				.println("=========================================================");
	}

	/**
	 * Construtor da classe Pessoa
	 * 
	 * @param nome
	 *            - Nome da pessoa
	 * @param idade
	 *            - Em anos, qual � a idade da pessoa
	 * @param genero
	 *            - <code>"F"</code> para feminino ou <code>"M"</code> para
	 *            masculino
	 */
	protected Pessoa(String nome, int idade, String genero) {
		System.out
				.println("=========================================================");
		System.out
				.println("Entramos no construtor da classe pessoa, e foi passado os seguintes construtores: ");
		System.out.println("nome= " + nome);
		System.out.println("idade= " + idade);
		System.out.println("genero= " + genero);
		System.out
				.println("=========================================================");
		System.out
				.println("Neste momento os atributos possuem os seguintes valores");
		System.out.println("nome= " + this.nome);
		System.out.println("idade= " + this.idade);
		System.out.println("genero= " + this.genero);

		System.out
				.println("=========================================================");
		this.nome = nome;
		this.genero = genero;
		this.idade = idade;
		System.out
				.println("=========================================================");
		System.out
				.println("Criando a classe pessoa... Passamos pela atribui��o de valores");
		System.out.println("nome= " + nome);
		System.out.println("idade= " + idade);
		System.out.println("genero= " + genero);
		System.out
				.println("=========================================================");
	}

	/**
	 * Construtor da classe Pessoa
	 * 
	 * @param nome
	 *            - Nome da pessoa
	 * @param idade
	 *            - Em anos, qual � a idade da pessoa
	 * @param genero
	 *            - <code>"F"</code> para feminino ou <code>"M"</code> para
	 *            masculino
	 * @param estaVivo
	 *            Informa se a pessoa ainda � viva. <code> true </code> = viva e
	 *            <code> false </code> falecida.
	 */
	protected Pessoa(String nome, int idade, String genero, boolean estaVivo) {
		this(nome, idade, genero);
		this.vivo = estaVivo;
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
	 * Imprime no console o programa favorito da pessoa.
	 */
	public void getProgramaFavorito() {
		if (genero.equalsIgnoreCase("M")) {
			System.out.println("Assistir futebol");
		} else {
			System.out.println("Comprar no Shopping");
		}
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
	
	
}
