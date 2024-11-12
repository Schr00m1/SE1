/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package at.mci.clemens.task2;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Clemens
 */
public class MainTask2 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Set<Character> charsToMask = new HashSet<>();
        charsToMask.add('a');
        charsToMask.add('e');
        charsToMask.add('z');
       
        
        InputStream maskingStream = new MaskingInputStream(System.in, charsToMask);
         byte[] buffer = new byte[1024];  // Buffer to store user input

            System.out.println("Please type something (press Enter to finish):");

            // Read the data from System.in and apply the masking
            int bytesRead;
            try{
                while ((bytesRead = maskingStream.read(buffer)) != -1) {
                    // Convert the buffer to a string and print the result
                    System.out.print(new String(buffer, 0, bytesRead));  // Output the masked text
                    break;
                } 
           

            // Close the streams
            maskingStream.close();
            } catch (IOException e) {
                System.out.println(e);
       
        }
    }
}

