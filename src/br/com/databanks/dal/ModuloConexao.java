/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.databanks.dal;

import java.sql.*;

/**
 *
 * @author barre
 */
public class ModuloConexao {

    //metodo responsavel por estabelecer conexão com banco de dados
    public static Connection conector() {
        java.sql.Connection conexao = null;
        // a linha abaixo chama o driver que eu importei aqui para bibliotecas
        String driver = "com.mysql.cj.jdbc.Driver";
        //armazenando informaçoes referentes ao banco
        String url = "jdbc:mysql://localhost:3307/databankx";
        String user = "root";
        String password = "";
        //Estabelecendo conexão com banco de dados 
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            //a linha abaixo serve de apoio para exclarecer o erro
            //System.out.println(e);
            return null;
        }
    }
}
