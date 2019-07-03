import java.util.Scanner;
import java.io.*;
import java.math.BigDecimal;
import java.util.Arrays;

public class Thing{

    int quantity;
    String name;
    double price;

    // public Item(){

    // }

    public static void main(String[] args){
        Product r = new Product();
        r.openFile();
        r.readFile();
        r.closeFile();

    }
}