package com.folks.GUI;

import com.folks.*;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;


public class Funcionario extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textSalario;
	private Funcionarios funcionario;
	private ArrayList<Funcionarios> funcionarios;
	private JTextField textFieldID;
	private int contador;

	public void CadastrarFun(String nome, String cpf, double salario, String departamento) {
		funcionario = new Funcionarios();
		funcionario.setNome(nome);
		funcionario.setCpf(cpf);
		funcionario.setSalario(salario);
		funcionario.setDepartamento(departamento);
		funcionarios.add(funcionario);
	}
	public void EditarFun(int indice, String nome, String cpf, double salario, String departamento) {
		funcionarios.get(indice-1).setNome(nome);
		funcionarios.get(indice-1).setCpf(cpf);
		funcionarios.get(indice-1).setSalario(salario);
		funcionarios.get(indice-1).setDepartamento(departamento);
	}
	
	public Funcionario() throws ParseException {
		super("Folks");
		setResizable(false);
		setBackground(new Color(135, 206, 235));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 537, 350);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		funcionarios = new ArrayList<Funcionarios>();
		contador = 1;
		
		JPanel panel = new JPanel();
		panel.setBounds(48, 38, 427, 215);
		panel.setBackground(new Color(173, 216, 230));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(43, 60, 101, 14);
		lblNome.setFont(new Font("Calibri", Font.PLAIN, 19));
		panel.add(lblNome);
		
		JLabel lblDepto = new JLabel("Departamento");
		lblDepto.setBounds(43, 161, 112, 24);
		lblDepto.setFont(new Font("Calibri", Font.PLAIN, 19));
		panel.add(lblDepto);
		
		JLabel lblSalrio = new JLabel("Sal\u00E1rio");
		lblSalrio.setBounds(43, 126, 101, 24);
		lblSalrio.setFont(new Font("Calibri", Font.PLAIN, 19));
		panel.add(lblSalrio);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(43, 91, 51, 24);
		lblCpf.setFont(new Font("Calibri", Font.PLAIN, 19));
		panel.add(lblCpf);
		
		textNome = new JTextField();
		textNome.setBounds(163, 58, 221, 20);
		panel.add(textNome);
		textNome.setColumns(10);
		
		textSalario = new JTextField();
		textSalario.setBounds(163, 130, 159, 20);
		panel.add(textSalario);
		textSalario.setColumns(10);
		
		JTextField formattedTextCpf = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
		formattedTextCpf.setBounds(163, 95, 159, 20);
		panel.add(formattedTextCpf);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(163, 164, 159, 20);
		comboBox.setFont(new Font("Calibri", Font.BOLD, 14));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "Gerente de Projeto", "Programação", "Departamento Pessoal"}));
		comboBox.setEditable(true);
		panel.add(comboBox);
		
		JLabel labelID = new JLabel("ID");
		labelID.setFont(new Font("Calibri", Font.PLAIN, 19));
		labelID.setBounds(43, 23, 86, 24);
		panel.add(labelID);
		
		textFieldID = new JTextField();
		textFieldID.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if(Integer.parseInt(textFieldID.getText())>funcionarios.size()) {
					textNome.setText("");
					textSalario.setText("");
					formattedTextCpf.setText("");
					comboBox.setSelectedItem("");
				}else {
					int indice = Integer.parseInt(textFieldID.getText());
					textNome.setText(funcionarios.get(indice-1).getNome());
					textSalario.setText(Double.toString(funcionarios.get(indice-1).getSalario()));
					formattedTextCpf.setText(funcionarios.get(indice-1).getCpf());
					comboBox.setSelectedItem(funcionarios.get(indice-1).getDepartamento());
				}
				
			}
		});
		textFieldID.setBounds(163, 23, 86, 20);
		panel.add(textFieldID);
		textFieldID.setColumns(10);
		String id = Integer.toString(contador);
		textFieldID.setText(id);
		
		
		JLabel lblProgramador = new JLabel("Funcion\u00E1rio");
		lblProgramador.setBounds(203, 11, 117, 27);
		lblProgramador.setFont(new Font("Calibri", Font.BOLD, 20));
		contentPane.add(lblProgramador);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(48, 261, 89, 23);
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Integer.parseInt(textFieldID.getText())>funcionarios.size()) {
					double salario = Double.parseDouble(textSalario.getText());
					CadastrarFun(textNome.getText(),formattedTextCpf.getText(),salario,String.valueOf(comboBox.getSelectedItem()));
					JOptionPane.showMessageDialog(null, "Dados Salvos", "Mensagem", JOptionPane.INFORMATION_MESSAGE );
					textNome.setText("");
					textSalario.setText("");
					formattedTextCpf.setText("");
					comboBox.setSelectedItem("");
					contador+=1;
					String id = Integer.toString(contador);
					textFieldID.setText(id);
				}else {
					int indice = Integer.parseInt(textFieldID.getText());
					double salario = Double.parseDouble(textSalario.getText());
					EditarFun(indice, textNome.getText(),formattedTextCpf.getText(),salario,String.valueOf(comboBox.getSelectedItem()));
					JOptionPane.showMessageDialog(null, "Dados Editados", "Mensagem", JOptionPane.INFORMATION_MESSAGE );
					textNome.setText("");
					textSalario.setText("");
					formattedTextCpf.setText("");
					comboBox.setSelectedItem("");
					String id = Integer.toString(contador);
					textFieldID.setText(id);
				}
			}
		});
		btnSalvar.setFont(new Font("Calibri", Font.PLAIN, 14));
		btnSalvar.setBackground(new Color(250, 128, 114));
		contentPane.add(btnSalvar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setBounds(386, 261, 89, 23);
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSair.setBackground(new Color(176, 224, 230));
		btnSair.setFont(new Font("Calibri", Font.PLAIN, 14));
		contentPane.add(btnSair);
	}
}
