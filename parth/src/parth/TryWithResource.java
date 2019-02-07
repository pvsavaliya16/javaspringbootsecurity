package parth;

import java.io.FileInputStream;

class TryWithResource {

    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("TryWithResource.txt")) { //usually resource means stream or JDBC connection
            int character = fis.read();
            while (character != -1) {	//read() returns -1 when no character is found
                System.out.print((char) character);
                character = fis.read();
            }
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        } finally {
            System.out.println("Exception caught");
        }
    }
} 
