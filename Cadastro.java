package T02;

import java.util.*;

public class Cadastro {
	Cliente c1 = new Cliente();
	public Scanner entrada = new Scanner(System.in);

	private String salario, logradouro, tipoPessoa, CPF, CNPJ, decide;
	private int numero = 0;
	private boolean func1, ok;

	// GUILHERME
	/*
	 * Métodos que recebem as entradas a serem validadas.
	 */

	public void CadastraEstadoCivil() {

		String estadoCivil;

		boolean eCivil = false;
		do {
			System.out.println("Digite seu estado civil: ");
			estadoCivil = entrada.nextLine();

			if (c1.setEstadoCivil(estadoCivil) == true) {
				eCivil = true;
				c1.setEstadoCivil(estadoCivil);
			} else {
				EntradaInvalida();
			}

		} while (eCivil == false);

	}

	public void CadastraTime() {

		String timeFutebol;
		boolean eTime = false;
		do {
			System.out.println("Digite seu time de futebol:");
			timeFutebol = entrada.nextLine();

			if (c1.setTimeFutebol(timeFutebol) == true) {
				eTime = true;
				c1.setTimeFutebol(timeFutebol);
			} else {
				EntradaInvalida();
			}
		} while (eTime == false);
	}

	public void CadastraCel() {

		String celular;
		boolean eCel = false;
		do {
			System.out.println("Digite seu celular com o DDD (apenas nºs):");
			celular = entrada.nextLine();

			if (c1.setCelular(celular) == true) {
				eCel = true;
				c1.setCelular(celular);
			} else {
				EntradaInvalida();
			}
		} while (eCel == false);
	}

	public void CadastraTelFixo() {

		String telFixo;
		boolean eTel = false;
		do {
			System.out
					.println("Digite seu telefone fixo com o DDD (apenas nºs):");
			telFixo = entrada.nextLine();

			if (c1.setTelFixo(telFixo) == true) {
				eTel = true;
				c1.setTelFixo(telFixo);
			} else {
				EntradaInvalida();
			}
		} while (eTel == false);
	}

	/*
	 * Métodos para a exibição das entradas (validadas e formatadas).
	 */

	public void exibeCadastro() {

		System.out.println("Nome Completo: " + c1.getNome() + " "
				+ c1.getSobreNome());
		System.out.println("Sexo: " + c1.getSexo());
		System.out.println("Profissão: " + c1.getProfissao());
		System.out.println("RG: " + c1.getRG());
		System.out.println("Tipo de Pessoa: " + c1.getTipoPessoa());
		System.out.println("E-mail: " + c1.getTipoEmail());
		System.out.println("Estado Civil: " + c1.getEstadoCivil());
		System.out.println("Time de Futebol: " + c1.getTimeFutebol());
		System.out.println("Celular: " + c1.getCelular());
		System.out.println("Telefone Residencial: " + c1.getTelFixo());
		System.out.println("Logradouro: " + c1.getLogradouro());
		System.out.println("Número: " + c1.getNumero());
		System.out.println("Complemento: " + c1.getComp());
		System.out.println("Bairro: " + c1.getBairro());
		System.out.println("Cep " + c1.getCep());
		System.out.println("Cidade " + c1.getCidade());
		System.out.println("Unidade Federal: " + c1.getUF());
		System.out.println("Faixa salarial: " + c1.getSalario());
		System.out.println("CNPJ: " + c1.getCNPJ());
		System.out.println("CPF: " + c1.getCpf());
		System.out.println("Data de Nascimento " + c1.getData());
		System.out.println("ID: " + c1.getID());
		System.out.println("Data do Cadastro: " + c1.getDataCad());
		System.out.println("Referencia: " + c1.getReferencia());
		System.out.println("Informações adicionais: " + c1.getInfoAdicionais());
		System.out.println("Montante gasto: " + c1.getMontante());

	}

	public void EntradaInvalida() {
		System.out.println("ENTRADA INVÁLIDA!");
	}

	// RAUL

	public Cadastro() {

	}

	public String CadastraCliente() {
		System.out.println("Bem vindo ao cadastro de clientes");

		do {
			do {
				try {
					System.out.println("O que deseja fazer? ");
					System.out.println("[1] Cadastrar novo Cliente");
					System.out.println("[2] Encerrar o programa");
					System.out.print("-> ");
					decide = entrada.nextLine();

					switch (decide) {

					case "1":
						func1 = true;
						break;

					case "2":
						System.out.println("Você saiu do programa.");
						System.exit(0);
						break;

					default:
						System.out
								.println("Função inexistente ou não suportada");

					}
				} catch (InputMismatchException erro1) {
					System.out
							.println("Por favor insira um número inteiro de 1 a 2 de acordo com a função que deseja realizar.");
				}

			} while (func1 == false);

			do {
				System.out
						.println("Digite o tipo de pessoa <física ou jurídica> : ");
				tipoPessoa = entrada.nextLine();
				ok = true;

			} while (ok == false);

		} while (ok == false);

		return tipoPessoa;

	}

	public void CadastrarSalario() {
		do {

			System.out.println("Digite o salário do cliente: ");
			salario = entrada.nextLine();
			ok = c1.setSalario(salario);

			if (ok == false) {
				EntradaInvalida();
			}

		} while (ok == false);
		System.out.println("Salário inserido com sucesso!");
	}

	public void CadastrarLogradouro() {
		do {
			System.out
					.println("Digite o Logradouro do cliente(Rua/Avenida/etc.): ");
			logradouro = entrada.nextLine();
			ok = c1.setLogradouro(logradouro);

			if (ok == false) {
				EntradaInvalida();

			}

		} while (ok == false);

		System.out.println("Logradouro inserido com sucesso!");
	}

	public void CadastrarNumero() {

		String numero;

		do {
			System.out.println("Digite o número do endereço do cliente: ");
			numero = entrada.nextLine();
			if (c1.setNumero(numero) == true) {
				c1.setNumero(numero);
				System.out.println("Número adicionado com sucesso!");
				ok = true;
			} else {
				EntradaInvalida();
				ok = false;
			}

		} while (ok == false);

	}

	public void CadastrarCPF() {

		do {

			if ((c1.getTipoPessoa().compareToIgnoreCase("Fisica") == 0)
					|| (c1.getTipoPessoa().compareToIgnoreCase("Física") == 0)) {
				System.out.println("Digite o número do seu CPF: ");
				CPF = entrada.nextLine();
				ok = c1.setCpf(CPF);
				if (ok == true) {
					System.out.println("Número de CPF adicionado com suceso");
				} else {
					EntradaInvalida();
				}
			} else {
				System.out
						.println("Função disponível apenas para pessoas físicas");
			}
		} while (ok == false);
	}

	public void CadastrarCNPJ() {

		do {
			if ((c1.getTipoPessoa().compareToIgnoreCase("Juridica") == 0)) {
				System.out.println("Digite o número do seu CNPJ: ");
				CNPJ = entrada.nextLine();

				ok = c1.setCNPJ(CNPJ);

				if (ok == true) {
					System.out.println("CNPJ cadastrado com sucesso.");
				} else
					System.out.println("Digite um número de CNPJ válido.");
			} else {
				System.out
						.println("Função suportada apenas para pessoas jurídicas.");
			}

		} while (ok == false);
	}

	// FIM RAUL

	// JEAN
	public void menuCidade() {
		String cidade;

		do {
			System.out.println("Digite a cidade onde o cliente reside: ");
			cidade = entrada.nextLine();
			if (c1.setCidade(cidade) == false) {
				EntradaInvalida();
			} else {
				System.out.println("Cidade válida.");
			}
		} while (c1.setCidade(cidade) == false);

	}

	public void menuCep() {
		System.out.println("Digite o cep na forma xxxxx-xxx");
		String cep;
		cep = entrada.nextLine();

		if (c1.setCep(cep) == false) {
			System.out
					.println("Cep inválido. Deseja cadastrar cep? (Digite Sim/Não)");
			String op = entrada.nextLine();
			op = op.toLowerCase();
			switch (op) {
			case "sim":
				do {
					System.out.println("Digite o cep novamente");
					cep = entrada.nextLine();
					if (c1.setCep(cep) == true) {

					}
				} while (c1.setCep(cep) == false);
				break;

			case "não":
				System.out.println("Cep não cadastrado");

				break;
			default:
				System.out.println("Nada digitado,cep não cadastrado");
				break;

			}
		}

	}

	public void menuData() {
		String data;

		System.out.println("Digite a data e nascimento na forma de dd/mm/aaaa");
		data = entrada.nextLine();
		c1.setDataNasc(data);
		if (c1.setDataNasc(data) == true) {
			System.out.println("Data armazenada");

		} else {

			System.out
					.println("Data inválida,deseja cadastrar uma data? sim/não");
			String op;
			op = entrada.nextLine();
			op = op.toLowerCase();

			switch (op) {
			case "sim":
				do {
					System.out.println("Digite a data novamente");
					data = entrada.nextLine();
					c1.setDataNasc(data);
					if (c1.setDataNasc(data) == true) {

					}
				} while (c1.setDataNasc(data) == false);

				break;
			case "não":
				System.out.println("Data não cadastrada");
				break;
			default:
				System.out.println("Nada digitado,data não cadastrada");
				break;
			}

		}
	}

	public void menuCnpj() {

		do {
			CNPJ = entrada.nextLine();
			c1.setCnpj(CNPJ);
			if (c1.setCnpj(CNPJ) == false) {
				System.out.println("CNPJ inválido!");
				System.out.println("Campo obrigatorio!");
			}
		} while (c1.setCnpj(CNPJ) == false);
		System.out.println("Cnpj válido");

	}// FIM JEAN

	// DIONATÃ
	public boolean gravaDadosNome() {
		// Este é o método q aciona o método de validar o Nome do Cliente
		String nome;
		boolean bNome = false;
		do {
			System.out.println("Digite o primeiro nome do Cliente:");
			nome = entrada.nextLine();
			nome = nome.toUpperCase();
			if (c1.setNome(nome)) {
				bNome = true;
			} else {
				System.out.println("Tente novamente!");
			}
		} while (bNome == false);
		return bNome;
	}

	public boolean gravaDadosSegundoNome() {
		String sobreNome;
		// Este é o método q aciona o método de validar o Sobrenome do Cliente
		boolean bSobrenome = false;
		do {
			System.out.println("Digite o Sobrenome do Cliente:");
			sobreNome = entrada.nextLine();
			sobreNome = sobreNome.toUpperCase();
			if (c1.setSobreNome(sobreNome)) {
				bSobrenome = true;
			} else {
				System.out.println("Tente novamente!");
			}
		} while (bSobrenome == false);
		return bSobrenome;
	}

	public boolean gravaDadosSexo() {
		String sexo;
		// Este é o método q aciona o método de validar o Sexo do Cliente
		boolean bSexo = false;
		do {
			System.out
					.println("Digite o sexo do cliente: <Masculino> ou <Feminino>:");
			sexo = entrada.nextLine();
			sexo = sexo.toUpperCase();
			if (c1.setSexo(sexo)) {
				bSexo = true;
			} else {
				System.out.println("Tente novamente!");
			}
		} while (bSexo == false);
		return bSexo;
	}

	public boolean gravaDadosProfissao() {
		String profissao;
		// Este é o método q aciona o método de validar a Profissão do Cliente
		boolean bProfissao = false;
		do {
			System.out.println("Profissão do Cliente:");
			profissao = entrada.nextLine();
			profissao = profissao.toUpperCase();
			if (c1.setProfissao(profissao)) {
				bProfissao = true;
			} else {
				System.out.println("Tente novamente!");
			}
		} while (bProfissao == false);
		return bProfissao;
	}

	public boolean gravaDadosRG() {
		String RG;
		// Este é o método q aciona o método de validar RG
		boolean bRG = false;
		do {
			System.out.println("RG do Cliente:");
			RG = entrada.nextLine();
			if (c1.setRG(RG)) {
				bRG = true;
			} else {
				System.out.println("Tente novamente!");
			}
		} while (bRG == false);
		return bRG;
	}

	public boolean gravaDadosEmail() {
		String tipoEmail;
		boolean bmail = false;

		System.out.println("E-mail do Cliente:");
		tipoEmail = entrada.nextLine();
		if (c1.setTipoEmail(tipoEmail) == true) {
			bmail = true;
		}
		else {
			System.out.println("Email não cadastrado!");
			bmail = false;
		}

		return bmail;
	}

	// REGIS AMARAL
	public void NovaID() {
		int id = Programa.novaidcliente++;
		c1.setID(id);
	}

	public void DataCad() {
		int dia, mes, ano;
		Calendar c = Calendar.getInstance();
		dia = c.get(Calendar.DAY_OF_MONTH);
		mes = c.get(Calendar.MONTH);
		ano = c.get(Calendar.YEAR);
		c1.setData(dia, mes, ano);
	}

	public void TelaReferencia() {
		String EndReferencias;
		Boolean tREF = false;
		entrada = new Scanner(System.in);
		do {
			System.out
					.println("REFERÊNCIA: \n(Use letras e números, maximo de 50 caracteres incluindo espaços)");
			EndReferencias = entrada.nextLine();

			if (c1.setReferencia(EndReferencias, 50)) {
				tREF = true;
			} else {
				System.out
						.println("Atenção, você precisa digitar conforme o solicitado, tente novamente. \n \n");
			}
		} while (tREF == false);
	}

	public void TelaInfoAdicionais() {
		String InfoAdicionais = new String();
		Boolean tInfo = false;
		entrada = new Scanner(System.in);
		do {
			System.out
					.println("Informações adicionais: \n(Use letras e números, maximo de 300 caracteres incluindo espaços)");
			InfoAdicionais = entrada.nextLine();

			if (c1.setInfoAdicionais(InfoAdicionais, 300)) {
				tInfo = true;
			} else {
				System.out
						.println("Atenção, você precisa digitar conforme o solicitado, tente novamente. \n \n");
			}
		} while (tInfo == false);
	}

	public void TelaMontante() {
		boolean tMont = false;
		entrada = new Scanner(System.in);
		do {
			System.out
					.println("Digite o montante gasto pelo cliente: (Formato aceito: R$ 1.350,31)");
			String Montante = entrada.nextLine();
			if (c1.setMontante(Montante)) {
				tMont = true;
			}
			;
		} while (tMont == false);
		System.out.println(c1.getMontante());
	}

	public void TelaUF() {
		boolean tUF = false;
		String EndUF;
		entrada = new Scanner(System.in);
		do {
			System.out
					.println("UNIDADE FEDERAL - UF: \n(Obs: Caracteres correspondentes a sigla do estado. ex: RS, SP,...)");
			EndUF = entrada.nextLine();

			if (c1.setUF(EndUF)) {
				tUF = true;
			} else {
				System.out
						.println("Atenção, você precisa digitar conforme o solicitado, tente novamente. \n \n");
			}
		} while (tUF == false);
	}// FIM REGIS

	// ANDRE

	public void CadastroComp() {

		Boolean execComp = false;
		do

		{
			System.out
					.println("Digite o seu Complemento (Apenas alfanuméricos): ");
			String comp = entrada.nextLine();

			if (c1.setComp(comp)) {
				System.out
						.println("Você realizou o cadastro do Complemento com sucesso!\n");
				execComp = true;
			} else {
				System.out.println("Dados inválidos, tente novamente! \n");
			}
		} while (execComp == false);
	}

	// Cadastro do Bairro

	public void CadastroBairro() {

		Boolean execbairro = false;

		do {
			System.out.println("Digite o seu Bairro (Apenas alfanuméricos): ");
			String bairro = entrada.nextLine();

			if (c1.setBairro(bairro)) {
				System.out
						.println("Você realizou o cadastro do Bairro com sucesso!\n");
				execbairro = true;
			} else {
				System.out.println("Dados inválidos, tente novamente! \n");
			}

		} while (execbairro == false);

	}

	
}


