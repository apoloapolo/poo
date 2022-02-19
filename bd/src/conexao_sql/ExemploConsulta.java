package conexao_sql;

import java.sql.*;

public class ExemploConsulta {
	// Nome do JDBC driver e URL database
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	static final String DB_URL = "jdbc:mysql://localhost/escola";

	//  Credenciais do Banco
	static final String USER = "root";
	static final String PASS = "";

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		try{
			//Registro do JDBC driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			//Abertura da conex�o
			System.out.println("Conectando a database...");
			conn = DriverManager.getConnection(DB_URL,USER,PASS);

			//Montagem e execu��o da consulta
			System.out.println("Preparando consulta...");
			stmt = conn.createStatement();
			String sql;
			sql = "SELECT id, nome, matricula FROM aluno";
			ResultSet rs = stmt.executeQuery(sql);

			//Extra��o dos dados e impress�o
			while(rs.next()){
				//Extra��o por nome da coluna
				int id  = rs.getInt("id");
				String nome = rs.getString("nome");
				String matricula = rs.getString("matricula");

				//Impress�es
				System.out.print("ID: " + id);
				System.out.print(", Nome: " + nome);
				System.out.print(", Matr�cula: " + matricula+"\n");
			}
			//Encerrando objetos
			rs.close();
			stmt.close();
			conn.close();
		}catch(SQLException se){
			//erros JDBC 
			se.printStackTrace();
		}catch(Exception e){
			//outros erros
			e.printStackTrace();
		}finally{
			//Encerramento em caso de falhas
			try{
				if(stmt!=null)
					stmt.close();
			}catch(SQLException se2){
			}
			try{
				if(conn!=null)
					conn.close();
			}catch(SQLException se){
				se.printStackTrace();
			}//end finally try
		}//end try
		System.out.println("Execu��o finalizada!");
	}//end main
}//end class