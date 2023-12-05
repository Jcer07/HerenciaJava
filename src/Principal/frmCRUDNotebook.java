package Principal;

import Colecciones.ListadoEquipos;
import Entidades.Celular;
import Entidades.EquipoInformatico;
import Entidades.Notebook;
import java.awt.BorderLayout;
import java.util.UUID;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmCRUDNotebook extends javax.swing.JFrame {

    private static final DefaultTableModel modeloTable = new DefaultTableModel();

    /**
     * Creates new form frmCRUDNotebook
     */
    public frmCRUDNotebook() {
        initComponents();
        this.setLocationRelativeTo(null);
        crearModeloTabla();
        rBtnNotebook.setSelected(true);
        presentarPnlInicial();
    }
    
    private void presentarPnlInicial(){
        pnlFrmNotebook pnl = new pnlFrmNotebook();
        
        pnl.setSize(pnlContainerPanels.getWidth(), pnlContainerPanels.getHeight());
        pnl.setLocation(0, 0);
        
        pnlContainerPanels.removeAll();
        pnlContainerPanels.add(pnl, BorderLayout.CENTER);
        pnlContainerPanels.revalidate();
        pnlContainerPanels.repaint();
    }
    
    private void crearModeloTabla(){
        modeloTable.addColumn("Código");
        modeloTable.addColumn("Marca");
        modeloTable.addColumn("Modelo");
        modeloTable.addColumn("Precio");
        
        tblListadoNotebooks.setModel(modeloTable);
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
        pnlListado = new javax.swing.JPanel();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListadoNotebooks = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        pnlContainer = new javax.swing.JPanel();
        rBtnNotebook = new javax.swing.JRadioButton();
        rBtnCelular = new javax.swing.JRadioButton();
        pnlContainerPanels = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CRUD Equipos Informáticos");
        setResizable(false);

        pnlListado.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado"));

        btnEliminar.setText("Eliminar");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        tblListadoNotebooks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblListadoNotebooks);

        btnEditar.setText("Editar");
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlListadoLayout = new javax.swing.GroupLayout(pnlListado);
        pnlListado.setLayout(pnlListadoLayout);
        pnlListadoLayout.setHorizontalGroup(
            pnlListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 717, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlListadoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlListadoLayout.setVerticalGroup(
            pnlListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListadoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnEditar))
                .addContainerGap())
        );

        buttonGroup1.add(rBtnNotebook);
        rBtnNotebook.setText("Notebook");
        rBtnNotebook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rBtnNotebook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBtnNotebookActionPerformed(evt);
            }
        });

        buttonGroup1.add(rBtnCelular);
        rBtnCelular.setText("Celular");
        rBtnCelular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rBtnCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBtnCelularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlContainerPanelsLayout = new javax.swing.GroupLayout(pnlContainerPanels);
        pnlContainerPanels.setLayout(pnlContainerPanelsLayout);
        pnlContainerPanelsLayout.setHorizontalGroup(
            pnlContainerPanelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlContainerPanelsLayout.setVerticalGroup(
            pnlContainerPanelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 299, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlContainerLayout = new javax.swing.GroupLayout(pnlContainer);
        pnlContainer.setLayout(pnlContainerLayout);
        pnlContainerLayout.setHorizontalGroup(
            pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlContainerPanels, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlContainerLayout.createSequentialGroup()
                        .addComponent(rBtnNotebook, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rBtnCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlContainerLayout.setVerticalGroup(
            pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rBtnNotebook)
                    .addComponent(rBtnCelular))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlContainerPanels, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlListado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlListado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void presentarPnlNotebook(Notebook notebook){
        rBtnNotebook.setSelected(true);
        pnlFrmNotebook pnl = new pnlFrmNotebook();
        
        pnl.setSize(pnlContainerPanels.getWidth(), pnlContainerPanels.getHeight());
        pnl.setLocation(0, 0);
        
        pnlContainerPanels.removeAll();
        pnlContainerPanels.add(pnl, BorderLayout.CENTER);
        pnlContainerPanels.revalidate();
        pnlContainerPanels.repaint();
        pnl.mostrarNotebook(notebook);
    }
    
    private void presentarPnlCelular(Celular celular){
        rBtnCelular.setSelected(true);
        pnlFrmCelular pnl = new pnlFrmCelular();
        
        pnl.setSize(pnlContainerPanels.getWidth(), pnlContainerPanels.getHeight());
        pnl.setLocation(0, 0);
        
        pnlContainerPanels.removeAll();
        pnlContainerPanels.add(pnl, BorderLayout.CENTER);
        pnlContainerPanels.revalidate();
        pnlContainerPanels.repaint();
        pnl.mostrarCelular(celular);
    }
    
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int filaSelecionada = tblListadoNotebooks.getSelectedRow();
        
        if(filaSelecionada != -1){
            UUID codigoSeleccionado = UUID.fromString(tblListadoNotebooks.getValueAt(filaSelecionada, 0).toString());
            EquipoInformatico objBuscar = ListadoEquipos.buscarEquipoInformatico(codigoSeleccionado);
            
            if(objBuscar != null){
                if(objBuscar instanceof Notebook){
                    Notebook notebook = (Notebook) objBuscar;
                    presentarPnlNotebook(notebook);
                }
                
                if(objBuscar instanceof Celular){
                    Celular celular = (Celular) objBuscar;
                    presentarPnlCelular(celular);
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Selecciona una fila para editar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int filaSelecionada = tblListadoNotebooks.getSelectedRow();
        
        if(filaSelecionada != -1){
            UUID codigoSeleccionado = UUID.fromString(tblListadoNotebooks.getValueAt(filaSelecionada, 0).toString());
            
            ListadoEquipos.eliminarEquipoInformatico(codigoSeleccionado);
            modeloTable.removeRow(filaSelecionada);
            cargarListadoEnTable();
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Selecciona una fila para eliminar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    
    private void rBtnCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBtnCelularActionPerformed
        pnlFrmCelular pnl = new pnlFrmCelular();
        
        pnl.setSize(pnlContainerPanels.getWidth(), pnlContainerPanels.getHeight());
        pnl.setLocation(0, 0);
        
        pnlContainerPanels.removeAll();
        pnlContainerPanels.add(pnl, BorderLayout.CENTER);
        pnlContainerPanels.revalidate();
        pnlContainerPanels.repaint();
    }//GEN-LAST:event_rBtnCelularActionPerformed

    private void rBtnNotebookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBtnNotebookActionPerformed
        pnlFrmNotebook pnl = new pnlFrmNotebook();
        
        pnl.setSize(pnlContainerPanels.getWidth(), pnlContainerPanels.getHeight());
        pnl.setLocation(0, 0);
        
        pnlContainerPanels.removeAll();
        pnlContainerPanels.add(pnl, BorderLayout.CENTER);
        pnlContainerPanels.revalidate();
        pnlContainerPanels.repaint();
    }//GEN-LAST:event_rBtnNotebookActionPerformed

    
    public static void cargarListadoEnTable(){
        modeloTable.setRowCount(0);
        for (EquipoInformatico obj : ListadoEquipos.getList()) {
            Object[] fila = {
                    obj.getCodigo().toString(),
                    obj.getMarca(),
                    obj.getModelo(),
                    obj.getPrecio()
                };
            
            modeloTable.addRow(fila);
        }
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmCRUDNotebook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCRUDNotebook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCRUDNotebook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCRUDNotebook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new frmCRUDNotebook().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlContainer;
    private javax.swing.JPanel pnlContainerPanels;
    private javax.swing.JPanel pnlListado;
    private javax.swing.JRadioButton rBtnCelular;
    private javax.swing.JRadioButton rBtnNotebook;
    private static javax.swing.JTable tblListadoNotebooks;
    // End of variables declaration//GEN-END:variables
}
