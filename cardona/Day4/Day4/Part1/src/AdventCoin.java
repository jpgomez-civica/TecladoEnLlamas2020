package day_4_a;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author María del Mar Cardona
 */
public class AdventCoin {

    private final String secretKey;
    private int decimal;

    public AdventCoin(String secretKey) {
        this.secretKey = secretKey;
        this.decimal = 1;
    }

    public void mineAdventCoin() {
        String key = MD5(secretKey+""+decimal);
        while (!startsWith5zeroes(key)) {
            this.decimal++;
            key = MD5(secretKey+""+decimal);
        }
    }
    
    private boolean startsWith5zeroes(String key) {
        String first5numbers = key.substring(0, 5);
        return first5numbers.equals("00000");
    }
    
    public String MD5(String key) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(key.getBytes());
            byte[] digest = md.digest();
            return DatatypeConverter.printHexBinary(digest).toUpperCase();
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(AdventCoin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public int getDecimal() {
        return decimal;
    }
    
    public String getMD5Hash() {
        return MD5(secretKey+""+decimal);
    }
    
    public String getFullSecretKey() {
        return secretKey+decimal;
    }

}
