
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author shoqkhalid
 */

public class RSA {
    static public void doGenkey(String user,String filepath)
	throws java.security.NoSuchAlgorithmException,
	       java.io.IOException
    {
	
	File currentDir = new File (".");
        String basePath = currentDir.getCanonicalPath();
	KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA");
	kpg.initialize(2048);
	KeyPair kp = kpg.generateKeyPair();
	try (FileOutputStream out = new FileOutputStream(new File(filepath+"/"+user+".key"))) {
		out.write(kp.getPrivate().getEncoded());
	    }

	try (FileOutputStream out = new FileOutputStream(new File(basePath+"/src/publickey/"+user+".pub"))) {
		out.write(kp.getPublic().getEncoded());
	    }

    }
    
    public static void main(String args[]) throws NoSuchAlgorithmException{
    
    }
}
