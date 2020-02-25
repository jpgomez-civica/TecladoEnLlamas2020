package day_3;

/**
 *
 * @author María del Mar Cardona
 */
public class ActiveCharacter {
    
    private final Location santa;
    private final Location robot;
    private Turn turn;
    
    public ActiveCharacter() {
        this.turn = Turn.SANTA;
        this.santa = new Location();
        this.robot = new Location();
    }
    
    public void changeTurn() {
        if (turn == Turn.SANTA) {
            turn = Turn.ROBOT;
        } else {
            turn = Turn.SANTA;
        }
    }
    
    public Location getActiveCharacter() {
        if (turn == Turn.SANTA) {
            return santa;
        } else {
            return robot;
        }
    }
    
    public void move(int direction) {
        if (turn == Turn.SANTA) {
            santa.move(direction);
        } else {
            robot.move(direction);
        }
    }
    
}
