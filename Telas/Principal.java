
package Telas;


import java.awt.Color;
import conecta_mysql.*;
import conecta_firebird.*;
import java.sql.ResultSet;
import java.util.Date;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;


public class Principal extends javax.swing.JFrame {


    public Principal() {
        initComponents();

        this.getContentPane().setBackground(Color.WHITE); //muda cor do fundo
        this.jSeparator1.setBackground(Color.red);
        this.setSize(700, 565);
         saida.setEditable(false);
         saida.setBackground(Color.white);
         outputtext.setEditable(false);
         outputtext.setFocusable(false);
         progresso.setMinimum(0);
         progresso.setMaximum(100);

    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        pnsgbd = new javax.swing.JPanel();
        msql = new javax.swing.JRadioButton();
        fire = new javax.swing.JRadioButton();
        pncarga = new javax.swing.JPanel();
        mil = new javax.swing.JRadioButton();
        milhao = new javax.swing.JRadioButton();
        btninserir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        select_all = new javax.swing.JRadioButton();
        select_one = new javax.swing.JRadioButton();
        btnselect = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        updateOne = new javax.swing.JRadioButton();
        updateAll = new javax.swing.JRadioButton();
        btnatualizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        saida = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        btndeletar = new javax.swing.JButton();
        deleteOne = new javax.swing.JRadioButton();
        deleteAll = new javax.swing.JRadioButton();
        outputtext = new java.awt.TextArea();
        progresso = new javax.swing.JProgressBar();
        btnsair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TCC   Fatec - Guaratinguetá");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 15));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Avaliação de Desempenho");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        pnsgbd.setBackground(new java.awt.Color(255, 255, 255));
        pnsgbd.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SGBD", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(0, 0, 255))); // NOI18N

        msql.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(msql);
        msql.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        msql.setSelected(true);
        msql.setText("MySql");
        msql.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        fire.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(fire);
        fire.setFont(new java.awt.Font("Tahoma", 0, 12));
        fire.setText("Firebird");

        javax.swing.GroupLayout pnsgbdLayout = new javax.swing.GroupLayout(pnsgbd);
        pnsgbd.setLayout(pnsgbdLayout);
        pnsgbdLayout.setHorizontalGroup(
            pnsgbdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnsgbdLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnsgbdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(msql, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fire, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        pnsgbdLayout.setVerticalGroup(
            pnsgbdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnsgbdLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(msql)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fire)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pncarga.setBackground(new java.awt.Color(255, 255, 255));
        pncarga.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Carga", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), java.awt.Color.blue)); // NOI18N
        pncarga.setPreferredSize(new java.awt.Dimension(130, 120));

        mil.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(mil);
        mil.setFont(new java.awt.Font("Tahoma", 0, 12));
        mil.setSelected(true);
        mil.setText("1000");

        milhao.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(milhao);
        milhao.setFont(new java.awt.Font("Tahoma", 0, 12));
        milhao.setText("1000.000");

        btninserir.setFont(new java.awt.Font("Tahoma", 0, 12));
        btninserir.setForeground(new java.awt.Color(255, 0, 0));
        btninserir.setText("Inserir");
        btninserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninserirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pncargaLayout = new javax.swing.GroupLayout(pncarga);
        pncarga.setLayout(pncargaLayout);
        pncargaLayout.setHorizontalGroup(
            pncargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pncargaLayout.createSequentialGroup()
                .addGroup(pncargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pncargaLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(pncargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(mil)
                            .addComponent(milhao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pncargaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btninserir)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        pncargaLayout.setVerticalGroup(
            pncargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pncargaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btninserir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(mil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(milhao)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consulta", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(0, 0, 255))); // NOI18N
        jPanel3.setPreferredSize(new java.awt.Dimension(130, 120));
        jPanel3.setRequestFocusEnabled(false);

        select_all.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup3.add(select_all);
        select_all.setFont(new java.awt.Font("Tahoma", 0, 12));
        select_all.setText("Mil registros");

        select_one.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup3.add(select_one);
        select_one.setFont(new java.awt.Font("Tahoma", 0, 12));
        select_one.setSelected(true);
        select_one.setText("Um registro");

        btnselect.setFont(new java.awt.Font("Tahoma", 0, 12));
        btnselect.setForeground(new java.awt.Color(255, 0, 0));
        btnselect.setText("Selecionar");
        btnselect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnselectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnselect, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(select_all, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(select_one, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnselect)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(select_one)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(select_all)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Atualização", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(0, 0, 255))); // NOI18N

        updateOne.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup4.add(updateOne);
        updateOne.setFont(new java.awt.Font("Tahoma", 0, 12));
        updateOne.setSelected(true);
        updateOne.setText("Um registro");

        updateAll.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup4.add(updateAll);
        updateAll.setFont(new java.awt.Font("Tahoma", 0, 12));
        updateAll.setText("Todos");

        btnatualizar.setFont(new java.awt.Font("Tahoma", 0, 12));
        btnatualizar.setForeground(new java.awt.Color(255, 0, 0));
        btnatualizar.setText("Atualizar");
        btnatualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnatualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(updateAll, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                    .addComponent(updateOne)
                    .addComponent(btnatualizar))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnatualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(updateOne)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(updateAll)
                .addContainerGap())
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Topo1x1.JPG"))); // NOI18N
        jLabel1.setText("jLabel1");

        saida.setFont(new java.awt.Font("Tahoma", 1, 11));
        saida.setForeground(new java.awt.Color(51, 51, 255));
        saida.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        saida.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        saida.setFocusable(false);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Exclusão", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(0, 0, 255))); // NOI18N

        btndeletar.setFont(new java.awt.Font("Tahoma", 0, 12));
        btndeletar.setForeground(new java.awt.Color(255, 0, 0));
        btndeletar.setText("Deletar");
        btndeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeletarActionPerformed(evt);
            }
        });

        deleteOne.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup5.add(deleteOne);
        deleteOne.setFont(new java.awt.Font("Tahoma", 0, 12));
        deleteOne.setSelected(true);
        deleteOne.setText("Um registro");

        deleteAll.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup5.add(deleteAll);
        deleteAll.setFont(new java.awt.Font("Tahoma", 0, 12));
        deleteAll.setText("Todos");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btndeletar)
                    .addComponent(deleteAll)
                    .addComponent(deleteOne, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btndeletar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(deleteOne)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteAll)
                .addContainerGap())
        );

        outputtext.setBackground(new java.awt.Color(0, 0, 0));
        outputtext.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        outputtext.setFont(new java.awt.Font("Dialog", 1, 12));
        outputtext.setForeground(new java.awt.Color(0, 255, 0));

        progresso.setForeground(new java.awt.Color(255, 0, 0));

        btnsair.setFont(new java.awt.Font("Tahoma", 0, 12));
        btnsair.setForeground(new java.awt.Color(255, 0, 0));
        btnsair.setText("Sair");
        btnsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
                .addGap(24, 24, 24))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 792, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnsgbd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pncarga, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(108, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(progresso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(outputtext, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
                            .addComponent(saida, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 279, Short.MAX_VALUE)
                        .addComponent(btnsair)
                        .addGap(27, 27, 27))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                        .addComponent(pncarga, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                    .addComponent(pnsgbd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(outputtext, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(saida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(progresso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsair))
                .addGap(122, 122, 122))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btninserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninserirActionPerformed

        System.gc();

     //Variaveis
        final  Inserir_Mysql por = new Inserir_Mysql();
        final Inserir fb = new Inserir();
        progresso.setIndeterminate(true);
        boolean teste;
        boolean conta;
        teste = msql.isSelected();
        conta = mil.isSelected();
        final int lala;
        final int out;
     //   int m = 1000000;
         int bruto = 1000000;
       // int milzin = 1000;
        int milzin = 1000;
     //fim de variaveis
    //seta a quantidade a ser passada para  função de inserção
     // if (conta == true) { lala = milzin;} else {lala = bruto;}
        if (conta == true) { lala = 1; out = milzin;}
        else {lala = 0; out = bruto;}
   
      if (teste == true){
          //inserindo no mysql
  
           Thread t = new Thread() {
           @Override
           public void run()
            {
              try {
                     saida.setText("Inserindo dados no Mysql...");
                     Thread.sleep(5000);
                     double tempo_inicial = new Date().getTime(); //pega o tempo
                     tempo_inicial = tempo_inicial / 1000; //converte para segundos
                    // por.Gravar(lala); //chama a funçao de insert
                     if (lala == 1) { por.Gravar_Procedure();}
                     else { por.Gravar_Procedure_Bruta();}
                     double tempo_final = new Date().getTime();
                     tempo_final = tempo_final / 1000;
                     double resultado = tempo_final - tempo_inicial;
                     String unidade = "segundos";
                     if (resultado >= 60)
                      {resultado = resultado/60; unidade = "minutos"; }
                     if (resultado >= 60)
                      {resultado = resultado/60; unidade = "horas"; }

                     DecimalFormat fmt = new DecimalFormat("0.00");
                     String result = fmt.format(resultado);

                   // System.out.printf( "resultado = %.3f segundos", resultado );
                   // System.out.println("");
                    outputtext.setText(null);
                    outputtext.append("Sistema:  Mysql");
                    outputtext.append("\nRegistros:  "+out);
                    outputtext.append("\nOperação:  Inserção");
                    outputtext.append("\nTempo:  "+result+"  "+unidade);
                   // outputtext.append("\nTempo:  "+result+"  segundos");
                    progresso.setIndeterminate(false);
                    saida.setText("Dados inseridos com sucesso!");
                    JOptionPane.showMessageDialog(null,"Dados inseridos com sucesso!");

                } catch (Exception ex) {
                  ;
                }
            }
       };
      t.start();
 
      }else {
//inserindo no firebird
           Thread t = new Thread() {
           @Override
           public void run()
            {
              try {
                     saida.setText("Inserindo dados no Firebird...");
                     Thread.sleep(5000);
                     double tempo_inicial = new Date().getTime(); //pega o tempo
                     tempo_inicial = tempo_inicial / 1000; //converte para segundos
                     //fb.Gravar(); //chama a funçao de insert
                     if (lala == 1) { fb.Gravar_procedure();}
                     else { fb.Gravar_procedure_Bruta();}
                     double tempo_final = new Date().getTime();
                     tempo_final = tempo_final / 1000;
                     double resultado = tempo_final - tempo_inicial;
                     String unidade = "segundos";
                     if (resultado >= 60)
                      {resultado = resultado/60; unidade = "minutos"; }
                     if (resultado >= 60)
                      {resultado = resultado/60; unidade = "horas"; }




                     DecimalFormat fmt = new DecimalFormat("0.00");
                     String result = fmt.format(resultado);

                   // System.out.printf( "resultado = %.3f segundos", resultado );
                   // System.out.println("");
                    outputtext.setText(null);
                    outputtext.append("Sistema:  Firebird");
                    outputtext.append("\nRegistros:  "+out);
                    outputtext.append("\nOperação:  Inserção");
                    outputtext.append("\nTempo:  "+result+"  "+unidade);
                  //  outputtext.append("\nTempo:  "+result+"  segundos");
                    progresso.setIndeterminate(false);
                    saida.setText("Dados inseridos com sucesso!");
                    JOptionPane.showMessageDialog(null,"Dados inseridos com sucesso!");

                } catch (Exception ex) {
                  ;
                }
            }
       };
      t.start();

            }
    }//GEN-LAST:event_btninserirActionPerformed

    private void btnselectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnselectActionPerformed
       

        System.gc();
       //Variaveis
        final  seleciona_my sel = new seleciona_my();
        final selecionar_firebird fb = new selecionar_firebird();
        final Dao_firebird fch = new Dao_firebird();
        final Dao fchmy = new Dao(); //mysql

        progresso.setIndeterminate(true);
        boolean teste;
        boolean conta;
        teste = msql.isSelected();
        conta = select_one.isSelected();
        final int lala;
        final  String bla;

        if (conta == true) { lala = 1; bla = "Um"; }
        else { lala = 0; bla = "Todos";}
        if (teste == true){

           Thread t = new Thread() {
           @Override
           public void run()
            {
              try {

                  saida.setText("Consultando dados no Mysql...");
                  Thread.sleep(5000);
                  double tempo_inicial = new Date().getTime(); //pega o tempo
                  tempo_inicial = tempo_inicial / 1000; //converte para segundos
                  ResultSet res = null ;
                  if (lala == 1) {res = sel.ExibirOne();}
                  else {res = sel.Exibir();}
                  outputtext.setText(null);
                  while (res.next()) {
                   outputtext.append("RA = "+String.valueOf(res.getInt("ra")));
                   outputtext.append("\nNome = "+res.getString("nome"));
                   outputtext.append("\nCPF = "+String.valueOf(res.getInt("cpf")));
                   outputtext.append("\n====================================");
                   outputtext.append("\n");
                  }
                  fchmy.fecharbanco();
                  //Integer.toString( raa ); //Converte mesmo a variavel p/ String
                 //outputtext.append(String.valueOf(res.getInt("ra"))); //Pega o valor String da variavel


                  double tempo_final = new Date().getTime();
                  tempo_final = tempo_final / 1000;
                  double resultado = tempo_final - tempo_inicial;
                  String unidade = "segundos";
                  if (resultado >= 60)
                  {resultado = resultado/60; unidade = "minutos"; }
                  if (resultado >= 60)
                  {resultado = resultado/60; unidade = "horas"; }


                  DecimalFormat fmt = new DecimalFormat("0.00");
                  String result = fmt.format(resultado);
                 // System.out.printf( "\nresultado = %.3f segundos", resultado );
                 // outputtext.setText(null);
                  outputtext.append("\n\nSistema:  Mysql");
                  outputtext.append("\nRegistros:  "+bla);
                  outputtext.append("\nOperação:  Consulta");
                  outputtext.append("\nTempo:  "+result+"  "+unidade);
                  progresso.setIndeterminate(false);
                  saida.setText("Dados consultados com sucesso!");
                  JOptionPane.showMessageDialog(null,"Dados consultados com sucesso!");

                } catch (Exception ex) {
                  ;
                }
            }
       };
      t.start();

      }else {
              // select no firebird

           Thread t = new Thread() {
           @Override
           public void run()
            {
              try {

                  saida.setText("Consultando dados no Firebird...");
                  Thread.sleep(5000);
                  double tempo_inicial = new Date().getTime(); //pega o tempo
                  tempo_inicial = tempo_inicial / 1000; //converte para segundos
                  ResultSet res = null ;
                  if (lala == 1) {res = fb.ExibirOne();}
                  else {res = fb.Exibir();}
                  outputtext.setText(null);
                  while (res.next()) {
                   
                   outputtext.append("RA = "+String.valueOf(res.getInt("ra")));
                   outputtext.append("\nNome = "+res.getString("nome"));
                   outputtext.append("\nCPF = "+String.valueOf(res.getInt("cpf")));
                   outputtext.append("\n====================================");
                   outputtext.append("\n");
                  }
                   fch.fecharbanco();

               //Integer.toString( raa ); //Converte mesmo a variavel p/ String
               //outputtext.append(String.valueOf(res.getInt("ra"))); //Pega o valor String da variavel
       
                  double tempo_final = new Date().getTime();
                  tempo_final = tempo_final / 1000;
                  double resultado = tempo_final - tempo_inicial;
                   String unidade = "segundos";
                  if (resultado >= 60)
                  {resultado = resultado/60; unidade = "minutos"; }
                  if (resultado >= 60)
                  {resultado = resultado/60; unidade = "horas"; }

                  DecimalFormat fmt = new DecimalFormat("0.00");
                  String result = fmt.format(resultado);


                //  System.out.printf( "\nresultado = %.3f segundos", resultado );
                //  outputtext.setText(null);
                  outputtext.append("\n\nSistema:  Firebird");
                  outputtext.append("\nRegistros:  "+bla);
                  outputtext.append("\nOperação:  Consulta");
                  outputtext.append("\nTempo:  "+result+" "+unidade);
                  progresso.setIndeterminate(false);
                  saida.setText("Dados consultados com sucesso!");
                  JOptionPane.showMessageDialog(null,"Dados consultados com sucesso!");

                } catch (Exception ex) {
                  ;
                }
            }
       };
      t.start();

            }

    }//GEN-LAST:event_btnselectActionPerformed

    private void btnatualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnatualizarActionPerformed

        System.gc();
        final Atualiza at = new Atualiza();
        final atualizar_firebird fb = new atualizar_firebird();
        progresso.setIndeterminate(true);
        boolean teste;
        boolean conta;
        teste = msql.isSelected();
        conta = updateOne.isSelected();
        final int lala;
        final  String bla;

        if (conta == true) { lala = 1; bla = "Um"; } 
        else { lala = 0; bla = "Todos";}

        if (teste == true){
             Thread t = new Thread() {
             @Override
             public void run()
              {
               try {

                  saida.setText("Atualizando dados no Mysql...");
                  Thread.sleep(5000);
                  double tempo_inicial = new Date().getTime(); //pega o tempo
                  tempo_inicial = tempo_inicial / 1000; //converte para segundos
                  String atmy = "";
                  if (lala == 1) { atmy = at.Atualizar();}
                  else { at.AtualizarAll(); atmy = "#";}
                  double tempo_final = new Date().getTime();
                  tempo_final = tempo_final / 1000;
                  double resultado = tempo_final - tempo_inicial;
                  String unidade = "segundos";
                  if (resultado >= 60)
                   {resultado = resultado/60; unidade = "minutos"; }
                  if (resultado >= 60)
                   {resultado = resultado/60; unidade = "horas"; }







                  DecimalFormat fmt = new DecimalFormat("0.00");
                  String result = fmt.format(resultado);
                  outputtext.setText(null);
                  outputtext.append("Sistema:  Mysql");
                  outputtext.append("\nOperação:  Atualização");
                  outputtext.append("\nRegistros:  "+bla);
                  outputtext.append("\nNumero do registro: "+atmy);
                  outputtext.append("\nTempo:  "+result+" "+unidade);
                 // outputtext.append("\nTempo:  "+result+"  segundos");
                  progresso.setIndeterminate(false);
                  saida.setText("Dados atualizados com sucesso!");
                  JOptionPane.showMessageDialog(null,"Dados atualizados com sucesso!");

                } catch (Exception ex) {
                  ;
                }
            }
       };
      t.start();

      }else {
              //Atualiza no Firebird
            
             Thread t = new Thread() {
             @Override
             public void run()
              {
               try {

                  saida.setText("Atualizando dados no Firebird...");
                  Thread.sleep(5000);


                  double tempo_inicial = new Date().getTime(); //pega o tempo
                  tempo_inicial = tempo_inicial / 1000; //converte para segundos
                  String atfb = "";
                  if (lala == 1) { atfb = fb.Atualizar();}
                  else { fb.AtualizarAll(); atfb = "#";}
                  double tempo_final = new Date().getTime();
                  tempo_final = tempo_final / 1000;
                  double resultado = tempo_final - tempo_inicial;
                  String unidade = "segundos";
                  if (resultado >= 60)
                   {resultado = resultado/60; unidade = "minutos"; }
                  if (resultado >= 60)
                   {resultado = resultado/60; unidade = "horas"; }





                  DecimalFormat fmt = new DecimalFormat("0.00");
                  String result = fmt.format(resultado);
                  outputtext.setText(null);
                  outputtext.append("Sistema:  Firebird");
                  outputtext.append("\nOperação:  Atualização");
                  outputtext.append("\nRegistros:  "+bla);
                  outputtext.append("\nNumero do registro: "+atfb);
                  outputtext.append("\nTempo:  "+result+" "+unidade);
                 // outputtext.append("\nTempo:  "+result+"  segundos");
                  progresso.setIndeterminate(false);
                  saida.setText("Dados atualizados com sucesso!");
                  JOptionPane.showMessageDialog(null,"Dados atualizados com sucesso!");

                } catch (Exception ex) {
                  ;
                }
            }
       };
      t.start();


            }

    }//GEN-LAST:event_btnatualizarActionPerformed

    private void btndeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeletarActionPerformed

          System.gc();
          final Deleta_my dl = new Deleta_my();
          final deletar_firebird fb = new deletar_firebird();
          progresso.setIndeterminate(true);
          boolean teste;
          boolean conta;
          teste = msql.isSelected();
          conta = deleteOne.isSelected();
          final int lala;
          final  String bla;
          

         if (conta == true) { lala = 1; bla = "Um"; } else { lala = 0; bla = "Todos";}

          if (teste == true){
            
             Thread t = new Thread() {
             @Override
             public void run()
              {
               try {

                  saida.setText("Deletando dados no Mysql...");
                  Thread.sleep(5000);
                  double tempo_inicial = new Date().getTime(); //pega o tempo
                  tempo_inicial = tempo_inicial / 1000; //converte para segundos
                  String delmy = "";
                  if (lala == 1) {delmy = dl.DeletarOne();}
                  else {dl.DeletarAll(); delmy = "#";}
                  double tempo_final = new Date().getTime();
                  tempo_final = tempo_final / 1000;
                  double resultado = tempo_final - tempo_inicial;
                  String unidade = "segundos";
                  if (resultado >= 60)
                   {resultado = resultado/60; unidade = "minutos"; }
                  if (resultado >= 60)
                   {resultado = resultado/60; unidade = "horas"; }



                  DecimalFormat fmt = new DecimalFormat("0.00");
                  String result = fmt.format(resultado);
                  outputtext.setText(null);
                  outputtext.append("Sistema:  Mysql");
                  outputtext.append("\nOperação:  Exclusão");
                  outputtext.append("\nRegistros:  "+bla);
                  outputtext.append("\nNumero do registro: "+delmy);
                  outputtext.append("\nTempo:  "+result+" "+unidade);
                  //outputtext.append("\nTempo:  "+result+"  segundos");
                  progresso.setIndeterminate(false);
                  saida.setText("Dados deletados com sucesso!");
                  JOptionPane.showMessageDialog(null,"Dados deletados com sucesso!");

                } catch (Exception ex) {
                  ;
                }
            }
       };
      t.start();

      }else {
              // deleta no firebird
             
             Thread t = new Thread() {
             @Override
             public void run()
              {
               try {

                  saida.setText("Deletando dados no Firebird...");
                  Thread.sleep(5000);
                  double tempo_inicial = new Date().getTime(); //pega o tempo
                  tempo_inicial = tempo_inicial / 1000; //converte para segundos
                  String delfb = "";
                  if (lala == 1) {
                  delfb = fb.DeletarOne();}
                  else { fb.DeletarAll(); delfb = "#";}
                  double tempo_final = new Date().getTime();
                  tempo_final = tempo_final / 1000;
                  double resultado = tempo_final - tempo_inicial;
                  String unidade = "segundos";
                  if (resultado >= 60)
                   {resultado = resultado/60; unidade = "minutos"; }
                  if (resultado >= 60)
                   {resultado = resultado/60; unidade = "horas"; }




                  DecimalFormat fmt = new DecimalFormat("0.00");
                  String result = fmt.format(resultado);
                  outputtext.setText(null);
                  outputtext.append("Sistema:  Firebird");
                  outputtext.append("\nOperação:  Exclusão");
                  outputtext.append("\nRegistros:  "+bla);
                  outputtext.append("\nNumero do registro: "+delfb);
                  outputtext.append("\nTempo:  "+result+" "+unidade);
                //  outputtext.append("\nTempo:  "+result+"  segundos");
                  progresso.setIndeterminate(false);
                  saida.setText("Dados deletados com sucesso!");
                  JOptionPane.showMessageDialog(null,"Dados deletados com sucesso!");

                } catch (Exception ex) {
                  ;
                }
            }
       };
      t.start();

            }
    }//GEN-LAST:event_btndeletarActionPerformed

    private void btnsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsairActionPerformed

     System.exit(0);


    }//GEN-LAST:event_btnsairActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnatualizar;
    private javax.swing.JButton btndeletar;
    private javax.swing.JButton btninserir;
    private javax.swing.JButton btnsair;
    private javax.swing.JButton btnselect;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JRadioButton deleteAll;
    private javax.swing.JRadioButton deleteOne;
    private javax.swing.JRadioButton fire;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton mil;
    private javax.swing.JRadioButton milhao;
    private javax.swing.JRadioButton msql;
    private java.awt.TextArea outputtext;
    private javax.swing.JPanel pncarga;
    private javax.swing.JPanel pnsgbd;
    private javax.swing.JProgressBar progresso;
    private javax.swing.JTextField saida;
    private javax.swing.JRadioButton select_all;
    private javax.swing.JRadioButton select_one;
    private javax.swing.JRadioButton updateAll;
    private javax.swing.JRadioButton updateOne;
    // End of variables declaration//GEN-END:variables

}
