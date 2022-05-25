
package conecta_firebird;

import java.util.Random;


public class atualizar_firebird extends Dao_firebird {

    public String Atualizar () throws Exception {


        Random random = new Random();
        int i = random.nextInt(1000);
        i = 700;
        String rr = String.valueOf(i);
        abrirbanco();
        
        String str = "update matricula set nome ="
                 + "'Claudia Ferreira', nome_pai = 'Julio Alberto',"
                 + "cpf = 222222222, rg = 777777777,"
                 + "nome_mae = 'Flavia Aparecida',"
                 + "sexo = 'Feminino',"
                 + "nacionalidade = 'Brasileira',"
                 + "cidade= 'Sao Paulo',"
                 + "estado_civil = 'Solteira',"
                 + "titulo_eleitor = 999999999,"
                 + "estado = 'SP',"
                 + "e_mail = 'claudia@claudia.com.br',"
                 + "naturalidade = 'Sao Jose dos Campos',"
                 + "cor = 'Branca'  where ra = "+rr;

        teste = con.prepareStatement(str);
        teste.execute(str);
        fecharbanco();
        return rr;

    }

    public void AtualizarAll () throws Exception {


     abrirbanco();
     
     String str = "update matricula set nome ="
                 + "'Claudia Ferreira', nome_pai = 'Julio Alberto',"
                 + "cpf = 222222222, rg = 777777777,"
                 + "nome_mae = 'Flavia Aparecida',"
                 + "sexo = 'Feminino',"
                 + "nacionalidade = 'Brasileira',"
                 + "cidade= 'Sao Paulo',"
                 + "estado_civil = 'Solteira',"
                 + "titulo_eleitor = 999999999,"
                 + "estado = 'SP',"
                 + "e_mail = 'claudia@claudia.com.br',"
                 + "naturalidade = 'Sao Jose dos Campos',"
                 + "cor = 'Branca'";
   
     teste = con.prepareStatement(str);
     teste.execute(str);
     fecharbanco();
    }

}
