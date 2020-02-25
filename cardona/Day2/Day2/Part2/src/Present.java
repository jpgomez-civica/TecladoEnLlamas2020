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
        int[] sorted = dimension;      // to not modify the original dimension
        Arrays.sort(sorted);
        return sorted[0]*sorted[1];
    }
    
    public int getSmallestPerimeter() {
        int[] sorted = dimension;       // to not modify the original dimension
        Arrays.sort(sorted);
        return (2*sorted[0]) + (2*sorted[1]);
    }
    
    public int getCubicVolume() {
        return this.dimension[0]*this.dimension[1]*this.dimension[2];
    }
}
