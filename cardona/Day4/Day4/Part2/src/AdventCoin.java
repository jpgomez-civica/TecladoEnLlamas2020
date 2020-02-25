package day_4_b;

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

    public void mineAdventCoin(int numberOfZeroes) {
        String key = MD5(secretKey+""+decimal);
        while (!startsWithNzeroes(key, numberOfZeroes)) {
            this.decimal++;
            key = MD5(secretKey+""+decimal);
        }
    }
    
    private boolean startsWithNzeroes(String key, int numberOfZeroes) {
        String first5numbers = key.substring(0, numberOfZeroes);
        String zeroes = "";
        for (int i = 0; i < numberOfZeroes; i++) {
            zeroes += "0";
        }
        return first5numbers.equals(zeroes);
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
