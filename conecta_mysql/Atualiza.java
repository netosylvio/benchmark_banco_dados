
package conecta_mysql;
import java.util.Random;

public class Atualiza extends Dao {


    public String Atualizar () throws Exception {


        Random random = new Random();
        int i = random.nextInt(1000);
        i=700;
        String rr = String.valueOf(i);

        abrirbanco();
        String str = "update matricula set nome ="
                 + "'Claudia Ferreira', nome_pai = 'Julio Alberto', "
                 + "cpf = 222222222, rg = 777777777,"
                 + "nome_mae = 'Flavia Aparecida',"
                 + "sexo = 'Feminino',"
                 + "nacionalidade = 'Brasileira',"
                 + "cidade= 'São Paulo',"
                 + "estado_civil = 'solteira',"
                 + "titulo_eleitor = 999999999,"
                 + "estado = 'SP',"
                 + "e_mail = 'claudia@claudia.com.br',"
                 + "naturalidade = 'São José dos Campos',"
                 + "cor = 'branca'  where ra = "+rr;

         pstmt = con.prepareStatement(str);
         pstmt.execute();       
         fecharbanco();
         return rr;

    }


  public void AtualizarAll () throws Exception {


     abrirbanco();
    pstmt = con.prepareStatement("update matricula set nome ="
                 + "'Claudia Ferreira', nome_pai = 'Julio Alberto', "
                 + "cpf = 222222222, rg = 777777777,"
                 + "nome_mae = 'Flavia Aparecida',"
                 + "sexo = 'Feminino',"
                 + "nacionalidade = 'Brasileira',"
                 + "cidade= 'São Paulo',"
                 + "estado_civil = 'solteira',"
                 + "titulo_eleitor = 999999999,"
                 + "estado = 'SP',"
                 + "e_mail = 'claudia@claudia.com.br',"
                 + "naturalidade = 'São José dos Campos',"
                 + "cor = 'branca'");

         pstmt.execute();
         fecharbanco();
    }


}
