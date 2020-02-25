package day_3;

import javax.swing.JOptionPane;


/**
 *
 * @author María del Mar Cardona
 */
public class Day_3 {

    private final ActiveCharacter activeCharacter;
    private final VisitedHouses visitedHouses;
    private final AccessFile af;
    
    public Day_3() {
        this.af = new AccessFile();
        this.visitedHouses = new VisitedHouses();
        this.activeCharacter = new ActiveCharacter();
    }
   
    private void start() {
        int direction; 
        visitedHouses.visitLocation(activeCharacter);
        while ( (direction = af.nextChar()) != AccessFile.END_OF_FILE) {
            activeCharacter.move(direction);
            visitedHouses.visitLocation(activeCharacter);
            activeCharacter.changeTurn();
        }
        showOutput();
    }
    
    private void showOutput() {
        String msg = "Houses that have presents: "+visitedHouses.getVisitedHouses();
        JOptionPane.showMessageDialog(null, msg);
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        (new Day_3()).start();
    }

}
