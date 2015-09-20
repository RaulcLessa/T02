package T02_Integrado;

import java.awt.*;
import java.awt.event.*;
import java.text.ParseException;

import javax.swing.*;
import javax.swing.text.MaskFormatter;

@SuppressWarnings("serial")
public class JanelaCadastro extends JFrame implements ActionListener {
	
	
	//Labels
	public JLabel lblSexo;
	public JLabel lblEstadoCivil;
	public JLabel lblDataDeNascimento;
	public JLabel lblRg;
	public JLabel lblProfisso;
	public JLabel lblFaixaSalarial;
	public JLabel lblTimeDeFutebol;
	public JLabel lblLogradouro;
	public JLabel lblNmero;
	public JLabel lblComplemento;
	public JLabel lblBairro;
	public JLabel lblCep;
	public JLabel lblCidade;
	public JLabel lblUf;
	public JLabel lblNome;
	public JLabel lblReferncias;
	public JLabel lblTelefoneResidencial;
	public JLabel lblTelefoneCelular;
	public JLabel lblEmail;
	public JLabel lblTipoDePessoa;
	public JLabel lblCpf;
	public JLabel lblCnpj;
	public JLabel lblMontante;
	public JLabel lblInformaesAdicionais;
	
	//TextFields
	public JTextField fieldNome;
	public JTextField fieldProf;
	public JTextField fieldTime;
	public JTextField fieldLogradouro;
	public JTextField fieldNum;
	public JTextField fieldComplemento;
	public JTextField fieldBairro;
	public JTextField fieldCep;
	public JTextField fieldCidade;
	public JTextField fieldRef;
	public JTextField fieldEmail;
	public JTextField fieldMontante;
	
	//TextPArea
	public JTextArea textAreaInfoAd;
	
	//Radioutton
	public JRadioButton rdbtnMasculino;
	public JRadioButton rdbtnFeminino;
	public JRadioButton rdbtnFisica;
	public JRadioButton rdbtnJridi;
	
	//ComboBoxes
	public JComboBox<String> boxEstadoCivil;
	public JComboBox<String> comboBoxFxSal;
	public JComboBox<String> comboBoxUf;
	
	//Buttons
	public JButton btnSalvar;
	public JButton btnSair;
	
	//Formatadores
	public JFormattedTextField fieldFormatTelRes;
	public JFormattedTextField fieldFormatTelCel;
	public JFormattedTextField fieldFormatDataNasc;
	public JFormattedTextField fieldFormatRg;
	public JFormattedTextField fieldFormatCep;
	public JFormattedTextField fieldFormatCpf;
	public JFormattedTextField fieldFormatCnpj;
	
	//Máscaras
	public MaskFormatter maskTelRes;
	public MaskFormatter maskDataNasc;
	public MaskFormatter maskRg;
	public MaskFormatter maskCep;
	public MaskFormatter maskTelCel;
	public MaskFormatter maskCpf;
	public MaskFormatter maskCnpj;
	protected Container content = getContentPane();
	
	//Objeto
	protected Cliente c;

	public JanelaCadastro() throws ParseException {
		super("Cadastrar usuário");

		content = getContentPane();
		content.setLayout(null);
		
		//Labels
		
		lblNome = new JLabel("Nome Completo*:");
		lblNome.setBounds(new Rectangle(10, 22, 99, 14));
		content.add(lblNome);

		lblSexo = new JLabel("Sexo*:");
		lblSexo.setBounds(10, 47, 46, 14);
		content.add(lblSexo);

		lblEstadoCivil = new JLabel("Estado Civil:");
		lblEstadoCivil.setBounds(10, 72, 79, 14);
		content.add(lblEstadoCivil);

		lblDataDeNascimento = new JLabel("Data de nascimento: ");
		lblDataDeNascimento.setBounds(10, 97, 135, 14);
		content.add(lblDataDeNascimento);

		lblRg = new JLabel("RG*:");
		lblRg.setBounds(224, 97, 46, 14);
		content.add(lblRg);
		

		lblEmail = new JLabel("E-mail: ");
		lblEmail.setBounds(10, 362, 99, 14);
		content.add(lblEmail);

		lblProfisso = new JLabel("Profissão*:");
		lblProfisso.setBounds(10, 119, 123, 14);
		content.add(lblProfisso);

		lblFaixaSalarial = new JLabel("Faixa Salarial*:");
		lblFaixaSalarial.setBounds(10, 144, 123, 14);
		content.add(lblFaixaSalarial);

		lblTimeDeFutebol = new JLabel("Time de futebol:");
		lblTimeDeFutebol.setBounds(10, 169, 123, 14);
		content.add(lblTimeDeFutebol);

		lblLogradouro = new JLabel("Logradouro*:");
		lblLogradouro.setBounds(10, 194, 123, 14);
		content.add(lblLogradouro);

		lblNmero = new JLabel("Número*:");
		lblNmero.setBounds(353, 194, 61, 14);
		content.add(lblNmero);

		lblComplemento = new JLabel("Complemento: ");
		lblComplemento.setBounds(10, 219, 123, 14);
		content.add(lblComplemento);

		lblBairro = new JLabel("Bairro:");
		lblBairro.setBounds(10, 244, 99, 14);
		content.add(lblBairro);

		lblCep = new JLabel("CEP: ");
		lblCep.setBounds(284, 244, 46, 14);
		content.add(lblCep);

		lblCidade = new JLabel("Cidade*: ");
		lblCidade.setBounds(10, 269, 99, 14);
		content.add(lblCidade);

		lblUf = new JLabel("UF*:");
		lblUf.setBounds(284, 272, 46, 14);
		content.add(lblUf);

		lblReferncias = new JLabel("Referências: ");
		lblReferncias.setBounds(10, 294, 123, 14);
		content.add(lblReferncias);
		
		lblTelefoneResidencial = new JLabel("Telefone residencial:");
		lblTelefoneResidencial.setBounds(10, 331, 135, 14);
		content.add(lblTelefoneResidencial);
		
		lblTelefoneCelular = new JLabel("Celular:");
		lblTelefoneCelular.setBounds(300, 331, 99, 14);
		content.add(lblTelefoneCelular);

		lblCpf = new JLabel("CPF*:");
		lblCpf.setBounds(10, 420, 79, 14);
		content.add(lblCpf);
		lblCpf.setVisible(false);

		lblTipoDePessoa = new JLabel("Tipo de pessoa*:");
		lblTipoDePessoa.setBounds(10, 387, 135, 14);
		content.add(lblTipoDePessoa);

		lblCnpj = new JLabel("CNPJ*:");
		lblCnpj.setBounds(10, 420, 79, 14);
		content.add(lblCnpj);
		lblCnpj.setVisible(false);

		lblMontante = new JLabel("Montante:");
		lblMontante.setBounds(10, 513, 99, 14);
		content.add(lblMontante);

		lblInformaesAdicionais = new JLabel("Informações adicionais:");
		lblInformaesAdicionais.setBounds(249, 480, 144, 14);
		content.add(lblInformaesAdicionais);
		
		//Text Area
		textAreaInfoAd = new JTextArea();
		textAreaInfoAd.setBounds(392, 470, 254, 86);
		textAreaInfoAd.setToolTipText("Digite apenas números.");
		content.add(textAreaInfoAd);
		
		//Button Groups
		ButtonGroup groupPessoa = new ButtonGroup();
		ButtonGroup sexo = new ButtonGroup();

		//Combo Boxes
		comboBoxFxSal = new JComboBox<String>();
		comboBoxFxSal.setModel(new DefaultComboBoxModel<String>(new String[] {"Abaixo de um salário mínimo", "De um a dois salários mínimos", "De dois a três salários mínimos", "De quatro a cinco salários mínimos", "Mais que seis salários mínimos"}));
		comboBoxFxSal.setBounds(143, 141, 250, 20);
		content.add(comboBoxFxSal);
		
		boxEstadoCivil = new JComboBox<String>();
		boxEstadoCivil.setModel(new DefaultComboBoxModel<String>(new String[] {"Casado(a)", "Solteiro(a)", "Viúvo(a)", "Divorciado(a)"}));
		boxEstadoCivil.setBounds(143, 69, 135, 20);
		content.add(boxEstadoCivil);
		
		comboBoxUf = new JComboBox<String>();
		comboBoxUf.setModel(new DefaultComboBoxModel<String>(new String[] {"RS", "SP", "AL", "BA", "SC", "PA", "SE", "AC", "AP", "AM", "CE", "DF", "ES", "GO", "MS", "MT", "MG", "PB", "PR", "PE", "PI", "RJ", "RN", "RO", "RR", "TO"}));
		comboBoxUf.setBounds(318, 266, 51, 20);
		content.add(comboBoxUf);
		comboBoxUf.setActionCommand("SP");
		comboBoxUf.addActionListener(this);
		
		//Fields
		
		fieldNome = new JTextField();
		fieldNome.addKeyListener(new KeyAdapter() {
			//@Override
			public void keyTyped(KeyEvent ev) {
				String caracteres = "0987654321!@#$%¨&*()_-=+§-,.;<][{}?/|";
				if (caracteres.contains(ev.getKeyChar() + "")) {
					JOptionPane.showMessageDialog(fieldCep,
							"Digite apenas letras!");
					ev.consume();
				}
			}
		});

		fieldNome.setBounds(143, 19, 270, 20);
		fieldNome.setToolTipText("Digite o nome completo, apenas letras.");
		content.add(fieldNome);
		
		maskDataNasc = new MaskFormatter("##/##/####");
		maskDataNasc.setPlaceholderCharacter('_');
		fieldFormatDataNasc = new JFormattedTextField(maskDataNasc);
		fieldFormatDataNasc.setBounds(143, 94, 71, 20);
		content.add(fieldFormatDataNasc);		
		fieldFormatDataNasc.setToolTipText("Digite apenas números.");
		fieldFormatDataNasc.addFocusListener(new FocusAdapter() {  
		    @Override  
		    public void focusLost(FocusEvent e) {  
		        //Se não estiver válido exibe o erro.  
		    	boolean ok = Cliente.validaDataNasc(fieldFormatDataNasc.getText()); 
		    	if(!ok){
					JOptionPane.showMessageDialog(boxEstadoCivil, "Data Inválida");
				}
		    }
		});
		
		maskRg = new MaskFormatter("#########");
		fieldFormatRg = new JFormattedTextField(maskRg);
		fieldFormatRg.setBounds(257, 94, 99, 20);
		content.add(fieldFormatRg);
		fieldFormatRg.setToolTipText("Digite apenas números.");
		
		fieldProf = new JTextField();
		fieldProf.setBounds(143, 116, 135, 20);
		content.add(fieldProf);
		fieldProf.addKeyListener(new KeyAdapter() {
			//@Override
			public void keyTyped(KeyEvent ev) {
				String caracteres = "0987654321!@#$%¨&*()_-=+§-,.;<][{}?/|";
				if (caracteres.contains(ev.getKeyChar() + "")) {
					JOptionPane.showMessageDialog(fieldCep,
							"Digite apenas letras!");
					ev.consume();
				}
			}
		});
		fieldProf.setToolTipText("Digite apenas letras.");

		fieldTime = new JTextField();
		fieldTime.setBounds(143, 166, 200, 20);
		fieldTime.addKeyListener(new KeyAdapter() {
			//@Override
			public void keyTyped(KeyEvent ev) {
				String caracteres = "0987654321!@#$%¨&*()_-=+§-,.;<][{}?/|";
				if (caracteres.contains(ev.getKeyChar() + "")) {
					JOptionPane.showMessageDialog(fieldCep,
							"Digite apenas letras!");
					ev.consume();
				}
			}
		});
		fieldTime.setToolTipText("Digite apenas letras.");
		content.add(fieldTime);

		fieldLogradouro = new JTextField();
		fieldLogradouro.setBounds(143, 191, 200, 20);
		fieldTime.addKeyListener(new KeyAdapter() {
			//@Override
			public void keyTyped(KeyEvent ev) {
				String caracteres = "0987654321!@#$%¨&*()_-=+§-,.;<][{}?/|";
				if (caracteres.contains(ev.getKeyChar() + "")) {
					JOptionPane.showMessageDialog(fieldCep,
							"Digite apenas letras!");
					ev.consume();
				}
			}
		});
		fieldTime.setToolTipText("Digite apenas letras.");
		content.add(fieldLogradouro);

		fieldNum = new JTextField();
		fieldNum.setBounds(404, 191, 52, 20);
		fieldNum.addKeyListener(new KeyAdapter() {
			//@Override
			public void keyTyped(KeyEvent ev) {
				String caracteres = "0987654321!@#$%¨&*()_-=+§-,.;<][{}?/|";
				if (!caracteres.contains(ev.getKeyChar() + "")) {
					ev.consume();
				}
			}
		});
		content.add(fieldNum);

		fieldComplemento = new JTextField();		
		fieldComplemento.setBounds(143, 216, 200, 20);
		fieldComplemento.addKeyListener(new KeyAdapter() {
			//@Override
			public void keyTyped(KeyEvent ev) {
				String caracteres = "0987654321!@#$%¨&*()_-=+§-,.;<][{}?/|";
				if (caracteres.contains(ev.getKeyChar() + "")) {
					JOptionPane.showMessageDialog(fieldCep,
							"Digite apenas letras!");
					ev.consume();
				}
			}
		});
		fieldComplemento.setToolTipText("Digite apenas letras.");
		content.add(fieldComplemento);

		fieldBairro = new JTextField();
		fieldBairro.setBounds(143, 241, 128, 20);
		fieldBairro.addKeyListener(new KeyAdapter() {
			//@Override
			public void keyTyped(KeyEvent ev) {
				String caracteres = "0987654321!@#$%¨&*()_-=+§-,.;<][{}?/|";
				if (caracteres.contains(ev.getKeyChar() + "")) {
					JOptionPane.showMessageDialog(fieldCep,
							"Digite apenas letras!");
					ev.consume();
				}
			}
		});
		fieldBairro.setToolTipText("Digite apenas letras.");
		content.add(fieldBairro);
		
		maskCep = new MaskFormatter("#####-###");
		maskCep.setPlaceholderCharacter('_');
		fieldFormatCep = new JFormattedTextField(maskCep);
		fieldFormatCep.setBounds(318, 241, 89, 20);
		content.add(fieldFormatCep);

		fieldCidade = new JTextField();
		fieldCidade.setBounds(143, 269, 135, 20);
		fieldCidade.addKeyListener(new KeyAdapter() {
			//@Override
			public void keyTyped(KeyEvent ev) {
				String caracteres = "0987654321!@#$%¨&*()_-=+§-,.;<][{}?/|";
				if (caracteres.contains(ev.getKeyChar() + "")) {
					JOptionPane.showMessageDialog(fieldCep,
							"Digite apenas letras!");
					ev.consume();
				}
			}
		});
		fieldCidade.setToolTipText("Digite apenas letras.");
		content.add(fieldCidade);

		fieldRef = new JTextField();
		fieldRef.setBounds(143, 297, 200, 20);
		fieldRef.addKeyListener(new KeyAdapter() {
			//@Override
			public void keyTyped(KeyEvent ev) {
				String caracteres = "0987654321!@#$%¨&*()_-=+§-,.;<][{}?/|";
				if (caracteres.contains(ev.getKeyChar() + "")) {
					JOptionPane.showMessageDialog(fieldCep,
							"Digite apenas letras!");
					ev.consume();
				}
			}
		});
		fieldRef.setToolTipText("Digite apenas letras.");
		content.add(fieldRef);

		maskTelRes = new MaskFormatter("(##)####-####");
		maskTelRes.setPlaceholderCharacter('_');
		fieldFormatTelRes = new JFormattedTextField(maskTelRes);
		fieldFormatTelRes.setBounds(143, 328, 150, 20);
		content.add(fieldFormatTelRes);

		
		maskTelCel = new MaskFormatter("(##)####-####");
		maskTelCel.setPlaceholderCharacter('_');
		fieldFormatTelCel = new JFormattedTextField(maskTelCel);
		fieldFormatTelCel.setBounds(353, 328, 99, 20);
		fieldFormatTelCel.setToolTipText("Digite apenas números.");
		content.add(fieldFormatTelCel);

		fieldEmail = new JTextField();
		fieldEmail.setBounds(143, 359, 200, 20);
		fieldEmail.addKeyListener(new KeyAdapter() {
			//@Override
			public void keyTyped(KeyEvent ev) {
				String caracteres = "0987654321!#$%¨&*()_-=+§-,.;<][{}?/|";
				if (caracteres.contains(ev.getKeyChar() + "")) {
					JOptionPane.showMessageDialog(fieldCep,
							"Digite apenas letras!");
					ev.consume();
				}
			}
		});
		fieldEmail.setToolTipText("Informe um endereço de Email válido");
		content.add(fieldEmail);
		
		maskCnpj = new MaskFormatter("##.###.###/####-##");
		maskCnpj.setPlaceholderCharacter('_');
		fieldFormatCnpj = new JFormattedTextField(maskCnpj);
		fieldFormatCnpj.setBounds(143, 417, 200, 20);
		fieldFormatCnpj.setToolTipText("Digite apenas números.");
		content.add(fieldFormatCnpj);
		fieldFormatCnpj.setVisible(false);
		fieldFormatCnpj.setActionCommand("ValidaCPF");
		fieldFormatCnpj.addActionListener(this);
		fieldFormatCnpj.addFocusListener(new FocusAdapter() {  
		    @Override  
		    public void focusLost(FocusEvent e) {  
		        //Se não estiver válido exibe o erro.  
		    	boolean ok = Cliente.validaCnpj(fieldFormatCnpj.getText()); 
		    	if(!ok){
					JOptionPane.showMessageDialog(boxEstadoCivil, "CNPJ inválido");
				}
		    }
		});
		
		maskCpf = new MaskFormatter("###.###.###-##");
		maskCpf.setPlaceholderCharacter('_');
		fieldFormatCpf = new JFormattedTextField(maskCpf);
		fieldFormatCpf.setBounds(143, 417, 200, 20);
		fieldFormatCpf.setToolTipText("Digite apenas números.");
		content.add(fieldFormatCpf);
		fieldFormatCpf.setVisible(false);
		fieldFormatCpf.addFocusListener(new FocusAdapter() {  
		    @Override  
		    public void focusLost(FocusEvent e) {  
		        //Se não estiver válido exibe o erro.  
		    	boolean ok = Cliente.validaCpf(fieldFormatCpf.getText()); 
		    	if(!ok){
					JOptionPane.showMessageDialog(boxEstadoCivil, "CPF inválido");
				}
		    }
		}); 
		
		
		
		fieldMontante = new JTextField();
		fieldMontante.setBounds(143, 510, 104, 20);
		content.add(fieldMontante);
		
		//Radio Buttons
		rdbtnFisica = new JRadioButton("Física");
		rdbtnFisica.setBounds(143, 386, 71, 20);
		groupPessoa.add(rdbtnFisica);
		rdbtnFisica.setActionCommand("Física");
		rdbtnFisica.addActionListener(this);
		content.add(rdbtnFisica);
		
		rdbtnJridi = new JRadioButton("Jurídica");
		rdbtnJridi.setBounds(216, 386, 104, 20);
		groupPessoa.add(rdbtnJridi);
		rdbtnJridi.setActionCommand("Jurídica");
		rdbtnJridi.addActionListener(this);
		content.add(rdbtnJridi);
		
		rdbtnMasculino = new JRadioButton("Masculino");
		rdbtnMasculino.setBounds(137, 47, 99, 14);
		content.add(rdbtnMasculino);
		rdbtnMasculino.setActionCommand("Masculino");
		rdbtnMasculino.addActionListener(this);
		sexo.add(rdbtnMasculino);
		
		rdbtnFeminino = new JRadioButton("Feminino");
		rdbtnFeminino.setBounds(238, 44, 99, 20);
		content.add(rdbtnFeminino);
		rdbtnFeminino.setActionCommand("Feminino");
		rdbtnFeminino.addActionListener(this);
		sexo.add(rdbtnFeminino);

		//Buttons
		btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(280, 581, 89, 23);
		content.add(btnSalvar);
		btnSalvar.setActionCommand("Salvar");
		btnSalvar.addActionListener(this);

		btnSair = new JButton("Sair");
		btnSair.setBounds(377, 581, 89, 23);
		btnSair.setActionCommand("Sair");
		btnSair.addActionListener(this);
		content.add(btnSair);

		setSize(700, 680);
		setVisible(true);

	}
	
	public void limparTela(){
		
		//Limpar Campos de JTextField
		fieldBairro.setText(null);
		fieldCidade.setText(null);
		fieldComplemento.setText(null);
		fieldEmail.setText(null);
		fieldFormatCep.setText(null);
		fieldFormatCnpj.setText(null);
		fieldFormatCpf.setText(null);
		fieldFormatDataNasc.setText(null);
		fieldFormatRg.setText(null);
		fieldFormatTelCel.setText(null);
		fieldFormatTelRes.setText(null);
		fieldLogradouro.setText(null);
		fieldMontante.setText(null);
		fieldNome.setText(null);
		fieldNum.setText(null);
		fieldProf.setText(null);
		fieldRef.setText(null);
		fieldTime.setText(null);
		
		//Limpar RadioButtons
		
		rdbtnFeminino.setSelected(false);
		rdbtnMasculino.setSelected(false);
		rdbtnFisica.setSelected(false);
		rdbtnJridi.setSelected(false);
	}

	public boolean verificaDados(){
		
		boolean aux;
		
		if((fieldNome.getText() == null) || ((!rdbtnFeminino.isSelected())&&(!rdbtnMasculino.isSelected())) ||
				(fieldFormatRg.getText() == null) || (fieldProf.getText() == null) || (fieldLogradouro.getText() == null) ||
				(fieldNum.getText() == null) || (fieldCidade.getText() == null) || ((!rdbtnFisica.isSelected())&&(!rdbtnJridi.isSelected()))
				|| (!Cliente.validaDataNasc(fieldFormatDataNasc.getText())) || (!Cliente.validaCpf(fieldFormatCpf.getText()))
				||(!Cliente.validaCnpj(fieldFormatCnpj.getText()))){
			aux = false;
		}
		else if(rdbtnFisica.isSelected()){
			if(fieldFormatCpf.getText() == null){
				aux = false;
			}
			else{
				aux = true;
			}
		}
		else if(rdbtnJridi.isSelected()){
			if(fieldFormatCnpj.getText() == null){
				aux = false;
			}
			else{
				aux = true;
			}
		}
		else{
			aux = false;
		}
		return aux;
		
	}
	
	
	public static void main(String[] args) throws ParseException {
		new JanelaCadastro();

	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		
		
		String comand = (String) e.getActionCommand();
		
		if(comand.equals("Física")){
			lblCpf.setVisible(true);
			fieldFormatCpf.setVisible(true);
			lblCnpj.setVisible(false);
			fieldFormatCnpj.setVisible(false);
		}
		if(comand.equals("Jurídica")){
			lblCpf.setVisible(false);
			fieldFormatCpf.setVisible(false);
			lblCnpj.setVisible(true);
			fieldFormatCnpj.setVisible(true);
		}
		
		if(comand.equals("SP")){

			try {
				if(comboBoxUf.getSelectedItem() == "SP"){
					maskTelCel = new MaskFormatter("(##)#####-####");
					maskTelCel.setPlaceholderCharacter('_');
					fieldFormatTelCel = new JFormattedTextField(maskTelCel);
				}
				else{
					maskTelCel = new MaskFormatter("(##)####-####");
					maskTelCel.setPlaceholderCharacter('_');
					fieldFormatTelCel = new JFormattedTextField(maskTelCel);
				}
			} catch (ParseException e1) {
				JOptionPane.showMessageDialog(boxEstadoCivil, "Ocorreu um erro. Tente novamente.");
			}
		}
		
		if(comand.equals("Salvar")){
			
			c = new Cliente();
			if(verificaDados()){
			
				//Seta Informações Adicionais
				c.setInfoAdicionais(textAreaInfoAd.getText());
				
				//Seta elementos das Radio buttons Pessoa Física e Sexo
				if(rdbtnFisica.isSelected()){
					c.setTipoPessoa("Física");
				}
				else if(rdbtnJridi.isSelected()){
					c.setTipoPessoa("Jurídica");
				}
				if(rdbtnMasculino.isSelected()){
					c.setSexo("Masculino");
				}
				else if(rdbtnFeminino.isSelected()){
					c.setSexo("Feminino");
				}
				
				//Seta elementos das ComboBoxes, Faixa Salarial, UF e Estado Civil
				c.setUF((String) comboBoxUf.getSelectedItem());
				c.setSalario((String) comboBoxFxSal.getSelectedItem());
				c.setEstadoCivil((String) boxEstadoCivil.getSelectedItem());
				
				/*Seta elementos de TextFielnd
				 * Nome, Bairro, Celular, Cep, Cidade, Cnpj, Comp, Cpf, Data de Nascimento, Logradouro, Montante, Número,
				 * Profissão, Referência, RG, Telefone Fixo, Celular, Time de Futebol e Email.
				 */
				
				c.setNome(fieldNome.getText());
				c.setBairro(fieldBairro.getText());
				c.setCelular(fieldFormatTelCel.getText());
				c.setCep(fieldFormatCep.getText());
				c.setCidade(fieldCidade.getText());
				c.setComp(fieldComplemento.getText());
				c.setDataNasc(fieldFormatDataNasc.getText());
				c.setLogradouro(fieldLogradouro.getText());
				c.setMontante(fieldMontante.getText());
				c.setNumero(fieldNum.getText());
				c.setProfissao(fieldProf.getText());
				c.setReferencia(fieldRef.getText());
				c.setRG(fieldFormatRg.getText());
				c.setTelFixo(fieldFormatTelRes.getText());
				c.setTimeFutebol(fieldTime.getText());
				c.setTipoEmail(fieldEmail.getText());
				c.setCpf(fieldFormatCpf.getText());
				c.setCNPJ(fieldFormatCnpj.getText());
				
				/*
				 * Adiciona o objeto c ao vetor na posição do ID. 
				 * No caso, tive que mudar a lógica do ID na classe Cliente. O que eu fiz foi o seguinte;
				 * Atribui um valor estático à uma variável auxiliar chamada "contID" inicializada em 0 e criei um método chamado "incrementaID"
				 * O método "incrementaID" adiciona o valor do contID(que incialmente é zero) e então incrementa +1 à variável cont ID,
				 * que na próxima vez que for chamado, terá o valor 1 e assim por diante.
				 * Esse valor será o ID do usuário e eu usei esse valor pra indicar a posição do índice no vetor.
				 * vector.add(índice, objeto)
				 * que no caso, seria vector.add(ID do Cliente, objeto do cliente); 
				 * 
				 */
				
				c.incrementaID();
				limparTela();
				Cliente.setVectorC(c.getID(), c);
				System.out.println("Posição atual " + Cliente.getVectorC().get(c.getID()).getNome() + " " +c.getID());
				System.out.println("Data " + Cliente.getVectorC().get(c.getID()).getDataNasc());
				System.out.println("Cpf " + Cliente.getVectorC().get(c.getID()).getCPF());
				
				
				System.out.println("Posição " + Cliente.getVectorC().get(0).getNome() + " 0");
			}
			
			if(!verificaDados()){
				JOptionPane.showMessageDialog(boxEstadoCivil, "Um ou mais campos obrigatórios não foram preenchidos.");
			}
			else if(Cliente.getVectorC().isEmpty()){
				JOptionPane.showMessageDialog(boxEstadoCivil, "Não tem nenhum cliente cadastrado");
			}
						
		}
		
		if(comand.equals("Sair")){
			System.exit(0);
		}
	}
}

