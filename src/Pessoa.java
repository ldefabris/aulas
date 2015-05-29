/**
 * Classe responsável pela representação sistemica de pessoa. Esta classe deverá
 * <strong>sempre</strong> ser instanciada no sistema
 * 
 * Variavéis do tipo <code> boolean</code> são <code>true or false</code>
 * 
 * <i>a documentação do java aceita formatação html</i>
 * 
 * <h2>E possui também suas próprias palavras reservadas:</h2>
 * <p>
 * As palavras reservadas nos comentários são denonimandas <i>annotations</i> e
 * iniciam sempre pelo caractere: <b>'@'</>
 * </p>
 * <p>
 * <i>Annotations</i> São responsáveis por descrever métodos, variavéis e
 * classes, podendo também descrever seu comportamento a uma api. É possivél em
 * tempo de execução recuperar uma annotation. Exemplo de annotations: Autor da
 * classe:
 * 
 * @author Leonardo Lopes
 *
 */
public class Pessoa {
	// Declaração de atributos:
	String nome;
	int idade;
	String genero;
	// Bloco de inicialização
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
	 *            - Em anos, qual é a idade da pessoa
	 * @param genero
	 *            - <code>"F"</code> para feminino ou <code>"M"</code> para
	 *            masculino
	 */
	public Pessoa(String nome, int idade, String genero) {
		System.out
				.println("=========================================================");
		System.out
				.println("Criando a classe pessoa... Os Atributos de pessoa receberão novos valores agora:");
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
				.println("Criando a classe pessoa... Passamos pela atribuição de valores");
		System.out.println("nome= " + nome);
		System.out.println("idade= " + idade);
		System.out.println("genero= " + genero);
		System.out
				.println("=========================================================");
	}

	// métodos.
	/**
	 * Recupera o nome cadastrado da pessoa
	 * 
	 * @return O nome da pessoa armazenado no banco de dados.
	 */
	public String getNome() {
		return nome;
	}
}
