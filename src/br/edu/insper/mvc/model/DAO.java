package br.edu.insper.mvc.model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAO {
	private Connection connection = null;
	
	public DAO () throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://localhost/meusdados", "root", "rogm4568");
	}
	
	public List<Pessoa> getLista() throws SQLException{
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		java.sql.PreparedStatement stmt = connection.prepareStatement("SELECT * FROM pessoas");
		ResultSet rs = stmt.executeQuery();
		
		while (rs.next()) {
			Pessoa pessoa = new Pessoa();
			pessoa.setNome(rs.getString("nome"));
			pessoa.setIdade(rs.getInt("idade"));
			pessoas.add(pessoa);
		}
		
		rs.close();
		stmt.close();
		
		return pessoas;
	}
		
	public void adiciona (Pessoa pessoa) throws SQLException {
		String sql = "INSERT INTO Pessoa (nome, idade), VALUES (?,?)";
		
		java.sql.PreparedStatement stmt = connection.prepareStatement(sql);
		stmt.setNString(1,  pessoa.getName());
		stmt.setInt(2, pessoa.getIdade());
		stmt.execute();
		stmt.close();
	}
	
	public void close () throws SQLException {
		connection.close();
	}
	
}
