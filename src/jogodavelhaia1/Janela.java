/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodavelhaia1;

import java.awt.Color;
import java.util.Random;
import javax.swing.*;

/**
 *
 * @author José Luiz
 */
public class Janela extends javax.swing.JFrame
{
    private Tabuleiro tabuleiro;
    private boolean jogando;
    private MiniMax jogoMinMax;
    private PodaAlfaBeta jogoPodaAlfaBeta;
    private final Random posicao;

    /**
     * Creates new form Janela
     */
    public Janela()
    {
        tabuleiro = new Tabuleiro();
        posicao = new Random();
        jogando = false;
        initComponents();
    }

    public void limpaTela()
    {
        posicao00.setText("");
        posicao01.setText("");
        posicao02.setText("");
        posicao10.setText("");
        posicao11.setText("");
        posicao12.setText("");
        posicao20.setText("");
        posicao21.setText("");
        posicao22.setText("");
        info.setText("");
    }

    public void obtemNosProfundidade(int profundidade, long nos)
    {
        if (facil.isSelected())
        {
            info.setText(" ");
            info.setText("DIFICULDADE FÁCIL\n");
        }
        else
        {
            if (medio.isSelected())
            {
                info.setText(" ");
                info.setText("DIFICULDADE MÉDIA\n");
            }
            else
            {
                if (dificil.isSelected())
                {
                    info.setText(" ");
                    info.setText("DIFICULDADE DIFÍCIL\n");
                }
            }
        }
        info.setText(info.getText() + "Profundidade: " + nos + "\nNós: " + profundidade);
    }

    public void jogadaDaIA(Coordenada pos)
    {
        if (pos.getX() == 0 && pos.getY() == 0)
        {
            posicao00.setText("X");
            posicao00.setForeground(Color.red);
            return;
        }
        if (pos.getX() == 0 && pos.getY() == 1)
        {
            posicao01.setText("X");
            posicao01.setForeground(Color.red);
            return;
        }
        if (pos.getX() == 0 && pos.getY() == 2)
        {
            posicao02.setText("X");
            posicao02.setForeground(Color.red);
            return;
        }
        if (pos.getX() == 1 && pos.getY() == 0)
        {
            posicao10.setText("X");
            posicao10.setForeground(Color.red);
            return;
        }
        if (pos.getX() == 1 && pos.getY() == 1)
        {
            posicao11.setText("X");
            posicao11.setForeground(Color.red);
            return;
        }
        if (pos.getX() == 1 && pos.getY() == 2)
        {
            posicao12.setText("X");
            posicao12.setForeground(Color.red);
            return;
        }
        if (pos.getX() == 2 && pos.getY() == 0)
        {
            posicao20.setText("X");
            posicao20.setForeground(Color.red);
            return;
        }
        if (pos.getX() == 2 && pos.getY() == 1)
        {
            posicao21.setText("X");
            posicao21.setForeground(Color.red);
            return;
        }
        if (pos.getX() == 2 && pos.getY() == 2)
        {
            posicao22.setText("X");
            posicao22.setForeground(Color.red);
            return;
        }
        JOptionPane.showMessageDialog(null, "Erro desconhecido!!!!!!");
    }

    void zerarRadio()
    {
        buttonGroup1.clearSelection();
        buttonGroup2.clearSelection();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        minMax = new javax.swing.JRadioButton();
        podaAlfaBeta = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        info = new javax.swing.JTextArea();
        iniciarResetar = new javax.swing.JButton();
        posicao11 = new javax.swing.JButton();
        posicao20 = new javax.swing.JButton();
        posicao21 = new javax.swing.JButton();
        posicao22 = new javax.swing.JButton();
        posicao10 = new javax.swing.JButton();
        posicao00 = new javax.swing.JButton();
        posicao12 = new javax.swing.JButton();
        posicao01 = new javax.swing.JButton();
        posicao02 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        facil = new javax.swing.JRadioButton();
        medio = new javax.swing.JRadioButton();
        dificil = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo da Velha - IA1 - MiniMax/AlfaBeta");
        setResizable(false);

        buttonGroup1.add(minMax);
        minMax.setText("MinMax");
        minMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minMaxActionPerformed(evt);
            }
        });

        buttonGroup1.add(podaAlfaBeta);
        podaAlfaBeta.setText("PodaAlfaBeta");
        podaAlfaBeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                podaAlfaBetaActionPerformed(evt);
            }
        });

        jLabel1.setText("Algoritmo");

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel2.setText("Heurística");

        info.setEditable(false);
        info.setColumns(20);
        info.setRows(5);
        jScrollPane1.setViewportView(info);

        iniciarResetar.setText("Iniciar/Resetar");
        iniciarResetar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarResetarActionPerformed(evt);
            }
        });

        posicao11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                posicao11ActionPerformed(evt);
            }
        });

        posicao20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                posicao20ActionPerformed(evt);
            }
        });

        posicao21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                posicao21ActionPerformed(evt);
            }
        });

        posicao22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                posicao22ActionPerformed(evt);
            }
        });

        posicao10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                posicao10ActionPerformed(evt);
            }
        });

        posicao00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                posicao00ActionPerformed(evt);
            }
        });

        posicao12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                posicao12ActionPerformed(evt);
            }
        });

        posicao01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                posicao01ActionPerformed(evt);
            }
        });

        posicao02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                posicao02ActionPerformed(evt);
            }
        });

        jLabel3.setText("Informações");

        buttonGroup2.add(facil);
        facil.setText("Fácil - 2 vitórias");
        facil.setName(""); // NOI18N
        facil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facilActionPerformed(evt);
            }
        });

        buttonGroup2.add(medio);
        medio.setText("Médio - 3 vitórias");
        medio.setToolTipText("");

        buttonGroup2.add(dificil);
        dificil.setText("Difícil - 4 vitórias");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(iniciarResetar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(posicao00, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(posicao01, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(posicao02, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(posicao10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(posicao11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(posicao12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(posicao20, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(posicao21, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(posicao22, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(97, 97, 97))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
                            .addComponent(jSeparator3)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(minMax)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(podaAlfaBeta, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(22, 22, 22)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(facil)
                                    .addComponent(medio)
                                    .addComponent(dificil))))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(facil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(medio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dificil))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(minMax)
                            .addComponent(podaAlfaBeta))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 11, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(posicao00, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iniciarResetar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(posicao10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(posicao01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(posicao02, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(posicao12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(posicao11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(posicao21, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(posicao20, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(posicao22, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        facil.getAccessibleContext().setAccessibleName("facil");
        facil.getAccessibleContext().setAccessibleDescription("");
        medio.getAccessibleContext().setAccessibleName("medio");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void minMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minMaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_minMaxActionPerformed

    private void podaAlfaBetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_podaAlfaBetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_podaAlfaBetaActionPerformed

    private void iniciarResetarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarResetarActionPerformed
        if ((!(facil.isSelected()) && !(medio.isSelected())) && !(dificil.isSelected()) || (!(minMax.isSelected()) && !(podaAlfaBeta.isSelected())))
        {
            limpaTela();
            JOptionPane.showMessageDialog(null, "Selecione quem inicia jogando e qual algoritmo de busca competitiva utilizar antes de começar a jogar!");
            return;
        }
        System.gc();
        tabuleiro = new Tabuleiro();
        limpaTela();
        if (minMax.isSelected())
        {
            jogoMinMax = new MiniMax(3);
        }
        else
        {
            jogoPodaAlfaBeta = new PodaAlfaBeta(3);
        }
        if (dificil.isSelected())
        {
            posicao11.setText("X");
            posicao11.setForeground(Color.red);
            tabuleiro.marcaX(1, 1);
            info.setText("DIFICULDADE DIFÍCIL\n");
            jogando = true;
            return;
        }
        if (medio.isSelected())
        {
            int p = posicao.nextInt(4);
            info.setText("DIFICULDADE MÉDIA\n");
            switch (p)
            {
                case 0:
                    posicao00.setText("X");
                    posicao00.setForeground(Color.red);
                    tabuleiro.marcaX(0, 0);
                    break;
                case 1:
                    posicao02.setText("X");
                    posicao02.setForeground(Color.red);
                    tabuleiro.marcaX(0, 2);
                    break;
                case 2:
                    posicao20.setText("X");
                    posicao20.setForeground(Color.red);
                    tabuleiro.marcaX(2, 0);
                    break;
                case 3:
                    posicao22.setText("X");
                    posicao22.setForeground(Color.red);
                    tabuleiro.marcaX(2, 2);
                    break;
            }
            jogando = true;
            return;
        }
        if (!facil.isSelected())
        {
            JOptionPane.showMessageDialog(null, "Marque uma posição para iniciar o jogo...");
            jogando = true;
            return;
        }
        int p = posicao.nextInt(4);
        info.setText("DIFICULDADE FÁCIL\n");
        switch (p)
        {
            case 0:
                posicao01.setText("X");
                posicao01.setForeground(Color.red);
                tabuleiro.marcaX(0, 1);
                break;
            case 1:
                posicao10.setText("X");
                posicao10.setForeground(Color.red);
                tabuleiro.marcaX(1, 0);
                break;
            case 2:
                posicao12.setText("X");
                posicao12.setForeground(Color.red);
                tabuleiro.marcaX(1, 2);
                break;
            case 3:
                posicao21.setText("X");
                posicao21.setForeground(Color.red);
                tabuleiro.marcaX(2, 1);
                break;
        }
        jogando = true;
    }//GEN-LAST:event_iniciarResetarActionPerformed

    private void posicao00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_posicao00ActionPerformed
        MetodoBotao(evt, 0, 0, posicao00);
    }//GEN-LAST:event_posicao00ActionPerformed

    private void posicao01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_posicao01ActionPerformed
        MetodoBotao(evt, 0, 1, posicao01);
    }//GEN-LAST:event_posicao01ActionPerformed

    private void posicao02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_posicao02ActionPerformed
        MetodoBotao(evt, 0, 2, posicao02);
    }//GEN-LAST:event_posicao02ActionPerformed

    private void posicao10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_posicao10ActionPerformed
        MetodoBotao(evt, 1, 0, posicao10);
    }//GEN-LAST:event_posicao10ActionPerformed

    private void posicao11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_posicao11ActionPerformed
        MetodoBotao(evt, 1, 1, posicao11);
    }//GEN-LAST:event_posicao11ActionPerformed

    private void posicao12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_posicao12ActionPerformed
        MetodoBotao(evt, 1, 2, posicao12);
    }//GEN-LAST:event_posicao12ActionPerformed

    private void posicao20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_posicao20ActionPerformed
        MetodoBotao(evt, 2, 0, posicao20);
    }//GEN-LAST:event_posicao20ActionPerformed

    private void posicao21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_posicao21ActionPerformed
        MetodoBotao(evt, 2, 1, posicao21);
    }//GEN-LAST:event_posicao21ActionPerformed

    private void posicao22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_posicao22ActionPerformed
        MetodoBotao(evt, 2, 2, posicao22);
    }//GEN-LAST:event_posicao22ActionPerformed

    private void facilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_facilActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Janela().setVisible(true);
            }
        });
    }

    private void MetodoBotao(
            java.awt.event.ActionEvent evt, int x, int y, JButton btn)
    {
        boolean jogada = tabuleiro.marcaO(x, y);
        if (!jogada || !jogando)
        {
            JOptionPane.showMessageDialog(null, "Jogada inválida");
            return;
        }
        if (!jogada || !jogando)
        {
            JOptionPane.showMessageDialog(null, "Jogada inválida");
            return;
        }
        btn.setText("O");
        btn.setForeground(Color.blue);
        if (tabuleiro.fimdejogo() && !(tabuleiro.empate()))
        {
            JOptionPane.showMessageDialog(null, "Você venceu!!! Parabéns :)");
            zerarRadio();
            iniciarResetarActionPerformed(evt);
            return;
        }
        if (tabuleiro.empate())
        {
            JOptionPane.showMessageDialog(null, "Empatou :|");
            zerarRadio();
            iniciarResetarActionPerformed(evt);
            return;
        }
        if (minMax.isSelected())
        {
            jogoMinMax.nos = 0;
            jogoMinMax.profundidade = 0;
            Coordenada pos = jogoMinMax.jogadaComputador(tabuleiro);
            tabuleiro.marcaX(pos.getX(), pos.getY());
            System.out.println(pos.getX() + " " + pos.getY());
            jogadaDaIA(pos);
            obtemNosProfundidade(jogoMinMax.profundidade, jogoMinMax.nos);
            if (tabuleiro.fimdejogo() && !(tabuleiro.empate()))
            {
                JOptionPane.showMessageDialog(null, "Você é um perdedor!!! :(");
                zerarRadio();
                iniciarResetarActionPerformed(evt);
                return;
            }
            if (tabuleiro.empate())
            {
                JOptionPane.showMessageDialog(null, "Empatou :|");
                zerarRadio();
                iniciarResetarActionPerformed(evt);
            }
            return;
        }
        jogoPodaAlfaBeta.nos = 0;
        jogoPodaAlfaBeta.profundidade = 0;
        Coordenada pos = jogoPodaAlfaBeta.jogadaComputador(tabuleiro);
        tabuleiro.marcaX(pos.getX(), pos.getY());
        System.out.println(pos.getX() + " " + pos.getY());
        jogadaDaIA(pos);
        obtemNosProfundidade(jogoPodaAlfaBeta.profundidade, jogoPodaAlfaBeta.nos);
        if (tabuleiro.fimdejogo() && !(tabuleiro.empate()))
        {
            JOptionPane.showMessageDialog(null, "Você é um perdedor!!! :(");
            zerarRadio();
            iniciarResetarActionPerformed(evt);
            return;
        }
        if (tabuleiro.empate())
        {
            JOptionPane.showMessageDialog(null, "Empatou :|");
            zerarRadio();
            iniciarResetarActionPerformed(evt);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JRadioButton dificil;
    private javax.swing.JRadioButton facil;
    private javax.swing.JTextArea info;
    private javax.swing.JButton iniciarResetar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JRadioButton medio;
    private javax.swing.JRadioButton minMax;
    private javax.swing.JRadioButton podaAlfaBeta;
    private javax.swing.JButton posicao00;
    private javax.swing.JButton posicao01;
    private javax.swing.JButton posicao02;
    private javax.swing.JButton posicao10;
    private javax.swing.JButton posicao11;
    private javax.swing.JButton posicao12;
    private javax.swing.JButton posicao20;
    private javax.swing.JButton posicao21;
    private javax.swing.JButton posicao22;
    // End of variables declaration//GEN-END:variables
}
