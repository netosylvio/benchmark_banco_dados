
package conecta_mysql;
import java.sql.ResultSet; // usado para select

public class seleciona_my extends Dao {

      public ResultSet Exibir () throws Exception {
        abrirbanco();
        stmt_consulta = con.createStatement();
      //  String sql = "SELECT * FROM matricula";
        String sql = "SELECT ra, nome, cpf FROM matricula where ra < 1001";
        ResultSet rs = stmt_consulta.executeQuery(sql);
        return rs;
     //   while (rs.next()) {
     //         System.out.println(rs.getInt("ra"));
     //         System.out.println(rs.getString("nome"));
     //         System.out.println(rs.getInt("cpf"));
     //         System.out.println("====================================");
     //        }
     //    fecharbanco();
    }


      public ResultSet ExibirOne () throws Exception {

        abrirbanco();
        stmt_consulta = con.createStatement();
        String sql = "SELECT ra, nome, cpf FROM matricula where ra = 500";
        ResultSet rs = stmt_consulta.executeQuery(sql);
        return rs;
       // while (rs.next()) {
       //       System.out.println(rs.getInt("ra"));
       //       System.out.println(rs.getString("nome"));
       //       System.out.println(rs.getInt("cpf"));
       //       System.out.println("====================================");
       //      }
       //  fecharbanco();

      }

}
