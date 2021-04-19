package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Produto;

public class ProdutoDAO extends BaseDAO{

	public static List<Produto> selectProdutos() {
		final String sql = "SELECT * FROM produtos";
		try //try-witch-resource
			(
				Connection conn = getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
			)
		{
			List<Produto> produtos = new ArrayList<>();
			while(rs.next()) {
				produtos.add(resultsetToProduto(rs));
			}
			return produtos;
		} catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static Produto selectProdutoById(Long id) {
		final String sql = "SELECT * FROM produtos WHERE id=?";
		try
		(
			Connection conn = getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
		)
		{
			pstmt.setLong(1, id);	
			ResultSet rs = pstmt.executeQuery();
			Produto produto = null;
			if(rs.next()) {
				produto = resultsetToProduto(rs);
			}
			rs.close();
			return produto;
			
		} catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	//método utilitário, converte ResultSet na classe de modelo (nesse caso, Produto)
	private static Produto resultsetToProduto(ResultSet rs) throws SQLException {
		Produto p = new Produto();
		p.setId(rs.getLong("id"));
		p.setNome(rs.getString("nome"));
		p.setDescricao(rs.getString("descricao"));
		p.setValor(rs.getDouble("valor"));
		p.setEstoque(rs.getInt("quantidade"));
		p.setSituacao(rs.getBoolean("situacao"));

		return p;
	}
      
    
    public static void main(String[] args) {
		System.out.println(selectProdutoById(1L));
	}

}//fim classe
