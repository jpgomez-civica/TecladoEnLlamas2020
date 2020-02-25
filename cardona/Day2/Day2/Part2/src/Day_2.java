package day_2;

import javax.swing.JOptionPane;

/**
 * @author María del Mar Cardona
 */
public class Day_2 {
    
    private final AccessFile af;
    private int ribbon;


    private void start() {
        String presentDimensions; Present present;
        while ((presentDimensions = af.nextLine()) != null) {
            present = new Present(presentDimensions.split("x"));
            ribbon += present.getSmallestPerimeter();
            ribbon += present.getCubicVolume();
        }
        showResult();
    }
    
    private void showResult() {
        String msg = "Ribbon required: "+ribbon;
        JOptionPane.showMessageDialog(null, msg);
    }
    
    public Day_2() {
        af = new AccessFile();
        this.ribbon = 0;
    }
    
    public static void main(String[] args) {
        (new Day_2()).start();
    }
}
