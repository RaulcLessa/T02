package T02_Integrado;

import java.awt.*;
import java.awt.event.*;
import java.text.ParseException;
import java.util.Vector;

import javax.swing.*;
import javax.swing.text.MaskFormatter;

@SuppressWarnings("serial")
public class JanelaEdicao extends JFrame implements ActionListener {

	// Labels
	private JLabel lblSexo;
	private JLabel lblEstadoCivil;
	private JLabel lblDataDeNascimento;
	private JLabel lblRg;
	private JLabel lblProfisso;
	private JLabel lblFaixaSalarial;
	private JLabel lblTimeDeFutebol;
	private JLabel lblLogradouro;
	private JLabel lblNmero;
	private JLabel lblComplemento;
	private JLabel lblBairro;
	private JLabel lblCep;
	private JLabel lblCidade;
	private JLabel lblUf;
	private JLabel lblNome;
	private JLabel lblReferncias;
	private JLabel lblTelefoneResidencial;
	private JLabel lblTelefoneCelular;
	private JLabel lblEmail;
	private JLabel lblTipoDePessoa;
	private JLabel lblCpf;
	private JLabel lblCnpj;
	private JLabel lblMontante;
	private JLabel lblInformaesAdicionais;

	// TextFields
	private JTextField fieldNome;
	private JTextField fieldProf;
	private JTextField fieldTime;
	private JTextField fieldLogradouro;
	private JTextField fieldNum;
	private JTextField fieldComplemento;
	private JTextField fieldBairro;
	private JTextField fieldCep;
	private JTextField fieldCidade;
	private JTextField fieldRef;
	private JTextField fieldEmail;
	private JTextField fieldCnpj;
	private JTextField fieldCpf;
	private JTextField fieldMontante;

	// TextPane
	private JTextPane textPaneInfoAd;

	// Radioutton
	private JRadioButton rdbtnMasculino;
	private JRadioButton rdbtnFeminino;
	private JRadioButton rdbtnFisica;
	private JRadioButton rdbtnJridi;

	private JTextArea textAreaInfoAd;

	// ComboBoxes
	private JComboBox<String> boxEstadoCivil;
	private JComboBox<String> comboBoxFxSal;
	private JComboBox<String> comboBoxUf;

	// Buttons
	private JButton btnSalvar;
	private JButton btnSair;

	// Formatadores
	private JFormattedTextField fieldFormatTelRes;
	private JFormattedTextField fieldFormatTelCel;
	private JFormattedTextField fieldFormatDataNasc;
	private JFormattedTextField fieldFormatRg;
	private JFormattedTextField fieldFormatCep;

	// Máscaras
	private MaskFormatter maskTelRes;
	private MaskFormatter maskDataNasc;
	private MaskFormatter maskRg;
	private MaskFormatter maskCep;
	private MaskFormatter maskTelCel;

	public JanelaEdicao(Vector<?> vetor) throws ParseException {
		super("Editar cadastro");

		Container content = getContentPane();
		content.setLayout(null);

		// Labels

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

		lblTipoDePessoa = new JLabel("Tipo de pessoa*:");
		lblTipoDePessoa.setBounds(10, 387, 135, 14);
		content.add(lblTipoDePessoa);

		lblCnpj = new JLabel("CNPJ*:");
		lblCnpj.setBounds(10, 445, 99, 14);
		content.add(lblCnpj);

		lblMontante = new JLabel("Montante:");
		lblMontante.setBounds(10, 542, 99, 14);
		content.add(lblMontante);

		lblInformaesAdicionais = new JLabel("Informações adicionais:");
		lblInformaesAdicionais.setBounds(249, 480, 144, 14);
		content.add(lblInformaesAdicionais);

		// Text Pane
		textPaneInfoAd = new JTextPane();
		textPaneInfoAd.setBounds(392, 470, 254, 86);
		content.add(textPaneInfoAd);

		// Button Groups
		ButtonGroup groupPessoa = new ButtonGroup();
		ButtonGroup sexo = new ButtonGroup();

		// Radio Buttons
		rdbtnFisica = new JRadioButton("Fisica");
		rdbtnFisica.setBounds(143, 386, 71, 20);
		groupPessoa.add(rdbtnFisica);
		content.add(rdbtnFisica);

		rdbtnJridi = new JRadioButton("Jurídica");
		rdbtnJridi.setBounds(216, 386, 104, 20);
		groupPessoa.add(rdbtnJridi);
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

		// Combo Boxes
		comboBoxFxSal = new JComboBox<String>();
		comboBoxFxSal.setModel(new DefaultComboBoxModel<String>(new String[] {
				"Abaixo de um salário mínimo", "De um a dois salários mínimos",
				"De dois a três salários mínimos",
				"De quatro a cinco salários mínimos",
				"Mais que seis salários mínimos" }));
		comboBoxFxSal.setBounds(143, 141, 250, 20);
		content.add(comboBoxFxSal);

		boxEstadoCivil = new JComboBox<String>();
		boxEstadoCivil.setModel(new DefaultComboBoxModel<String>(new String[] {
				"Casado(a)", "Solteiro(a)", "Viúvo(a)", "Divorciado(a)" }));
		boxEstadoCivil.setBounds(143, 69, 135, 20);
		content.add(boxEstadoCivil);

		comboBoxUf = new JComboBox<String>();
		comboBoxUf.setModel(new DefaultComboBoxModel<String>(new String[] {
				"RS", "SP", "AL", "BA", "SC", "PA", "SE", "AC", "AP", "AM",
				"CE", "DF", "ES", "GO", "MS", "MT", "MG", "PB", "PR", "PE",
				"PI", "RJ", "RN", "RO", "RR", "TO" }));
		comboBoxUf.setBounds(318, 266, 51, 20);
		content.add(comboBoxUf);

		// Fields

		fieldNome = new JTextField();
		fieldNome.addKeyListener(new KeyAdapter() {
			// @Override
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

		maskRg = new MaskFormatter("#########");
		fieldFormatRg = new JFormattedTextField(maskRg);
		fieldFormatRg.setBounds(257, 94, 99, 20);
		content.add(fieldFormatRg);
		fieldFormatRg.setToolTipText("Digite apenas números.");

		fieldProf = new JTextField();
		fieldProf.setBounds(143, 116, 135, 20);
		content.add(fieldProf);
		fieldProf.addKeyListener(new KeyAdapter() {
			// @Override
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
			// @Override
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
			// @Override
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
		content.add(fieldNum);

		fieldComplemento = new JTextField();
		fieldComplemento.setBounds(143, 216, 200, 20);
		fieldComplemento.addKeyListener(new KeyAdapter() {
			// @Override
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
			// @Override
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
			// @Override
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
			// @Override
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

		maskTelRes = new MaskFormatter("(##)#####-####");
		maskTelRes.setPlaceholderCharacter('_');
		fieldFormatTelRes = new JFormattedTextField(maskTelRes);
		fieldFormatTelRes.setBounds(143, 328, 150, 20);
		content.add(fieldFormatTelRes);

		maskTelCel = new MaskFormatter("(##)#####-####");
		maskTelCel.setPlaceholderCharacter('_');
		fieldFormatTelCel = new JFormattedTextField(maskTelCel);
		fieldFormatTelCel.setBounds(353, 328, 99, 20);
		fieldFormatTelCel.setToolTipText("Digite apenas letras.");
		content.add(fieldFormatTelCel);

		fieldEmail = new JTextField();
		fieldEmail.setBounds(143, 359, 200, 20);
		fieldEmail.addKeyListener(new KeyAdapter() {
			// @Override
			public void keyTyped(KeyEvent ev) {
				String caracteres = "0987654321!#$%¨&*()_-=+§-,.;<][{}?/|";
				if (caracteres.contains(ev.getKeyChar() + "")) {
					JOptionPane.showMessageDialog(fieldCep,
							"Digite apenas letras!");
					ev.consume();
				}
			}
		});
		fieldEmail.setToolTipText("Digite apenas letras.");
		content.add(fieldEmail);

		fieldCnpj = new JTextField();
		fieldCnpj.setBounds(143, 445, 200, 20);
		fieldCnpj.addKeyListener(new KeyAdapter() {
			// @Override
			public void keyTyped(KeyEvent ev) {
				String caracteres = "0987654321!@#$%¨&*()_-=+§-,.;<][{}?/|";
				if (!caracteres.contains(ev.getKeyChar() + "")) {
					JOptionPane.showMessageDialog(fieldCep,
							"Digite apenas letras!");
					ev.consume();
				}
			}
		});

		fieldCpf = new JTextField();
		fieldCpf.setBounds(143, 417, 200, 20);
		fieldCpf.addKeyListener(new KeyAdapter() {
			// @Override
			public void keyTyped(KeyEvent ev) {
				String caracteres = "0987654321!@#$%¨&*()_-=+§-,.;<][{}?/|";
				if (!caracteres.contains(ev.getKeyChar() + "")) {
					JOptionPane.showMessageDialog(fieldCep,
							"Digite apenas letras!");
					ev.consume();
				}
			}
		});
		fieldCpf.setToolTipText("Digite apenas letras.");
		content.add(fieldCpf);

		fieldMontante = new JTextField();
		fieldMontante.setBounds(143, 533, 104, 20);
		content.add(fieldMontante);

		// Buttons
		btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(284, 620, 89, 23);
		content.add(btnSalvar);
		btnSalvar.setActionCommand("Salvar");
		btnSalvar.addActionListener(this);

		btnSair = new JButton("Sair");
		btnSair.setBounds(376, 620, 89, 23);
		btnSair.setActionCommand("Sair");
		btnSair.addActionListener(this);
		content.add(btnSair);

		int valor = JanelaBusca.getValorBusca();

		for (int i = 0; i < JanelaCadastro.vetor.size(); i++) {
			Cliente obj = JanelaCadastro.vetor.elementAt(i);
			if (valor == i) {

				// Chama os valores dentro dos JTextFields
				fieldNome.setText(obj.getNome());
				fieldBairro.setText(obj.getBairro());
				fieldFormatTelCel.setText(obj.getCelular());
				fieldFormatCep.setText(obj.getCep());
				fieldCidade.setText(obj.getCidade());
				// fieldCnpj.setText(obj.getCnpj());
				fieldComplemento.setText(obj.getComp());
				// fieldCpf.setText(obj.getCpf());
				fieldFormatDataNasc.setText(obj.getDataNasc());
				fieldLogradouro.setText(obj.getLogradouro());
				fieldMontante.setText(obj.getMontante());
				fieldNum.setText(obj.getNumero());
				fieldProf.setText(obj.getProfissao());
				fieldRef.setText(obj.getReferencia());
				fieldFormatRg.setText(obj.getRG());
				fieldFormatTelRes.setText(obj.getTelFixo());
				fieldTime.setText(obj.getTimeFutebol());
				fieldEmail.setText(obj.getTipoEmail());

				// Chama os valores do JTextArea
				textAreaInfoAd.setText(obj.getInfoAdicionais());

				// Chama os valores dos JComboBoxes
				comboBoxUf.setSelectedItem(obj.getUF());
				comboBoxFxSal.setSelectedItem(obj.getSalario());
				boxEstadoCivil.setSelectedItem(obj.getEstadoCivil());

				// Seta os JRadioButtons
				if (obj.getSexo() == "Masculino") {
					rdbtnMasculino.setSelected(true);
				} else {
					rdbtnFeminino.setSelected(true);
				}
				if (obj.getTipoPessoa() == "Física") {
					rdbtnFisica.setSelected(true);
				} else {
					rdbtnJridi.setSelected(true);
				}

			}

		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 720);
		setVisible(true);

	}

	public static void main(String[] args) throws ParseException {
		// new JanelaEdicao();

	}

	public void actionPerformed(ActionEvent e) {
		String comando = (String) e.getActionCommand();

		if (comando.equals("Salvar")) {

		}
	}
}
