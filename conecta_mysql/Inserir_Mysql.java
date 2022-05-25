
package conecta_mysql;


public class Inserir_Mysql extends Dao {

    public void Gravar (int lele) throws Exception {
      //variaveis
       int valor_carga;
       valor_carga = lele;
       int i;
       String nome = "Joao da Silva";
       int cpf = 123456789;
       int rg = 987654321;
       String nome_pai = "Jose Roberto da Silva";
       String nome_mae = "Rosana dos Santos";
       String sexo = "Masculino";
       String nacionalidade = "Brasileiro";
       String cidade = "Guaratingueta";
       String estado_civil = "solteiro";
       int titulo_eleitor = 567894321;
       String estado = "SP";
       String e_mail = "joao@joao.com.br";
       String naturalidade = "Lorena";
       String cor = "branco";
       String str = "CALL teste();";
       abrirbanco();
     //  for( i = 1; i <= valor_carga ; i++){
       pstmt = con.prepareCall(str);
     //    pstmt = con.prepareStatement("insert into matricula values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
      //      pstmt.setInt(1, i);
      //      pstmt.setString(2, nome);
     //       pstmt.setInt(3, cpf);
      //      pstmt.setInt(4, rg);
      //      pstmt.setString(5, nome_pai);
      //      pstmt.setString(6, nome_mae);
     //       pstmt.setString(7, sexo);
     //       pstmt.setString(8, nacionalidade);
     //       pstmt.setString(9, estado_civil);
    //        pstmt.setString(10, cidade);
    //        pstmt.setInt(11, titulo_eleitor);
    //        pstmt.setString(12, estado);
    //        pstmt.setString(13, e_mail);
     //       pstmt.setString(14, naturalidade);
     //       pstmt.setString(15, cor);
      //   System.out.println("pstmt = "+pstmt);
         pstmt.execute();
   // }
          fecharbanco();
    }

   public void Gravar_Procedure()  throws Exception {

        String str = "CALL insercao();";
        abrirbanco();
        pstmt = con.prepareCall(str);
        pstmt.execute();
        fecharbanco();
   }

   public void Gravar_Procedure_Bruta()  throws Exception {

        String str = "CALL insercao_bruta();";
        abrirbanco();
        pstmt = con.prepareCall(str);
        pstmt.execute();
        fecharbanco();

    }
}
