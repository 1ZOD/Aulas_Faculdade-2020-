package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Usuario;
public class UsuarioDAO {
	public boolean validar(Usuario usuario) {
		String sqlSelect = "SELECT * FROM usuario WHERE username = ? and password = ?";
		// pega a conexão em um try normal para que ela não seja fechada
		try {
			Connection conn = ConnectionFactory.obtemConexao();
			// usando o try with resources do Java 7, que fecha o que abriu
			try (PreparedStatement stm = conn.prepareStatement(sqlSelect);) {
				stm.setString(1, usuario.getUsername());
				stm.setBytes(2, usuario.getPassword());
				try (ResultSet rs = stm.executeQuery();) {
					if (rs.next()) {
						return true;
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			} catch (SQLException e1) {
				System.out.print(e1.getStackTrace());
			}
		} catch (SQLException e2) {
			e2.printStackTrace();
		}
		return false;
	}
	public void cadastrar(Usuario usuario) {
		String sqlInsert = "INSERT INTO usuario VALUES (?,?)";
		try(Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlInsert);){
			stm.setString(1,usuario.getUsername());
			stm.setBytes(2,usuario.getPassword());
			stm.execute();
		} catch (SQLException e){
			e.printStackTrace();
		}
	}
}