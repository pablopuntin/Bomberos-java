
package com.mycompany.bomberos.igu;

import com.mycompany.bomberos.logica.ControladoraLogica;
import com.mycompany.bomberos.logica.Socio;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ConsultaSocio extends javax.swing.JFrame {

    
    
    //Creamos instancia de la controladora para la clase o el JFrame consultaScocio
     ControladoraLogica control = new ControladoraLogica();
    
    public ConsultaSocio() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaSocio = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("/home/pablo/Escritorio/images.png")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel2.setText("BOMBEROS VOLUNTARIOS LOS JURIES");

        tablaSocio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaSocio);

        btnEliminar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnVolver.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnVolver.setText("VOLVER");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 909, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(32, 32, 32))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        //Control de que la tabla no este vacia
        if(tablaSocio.getRowCount() > 0){
            //valido que se haya seleccionado un registro (-1 es el valor que trae el metodo si no hay filas selecciondad
            if (tablaSocio.getSelectedRow() != -1){
                //obtengo el id del socio que quiero eliminar
                //creo una variable para poner el id
                //traigo toda la fila con el metodo getSelectedRow y la columna de id que es la primera con el numero 0
                //hay que hacer casteo, traemos el id desde la tablaSocio que es un objeto, primero String
                //segundo parseo con Integer.parseInt
                int idSocio = Integer.parseInt(String.valueOf( tablaSocio.getValueAt(tablaSocio.getSelectedRow(),0 )));
                
                //pasamos id a la logica (idSocio)
                control.borarSocio(idSocio);
                mostrarMensaje("Registro borrado correctamente", "info", "Borrado exitoso");
                cargarTabla();
            
            }
            else{
                //Mostramos mensaje de que no se selecciono un registro para eliminar (segundo if)
                mostrarMensaje("No seleccione un registro para eliminar", "Error", "Error al eliminar");
            }
        
        }
        else {
            //mostramos msj en caso de que la table este vacia (primer if)
            mostrarMensaje ("la tabla esta vacia, no se puede eliminar el registro", "Error", "Error al eliminar");
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        cargarTabla();
        
    }//GEN-LAST:event_formWindowOpened

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        Principal prin = new Principal();
       prin.setVisible(true);
       prin.setLocationRelativeTo(null);
       this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        
            //Control de que la tabla no este vacia
        if(tablaSocio.getRowCount() > 0){
            //valido que se haya seleccionado un registro (-1 es el valor que trae el metodo si no hay filas selecciondad
            if (tablaSocio.getSelectedRow() != -1){
                    //Aca va el codigo para modificar el registro.
                     //obtengo el id del socio que quiero eliminar
                //creo una variable para poner el id
                //traigo toda la fila con el metodo getSelectedRow y la columna de id que es la primera con el numero 0
                //hay que hacer casteo, traemos el id desde la tablaSocio que es un objeto, primero String
                //segundo parseo con Integer.parseInt
                int idSocio = Integer.parseInt(String.valueOf( tablaSocio.getValueAt(tablaSocio.getSelectedRow(),0 )));
                
                //Creamos una instancia de la interfaz modificar socio
                ModifSocio modificar = new ModifSocio(idSocio);
                modificar.setVisible(true);
                modificar.setLocationRelativeTo(null);
                this.dispose();
                
            
            }
            else{
                //Mostramos mensaje de que no se selecciono un registro para eliminar (segundo if)
                mostrarMensaje("No seleccione un registro para modificar", "Error", "Error al modificar");
            }
        
        }
        else {
            //mostramos msj en caso de que la table este vacia (primer if)
            mostrarMensaje ("la tabla esta vacia, no se puede modificar el registro", "Error", "Error al modificar");
        }
    }//GEN-LAST:event_btnModificarActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaSocio;
    // End of variables declaration//GEN-END:variables

    
    //metodo para mostrar msj, sirve para todos los casos, recibe el msj (JOptionPane, tipo de msj, atc) y lo muestra, segun corresponda
    public void mostrarMensaje(String msj, String tipo, String titulo){
        
        JOptionPane optionPane = new JOptionPane (msj);
        
        if(tipo.equalsIgnoreCase("info")){
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
            
        } else if( tipo.equalsIgnoreCase("error")){
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
            
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }
    
    
    
    private void cargarTabla() {
        //codigo para que la tabla no sea editable
        DefaultTableModel modeloTabla = new DefaultTableModel (){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
            
        };
        //ponemos titulos a las columnas
        String titulos[]= {"Id", "Nombre", "Apelido", "Direccion", "DNI", "Cod Area", "Telefono" };
        
        //seteamos las columnas al modelo
        modeloTabla.setColumnIdentifiers(titulos);
        
        //asignamos el JTable (modeloSocio) al modelo que se estaba trabajando (modeloTabla)
        tablaSocio.setModel(modeloTabla);
        
        
        //Traer los socios desde la base de datos (la listaSocio tiene
        List <Socio> listaSocio= control.traerSocios();
        
        //Mostramos la lista que nos retorna la JPA controler (setear tabla)
        if (listaSocio !=null){
            for(Socio socio : listaSocio){
            
                Object[] object = {socio.getId(), socio.getNombre(), socio.getApellido(), 
                    socio.getDireccion(), socio.getDni(), socio.getCodigoArea(), socio.getTel()};
                
                modeloTabla.addRow(object);
            }
        }
       
        
        tablaSocio.setModel(modeloTabla);
        
    }
        
}



