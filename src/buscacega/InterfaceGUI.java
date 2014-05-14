
package buscacega;

import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Robson
 */
public class InterfaceGUI extends javax.swing.JFrame {
    
    public static final int TORRE_HANOI = 1;
    public static final int MISSIONAIRIES = 2;
    public static final int POTS = 3;
    public static final int HUSBANDS = 4;
    
    public static final int DEPTH = 10;
    public static final int BREADTH = 20;
    
    public InterfaceGUI() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bGProblem = new javax.swing.ButtonGroup();
        bGAlgorithm = new javax.swing.ButtonGroup();
        lblProblem = new javax.swing.JLabel();
        lblAlgorithm = new javax.swing.JLabel();
        rBhanoi = new javax.swing.JRadioButton();
        rBmissionairy = new javax.swing.JRadioButton();
        rBpots = new javax.swing.JRadioButton();
        rBhusband = new javax.swing.JRadioButton();
        rBdepth = new javax.swing.JRadioButton();
        rBbreadth = new javax.swing.JRadioButton();
        bRun = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblProblem.setText("Escolha um Problema:");

        lblAlgorithm.setText("Use um algoritmo:");

        bGProblem.add(rBhanoi);
        rBhanoi.setText("Torre Hanoi");
        rBhanoi.setName("1"); // NOI18N
        rBhanoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBhanoiActionPerformed(evt);
            }
        });

        bGProblem.add(rBmissionairy);
        rBmissionairy.setText("Missionarios e canibais");
        rBmissionairy.setName("2"); // NOI18N
        rBmissionairy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBmissionairyActionPerformed(evt);
            }
        });

        bGProblem.add(rBpots);
        rBpots.setText("3 Jarras");
        rBpots.setName("3"); // NOI18N
        rBpots.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBpotsActionPerformed(evt);
            }
        });

        bGProblem.add(rBhusband);
        rBhusband.setText("Maridos Ciumentos");
        rBhusband.setName("4"); // NOI18N

        bGAlgorithm.add(rBdepth);
        rBdepth.setText("Busca em Profundidade");
        rBdepth.setName("10"); // NOI18N

        bGAlgorithm.add(rBbreadth);
        rBbreadth.setText("Busca em Largura");
        rBbreadth.setName("20"); // NOI18N

        bRun.setText("Executar");
        bRun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRunActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblProblem)
                            .addComponent(lblAlgorithm)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rBhanoi)
                                .addGap(18, 18, 18)
                                .addComponent(rBmissionairy)
                                .addComponent(rBpots)
                                .addGap(18, 18, 18)
                                .addComponent(rBhusband)))
                        .addGap(107, 107, 107))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rBdepth)
                        .addGap(18, 18, 18)
                        .addComponent(rBbreadth)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bRun)
                        .addGap(29, 29, 29))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblProblem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rBhanoi)
                    .addComponent(rBmissionairy)
                    .addComponent(rBpots)
                    .addComponent(rBhusband))
                .addGap(36, 36, 36)
                .addComponent(lblAlgorithm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rBdepth)
                    .addComponent(rBbreadth)
                    .addComponent(bRun))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        rBhanoi.getAccessibleContext().setAccessibleName("1");
        rBhanoi.getAccessibleContext().setAccessibleDescription("");
        rBmissionairy.getAccessibleContext().setAccessibleName("2");
        rBmissionairy.getAccessibleContext().setAccessibleDescription("");
        rBpots.getAccessibleContext().setAccessibleName("3");
        rBhusband.getAccessibleContext().setAccessibleName("4");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void rBhanoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBhanoiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rBhanoiActionPerformed

    private void bRunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRunActionPerformed
        int alg,problem;
        problem = 0;
        alg = 0;
        
        Enumeration elements = bGProblem.getElements();
        while (elements.hasMoreElements()) {
          AbstractButton button = (AbstractButton)elements.nextElement();
          if (button.isSelected()) {
            problem = Integer.parseInt((String) button.getName());
          }
        }
        
        elements = bGAlgorithm.getElements();
        while (elements.hasMoreElements()) {
          AbstractButton button = (AbstractButton)elements.nextElement();
          if (button.isSelected()) {
            alg = Integer.parseInt((String) button.getName());
          }
        }
        
        switch(problem){
            case TORRE_HANOI:
                System.out.println("############################################");
                System.out.println("Torre de Hanoi");
                if(alg == BREADTH){
                    Problem p = new Problem("torre_hanoi.json");
                    System.out.println("Busca Largura");
                    BuscaLargura.buscar(p);
                }else{
                    if(alg == DEPTH){
                        Problem p = new Problem("torre_hanoi.json");
                        System.out.println("Busca Profundidade");
                        BuscaProfundidade.buscar(p);
                    }else{
                        JOptionPane.showMessageDialog(null, "Por favor escolha um algoritmo");
                    }
                }
                break;
            case MISSIONAIRIES:
                System.out.println("############################################");
                System.out.println("Missionarios e canibais");
                if(alg == BREADTH){
                    Problem p = new Problem("missionarios_canibais.json");
                    System.out.println("Busca Largura");
                    BuscaLargura.buscar(p);
                }else{
                    if(alg == DEPTH){
                        Problem p = new Problem("missionarios_canibais.json");
                        System.out.println("Busca Profundidade");
                        BuscaProfundidade.buscar(p);
                    }else{
                        JOptionPane.showMessageDialog(null, "Por favor escolha um algoritmo");
                    }
                }
                break;
            case POTS:
                System.out.println("############################################");
                System.out.println("3 Jarras");
                if(alg == BREADTH){
                    Problem p = new Problem("3_jarras.json");
                    System.out.println("Busca Largura");
                    BuscaLargura.buscar(p);
                }else{
                    if(alg == DEPTH){
                        Problem p = new Problem("3_jarras.json");
                        System.out.println("Busca Profundidade");
                        BuscaProfundidade.buscar(p);
                    }else{
                        JOptionPane.showMessageDialog(null, "Por favor escolha um algoritmo");
                    }
                }
                break;
            case HUSBANDS:
                System.out.println("############################################");
                System.out.println("Maridos Ciumentos");
                if(alg == BREADTH){
                    Problem p = new Problem("3maridos_ciumentos.json");
                    System.out.println("Busca Largura");
                    BuscaLargura.buscar(p);
                }else{
                    if(alg == DEPTH){
                        Problem p = new Problem("3maridos_ciumentos.json");
                        System.out.println("Busca Profundidade");
                        BuscaProfundidade.buscar(p);
                    }else{
                        JOptionPane.showMessageDialog(null, "Por favor escolha um algoritmo");
                    }
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Por favor escolha um problema");
                break;
        }
        
    }//GEN-LAST:event_bRunActionPerformed

    private void rBmissionairyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBmissionairyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rBmissionairyActionPerformed

    private void rBpotsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBpotsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rBpotsActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new InterfaceGUI();
                frame.setLocationRelativeTo ( null );
                frame.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bGAlgorithm;
    private javax.swing.ButtonGroup bGProblem;
    private javax.swing.JButton bRun;
    private javax.swing.JLabel lblAlgorithm;
    private javax.swing.JLabel lblProblem;
    private javax.swing.JRadioButton rBbreadth;
    private javax.swing.JRadioButton rBdepth;
    private javax.swing.JRadioButton rBhanoi;
    private javax.swing.JRadioButton rBhusband;
    private javax.swing.JRadioButton rBmissionairy;
    private javax.swing.JRadioButton rBpots;
    // End of variables declaration//GEN-END:variables
}
