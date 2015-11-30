/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodavelhaia1;

import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author José Luiz
 */
public class Janela extends javax.swing.JFrame
{
    private Tabuleiro tabuleiro;
    private boolean jogando;
    private boolean jogadorJogando;
    private MiniMax jogoMinMax;
    private PodaAlfaBeta jogoPodaAlfaBeta;

    /**
     * Creates new form Janela
     */
    public Janela()
    {
        tabuleiro = new Tabuleiro();
        jogando = false;
        jogadorJogando = true;
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
        info.setText("Profundidade: " + nos + "\nNós: " + profundidade);
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
        pc = new javax.swing.JRadioButton();
        jogador = new javax.swing.JRadioButton();
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

        jLabel2.setText("Primeiro a Jogar");

        buttonGroup2.add(pc);
        pc.setText("PC");
        pc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pcActionPerformed(evt);
            }
        });

        buttonGroup2.add(jogador);
        jogador.setText("Jogador");
        jogador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jogadorActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addGap(103, 103, 103))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(iniciarResetar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
                            .addComponent(jSeparator3)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(minMax)
                                                .addGap(18, 18, 18)
                                                .addComponent(podaAlfaBeta, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(pc)
                                                .addGap(54, 54, 54)
                                                .addComponent(jogador, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jLabel3))
                                .addGap(0, 76, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(minMax)
                                    .addComponent(podaAlfaBeta)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(pc)
                                    .addComponent(jogador))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(iniciarResetar)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(posicao00, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void minMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minMaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_minMaxActionPerformed

    private void podaAlfaBetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_podaAlfaBetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_podaAlfaBetaActionPerformed

    private void iniciarResetarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarResetarActionPerformed
        if ((!jogador.isSelected() && !pc.isSelected()) || (!minMax.isSelected() && !podaAlfaBeta.isSelected()))
        {
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
        if (podaAlfaBeta.isSelected())
        {
            jogoPodaAlfaBeta = new PodaAlfaBeta(3);
        }
        if (!pc.isSelected())
        {
            JOptionPane.showMessageDialog(null, "Marque uma posição para iniciar o jogo...");
            jogando = true;
            return;
        }
        posicao11.setText("X");
        posicao11.setForeground(Color.red);
        tabuleiro.marcaX(1, 1);
        jogando = true;
    }//GEN-LAST:event_iniciarResetarActionPerformed

    private void pcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pcActionPerformed

    private void jogadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jogadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jogadorActionPerformed

    private void posicao00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_posicao00ActionPerformed
        this.jogar(evt, posicao00, 0, 0);
    }//GEN-LAST:event_posicao00ActionPerformed

    private void posicao01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_posicao01ActionPerformed
        this.jogar(evt, posicao01, 0, 1);
    }//GEN-LAST:event_posicao01ActionPerformed

    private void posicao02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_posicao02ActionPerformed
        this.jogar(evt, posicao02, 0, 2);
    }//GEN-LAST:event_posicao02ActionPerformed

    private void posicao10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_posicao10ActionPerformed
        this.jogar(evt, posicao10, 1, 0);
    }//GEN-LAST:event_posicao10ActionPerformed

    private void posicao11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_posicao11ActionPerformed
        this.jogar(evt, posicao11, 1, 1);
    }//GEN-LAST:event_posicao11ActionPerformed

    private void posicao12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_posicao12ActionPerformed
        this.jogar(evt, posicao12, 1, 2);
    }//GEN-LAST:event_posicao12ActionPerformed

    private void posicao20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_posicao20ActionPerformed
        this.jogar(evt, posicao20, 2, 0);
    }//GEN-LAST:event_posicao20ActionPerformed

    private void posicao21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_posicao21ActionPerformed
        this.jogar(evt, posicao21, 2, 1);
    }//GEN-LAST:event_posicao21ActionPerformed

    private void posicao22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_posicao22ActionPerformed
        this.jogar(evt, posicao22, 2, 2);
    }//GEN-LAST:event_posicao22ActionPerformed

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
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(Janela.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Janela.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Janela.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Janela.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

    /**
     * Método de jogada dos botões, é o mesmo método para todos, alterando
     * apenas os parâmetros
     *
     * @param evt
     * @param btn
     * @param x
     * @param y
     */
    private void jogar(
            java.awt.event.ActionEvent evt,
            javax.swing.JButton btn,
            int x,
            int y)
    {
        // Jogada válida/inválida
        boolean jogada = tabuleiro.marcaO(x, y);
        if (!jogada || !jogando)
        {
            //JOptionPane.showMessageDialog(null, "Jogada inválida");
            return;
        }
        // Mensagem de vencimento
        btn.setText("O");
        btn.setForeground(Color.blue);
        if (tabuleiro.fimdejogo() && !this.tabuleiro.empate())
        {
            JOptionPane.showMessageDialog(null, "Você venceu!!! Parabéns :)");
            iniciarResetarActionPerformed(evt);
            return;
        }
        // Mensagem de empate
        if (this.tabuleiro.empate())
        {
            JOptionPane.showMessageDialog(null, "Empatou :|");
            iniciarResetarActionPerformed(evt);
            return;
        }
        this.jogadorJogando = false;
        // Método do minimax
        if (this.minMax.isSelected())
        {
            this.jogoMinMax.nos = 0;
            this.jogoMinMax.profundidade = 0;
            Coordenada pos = this.jogoMinMax.jogadaComputador(this.tabuleiro);
            this.tabuleiro.marcaX(pos.getX(), pos.getY());
            System.out.println(pos.getX() + " " + pos.getY());
            jogadaDaIA(pos);
            obtemNosProfundidade(this.jogoMinMax.profundidade, this.jogoMinMax.nos);
            // Verifica se o computador ganhou
            if (this.tabuleiro.fimdejogo() && !this.tabuleiro.empate())
            {
                JOptionPane.showMessageDialog(null, "Você é um perdedor!!! :(");
                iniciarResetarActionPerformed(evt);
                return;
            }
            // Verifica se houve empate
            if (this.tabuleiro.empate())
            {
                JOptionPane.showMessageDialog(null, "Empatou :|");
                iniciarResetarActionPerformed(evt);
                return;
            }
            // Define que o jogador ganhou
            jogadorJogando = true;
            return;
        }
        // Método do alfa-beta
        this.jogoPodaAlfaBeta.nos = 0;
        this.jogoPodaAlfaBeta.profundidade = 0;
        Coordenada pos = this.jogoPodaAlfaBeta.jogadaComputador(this.tabuleiro);
        this.tabuleiro.marcaX(pos.getX(), pos.getY());
        System.out.println(pos.getX() + " " + pos.getY());
        jogadaDaIA(pos);
        obtemNosProfundidade(this.jogoPodaAlfaBeta.profundidade, this.jogoPodaAlfaBeta.nos);
        // Verifica se o computador ganhou
        if (this.tabuleiro.fimdejogo() && !this.tabuleiro.empate())
        {
            JOptionPane.showMessageDialog(null, "Você é um perdedor!!! :(");
            iniciarResetarActionPerformed(evt);
            return;
        }
        // Verifica se empatou o jogo
        if (this.tabuleiro.empate())
        {
            JOptionPane.showMessageDialog(null, "Empatou :|");
            iniciarResetarActionPerformed(evt);
            return;
        }
        // Define que o jogador irá ganhar
        this.jogadorJogando = true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextArea info;
    private javax.swing.JButton iniciarResetar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JRadioButton jogador;
    private javax.swing.JRadioButton minMax;
    private javax.swing.JRadioButton pc;
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
