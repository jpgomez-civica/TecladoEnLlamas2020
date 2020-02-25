package day_2;

import java.util.Arrays;

/**
 * @author María del Mar Cardona
 */
public class Present {
    
    private final int dimension[];

    public Present(String[] sides) {
        this.dimension = new int[3];
        for (int i = 0; i < sides.length; i++) {
            this.dimension[i] = Integer.parseInt(sides[i]);
        }
    }
    
    public int getSurfaceArea() {
        return (2*this.dimension[0]*this.dimension[1]) 
                + (2*this.dimension[1]*this.dimension[2]) 
                + (2*this.dimension[2]*this.dimension[0]);
    }
    
    
    public int getAreaSmallestSize() {
        int[] sorted = dimension;   // to not modify original dimension
        Arrays.sort(sorted);
        return sorted[0]*sorted[1];
    }
    
}
