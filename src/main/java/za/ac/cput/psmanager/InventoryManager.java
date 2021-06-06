/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.psmanager;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

/**
 *
 * @author jodykearns
 */
public class InventoryManager extends JFrame implements ActionListener{
    private JFrame mainFrame;
    private JPanel panelNorth, panelWest,panelCenter;
    
    private JLabel lblPicture;
    
    private JLabel lblCompanyName;
    
    private JButton btnInventory;
    private JButton btnPersonnel;
    private JButton btnSchedule;
    private JButton btnCriminal;
    private JButton btnJailCell;
    
    private JPanel panelBlank1,panelBlank2,panelBlank3,panelBlank4,panelBlank5;
    
    private Font font1;
    
    
    Insets btnInsets = new Insets(5,5,5,5);
    

    public InventoryManager(){
        
        mainFrame = new JFrame("PS Manager");
        panelNorth = new JPanel();
        panelNorth.setBackground(new Color(27,78,164));
        panelWest = new JPanel();
        panelWest.setBackground(new Color(27,78,164));
        panelCenter = new JPanel();
        panelCenter.setBackground(Color.WHITE);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int height = screenSize.height * 2 / 3;
        int width = screenSize.width * 2 / 3;
        mainFrame.setPreferredSize(new Dimension(width, height));
        
        font1 = new Font("Impact", Font.PLAIN,40);
        
        lblPicture = new JLabel(new ImageIcon("SAPS Logo.png"),SwingConstants.LEFT);
        lblPicture.setPreferredSize(new Dimension(100,100));
        lblPicture.setOpaque(false);
        
        
        lblCompanyName = new JLabel("PS MANAGER     ");
        lblCompanyName.setFont(font1);
        lblCompanyName.setForeground(new Color(253,245,104));
        
        btnInventory = new JButton("INVENTORY");
        btnInventory.setForeground(Color.BLACK);
        btnInventory.setMargin(btnInsets);


        btnPersonnel = new JButton("PERSONNEL");
        btnPersonnel.setForeground(Color.BLACK);
        btnPersonnel.setMargin(btnInsets);
        
        btnSchedule = new JButton("SCHEDULE");
        btnSchedule.setForeground(Color.BLACK);
        btnSchedule.setMargin(btnInsets);

        btnCriminal = new JButton("CRIMINAL");
        btnCriminal.setForeground(Color.BLACK);
        btnCriminal.setMargin(btnInsets);

        btnJailCell = new JButton("JAIL CELL");
        btnJailCell.setForeground(Color.BLACK);
        btnJailCell.setMargin(btnInsets);
        
        panelBlank1 = new JPanel();
        panelBlank1.setBackground(new Color(27,78,164));
        panelBlank2 = new JPanel();
        panelBlank2.setBackground(new Color(27,78,164));
        panelBlank3 = new JPanel();
        panelBlank3.setBackground(new Color(27,78,164));
        panelBlank4 = new JPanel();
        panelBlank4.setBackground(new Color(27,78,164));
        panelBlank5 = new JPanel();
        panelBlank5.setBackground(new Color(27,78,164));
        
        
    }
    
    public void runInventoryManager(){
        
        panelNorth.setLayout(new GridLayout(1,2));
        panelWest.setLayout(new GridLayout(10, 1));
        panelCenter.setLayout(new GridLayout(6, 6));
        
        
        mainFrame.add(panelNorth, BorderLayout.NORTH);
        mainFrame.add(panelWest, BorderLayout.WEST);
        mainFrame.add(panelCenter, BorderLayout.CENTER);
        
        panelNorth.add(lblPicture);
        panelNorth.add(lblCompanyName);
        
        panelWest.add(panelBlank1);
        panelWest.add(btnInventory);
        panelWest.add(panelBlank2);
        panelWest.add(btnCriminal);
        panelWest.add(panelBlank3);
        panelWest.add(btnJailCell);
        panelWest.add(panelBlank4);
        panelWest.add(btnPersonnel);
        panelWest.add(panelBlank5);
        panelWest.add(btnSchedule);

        
        mainFrame.addWindowListener(new WindowAdapter(){
        @Override
        public void windowClosing(WindowEvent e){
            System.exit(0);
        }
    });
        
        mainFrame.pack();
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent click){
        
    } 
    
    
}
