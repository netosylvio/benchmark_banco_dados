
package conecta_firebird;


//import java.sql.*;
import java.sql.Connection; //fazer conexao
import java.sql.DriverManager; // usa o driver de conexao
import java.sql.PreparedStatement; //usado para insercao
import java.sql.Statement; // usado para fazer select

public class Dao_firebird {

    Connection con;
    PreparedStatement pstmt; //fazer insercao e sóooo insercao
    Statement stmt_consulta; // fazer consulta
    Statement teste; // fazer delete

    public void abrirbanco()throws Exception {

        Class.forName("org.firebirdsql.jdbc.FBDriver");
      //String url = "jdbc:firebirdsql:150.163.171.126:c:/PROJETO.fdb";  // caminho do banco
     //String url = "jdbc:firebirdsql:localhost:c:/tcc.fdb";
       String url = "jdbc:firebirdsql:localhost/3050:c:/tcc.fdb";

   //     String url = "jdbc:firebirdsql:localhost:c:/PROJETO.fdb";
        String user = "SYSDBA"; // usuario
        String passwrd = "masterkey"; // senha
        con = DriverManager.getConnection(url, user, passwrd);
     //   System.out.println("conn = "+con);


  //   conn = DriverManager.getConnection("jdbc:firebirdsql:ip_do_servidor/3050:/caminho_do_bco_de_dados.gdb", "SYSDBA", "masterkey");
        // "jdbc:firebirdsql:127.0.0.1:c:\\javaprojeto\\sisweb.fdb";
 //       URL: jdbc:firebirdsql:192.168.0.3:e:/interbase/base.gdb

    }

    public void fecharbanco()throws Exception {
        if (con != null){
        con.close();}
        if (pstmt != null){
        pstmt.close();}
    }

}
