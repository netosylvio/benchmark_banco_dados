
package conecta_mysql;

import java.sql.Connection; //fazer conexao
import java.sql.DriverManager; // usa o driver de conexao
import java.sql.PreparedStatement; //usado para insercao
import java.sql.Statement; // usado para fazer select

public class Dao {
    Connection con;
    PreparedStatement pstmt; //fazer insercao
    Statement stmt_consulta; // fazer consulta



    public void abrirbanco()throws Exception {
      //C:\Documents and Settings\All Users\Dados de aplicativos\MySQL\MySQL Server 5.1\data
      // esse caminho eh onde fica o banco mysql
        Class.forName("com.mysql.jdbc.Driver"); //carrega o driver na memoria
        String url = "jdbc:mysql://localhost:3306/tcc"; // caminho do banco
        String user = "root"; // usuario
        String passwrd = "pardal"; // senha
        con = DriverManager.getConnection(url, user, passwrd); //capturando a conexao
        //System.out.println("con = "+con);

    }
    public void fecharbanco()throws Exception {

        if (con != null){
        con.close();}
        if (pstmt != null){
        pstmt.close();}

   //     if  (con != null){
   //         con.close();
   //     }
   //     if (pstmt != null){
   //         pstmt.close();
   //     }
   //     return 1;

    }
}
