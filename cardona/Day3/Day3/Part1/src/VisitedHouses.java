package day_3;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author María del Mar Cardona
 */
public class VisitedHouses {
    
    private ArrayList<Location> houses;  
    
    public VisitedHouses() {
        this.houses = new ArrayList<>();
    }
    
    public void visitLocation(Location location) {
        try {
            if (!houses.contains(location.clone())) houses.add(location.clone());
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(VisitedHouses.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    public int getVisitedHouses() {
        return houses.size();
    }
    
}
