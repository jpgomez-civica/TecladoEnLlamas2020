
package day1;

/**
 * @author Maria del Mar Cardona Aranda
 */
public class Santa {
    
    /**
     * Santa's floor location
     */
    private int floor;
    /**
     * Santa's number of moves.
     */
    private int moves;
    /**
     * Santa's first time in basement.
     */
    private int basement;
    
    
    public Santa() {
        this.floor = 0;
        this.basement = 0;
        this.moves = 0;
    }
    
    public void move(char c) {
        switch(c) {
            case '(':
                floor++;
                break;
            case ')':
                floor--;
                break;
        }
        moves++;
    }
    
    public void checkBasement() {
        if ((basement == 0) && (floor == -1)) basement = moves;
    }
    
    public int getFloor() {
        return this.floor;
    }
    
    public int getBasement() {
        return this.basement;
    }
    
}
