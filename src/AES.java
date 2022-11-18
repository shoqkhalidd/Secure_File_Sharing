import java.io.*;
import java.security.*;
import java.security.spec.*;
import javax.crypto.*;
import javax.crypto.spec.*;

public class AES {

    public static void main(String[] args) throws Exception {

    }

    public static String FileIncryption(SecretKey key, String plain_file_path) throws FileNotFoundException, NoSuchAlgorithmException, IOException, InvalidKeyException, InvalidKeySpecException, NoSuchPaddingException, InvalidParameterSpecException, IllegalBlockSizeException, BadPaddingException {

        FileInputStream inFile = new FileInputStream(plain_file_path);
        //Create encrypted file 
        FileOutputStream outFile = new FileOutputStream("C:\\Users\\hp\\OneDrive\\Desktop\\IS\\EncryptedFile.txt");

        SecretKey secKey = new SecretKeySpec(key.getEncoded(), "AES");
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, secKey);

        //file encryption
        byte[] input = new byte[64];
        int bytesRead;

        while ((bytesRead = inFile.read(input)) != -1) {
            byte[] output = cipher.update(input, 0, bytesRead);
            if (output != null) {
                outFile.write(output);
            }
        }

        byte[] output = cipher.doFinal();
        if (output != null) {
            outFile.write(output);
        }

        inFile.close();
        outFile.flush();
        outFile.close();

      
        return "C:\\Users\\hp\\OneDrive\\Desktop\\IS\\EncryptedFile.txt";
    }

    public static void FileDecryption(byte[] decryptedKey) throws FileNotFoundException, IOException, NoSuchAlgorithmException, IllegalBlockSizeException, InvalidKeyException, NoSuchPaddingException, InvalidAlgorithmParameterException, InvalidKeySpecException, BadPaddingException {

        // file decryption
        SecretKey secKey = new SecretKeySpec(decryptedKey, "AES");
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(Cipher.DECRYPT_MODE, secKey);
        
        FileInputStream fis = new FileInputStream("C:\\Users\\hp\\OneDrive\\Desktop\\IS\\EncryptedFile.txt");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\hp\\OneDrive\\Desktop\\IS\\decrypted.txt");
        
        byte[] in = new byte[64];
        int read;
        while ((read = fis.read(in)) != -1) {
            byte[] output = cipher.update(in, 0, read);
            if (output != null) {
                fos.write(output);
            }
        }

        byte[] output = cipher.doFinal();
        if (output != null) {
            fos.write(output);
        }
        fis.close();
        fos.flush();
        fos.close();
        
    }

    public static SecretKey generateKey(int n) throws NoSuchAlgorithmException {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(n);
        SecretKey key = keyGenerator.generateKey();
        return key;
    }
}
