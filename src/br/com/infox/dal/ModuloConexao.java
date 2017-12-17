package br.com.infox.dal;

import java.sql.*;

public class ModuloConexao {

    //método  responsavel por estabelecer a conexão com o banco
    public static Connection conector() {
        java.sql.Connection conexao = null;
        
        //a linha abaixo "chama" o driver que eu importei para blibiotecas
        String driver = "com.mysql.jdbc.Driver"; //fala quem é drive e o tipo do BD
        
        //Armazenando informações referentes ao banco
        String url = "jdbc:mysql://localhost:3306/dbinfox";  //caminho e nome do banco
        String user = "root"; //usuario que pode acessar o BD
        String password =""; //senha vazio, paadrão do XAMPP
        
        //estabelecendo a conexão com o banco
        try {
            Class.forName(driver); //executa o arquivo do driver
            conexao = DriverManager.getConnection(url, user, password);//gereciamento com os parametros->caminho,usuario,senha
            return conexao;
        } catch (Exception e) {
            System.out.println(e);//exibe o erro
            return null; //caso tenha algum emprevisto na conexão acima, retorna null
        }

    }

}
