
/**
 * Write a description of class lab9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.util.Scanner;

public class lab9
{
    public static void main(String args[])
    {
        P1();
        P2();
    }
    static void P1()
    {
       String First = JOptionPane.showInputDialog("Enter your first name:");
        String Middle = JOptionPane.showInputDialog("Enter middle name.");
        String Last = JOptionPane.showInputDialog("Enter your last name");
        JOptionPane.showMessageDialog(null, "Hello "+First+" "+Middle+" "+Last); 
    }
    static void P2()
    {
        String sizeofarray = JOptionPane.showInputDialog("enter size of array");
        int num1 = Integer.parseInt(sizeofarray);
        Double [] TempArray = new Double [num1];
        //JOptionPane.showMessageDialog(null, "Enter elements of array");
        for(int i=0; i<num1; i++){
            JOptionPane.showInputDialog(null, "Enter elements of array");
            double TempArrayX[] = Double.parseDouble();
            System.out.println(TempArray[i]+" degrees farenheight");
            
        }
        
    }

}