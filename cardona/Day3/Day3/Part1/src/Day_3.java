package day_3;

import javax.swing.JOptionPane;


/**
 *
 * @author María del Mar Cardona
 */
public class Day_3 {

    private final Location santa;      
    private final VisitedHouses visitedHouses;
    private final AccessFile af;
   
    private void start() {
        int direction;
        visitedHouses.visitLocation(santa);
        while ( (direction = af.nextChar()) != AccessFile.END_OF_FILE) {
            santa.move(direction);
            visitedHouses.visitLocation(santa);
        }
        showOutput();
    }

    private void showOutput() {
        String msg = "Houses that have presents: "+visitedHouses.getVisitedHouses();
        JOptionPane.showMessageDialog(null, msg);
    }
    
    public Day_3() {
        this.santa = new Location();
        this.af = new AccessFile();
        this.visitedHouses = new VisitedHouses();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        (new Day_3()).start();
    }

}
