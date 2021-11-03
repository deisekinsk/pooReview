package app;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import entities.Product;

public class Program {

	public static void main(String[] args) throws SQLException {

		//Product p = new Product();
		//p.setName("Pizza de Marguerita");

		//System.out.println(". Nome do Produto: " + p.getName());

		Connection conn = DB.getConnection();

		Statement st = conn.createStatement();

		ResultSet rs = st.executeQuery("select * from tb_product");

		while (rs.next()) { //percorre as linhas tb
			System.out.println(rs.getLong("Id") + ". " + rs.getString("Name")
					+ " | R$ " + rs.getFloat("Price"));
		}
	}
}
