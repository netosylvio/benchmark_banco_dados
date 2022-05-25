
package conecta_firebird;

public class Inserir extends Dao_firebird {

public void Gravar () throws Exception {


       String str = "execute procedure insercao";
       abrirbanco();      
        pstmt = con.prepareCall(str);
      //  pstmt = con.prepareStatement("insert into matricula (ra, nome, cpf) values(?,?,?)");
      //  pstmt.setInt(1,a);
      //  pstmt.setString(2,"joao");
      //  pstmt.setInt(3,123456789);          
     //   System.out.println("pstmt = "+pstmt);
        pstmt.execute();

       }

public void Gravar_procedure () throws Exception {

       String str = "execute procedure INSERCAO";
       abrirbanco();
       pstmt = con.prepareCall(str);
       pstmt.execute();
    }

public void Gravar_procedure_Bruta () throws Exception {

       String str = "execute procedure INSERCAO_BRUTA";
       abrirbanco();
       pstmt = con.prepareCall(str);
       pstmt.execute();
    }
}
