/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;


/**
 *
 * @author bgs
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println ("Hello world");
        Scanner keyboard = new Scanner(System.in);
        String s = keyboard.nextLine();
        System.out.println ("pong ---> " + s);
        System.out.println("sout");
        System.err.println("error");
        
    }
}
