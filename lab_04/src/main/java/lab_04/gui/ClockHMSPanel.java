/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_04.gui;

/**
 *
 * @author AlibekovMurad5202
 */
public class ClockHMSPanel extends javax.swing.JPanel {
    public int id = -1;
    
    /**
     * Creates new form ClockHMSPanel
     */
    public ClockHMSPanel() {
        initComponents();
        time_label.setVisible(false);
        start_btn.setVisible(false);
        stop_btn.setVisible(false);
        pause_btn.setVisible(false);
        reset_btn.setVisible(false);
        alarm_btn.setVisible(false);
    }
    
    public ClockHMSPanel(int id, String initTime) {
        initComponents();
        this.id = id;
        time_label.setText(initTime);
    }
       
    public ClockHMSPanel(int id) {
        initComponents();
        this.id = id;
        
        System.out.println("Init id: " + id);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        h_cb = new javax.swing.JComboBox<>();
        m_cb = new javax.swing.JComboBox<>();
        s_cb = new javax.swing.JComboBox<>();
        alarm_btn = new javax.swing.JButton();
        start_btn = new javax.swing.JButton();
        time_label = new javax.swing.JLabel();
        stop_btn = new javax.swing.JButton();
        reset_btn = new javax.swing.JButton();
        pause_btn = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setPreferredSize(new java.awt.Dimension(455, 77));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        h_cb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        h_cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11" }));
        add(h_cb, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 43, 51, -1));

        m_cb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        m_cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        add(m_cb, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 43, 50, -1));

        s_cb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        s_cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        add(s_cb, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 43, 50, -1));

        alarm_btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        alarm_btn.setText("Set alarm!!!");
        alarm_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alarm_btnActionPerformed(evt);
            }
        });
        add(alarm_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 43, 262, -1));

        start_btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        start_btn.setText("Start");
        start_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                start_btnActionPerformed(evt);
            }
        });
        add(start_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 12, 128, -1));

        time_label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        time_label.setText("0:0:0");
        add(time_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 163, 25));

        stop_btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        stop_btn.setText("Stop");
        stop_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stop_btnActionPerformed(evt);
            }
        });
        add(stop_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 12, 128, -1));

        reset_btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        reset_btn.setText("Continue");
        reset_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_btnActionPerformed(evt);
            }
        });
        add(reset_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 43, 128, -1));

        pause_btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pause_btn.setText("Pause");
        pause_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pause_btnActionPerformed(evt);
            }
        });
        add(pause_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 12, 128, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void start_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_start_btnActionPerformed
        GUI_Controller.event(4, id, 0, 0, 0);
    }//GEN-LAST:event_start_btnActionPerformed

    private void stop_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stop_btnActionPerformed
        GUI_Controller.event(5, id, 0, 0, 0);
    }//GEN-LAST:event_stop_btnActionPerformed

    private void alarm_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alarm_btnActionPerformed
        GUI_Controller.event(3, id, getH(), getM(), getS());
    }//GEN-LAST:event_alarm_btnActionPerformed

    private void reset_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_btnActionPerformed
        GUI_Controller.event(7, id, 0, 0, 0);
    }//GEN-LAST:event_reset_btnActionPerformed

    private void pause_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pause_btnActionPerformed
        GUI_Controller.event(6, id, 0, 0, 0);
    }//GEN-LAST:event_pause_btnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alarm_btn;
    private javax.swing.JComboBox<String> h_cb;
    private javax.swing.JComboBox<String> m_cb;
    private javax.swing.JButton pause_btn;
    private javax.swing.JButton reset_btn;
    private javax.swing.JComboBox<String> s_cb;
    private javax.swing.JButton start_btn;
    private javax.swing.JButton stop_btn;
    private javax.swing.JLabel time_label;
    // End of variables declaration//GEN-END:variables

    public int getH() {
        return Integer.parseInt(h_cb.getSelectedItem().toString());
    }
    
    public int getM() {
        return Integer.parseInt(m_cb.getSelectedItem().toString());
    }
    
    public int getS() {
        return Integer.parseInt(s_cb.getSelectedItem().toString());
    }
    
    public void preparePanel(int h, int m, int s) {
        time_label.setVisible(true);
        time_label.setText(h + ":" + m + ":" + s);
        
        start_btn.setVisible(true);
        stop_btn.setVisible(true);
        pause_btn.setVisible(true);
        reset_btn.setVisible(true);
        alarm_btn.setVisible(true);
    }

    public void setText(String text) {
        time_label.setText(text);
    }
}