package jbdc;

import java.sql.SQLException;

import javax.swing.JFrame;

import jbdc.view.ProdutoCategoriaFrame;

public class TestaOperacaoComView {

	public static void main(String[] args) throws SQLException {
		ProdutoCategoriaFrame produtoCategoriaFrame = new ProdutoCategoriaFrame();
		produtoCategoriaFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
