/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sensors;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import nwstcrpi.Factory;
import nwstcrpi.clsPreferences;




/**
 *
 * @author amartinez
 */
public class serverConnection extends javax.swing.JFrame {

    /**
     * Creates new form serverConnection
     */
    public serverConnection() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        txtFrequency = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDuration = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Frequency:");

        txtFrequency.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFrequency.setText("0");
        txtFrequency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFrequencyActionPerformed(evt);
            }
        });
        txtFrequency.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFrequencyKeyTyped(evt);
            }
        });

        jLabel2.setText("Duration (ms):");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Configuración acordada del server");

        txtDuration.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDuration.setText("0");
        txtDuration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDurationActionPerformed(evt);
            }
        });
        txtDuration.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDurationKeyTyped(evt);
            }
        });

        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFrequency, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(btnSave)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtFrequency, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnSave))
                .addContainerGap(106, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtDurationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDurationActionPerformed
      
    }//GEN-LAST:event_txtDurationActionPerformed

    public static void Preferences(){
   
       clsPreferences _preferences;
       
       Factory Factory;
       Factory = new Factory();
       
       _preferences = Factory.GetPreferences();
       
       
    }
    
    private void txtDurationKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDurationKeyTyped
        char c = evt.getKeyChar();
        
        if(!Character.isDigit(c))
        {
            evt.consume();
        }    
    }//GEN-LAST:event_txtDurationKeyTyped

    private void txtFrequencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFrequencyActionPerformed

    }//GEN-LAST:event_txtFrequencyActionPerformed

    private void txtFrequencyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFrequencyKeyTyped
       
        char c = evt.getKeyChar();
        
        if(!Character.isDigit(c))
        {
            evt.consume();
        }  
    }//GEN-LAST:event_txtFrequencyKeyTyped

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        
        try {
            //Con estas instrucciones se obtiene en memoria el contenido completo del fichero XML
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            //Elemento raíz
            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("root");
            doc.appendChild(rootElement);
            //Primer elemento
            Element elemento1 = doc.createElement("configuration");
            rootElement.appendChild(elemento1);
            //Hay métodos de la clase Document que permiten la creación de cada uno 
            //de los posibles tipos de nodos admitidos por XML como CreateElement o CreateAttribute
            //Se agrega un atributo al nodo frequency y su valor
            Attr attr = doc.createAttribute("id");
            attr.setValue("config");
            elemento1.setAttributeNode(attr);
            //Con frequency
            Element frequency = doc.createElement("frequency");
            frequency.setTextContent(txtFrequency.getText());
            rootElement.appendChild(frequency);
            //Con duration
            Element duration = doc.createElement("duration");
            duration.setTextContent(txtDuration.getText());
            rootElement.appendChild(duration);
            //Se escribe el contenido del XML en un archivo
            //Para realizar cualquiera de esas operaciones, es necesario crear previamente un 
            //transformador al que se le indique el documento y el destino que se le va a dar.
            //La clase Transformer para generará un archivo de texto con el contenido del XML.
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            //Construcción de la ruta

//            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu-MM-dd");
//            LocalDate localDate = LocalDate.now();
//
//            DateTimeFormatter dtt = DateTimeFormatter.ofPattern("HH-mm-ss");
//            LocalTime localTime = LocalTime.now();
//
//            String nombreArchivo = txtNombre.getText();
            String username = System.getProperty("user.name");
            String Ruta = "C:\\Users\\" + username + "\\results\\";
            String XML = "Reading_results.xml";
            String strRuta = Ruta + XML;
            StreamResult result = new StreamResult(new File(strRuta));

            transformer.transform(source, result);
            JOptionPane.showMessageDialog(null, "XML guardado en la ruta: " + strRuta, "Guardado", JOptionPane.INFORMATION_MESSAGE);
        }catch(ParserConfigurationException pce) {
            pce.printStackTrace();
        }catch(TransformerException tfe) {
       
//            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu-MM-dd");
//            LocalDate localDate = LocalDate.now();
//
//            DateTimeFormatter dtt = DateTimeFormatter.ofPattern("HH-mm-ss");
//            LocalTime localTime = LocalTime.now();
//            String nombreArchivo = txtNombre.getText();
            String XML = "Reading_results.xml";
            String username = System.getProperty("user.name");
            String Ruta = "C:\\Users\\" + username + "\\results\\";
            String strRuta = Ruta + XML;
            tfe.printStackTrace();
            
            int warning = JOptionPane.showConfirmDialog(null, "Error al guardar el XML, no existe la ruta. ¿Desea crear la ruta " + strRuta + " ?", null, JOptionPane.YES_NO_OPTION);
      
            if(warning == JOptionPane.YES_OPTION)
            {
                File directorio = new File(Ruta);
                directorio.mkdirs();
                File archivo = new File(Ruta,XML);

                try {
                    //Mismo codigo que en btnSave Action Performance
                    DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
                    DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

                    Document doc = docBuilder.newDocument();
                    Element rootElement = doc.createElement("root");
                    doc.appendChild(rootElement);

                    Element elemento1 = doc.createElement("configuration");
                    rootElement.appendChild(elemento1);

                    Attr attr = doc.createAttribute("id");
                    attr.setValue("config");
                    elemento1.setAttributeNode(attr);

                    Element frequency = doc.createElement("frequency");
                    frequency.setTextContent(txtFrequency.getText());
                    rootElement.appendChild(frequency);

                    Element duration = doc.createElement("duration");
                    duration.setTextContent(txtDuration.getText());
                    rootElement.appendChild(duration);

                    TransformerFactory transformerFactory = TransformerFactory.newInstance();
                    Transformer transformer = transformerFactory.newTransformer();
                    DOMSource source = new DOMSource(doc);
                    StreamResult result = new StreamResult(new File(strRuta));

                    transformer.transform(source, result);
                    JOptionPane.showMessageDialog(null, "XML guardado en la ruta: " + strRuta, "Guardado", JOptionPane.INFORMATION_MESSAGE);

                } catch (ParserConfigurationException ex) {
                    Logger.getLogger(serverConnection.class.getName()).log(Level.SEVERE, null, ex);
                } catch (TransformerConfigurationException ex) {
                    Logger.getLogger(serverConnection.class.getName()).log(Level.SEVERE, null, ex);
                } catch (TransformerException ex) {
                    Logger.getLogger(serverConnection.class.getName()).log(Level.SEVERE, null, ex);
                }     
            }  
        }
    }//GEN-LAST:event_btnSaveActionPerformed

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
            java.util.logging.Logger.getLogger(serverConnection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(serverConnection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(serverConnection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(serverConnection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new serverConnection().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtDuration;
    private javax.swing.JTextField txtFrequency;
    // End of variables declaration//GEN-END:variables
}
