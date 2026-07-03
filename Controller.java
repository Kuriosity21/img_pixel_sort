/**Controller Class
 * Implements ActionListener
 * 
 * @since July 3, 2026
 * @author Kyle Stewart
 */

import java.awt.event.*;

public class Controller implements ActionListener {
    // variable declaration
    Model model; //the model

    /**Default Constructor
     * @param aModel the model
     */
    public Controller(Model aModel) {
        this.model = aModel;
    }
    
    /**runs when button is pressed, different depending which
     * @param e the action event object 
     */
    public void actionPerformed(ActionEvent e) {
        
    }
}