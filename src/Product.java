import java.util.Scanner;
import java.io.*;
import java.math.BigDecimal;
import java.util.Arrays;
//import com.sun.jndi.url.dns.dnsURLContext;

public class Product {
    // public static void main(String[] args){
    //     BigDecimal nm1 = new BigDecimal("123232.123231");
    //     System.out.println(nm1);
    // }

    private Scanner textFile;

    public void openFile(){
        try{
            textFile = new Scanner(new File("input1.txt"));
        }
        catch(Exception e){
            System.out.println("Could not find file");
        }
    }

    public void readFile(){
        while(textFile.hasNext()){
            String a = textFile.next();
            String b = textFile.next();
            String c = textFile.next();

            System.out.printf("%s %s %s\n", a,b,c);
        }
    }

    public void closeFile(){
        textFile.close();
    }
}