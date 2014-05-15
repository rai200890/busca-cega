package buscacega;

import java.util.Enumeration;
import java.util.HashMap;
import javax.swing.AbstractButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class InterfaceGUI extends javax.swing.JFrame {
    
    //Define as constantes da interface
    //
    //Constantes de problemas 
    public static final int TORRE_HANOI = 1;
    public static final int MISSIONAIRIES = 2;
    public static final int POTS = 3;
    public static final int HUSBANDS = 4;

    //Constante de algoritmos 
    public static final int DEPTH = 10;
    public static final int BREADTH = 20;

    //HashMap que contem o nome dos arquivos dos problemas
    private HashMap<Integer, String> arquivos_problema;

    //Inicializa o HashMap associando os problemas com seus respectivos ids
    public InterfaceGUI() {
        this.arquivos_problema = new HashMap<Integer, String>();
        this.arquivos_problema.put(TORRE_HANOI, "torre_hanoi.json");
        this.arquivos_problema.put(MISSIONAIRIES, "missionarios_canibais.json");
        this.arquivos_problema.put(POTS, "3_jarras.json");
        this.arquivos_problema.put(HUSBANDS, "3maridos_ciumentos.json");
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jTA_Output = new javax.swing.JTextArea();

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

        jTA_Output.setColumns(20);
        jTA_Output.setRows(5);
        jScrollPane2.setViewportView(jTA_Output);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 15, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rBdepth)
                                .addGap(18, 18, 18)
                                .addComponent(rBbreadth)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bRun))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rBhanoi)
                                .addGap(18, 18, 18)
                                .addComponent(rBmissionairy)
                                .addGap(0, 0, 0)
                                .addComponent(rBpots)
                                .addGap(18, 18, 18)
                                .addComponent(rBhusband)))
                        .addGap(250, 250, 250))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAlgorithm)
                            .addComponent(lblProblem))
                        .addGap(0, 0, Short.MAX_VALUE))))
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
                .addComponent(lblAlgorithm, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rBdepth)
                    .addComponent(rBbreadth)
                    .addComponent(bRun))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                .addContainerGap())
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
        int alg, problem_id;
        alg = 0;
        problem_id = 0;
        
        //Pega a opção de problema selecionada na interface
        Enumeration elements = bGProblem.getElements();
        while (elements.hasMoreElements()) {
            AbstractButton button = (AbstractButton) elements.nextElement();
            if (button.isSelected()) {
                problem_id = Integer.parseInt((String) button.getName());
            }
        }
        
        //Pega a opção de algoritmo selecionada na interface
        elements = bGAlgorithm.getElements();
        while (elements.hasMoreElements()) {
            AbstractButton button = (AbstractButton) elements.nextElement();
            if (button.isSelected()) {
                alg = Integer.parseInt((String) button.getName());
            }
        }
        
        //Validação 
        //Caso não tenha selecionado um problema
        if (problem_id == 0) {
            JOptionPane.showMessageDialog(null, "Por favor escolha um problema");
        }
        
        //Caso não tenha selecionado um algoritmo
        if (alg == 0) {
            JOptionPane.showMessageDialog(null, "Por favor escolha um algoritmo");
        }
        
        if (problem_id != 0 && alg != 0) {
            //Pega o nome do arquivo correspondente no HashMap
            String arquivo = this.arquivos_problema.get(problem_id);
            String resposta = "";
            if (arquivo != null) {
                //Inicializa o problema a ser resolvido
                Problem p = new Problem(arquivo);
                jTA_Output.setText("");
                jTA_Output.append("############################################ \n");
                jTA_Output.append(p.getNome() + "\n");
                if (alg == BREADTH) {
                    //Executa a busca em largura
                    resposta += BuscaLargura.buscar(p);
                }
                if (alg == DEPTH) {
                    //Executa a busca em profundidade
                    resposta = BuscaProfundidade.buscar(p);
                }
                //Coloca a resposta do algoritmo no JTextArea
                jTA_Output.append(resposta);
            } else {
                JOptionPane.showMessageDialog(null, "Não existe mapeamento para esse problema!");
            }
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
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bGAlgorithm;
    private javax.swing.ButtonGroup bGProblem;
    private javax.swing.JButton bRun;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTA_Output;
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
