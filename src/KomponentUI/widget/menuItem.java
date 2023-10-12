/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package KomponentUI.widget;

import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;

/**
 *
 * @author LENOVO
 */
public class menuItem extends javax.swing.JPanel {

    /**
     * @return the subMenu
     */
    public ArrayList<menuItem> getSubMenu() {
        return subMenu;
    }

    /**
     * Creates new form menuItem
     */
    
    private final ArrayList<menuItem> subMenu =new ArrayList<>();
    private ActionListener act;
    public menuItem(Icon icon, boolean sdm, Icon iconSub, String menuItem, ActionListener act, menuItem... subMenu) {
        initComponents();
        
        lb_icon.setIcon(icon);
        lb_iconSub.setIcon(iconSub);
       lb_menuName.setText(menuItem);
       lb_iconSub.setVisible(sdm);
       
       if(act != null){
           this.act = act;
       }
       this.setSize(new Dimension(Integer.MAX_VALUE,45));
       this.setMaximumSize(new Dimension(Integer.MAX_VALUE,45));
       this.setMinimumSize(new Dimension(Integer.MAX_VALUE,45));
       for(int i = 0; i< subMenu.length; i++){
           this.subMenu.add(subMenu[i]);
           subMenu[i].setVisible(false);
           
       }
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_icon = new javax.swing.JLabel();
        lb_iconSub = new javax.swing.JLabel();
        lb_menuName = new javax.swing.JLabel();

        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        lb_menuName.setText("Menu Item");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_iconSub, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_menuName, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_menuName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_iconSub, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
private boolean showing = false;

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
    if(showing){
        hideMenu();
    }else{
        showMenu();
    }if(act != null){
        act.actionPerformed(null);
    }
    }//GEN-LAST:event_formMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lb_icon;
    private javax.swing.JLabel lb_iconSub;
    private javax.swing.JLabel lb_menuName;
    // End of variables declaration//GEN-END:variables

    private void showMenu() {
       new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = subMenu.size() - 1; i >=0; i--  ){
                  
                       sleep();
                        subMenu.get(i).setVisible(false);
                       
                  
                    
                }
                 showing =true;
                getParent().repaint();
                getParent().revalidate();
               
            }
        }).start();
    }

    private void hideMenu() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = subMenu.size() - 1; i >=0; i--  ){
                  
                       sleep();
                        subMenu.get(i).setVisible(false);
                        subMenu.get(i).hideMenu();
                  
                    
                }
                getParent().repaint();
                getParent().revalidate();
                showing =false;
            }
        }).start();
    }
private void sleep(){
        try {
            Thread.sleep(20);
        } catch (InterruptedException ex) {
            Logger.getLogger(menuItem.class.getName()).log(Level.SEVERE, null, ex);
        }
}
}


