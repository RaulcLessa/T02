package T02;

public class Programa {
	public static int novaidcliente = 0;

	public static void main(String[] args) {

		Cadastro obj = new Cadastro();
		String pessoa;

		// RAUL
		pessoa = obj.CadastraCliente();
		obj.CadastrarSalario();
		obj.CadastrarLogradouro();
		obj.CadastrarNumero();
		if ((pessoa.compareToIgnoreCase("Fisica") == 0)
				|| pessoa.compareTo("Física") == 0) {
			obj.CadastrarCPF();
		} else if ((pessoa.compareToIgnoreCase("Juridica")) == 0
				|| pessoa.compareToIgnoreCase("Jurídica") == 0) {
			obj.CadastrarCNPJ();

		}

		// GUILHERME
		obj.CadastraEstadoCivil();
		obj.CadastraTime();
		obj.CadastraCel();
		obj.CadastraTelFixo();

		// JEAN
		obj.menuCidade();
		obj.menuCep();
		obj.menuData();

		// DIONATÃ
		obj.gravaDadosNome();
		obj.gravaDadosSegundoNome();
		obj.gravaDadosSexo();
		obj.gravaDadosProfissao();
		obj.gravaDadosRG();
		obj.gravaDadosEmail();

		// RÉGIS

		obj.NovaID();
		obj.DataCad();
		obj.TelaReferencia();
		obj.TelaInfoAdicionais();
		obj.TelaMontante();
		obj.TelaUF();

		// ANDRE
		obj.CadastroComp();
		obj.CadastroBairro();

		// Exibição do Cadastro
		obj.exibeCadastro();
	}
}
