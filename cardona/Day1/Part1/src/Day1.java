package day1;

import javax.swing.JOptionPane;

/**
 *
 * @author Maria del Mar Cardona
 */
public class Day1 {
        
    private final Santa santa;
    private final AccessFile af;
    
    private static final int END_OF_FILE = -1;
    
    public Day1() {
        this.af = new AccessFile();
        this.santa = new Santa();
    }
    
    private void start() {
        int movement;
        while ((movement = af.nextChar()) != END_OF_FILE) {
            santa.move((char) movement);
        }
        showResult();
    }

    private void showResult() {
        JOptionPane.showMessageDialog(null, "With the instructions set given Santa has ended at the floor "+santa.getFloor()+".");
    }

    public static void main(String[] args) {
        (new Day1()).start();
    }
    
}
