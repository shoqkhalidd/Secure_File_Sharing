

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;


public class RSA {
    
    //Generate public and private keys and for each user 
    
    static public void doGenkey(String user)
	throws java.security.NoSuchAlgorithmException,
	       java.io.IOException
    {
	
	KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA");
	kpg.initialize(2048);
	KeyPair kp = kpg.generateKeyPair();
        
	
                FileOutputStream out = new FileOutputStream(new File("C:\\Users\\hp\\OneDrive\\Desktop\\IS"+"\\prv\\"+user+".key")) ;
		out.write(kp.getPrivate().getEncoded());
                
                FileOutputStream out2= new FileOutputStream(new File("C:\\Users\\hp\\OneDrive\\Desktop\\IS"+"\\publickey\\"+user+".pub")) ;
		out2.write(kp.getPublic().getEncoded());
	
    }
    
    
    public static byte[] encrypt(SecretKey SecretKey, String publicKey) throws BadPaddingException, IllegalBlockSizeException, InvalidKeyException, NoSuchPaddingException, NoSuchAlgorithmException, IOException {
	
// method to encrypt AES key using RSA public key 
        
        PublicKey publicKeyy = getPublicKey(publicKey);
        
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
	cipher.init(Cipher.ENCRYPT_MODE,publicKeyy );
	
        return cipher.doFinal(SecretKey.getEncoded());
}
    
    //convert public key to bytes by using path 
    public static PublicKey getPublicKey(String path) throws IOException{
        PublicKey publicKey = null;
        byte[] keyBytes = Files.readAllBytes(Paths.get(path));

        try{
            X509EncodedKeySpec keySpec = new X509EncodedKeySpec(keyBytes);
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            publicKey = keyFactory.generatePublic(keySpec);
            return publicKey;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return publicKey;
    }
    
    
//    method to decrypt AES key using RSA private key 
    
    public static byte[] Decrypt(String encFile,String priKey) throws BadPaddingException, IllegalBlockSizeException, InvalidKeyException, NoSuchPaddingException, NoSuchAlgorithmException, IOException {
      
        Path p = Paths.get(encFile);
       byte[] encryptedFileBytes = Files.readAllBytes(p);
       
       PrivateKey PrivateKey = getPrivateKey(priKey);
       Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
       cipher.init(Cipher.DECRYPT_MODE,PrivateKey);
       
       return cipher.doFinal(encryptedFileBytes);
}
    //convert private key to bytes by using path 
    public static PrivateKey getPrivateKey(String path) throws IOException{
        PrivateKey PrivateKey = null;
        byte[] keyBytes = Files.readAllBytes(Paths.get(path));

        try{
            PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(keyBytes);
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            PrivateKey = keyFactory.generatePrivate(keySpec);
            return PrivateKey;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return PrivateKey;
    }
    
    
   public static void main(String [] args) throws BadPaddingException, IllegalBlockSizeException, InvalidKeyException, NoSuchPaddingException, NoSuchAlgorithmException, IOException {

   }
 }
