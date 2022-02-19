package conexao_sql;

import java.sql.*;

public class ExemploAtualizacao{
	// Nome do JDBC driver e URL database
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	static final String DB_URL = "jdbc:mysql://localhost/escola";

	// Credenciais do Banco
	static final String USER = "test_user";
	static final String PASS = "123@456";

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		try{
			//Registro do JDBC driver
			Class.forName("com.mysql.jdbc.Driver");

			//Abertura da conexão
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL,USER,PASS);

			//Montagem e execução do comando SQL
			System.out.println("Creating statement...");
		    stmt = conn.createStatement();
		    String sql = "UPDATE aluno SET nome = 'Maria Joana' WHERE id = 3";
		    stmt.executeUpdate(sql);
		    System.out.println("Update realizado!");
			
		    //Encerrando objetos
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
		System.out.println("Execução finalizada!!");
	}//end main
}//end class