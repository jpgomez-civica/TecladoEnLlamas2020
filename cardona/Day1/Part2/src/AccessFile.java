package day1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author Maria del Mar Cardona
 */
public class AccessFile {
    
    private FileReader      fr;
    private BufferedReader  br;
    
    /**
     * Open file to read.
     */
    public AccessFile() {
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        int returnValue = jfc.showOpenDialog(null);
        jfc.setDialogTitle("Choose an input file");
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = jfc.getSelectedFile();
            try {
                this.fr = new FileReader(selectedFile);
                this.br = new BufferedReader(this.fr);
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(jfc, ex, "Open file error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    /**
     * Get next char.
     * @return ascii char.
     */
    public int nextChar() {
        try {
            return br.read();
        } catch (IOException ex) {
            Logger.getLogger(AccessFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }
    
    /**
     * Close file reader.
     */
    public void close() {
        try {
            this.fr.close();
        } catch (IOException ex) {
            Logger.getLogger(AccessFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
