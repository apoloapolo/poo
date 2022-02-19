package com.folks.GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class TelaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txtLogin;
	private JPasswordField txtSenha;

	public TelaLogin() {
		super("Folks");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 537, 350); 
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(85, 143, 85, 40);
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setFont(new Font("Calibri", Font.PLAIN, 20));
		contentPane.add(lblLogin);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(85, 194, 92, 29);
		lblSenha.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblSenha.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblSenha);
		
		txtLogin = new JTextField();
		txtLogin.setBounds(177, 144, 206, 29);
		txtLogin.setForeground(new Color(0, 0, 0));
		txtLogin.setBackground(new Color(176, 224, 230));
		contentPane.add(txtLogin);
		txtLogin.setColumns(10);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(177, 194, 206, 29);
		txtSenha.setForeground(new Color(0, 0, 0));
		txtSenha.setBackground(new Color(176, 224, 230));
		contentPane.add(txtSenha);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.setBounds(208, 246, 99, 29);
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(176, 224, 230));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				//Mensagem do login
				if (verificarLogin(txtLogin.getText(), new String(txtSenha.getPassword()))){
					setVisible(false);
					Funcionario frame;
					try {
						frame = new Funcionario();
						frame.setVisible(true);
					} catch (ParseException e) {
						e.printStackTrace();
					}
					
				}else {
					JOptionPane.showMessageDialog(null, "Senha e/ou Usu�rio Inv�lido", "Erro",JOptionPane.WARNING_MESSAGE );
				
				}
				
				
				
			}
		});
		btnNewButton.setFont(new Font("Calibri", Font.PLAIN, 16));
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(112, -12, 297, 148);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(TelaLogin.class.getResource("/imagens/text1132.png")));
		contentPane.add(lblNewLabel);
	}
	//Verificar Login
	public boolean verificarLogin(String login, String senha) {
		return login.equals("adm") && senha.equals("1234");
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}