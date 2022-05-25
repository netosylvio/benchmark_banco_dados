
package conecta_firebird;

import java.util.Random;

public class deletar_firebird extends Dao_firebird {

     public String DeletarOne () throws Exception {


         Random random = new Random();
         int i = random.nextInt(1000);
         i=1000;
         String rr = String.valueOf(i);
         abrirbanco();
         String str = "delete from matricula where ra = "+rr;
         teste = con.prepareStatement(str);
         teste.execute(str);  
         fecharbanco();
         return rr;
     }

     public void DeletarAll () throws Exception {

         abrirbanco();
         String str = "delete from matricula";
         teste = con.prepareStatement(str);
         teste.execute(str);
         fecharbanco();

     }

}
