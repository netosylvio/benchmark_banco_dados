
package conecta_mysql;


import modelo_banco.Pessoa;
import java.sql.ResultSet; // usado para select


public class PessoaDao extends Dao {

    public void Gravar (Pessoa pp) throws Exception {

        abrirbanco();
        pstmt = con.prepareStatement("insert into matricula values(null,?,?)");
        pstmt.setString(1,pp.getNome());
        pstmt.setInt(2, pp.getIdade());
        System.out.println("pstmt = "+pstmt);
        pstmt.execute();
        fecharbanco();

    }
    public void Exibir () throws Exception {
        abrirbanco();
        stmt_consulta = con.createStatement();
        String sql = "SELECT * FROM usuario";
        ResultSet rs = stmt_consulta.executeQuery(sql);
        while (rs.next()) {
              System.out.println(rs.getInt("id"));
              System.out.println(rs.getString("nome"));
              System.out.println(rs.getInt("idade"));
              System.out.println("====================================");
             }
         fecharbanco();
    }




}