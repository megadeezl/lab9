
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
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class lab9
{
    public static void main(String args[]) 
    {
      //  P1();
        P2();
      //  P3();
    }
    static void P1()
    {
       String First = JOptionPane.showInputDialog("Enter your first name:");
        String Middle = JOptionPane.showInputDialog("Enter middle name.");
        String Last = JOptionPane.showInputDialog("Enter your last name");
        JOptionPane.showMessageDialog(null, "Hello "+First+" "+Middle+" "+Last); 
    }
    static Double Sum(Double i[]) //gets sum of array
    {
        Double sum=0.0;
       
        for(int j=0; j<i.length; j++)
        {
            sum+=i[j];
        }
       
        return sum;        
       
    }
    static Double Average(Double i[]) //adds all values in array then divides by size of array
    {
        Double average=0.0;
        Double sum=0.0;
        for(int j=0; j<i.length; j++)
        {
            sum+=i[j];
            average = sum/i.length;
        }
       
        return average;
    }
    static Double Variance(Double i[])
    {
        Double variance=0.0;
        Double mean=Average(i);
        Double sum=0.0;
        for(int j=0; j<i.length; j++)
        {
            variance=(i[j]-mean); //subtracts mean from every element in array
            variance=variance*variance;
            sum+=variance;
        }
        return sum/i.length; //sum means answer in this case not addition place holder 
    }
    static Double StandardDeviation(Double i[])
    {              
        return Math.sqrt(Variance(i));//sd=sqrt of variance so onnly need to return
    }
    static Double Median(Double i[], int n)
    {
        double m=0;
        Arrays.sort(i); //have to sort before finding middle

        if(n%2==1){
        m=i[((n+1)/2)-1];
        }
        else{
        m=(i[n/2-1]+i[n/2])/2;
        }
           
        return m;
    }

   static void P2() 
    {
        /*
         * Need to get temperature from user in fahrenheit and convert
         * to celsius. Need to first get user input to name file they
         * want the array to go to see project 1 P2().
         */

        try {
            String infileName =JOptionPane.showInputDialog("Enter input filename");
            BufferedReader br = new BufferedReader(new FileReader(infileName));
            String outfileName =JOptionPane.showInputDialog("Enter output filename");
            File fileObject = new File(outfileName);
            if (fileObject.createNewFile()) {
                System.out.println("File created: " + fileObject.getName());
            } else {
                System.out.println("File already exists.");
            }
            FileWriter myWriter = new FileWriter(outfileName);
            // reading the contents of the file line by line
            String str;
            int size = 0;
            List<String> lineList = new ArrayList<>(); //using list of strings to hold file lines after reading
            //looping thru file line by line 
            while ((str = br.readLine()) != null && str.length() != 0) {
                size++;
                lineList.add(str); // adding file line into list 
            }
            br.close(); 
            // done with user input file - closing file 

            Double [] degreeArray2 = new Double [size]; //creates identical array but will be converted to celsius in the loop
            for(int i=0; i<size; i++)
            {
                double value = Integer.parseInt(lineList.get(i));
                degreeArray2[i] = value;
                Double celsius = (degreeArray2[i] - 32)/1.8;
                degreeArray2[i]=celsius;
                myWriter.write(degreeArray2[i]+ " degrees farenheight is "+celsius+" degrees celsius\n");
            }
            myWriter.write(String.format("The sum is: %.2f\n", Sum(degreeArray2)));
            myWriter.write(String.format("The sum is: %.2f\n", Variance(degreeArray2)));
            myWriter.write(String.format("The sum is: %.2f\n", StandardDeviation(degreeArray2)));
            myWriter.write(String.format("The sum is: %.2f\n", Median(degreeArray2,size)));
            myWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exception Occured:" + e.getMessage());
        }
    }
}
