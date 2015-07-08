package ima.sp.gov.br.java;
import ima.sp.gov.br.java.entidades.Adulto;
import ima.sp.gov.br.java.entidades.Funcionario;
import ima.sp.gov.br.java.entidades.Vampiro;
import ima.sp.gov.br.java.modelos.Ativista;
import ima.sp.gov.br.java.modelos.Pessoa;

public class MeuPrograma {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		funcionario.setDataDeAdmissao("29/06/2015");
		funcionario.setNome("João", "Dos Santos", "De Souza");
		funcionario.setIdade(35);
		funcionario.setSalario(16000);
		funcionario.setVivo(true);
		funcionario.setGenero("M");
		Pessoa pessoaNormal = new Adulto("Leonardo", 32, "M", Boolean.TRUE);
		Vampiro dracula = new Vampiro(" Vlad Drakul", 3228l);
		//Ativista testeAtivista = new Ativista();
		Pessoa[] arrayDePessoas = { funcionario, pessoaNormal, dracula };
		for (Pessoa pessoa : arrayDePessoas) {
			pessoa.getProgramaFavorito();
			pessoa.imprimeOsAtributosDaPessoa();
			imprimeObjeto(pessoa);
		}
	}

	/**
	 * Imprime um objeto no console
	 * 
	 * @param obj
	 *            obj que será impresso.
	 */
	public static void imprimeObjeto(Object obj) {
		System.out.println(obj.toString());
		if (obj instanceof Funcionario) {
			Funcionario f = (Funcionario) obj;
			System.out.println(f.toString());
		} else if (obj instanceof Vampiro) {
			Vampiro v = (Vampiro) obj;
			System.out.println(v.toString());
		} else if (obj instanceof Pessoa) {
			Pessoa p = (Pessoa) obj;
			System.out.println(p.toString());
		}
	}
}
