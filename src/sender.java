import java.io.*;
import java.net.*;
import java.util.ArrayList;

/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
/**
 *
 * @author reema
 */
public class sender {

    public static void main(String[] args) throws Exception {
        
    }
    public static void Send(String Key_path , String File_path) throws FileNotFoundException, IOException{
        
        ServerSocket s = new ServerSocket(6777);
        Socket sr = s.accept();
        byte b[] = new byte[256];

        //path of the first file to be sent 
        FileInputStream fr = new FileInputStream(Key_path);
        fr.read(b, 0, b.length);
        OutputStream os = sr.getOutputStream();
        os.write(b, 0, b.length);
        os.flush();

        //path of the second file to be sent
        FileInputStream fr2 = new FileInputStream(File_path);
        fr2.read(b, 0, b.length);
        os.write(b, 0, b.length);
        os.flush();

        fr.close();
        fr2.close();
        os.close();
    }
}
