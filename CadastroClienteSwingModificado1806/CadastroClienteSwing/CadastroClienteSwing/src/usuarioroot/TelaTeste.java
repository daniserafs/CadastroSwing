package usuarioroot;

public class TelaTeste extends javax.swing.JFrame {
    
    public void initComponents(){
        checkBox = new javax.swing.JCheckBox();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addGap(25,25,25)
        .addGroup(layout.createParallelGroup()
        .addComponent(checkBox))
        )
        );
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
        .addGroup(javax.swing.GroupLayout.Alignment.BASELINE, layout.createSequentialGroup()
        .addGap(25,25,25)
        .addGroup(layout.createParallelGroup()
        .addComponent(checkBox)))
        );
    }

    private javax.swing.JCheckBox checkBox; 
}
