package day_2;

import javax.swing.JOptionPane;

/**
 * @author María del Mar Cardona
 */
public class Day_2 {
    
    private final AccessFile af;
    private int wrappingPaper;
    
    public Day_2() {
        af = new AccessFile();
        this.wrappingPaper = 0;
    }

    private void start() {
        String presentDimensions; Present present;
        while ((presentDimensions = af.nextLine()) != null) {
            present = new Present(presentDimensions.split("x"));
            this.wrappingPaper += present.getSurfaceArea();
            this.wrappingPaper += present.getAreaSmallestSize();
        }
        showResult();
    }
    
    private void showResult() {
        String msg = "Wrapping paper required: "+this.wrappingPaper;
        JOptionPane.showMessageDialog(null, msg);
    }
    
    public static void main(String[] args) {
        (new Day_2()).start();
    }
    
}
