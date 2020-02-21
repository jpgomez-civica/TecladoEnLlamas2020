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
            santa.checkBasement();
        }
        showResult();
    }

    private void showResult() {
        String msg = "The position of the instruction in the input file\n"
                + "that makes Santa reach for first time the basement\n"
                + "at the building is "+santa.getBasement()+".";
        JOptionPane.showMessageDialog(null, msg);
    }

    public static void main(String[] args) {
        (new Day1()).start();
    }
    
}
