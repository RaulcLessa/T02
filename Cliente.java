package T02_Integrado;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Vector;

public class Cliente {
	private String celular, telFixo, timeFutebol, estadoCivil;
	private boolean valido;
	private String salario;
	private String logradouro;
	private String numero;
	private String CPF;
	private String CNPJ;
	private String cidade;
	private String cep;
	private String dataNasc;
	private String cnpj;
	private String nome;
	private String sexo;
	private String profissao;
	private String RG;
	private String tipoPessoa;
	private String tipoEmail;
	private String UF, Referencia, InfoAdicionais;
	private String Montante;
	private int dia, mes, ano;
	private String comp;
	private String bairro;
	private String cpf;
	private int ID;
	private static int contID = 0;
	private static Vector<Cliente> vector = new Vector<Cliente>();

	public Cliente() {}

	public static void setVectorC(int indice, Object obj){
		vector.add(indice, (Cliente) obj);
	}
	
	public static Vector<Cliente> getVectorC(){
		return vector;
	}
	
	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getTelFixo() {
		return telFixo;
	}

	public void setTelFixo(String telFixo) {
		this.telFixo = telFixo;
	}

	public String getTimeFutebol() {
		return timeFutebol;
	}

	public void setTimeFutebol(String timeFutebol) {
		this.timeFutebol = timeFutebol;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public boolean isValido() {
		return valido;
	}

	public void setValido(boolean valido) {
		this.valido = valido;
	}

	public String getSalario() {
		return salario;
	}

	public void setSalario(String salario) {
		this.salario = salario;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public boolean setDataNasc(String dataNasc) {
		
		Date d = new Date();
		//	if (data == null || data.equals(""))
		//		return false;

			try {
				DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
				formatter.setLenient(false); // se tolerancia se a data for inválida
				// retorna erro ex:31/02/2009

				String aux = formatter.format(d).toString();
				java.util.Date dataMinima = formatter.parse("01/01/1900");
				java.util.Date dataMaxima = formatter.parse(aux);
				java.util.Date dataParam = formatter.parse(dataNasc);

				// comparando período válido
				if ((dataParam.before(dataMinima)) || (dataParam.after(dataMaxima))) {
					return false;
				} else {
					this.dataNasc = dataNasc;
					return true;
				}
			} catch (ParseException erro) {
				return false;
			}
	}

	public String getCnpj() {
		return cnpj;
	}

	public boolean setCnpj(String CNPJ) {
		// remove mascara de cnpj
		CNPJ = CNPJ.replaceAll("\\D", "");

		// considera-se erro CNPJ com menos de 14 caracteres
		if (CNPJ.length() != 14) {
			return (false);
		}
		char dig13, dig14;
		int sm, i, r, num, peso;
		// "try" - protege o código para eventuais erros de conversao de tipo
		// (int)

		try { // Calculo do 1o. Digito Verificador
			sm = 0;
			peso = 2;
			for (i = 11; i >= 0; i--) { // converte o i-ésimo caractere do CNPJ
				// em um número:
				// por exemplo, transforma o caractere '0' no inteiro 0
				// (48 é a posição de '0' na tabela ASCII)
				num = (int) (CNPJ.charAt(i) - 48);
				sm = sm + (num * peso);
				peso = peso + 1;

				if (peso == 10)
					peso = 2;
			}
			r = sm % 11;

			if ((r == 0) || (r == 1))
				dig13 = '0';

			else
				dig13 = (char) ((11 - r) + 48); // Calculo do 2o. Digito
			// Verificador
			sm = 0;
			peso = 2;

			for (i = 12; i >= 0; i--) {
				num = (int) (CNPJ.charAt(i) - 48);
				sm = sm + (num * peso);
				peso = peso + 1;
				if (peso == 10)
					peso = 2;

			}
			r = sm % 11;
			if ((r == 0) || (r == 1))
				dig14 = '0';

			else {
				dig14 = (char) ((11 - r) + 48); // Verifica se os dígitos
			} // calculados conferem com os
				// dígitos informados.

			if ((dig13 == CNPJ.charAt(12)) && (dig14 == CNPJ.charAt(13))) {
				this.cnpj = CNPJ;
				return true;

			} else {
				return (false);
			}
		} catch (InputMismatchException erro) {
			return (false);
		}
	}
	
	public String imprimeCNPJ(String CNPJ) { 
		return (CNPJ.substring(0, 2) + "." + CNPJ.substring(2, 5) + "."
				+ CNPJ.substring(5, 8) + "." + CNPJ.substring(8, 12) + "-" + CNPJ
					.substring(12, 14));
	} 

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String getRG() {
		return RG;
	}

	public void setRG(String rG) {
		RG = rG;
	}

	public String getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(String tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	public boolean validaEmail(String tipoEmail){
		boolean vEmail = tipoEmail.matches("\\w+@\\w+\\.\\w+\\.?\\w?");
		
		return vEmail;
	}
	
	public String getTipoEmail() {
		return tipoEmail;
	}

	public void setTipoEmail(String tipoEmail) {
		this.tipoEmail = tipoEmail;
	}

	public String getUF() {
		return UF;
	}

	public void setUF(String uF) {
		UF = uF;
	}

	public String getReferencia() {
		return Referencia;
	}

	public void setReferencia(String referencia) {
		Referencia = referencia;
	}

	public String getInfoAdicionais() {
		return InfoAdicionais;
	}

	public void setInfoAdicionais(String infoAdicionais) {
		InfoAdicionais = infoAdicionais;
	}

	public String getMontante() {
		return Montante;
	}

	public void setMontante(String Montante) {
		this.Montante = Montante;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getComp() {
		return comp;
	}

	public void setComp(String comp) {
		this.comp = comp;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCpf() {
		return cpf;
	}

	public boolean setCpf(String cpf) {

		String cpftemp = formataRemocaoCaracteresEspeciais(cpf);

		int dig1, dig2, dig3, dig4, dig5, dig6, dig7, dig8, dig9, dig10, dig11, dv1, dv2, qDig;

		if ((cpftemp.length() == 0) || (cpftemp.length() < 11)
				|| (cpftemp.length() > 11)) {

			return false;
		}

		qDig = cpftemp.length(); // Quantidade total de caracteres

		// Gravar posição dos caracteres
		try {
			dig1 = Integer.parseInt(String.valueOf(cpftemp.charAt(qDig - 11)));
			dig2 = Integer.parseInt(String.valueOf(cpftemp.charAt(qDig - 10)));
			dig3 = Integer.parseInt(String.valueOf(cpftemp.charAt(qDig - 9)));
			dig4 = Integer.parseInt(String.valueOf(cpftemp.charAt(qDig - 8)));
			dig5 = Integer.parseInt(String.valueOf(cpftemp.charAt(qDig - 7)));
			dig6 = Integer.parseInt(String.valueOf(cpftemp.charAt(qDig - 6)));
			dig7 = Integer.parseInt(String.valueOf(cpftemp.charAt(qDig - 5)));
			dig8 = Integer.parseInt(String.valueOf(cpftemp.charAt(qDig - 4)));
			dig9 = Integer.parseInt(String.valueOf(cpftemp.charAt(qDig - 3)));
			dig10 = Integer.parseInt(String.valueOf(cpftemp.charAt(qDig - 2)));
			dig11 = Integer.parseInt(String.valueOf(cpftemp.charAt(qDig - 1)));
		} catch (NumberFormatException e) {
			return false;
		}

		// Cálculo para o primeiro dígito validador
		dv1 = dig1 + (dig2 * 2) + (dig3 * 3) + (dig4 * 4) + (dig5 * 5)
				+ (dig6 * 6) + (dig7 * 7) + (dig8 * 8) + (dig9 * 9);
		dv1 = dv1 % 11;

		if (dv1 == 10) {

			dv1 = 0; // Se o resto for igual a 10, dv1 igual a zero
		}

		// Cálculo para o segundo dígito validador
		dv2 = dig2 + (dig3 * 2) + (dig4 * 3) + (dig5 * 4) + (dig6 * 5)
				+ (dig7 * 6) + (dig8 * 7) + (dig9 * 8) + (dv1 * 9);
		dv2 = dv2 % 11;

		if (dv2 == 10) {

			dv2 = 0; // Se o resto for igual a 10, dv2 igual a zero
		}

		// Validação dos dígitos validadores, após o cálculo realizado
		if (dig10 == dv1 && dig11 == dv2) {

			this.cpf = cpf;
			return true;
		}
		else {
			return false;
		}
		
	}
		
		private static String formataRemocaoCaracteresEspeciais(String valor) {

			if (valor.indexOf(",") != -1 || valor.indexOf(".") != -1
					|| valor.indexOf("-") != -1 || valor.indexOf("/") != -1) {

				StringBuffer valorAux = new StringBuffer();
				for (int i = 0; i < valor.length(); i++)
					if ((valor.charAt(i) != ',') && (valor.charAt(i) != '.')
							&& (valor.charAt(i) != '-') && (valor.charAt(i) != '/'))
						valorAux.append(valor.charAt(i));

				valor = valorAux.toString();
			}
			return valor;
		}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public void incrementaID() {
		this.ID = contID;
		contID++;

	}

}