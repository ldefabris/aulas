import ima.sp.gov.br.java.entidades.Funcionario;

public class MeuPrograma {

	public static void main(String[] args) {
		Funcionario novoFunc = new Funcionario();
		novoFunc.setNome("João");
		novoFunc.setIdade(33);
		novoFunc.setVivo(Boolean.TRUE);
		novoFunc.setSalario(12000);
		novoFunc.setDataDeAdmissao("19/06/2015");
	}

}
