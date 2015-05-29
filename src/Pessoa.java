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
public class Pessoa {
	// Declara��o de atributos:
	String nome;
	int idade;
	String genero;
	// Bloco de inicializa��o
	{
		nome = "Preencha o nome";
		idade = 21;
		genero = "Preencha o genero";
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
	public Pessoa(String nome, int idade, String genero) {
		System.out
				.println("=========================================================");
		System.out
				.println("Criando a classe pessoa... Os Atributos de pessoa receber�o novos valores agora:");
		System.out.println("nome= " + nome);
		System.out.println("idade= " + idade);
		System.out.println("genero= " + genero);
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

	// m�todos.
	/**
	 * Recupera o nome cadastrado da pessoa
	 * 
	 * @return O nome da pessoa armazenado no banco de dados.
	 */
	public String getNome() {
		return nome;
	}
}
