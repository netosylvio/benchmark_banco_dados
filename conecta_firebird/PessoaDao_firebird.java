
package conecta_firebird;

import modelo_banco.Pessoa;
import java.sql.ResultSet; // usado para select

public class PessoaDao_firebird extends Dao_firebird{

       public void Gravar (Pessoa pp) throws Exception {

        abrirbanco();
        System.out.println("banco aberto");
        pstmt = con.prepareStatement("insert into usuario values(null,?,?)");
        pstmt.setString(1,pp.getNome());
        pstmt.setInt(2, pp.getIdade());
        System.out.println("pstmt = "+pstmt);
        pstmt.execute();

       }


}

