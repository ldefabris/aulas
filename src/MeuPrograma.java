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
		funcionario.getProgramaFavorito();
		funcionario.imprimeOsAtributosDaPessoa();
		Pessoa pessoaNormal = new Pessoa("Leonardo", 32, "M", Boolean.TRUE);
		pessoaNormal.imprimeOsAtributosDaPessoa();
		pessoaNormal.getProgramaFavorito();
		Vampiro dracula = new Vampiro(" Vlad Drakul", 3228l);
		dracula.imprimeOsAtributosDaPessoa(true);
		dracula.getProgramaFavorito();

	}

}
