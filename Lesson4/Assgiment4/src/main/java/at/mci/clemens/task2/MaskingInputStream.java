/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package at.mci.clemens.task2;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;

/**
 *
 * @author Clemens
 */
public class MaskingInputStream extends FilterInputStream {
    
    private final Set<Character> charactersToMask;
    
    /**
     *
     * @param in
     * @param charsToMask
     */
    public MaskingInputStream(InputStream in, Set<Character> charsToMask) {
        super(in);
        this.charactersToMask = charsToMask;
    }

    /**
     *
     * @return
     * @throws IOException
     */
    @Override
    public int read() throws IOException {
        int character = super.read();
        if(character == -1 || character == '\n' || character == '\r'){
            return character;
        }else if(this.charactersToMask.contains((char) character)){
            return 'c';
        }else{
            return '*';
        }
    }

    /**
     *
     * @param b
     * @return
     * @throws IOException
     */
    @Override
    public int read(byte[] b) throws IOException {
        //first read the byte array normally through the parent class
        int result = super.read(b);
        //if we have an output
        if (result != -1){
             // Mask the characters in the array
            for (int i = 0; i < result; i++) {
                // Check if the current byte should be masked
                char c = (char) b[i];
                c = Character.toLowerCase(c);
                if (charactersToMask.contains(c)) {
                    b[i] = '*';  
                } else if (b[i] == '\n' || b[i] == '\r') {
                    return i;  // Stop reading and return the result up to the Enter key
                }
            }
        }
        return result; // Return the number of bytes actually read
    }
    
}
