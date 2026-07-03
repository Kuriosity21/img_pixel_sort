/**View Class
 * Extends JPanel
 * 
 * @since July 3, 2026
 * @author Kyle Stewart
 */

import javax.swing.*;
import javax.swing.filechooser.*;

import java.awt.*;
import java.io.*;
import java.util.Scanner;

public class View extends JPanel {
    /******************************
     *****VARIABLE DECLARATION*****
     ******************************/
    private Model model; // the model

    /*****************
     *****METHODS*****
     *****************/
    
    /**Default Constructor
     * @param aModel the model
     */
    public View(Model aModel) {
        super();

        // sets GUI
        this.model = aModel;
        this.model.setGUI(this);

        this.layoutView();
        this.registerControllers();
    }

    /** sets all component information and adds them to their respective panels */
    private void layoutView() {

        // screen 1
        
        // screen 2
       
        // screen 3
        this.panel1.setLayout(this.layout1);
        this.panel1.add(this.subPanel1);
        this.panel1.add(this.subPanel2);
        this.panel1.add(this.subPanel3);

        this.panel2.setLayout(this.layout2);
        this.panel2.add(this.subPanel4);
        this.panel2.add(this.subPanel5);
        this.panel2.add(this.subPanel6);

        this.panel3.setLayout(this.layout3);
        this.panel3.add(this.subPanel7);
        this.panel3.add(this.subPanel8);
        this.panel3.add(this.subPanel9);

        // add all to view
        this.add(this.screen1);
        this.add(this.screen2);
        this.add(this.screen3);

        // visibility
        this.screen1.setVisible(false);
        this.screen2.setVisible(false);
        this.screen3.setVisible(false);
    }
    
    /** allows buttons to work when pressed */
    private void registerControllers() {
        // menu and function buttons
        this.button.addActionListener(new Controller(this.model));
    }
        
    /** updates visuals */
    public void update() {
        // set all invisible in case of screen switch
        this.screen1.setVisible(false);
        this.screen2.setVisible(false);
        this.screen3.setVisible(false);

        // view 1
        if () {

        }
        // view 2
        else if () {

        }
        // view 3
        else if () {
            
        }
    }
}