package com.apolo.atividade6;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cadastro extends JFrame {

	private JPanel jpanel;
	
	private JTextField textFieldNome;
	private JTextField textFieldTelefone;
	private JTextField textFieldEndere�o;
	private JTextField textFieldEscola;
	private JTextField textFieldNacio;
	private JTextField textFieldIdade;
	
	private JMenuBar menuBar;
	private JMenu menuArquivo;
	private JMenuItem menuItemSalvar;
	private JMenuItem menuItemSair;
	private JMenu menuEditar;
	private JMenuItem menuItemCopiar;
	private JMenuItem menuItemColar;
	
	private ButtonGroup radioGroup;
	
	private JComboBox comboBox;
	private String cursos[] = { "ADS", "Processos Gerenciais" };

	public Cadastro() {
		super("Cadastro");
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		menuArquivo = new JMenu("Arquivo");
		menuBar.add(menuArquivo);
		
		menuItemSalvar = new JMenuItem("Salvar");
		menuItemSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				JOptionPane.showMessageDialog(null, "Dados Salvos");
			}
		});
		menuArquivo.add(menuItemSalvar);
		
		menuItemSair = new JMenuItem("Sair");
		menuItemSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				System.exit(0);
			}
		});
		menuArquivo.add(menuItemSair);
		
		menuEditar = new JMenu("Editar");
		menuBar.add(menuEditar);
		
		menuItemCopiar = new JMenuItem("Copiar");
		menuEditar.add(menuItemCopiar);
		
		menuItemColar = new JMenuItem("Colar");
		menuEditar.add(menuItemColar);
		
		jpanel = new JPanel();
		setContentPane(jpanel);
		jpanel.setLayout(null);
		
		JLabel label1 = new JLabel("Nome");
		label1.setBounds(10, 11, 46, 14);
		jpanel.add(label1);
		
		JLabel label2 = new JLabel("Telefone");
		label2.setBounds(10, 36, 66, 14);
		jpanel.add(label2);
		
		JLabel label3 = new JLabel("Endere�o");
		label3.setBounds(10, 61, 66, 14);
		jpanel.add(label3);
		
		JLabel label4 = new JLabel("Escolaridade");
		label4.setBounds(10, 86, 76, 14);
		jpanel.add(label4);
		
		JLabel label5 = new JLabel("Nacionalidade");
		label5.setBounds(10, 110, 98, 14);
		jpanel.add(label5);
		
		JLabel label6 = new JLabel("Curso");
		label6.setBounds(10, 135, 46, 14);
		jpanel.add(label6);
		
		JLabel label17 = new JLabel("G�nero");
		label17.setBounds(10, 160, 46, 14);
		jpanel.add(label17);
		
		JLabel label8 = new JLabel("Idade");
		label8.setBounds(10, 185, 46, 14);
		jpanel.add(label8);
		
		textFieldNome = new JTextField();
		textFieldNome.setBounds(118, 8, 86, 20);
		jpanel.add(textFieldNome);
		textFieldNome.setColumns(10);
		
		textFieldTelefone = new JTextField();
		textFieldTelefone.setBounds(118, 33, 86, 20);
		jpanel.add(textFieldTelefone);
		textFieldTelefone.setColumns(10);
		
		textFieldEndere�o = new JTextField();
		textFieldEndere�o.setBounds(118, 58, 86, 20);
		jpanel.add(textFieldEndere�o);
		textFieldEndere�o.setColumns(10);
		
		textFieldEscola = new JTextField();
		textFieldEscola.setBounds(118, 83, 86, 20);
		jpanel.add(textFieldEscola);
		textFieldEscola.setColumns(10);
		
		textFieldNacio = new JTextField();
		textFieldNacio.setBounds(118, 107, 86, 20);
		jpanel.add(textFieldNacio);
		textFieldNacio.setColumns(10);
		
		comboBox = new JComboBox(cursos);
		comboBox.setBounds(96, 132, 154, 20);
		jpanel.add(comboBox);
		
		JRadioButton radioButtonMasc = new JRadioButton("M");
		radioButtonMasc.setBounds(62, 155, 46, 24);
		jpanel.add(radioButtonMasc);
		
		JRadioButton radioButtonFeme = new JRadioButton("F");
		radioButtonFeme.setBounds(111, 155, 37, 24);
		jpanel.add(radioButtonFeme);
		
		JRadioButton radioButtonOutro = new JRadioButton("Outro");
		radioButtonOutro.setBounds(152, 155, 66, 24);
		jpanel.add(radioButtonOutro);
		
		radioGroup = new ButtonGroup();
		
		radioGroup.add(radioButtonMasc);
		radioGroup.add(radioButtonFeme);
		radioGroup.add(radioButtonOutro);
		
		textFieldIdade = new JTextField();
		textFieldIdade.setBounds(118, 182, 86, 20);
		jpanel.add(textFieldIdade);
		textFieldIdade.setColumns(10);
		
		JButton buttonSalvar = new JButton("Salvar");
		buttonSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				JOptionPane.showMessageDialog(null, "Dados Salvos");
			}
		});
		buttonSalvar.setBounds(206, 230, 98, 26);
		jpanel.add(buttonSalvar);
	}
}