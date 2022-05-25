
package conecta_mysql;
import java.util.Random;

public class Deleta_my extends Dao {


    public String DeletarOne () throws Exception {


        Random random = new Random();
        int i = random.nextInt(1000);
        i = 1000;
        String rr = String.valueOf(i);

         abrirbanco();
         String str = "delete from matricula where ra = "+rr;
         pstmt = con.prepareStatement(str);
         pstmt.execute();
         fecharbanco();
         return rr;
    }


        public void DeletarAll () throws Exception {


        abrirbanco();
        pstmt = con.prepareStatement("delete from matricula");
        pstmt.execute();
        fecharbanco();
    }


}
