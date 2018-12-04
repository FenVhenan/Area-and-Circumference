/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feb1st;

import java.util.Scanner;

/**
 *
 * @author JCRAW4083
 */
public class Feb1st {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double radius,area,circ;
        int option=0;
        Scanner input = new Scanner(System.in);
        
        while(option != 3){
        
        //ask user to see if they want area or circumference
        System.out.printf("Please choose an option:\n");
        System.out.printf("1-Area\n");
        System.out.printf("2-Circumference\n");
        System.out.printf("3-Exit\n");
        option = input.nextInt();

        
        
        //If it is area\
        if (option == 1){
            //calculate the area
            area = getGood();
            //print the output
            printIt("Area",area);
        }
        //If it is circumference
        else if (option == 2){
            //calculate the circumefernce
            circ = getItDone();
            //print the output
            printIt("Circumference",circ);
        }
        }
        
    }
    public static void printIt(String placeHolder, double theThingToBePrinted){
        System.out.printf("%s of the circle is %.2f\n", placeHolder, theThingToBePrinted);
    }
    public static double getIt(){
        Scanner input = new Scanner(System.in);
        double radius;
        System.out.printf("Please enter a radius for the circle:\t");
        radius = input.nextDouble();
        
        return radius;
        
    }
    public static double getGood(){
        double area;
        double radius = getIt();
        area = radius*radius*3.14;
        
        return area;
        
    }
    public static double getItDone(){
        double circ;
        double radius = getIt();
        circ = 2*radius*3.14;
        
        return circ;
        
    }
    
}
