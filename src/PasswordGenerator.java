import java.util.Random;

public class PasswordGenerator {
    private String password;
    private byte passwordLenght;

    public PasswordGenerator(byte passwordLenght) {
        this.passwordLenght = passwordLenght;
    }
    public String generatePassword(){
        String arrpassword="1234567890abcderfstgehruitkhmjlpioöAUFNDGTEZSVFMHLOUPUÖILBMVBN";
        StringBuilder paswwordgenerator=new StringBuilder();
        Random r=new Random();
        for(int i=0; i<passwordLenght;i++ ){
            paswwordgenerator.append(arrpassword.charAt(r.nextInt(arrpassword.length())));
        }
        return paswwordgenerator.toString();
    }

    public static void main(String[] args) {
        PasswordGenerator pass=new PasswordGenerator((byte) 7);
        System.out.println(pass.generatePassword());
    }
}
