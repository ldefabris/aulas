import ima.sp.gov.br.java.entidades.Funcionario;
import ima.sp.gov.br.java.entidades.Pessoa;
import ima.sp.gov.br.java.entidades.Vampiro;

public class MeuPrograma {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		funcionario.setDataDeAdmissao("29/06/2015");
		funcionario.setNome("João", "Dos Santos", "De Souza");
		funcionario.setIdade(35);
		funcionario.setSalario(16000);
		funcionario.setVivo(true);
		funcionario.setGenero("M");
		Pessoa pessoaNormal = new Pessoa("Leonardo", 32, "M", Boolean.TRUE);
		Vampiro dracula = new Vampiro(" Vlad Drakul", 3228l);
		dracula.imprimeOsAtributosDaPessoa(true);
		dracula.getProgramaFavorito();
		// Pessoa[] arrayDePessoas = { funcionario, pessoaNormal, dracula };
		Pessoa[] arrayDePessoas = new Pessoa[3];
		arrayDePessoas[0] = funcionario;
		arrayDePessoas[1] = pessoaNormal;
		arrayDePessoas[2] = dracula;
		for (Pessoa pessoa : arrayDePessoas) {
			pessoa.getProgramaFavorito();
			if (pessoa instanceof Vampiro) {
				((Vampiro) pessoa).imprimeOsAtributosDaPessoa(true);
			} else {
				pessoa.imprimeOsAtributosDaPessoa();
			}
		}
	}
}
