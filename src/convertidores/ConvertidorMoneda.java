package convertidores;

import calculos.Moneda;
import javax.swing.JOptionPane;

public class ConvertidorMoneda extends javax.swing.JFrame {

    String de, a;
    double ingresa, valorInicial, amxn, ausd, aeur, agbp, ajpy, akrw;
    
    Moneda calcular = new Moneda();
    
       
    public ConvertidorMoneda() {
        initComponents();
        this.setLocationRelativeTo(null);
        setTitle("Convertidor de Moneda");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Convertir = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        resultadoConversion = new javax.swing.JTextField();
        DE = new javax.swing.JComboBox<>();
        A = new javax.swing.JComboBox<>();
        ingresarCantidad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Convertir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Convertir.setText("Convertir");
        Convertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConvertirActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        resultadoConversion.setPreferredSize(new java.awt.Dimension(45, 20));
        resultadoConversion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultadoConversionActionPerformed(evt);
            }
        });

        DE.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        DE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguna", "USD", "MXN", "EUR", "GBP", "JPY", "KRW" }));
        DE.setMinimumSize(new java.awt.Dimension(45, 20));
        DE.setPreferredSize(new java.awt.Dimension(45, 20));
        DE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DEActionPerformed(evt);
            }
        });

        A.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        A.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguna", "USD", "MXN", "EUR", "GBP", "JPY", "KRW" }));
        A.setMinimumSize(new java.awt.Dimension(45, 20));
        A.setPreferredSize(new java.awt.Dimension(45, 20));
        A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AActionPerformed(evt);
            }
        });

        ingresarCantidad.setPreferredSize(new java.awt.Dimension(45, 20));
        ingresarCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarCantidadActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Ingresar cantidad");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Resultado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DE, 0, 200, Short.MAX_VALUE)
                            .addComponent(ingresarCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(A, javax.swing.GroupLayout.Alignment.TRAILING, 0, 199, Short.MAX_VALUE)
                            .addComponent(resultadoConversion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(Convertir, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(88, 88, 88))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ingresarCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resultadoConversion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DE, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Convertir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AActionPerformed
        a = A.getSelectedItem().toString();
    }//GEN-LAST:event_AActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        MenuPrincipal newframe = new MenuPrincipal();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void ingresarCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarCantidadActionPerformed
               
    }//GEN-LAST:event_ingresarCantidadActionPerformed

    private void DEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DEActionPerformed
        de = DE.getSelectedItem().toString();
        
    }//GEN-LAST:event_DEActionPerformed

    private void ConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConvertirActionPerformed
        
      Double ingresa = Double.parseDouble(ingresarCantidad.getText());
       
       switch (de){
           
           case ("Ninguna"):
               
               JOptionPane.showMessageDialog(this, "Seleccionar una moneda");
               
               break;
           case ("USD"):
                      if(a.equals("MXN")){
                      amxn = 16.88;
                      resultadoConversion.setText(Double.toString(calcular.moneda(ingresa, amxn)));
                      }else if(a.equals("EUR")){
                      aeur = 0.91;
                      resultadoConversion.setText(Double.toString(calcular.moneda(ingresa, aeur)));    
                      }else if(a.equals("GBP")){
                      double agbp = 0.79;
                      resultadoConversion.setText(Double.toString(calcular.moneda(ingresa, agbp)));    
                      }else if(a.equals("JPY")){
                      ajpy = 144.77;
                      resultadoConversion.setText(Double.toString(calcular.moneda(ingresa, ajpy)));    
                      }else if(a.equals("KRW")){
                      akrw = 1288.34;
                      resultadoConversion.setText(Double.toString(calcular.moneda(ingresa, akrw)));    
                      }else {
                      JOptionPane.showMessageDialog(this, "Seleccionar otra moneda");
                      }
                      break;
                  case ("MXN"):
                      if(a.equals("USD")){
                      ausd = 16.88;
                      resultadoConversion.setText(Double.toString(calcular.moneda(ingresa, ausd)));
                      }else if(a.equals("EUR")){
                      aeur = 18.81;
                      resultadoConversion.setText(Double.toString(calcular.moneda(ingresa, aeur)));    
                      }else if(a.equals("GBP")){
                      agbp = 21.75;
                      resultadoConversion.setText(Double.toString(calcular.moneda(ingresa, agbp)));    
                      }else if(a.equals("JPY")){
                      ajpy = 0.12;
                      resultadoConversion.setText(Double.toString(calcular.moneda(ingresa, ajpy)));    
                      }else if(a.equals("KRW")){
                      akrw = 75.78;
                      resultadoConversion.setText(Double.toString(calcular.moneda(ingresa, akrw)));    
                      }else {
                      JOptionPane.showMessageDialog(this, "Seleccionar otra moneda");
                      }   
                      break;
                  case ("EUR"):
                      if(a.equals("USD")){
                      ausd = 1.10;
                      resultadoConversion.setText(Double.toString(calcular.moneda(ingresa, ausd)));
                      }else if(a.equals("MXN")){
                      amxn = 19.14;
                      resultadoConversion.setText(Double.toString(calcular.moneda(ingresa, amxn)));    
                      }else if(a.equals("GBP")){
                      agbp = 0.88;
                      resultadoConversion.setText(Double.toString(calcular.moneda(ingresa, agbp)));    
                      }else if(a.equals("JPY")){
                      ajpy = 159.61;
                      resultadoConversion.setText(Double.toString(calcular.moneda(ingresa, ajpy)));    
                      }else if(a.equals("KRW")){
                      akrw = 1431.39;
                      resultadoConversion.setText(Double.toString(calcular.moneda(ingresa, akrw)));    
                      }else {
                      JOptionPane.showMessageDialog(this, "Seleccionar otra moneda");
                      }                      
                      break;
                  case ("GBP"):
                      if(a.equals("USD")){
                      double ausd = 1.26;
                      resultadoConversion.setText(Double.toString(calcular.moneda(ingresa, ausd)));
                      }else if(a.equals("MXN")){
                      amxn = 21.86;
                      resultadoConversion.setText(Double.toString(calcular.moneda(ingresa, amxn)));    
                      }else if(a.equals("EUR")){
                      aeur = 1.14;
                      resultadoConversion.setText(Double.toString(calcular.moneda(ingresa, aeur)));    
                      }else if(a.equals("JPY")){
                      ajpy = 182.29;
                      resultadoConversion.setText(Double.toString(calcular.moneda(ingresa, ajpy)));    
                      }else if(a.equals("KRW")){
                      akrw = 1655.84;
                      resultadoConversion.setText(Double.toString(calcular.moneda(ingresa, akrw)));    
                      }else {
                      JOptionPane.showMessageDialog(this, "Seleccionar otra moneda");
                      }                       
                      break;
                  case ("JPY"):
                      if(a.equals("USD")){
                      ausd = 0.0071;
                      resultadoConversion.setText(Double.toString(calcular.moneda(ingresa, ausd)));
                      }else if(a.equals("MXN")){
                      amxn = 0.12;
                      resultadoConversion.setText(Double.toString(calcular.moneda(ingresa, amxn)));    
                      }else if(a.equals("EUR")){
                      aeur = 0.0063;
                      resultadoConversion.setText(Double.toString(calcular.moneda(ingresa, aeur)));    
                      }else if(a.equals("GBP")){
                      agbp = 0.0055;
                      resultadoConversion.setText(Double.toString(calcular.moneda(ingresa, agbp)));    
                      }else if(a.equals("KRW")){
                      akrw = 9.10;
                      resultadoConversion.setText(Double.toString(calcular.moneda(ingresa, akrw)));    
                      }else {
                      JOptionPane.showMessageDialog(this, "Seleccionar otra moneda");
                      }                      
                      break;
                  case ("KRW"):
                      if(a.equals("USD")){
                      ausd = 0.00078;
                      resultadoConversion.setText(Double.toString(calcular.moneda(ingresa, ausd)));
                      }else if(a.equals("MXN")){
                      amxn = 0.013;
                      resultadoConversion.setText(Double.toString(calcular.moneda(ingresa, amxn)));    
                      }else if(a.equals("EUR")){
                      aeur = 0.00070;
                      resultadoConversion.setText(Double.toString(calcular.moneda(ingresa, aeur)));    
                      }else if(a.equals("GBP")){
                      agbp = 0.0000060;
                      resultadoConversion.setText(Double.toString(calcular.moneda(ingresa, agbp)));    
                      }else if(a.equals("JPY")){
                      ajpy = 0.11;
                      resultadoConversion.setText(Double.toString(calcular.moneda(ingresa, ajpy)));    
                      }else {
                      JOptionPane.showMessageDialog(this, "Seleccionar otra moneda");
                      }                       
                      break;
                  default:
                      JOptionPane.showMessageDialog(this, "Divisa no diponible");      
                  
              }
    }//GEN-LAST:event_ConvertirActionPerformed

    private void resultadoConversionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultadoConversionActionPerformed
        
    }//GEN-LAST:event_resultadoConversionActionPerformed

 
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConvertidorMoneda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> A;
    private javax.swing.JButton Convertir;
    private javax.swing.JComboBox<String> DE;
    private javax.swing.JButton btnSalir;
    private javax.swing.JTextField ingresarCantidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField resultadoConversion;
    // End of variables declaration//GEN-END:variables
}
