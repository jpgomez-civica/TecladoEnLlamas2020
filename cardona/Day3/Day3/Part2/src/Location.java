package day_3;

/**
 *
 * @author María del Mar Cardona
 */
public class Location {

    /**
     * Location coordinates.
     */
    private int x, y;

    /**
     * Location constructor.
     */
    public Location() {
        this.x = 0;
        this.y = 0;
    }
    
    /**
     * Location constructor.
     * @param x
     * @param y
     */
    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(int direction) {
        switch ((char) direction) {
            case '^':
                moveNorth();
                break;
            case '>':
                moveEast();
                break;
            case 'v':
                moveSouth();
                break;
            case '<':
                moveWest();
                break;
        }
    }

    /**
     * Location moves *
     */
    private void moveNorth() {
        this.y--;
    }

    private void moveSouth() {
        this.y++;
    }

    private void moveEast() {
        this.x++;
    }

    private void moveWest() {
        this.x--;
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }

    @Override
    public Location clone() throws CloneNotSupportedException {  
        return new Location(x,y); 
    }  
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Location) {
            Location l = new Location(((Location) obj).x, ((Location) obj).y);
            return this.x == l.x && this.y == l.y;
        }
        return false;
    }

}
