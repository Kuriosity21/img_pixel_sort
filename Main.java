/**Main Class
 * Runs the program
 * @since July 3, 2026
 * @author Kyle Stewart
 */

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // variable declaration
        JFrame frame = new JFrame("Image Pixel Sorter");
        Model model = new Model();
        View view = new View(model);
    }
}