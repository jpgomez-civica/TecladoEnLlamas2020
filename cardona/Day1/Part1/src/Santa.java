
package day1;

/**
 * @author Maria del Mar Cardona Aranda
 */
public class Santa {
    
    /**
     * Santa's floor location
     */
    private int floor;
    
    public Santa() {
        this.floor = 0;
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
    }
    
    public int getFloor() {
        return this.floor;
    }
}
