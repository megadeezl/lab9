
/**
 * Write a description of class lab9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileOutputStream;

public class lab9
{
    public static void main(String args[]) 
    {
        P1();
        P2();
        P3();
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
        /*
         * Need to get temperature from user in fahrenheit and convert
         * to celsius. Need to first get user input to name file they
         * want the array to go to see project 1 P2().
         */
        String fileName =JOptionPane.showInputDialog("Enter file name");
        File fileObject = new File(fileName);
        PrintWriter outFile = null;
        
        String sizeofarray = JOptionPane.showInputDialog("enter size of array");
       
        int num1 = Integer.parseInt(sizeofarray);
        Double [] TempArray = new Double [num1];
        //JOptionPane.showMessageDialog(null, "Enter elements of array");
        for(int i=0; i<num1; i++){
            int TempArrayX=0;
            TempArrayX=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter elements of array"));
           // double TempArrayX[] = Double.parseDouble();
            JOptionPane.showMessageDialog(null,""+ TempArrayX+" degrees farenheight");
            try{
                 outFile= new PrintWriter(new FileOutputStream(fileObject));
            }catch(FileNotFoundException e){
                
            }
        }
       
        Double [] TempArrayXCopy = new Double[num1];
        
        
        
        
    }
    static void P3()
    {
        
         int num1= Integer.parseInt(JOptionPane.showInputDialog("Enter a positive number"));
    }

}
