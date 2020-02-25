package day_4_a;

import javax.swing.JOptionPane;

/**
 *
 * @author María del Mar Cardona
 */
public class Day_4_A {
    
    private final AdventCoin adventCoin;    
    private final String inputKey;
    
    private void start() {
       adventCoin.mineAdventCoin();
       showResult();
    }
    
    public Day_4_A() {
        this.inputKey = askSecretKey();
        this.adventCoin = new AdventCoin(inputKey);
    }
    
    private String askSecretKey() {
        String title = "Advent of Code - 2015";
        String msg = "Insert the secret key to mine an AdventCoin:";
        return JOptionPane.showInputDialog(null, msg, title, JOptionPane.DEFAULT_OPTION);
    }
    
    private void showResult() {
        String title = "Advent of Code - 2015";
        String msg = "The lowest positive number that generates a key\n"
                + "with 5 zeroes at the beginning is "+adventCoin.getDecimal()+".\n\n"
                + "The MD5 hash is "+adventCoin.getMD5Hash()+"\n"
                + "for the secret key "+adventCoin.getFullSecretKey()+".";
        JOptionPane.showMessageDialog(null, msg, title, JOptionPane.DEFAULT_OPTION);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        (new Day_4_A()).start();
    }
}
