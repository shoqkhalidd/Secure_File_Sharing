import java.net.*;
import java.io.*;

public class receiver {

    public receiver() throws IOException { 
        
        byte b[] = new byte[256];
        Socket sr = new Socket("localhost", 6777);

        InputStream is = sr.getInputStream();
        
        //create the first file to be decrypt
        FileOutputStream fr = new FileOutputStream("C:\\Users\\hp\\OneDrive\\Desktop\\IS\\EKey.txt");
        is.read(b, 0, b.length);
        fr.write(b, 0, b.length);
        fr.flush();
        
        //create the second file to be decrypt
        FileOutputStream fr2 = new FileOutputStream("C:\\Users\\hp\\OneDrive\\Desktop\\IS\\Efile.txt");
        is.read(b, 0, b.length);
        fr2.write(b, 0, b.length);
        fr2.flush();

        
        
        fr.close();
        fr2.close();
        is.close();
    }

    public static void main(String[] args) throws Exception {
        receiver r = new receiver();
    }
}
