import static ima.sp.gov.br.java.entidades.Pessoa.MEDIA_DE_VIDA_EM_ANOS;
import static java.lang.System.out;
import ima.sp.gov.br.java.entidades.Pessoa;

public class ClasseBasica {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		java.sql.Date dataDoSQL = new java.sql.Date(8l);
		java.util.Date dataDoJava = new java.util.Date();
		out.println(MEDIA_DE_VIDA_EM_ANOS);
	}
}
