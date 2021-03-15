package service;

import java.io.File;

import dao.UsuarioDAO;
import model.Usuario;
import utils.CryptoAES;

public class UsuarioService {
	public boolean validar(Usuario usuario)throws Exception{
		UsuarioDAO dao = new UsuarioDAO();
		usuario.setPassword(cryptografaSenha(usuario.getPassword()));
		return dao.validar(usuario);
		
	}
	public void cadastrar(Usuario usuario)throws Exception{
		UsuarioDAO dao = new UsuarioDAO();
		usuario.setPassword(cryptografaSenha(usuario.getPassword()));
		dao.cadastrar(usuario);
	}
	private byte [] cryptografaSenha(byte [] senha)throws Exception{
		CryptoAES aes = new CryptoAES();
		aes.geraCifra(senha, new File("C:\\Users\\Nathan\\eclipse-workspace\\Aula11\\src\\chave.simetrica"));
		byte[] senhaCifrada = aes.getTextoCifrado();
		return senhaCifrada;
	}
//	private byte[] descryptofragaSenha(byte [] senha)throws Exception {
//		CryptoAES aes = new CryptoAES();
//		aes.geraDecifra(senha, new File("C:\\Users\\Nathan\\eclipse-workspace\\Aula11\\src\\chave.simetrica"));
//		byte[] senhaDecifrada = aes.getTextoDecifrado();
//		return senhaDecifrada;
//	}
}