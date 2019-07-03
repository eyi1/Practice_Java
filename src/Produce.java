import java.util.Scanner;
import java.util.*;
import java.io.*;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.ArrayList;

public class Produce {
     int quantity;
     String name;
     double price;


    public Produce(int q, String n, double p){
        this.quantity = q;
        this.name = n;
        this.price = p;
    }

    public String toString(){//overriding the toString() method  
        return quantity+" "+name+" "+price;  
       }  

     public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("input1.txt"));
        //input.useDelimiter("-|\n");
        
        Produce[] items = new Produce[0];
        ArrayList<Produce> newList = new ArrayList<Produce>(Arrays.asList(items));

        while(input.hasNext()) {
            int quantity = input.nextInt();
            String name = input.next();
            double price = input.nextDouble();
            
            
            Produce newItem = new Produce (quantity, name, price);
            // System.out.println(newItem.quantity);
            // System.out.println(newItem.name);
            // System.out.println(newItem.price);
            System.out.println(newList.add(newItem));
            // System.out.println(newList);
            // System.out.printf("%s %s %s\n", quantity, name, price);
            System.out.println(newItem);
        }
        
        input.close();
    
        // for (Produce product : products) {
        //     System.out.println(product);
        // }
        
    }
    
}