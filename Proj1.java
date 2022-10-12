/**
 * 5 assignments
 * Lab 8
 * Eric Robinson
 * (V1.0 10/9/22)
 * */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Proj1
{
    public static void main(String args[]) throws IOException
    {
        P1();//question 1
        P2();//question 2
        P3();//question 3
        P4();//question 4
        P5();//question 5
    }
   
    static void P1()
    {
        Scanner in = new Scanner(System.in);
        int seconds;
       
        System.out.println("Enter number of seconds");
        seconds = in.nextInt();
       
        int days = seconds/84600;
        int remainDays = seconds % 84600;
        int hours = remainDays / 3600;
        int remainHours = remainDays%3600;
        int minutes = remainHours/60;
        int secondsCalculated = remainHours%60;
       
        //System.out.println
        //("The time entered in hours minutes and seconds is");
        //System.out.println(hours+" hours");
        //System.out.println(minutes+ " minutes");
        //System.out.println(secondsCalculated+ " seconds");
       
        if (seconds >= 84600){
            System.out.println
            (seconds+ " seconds equals to " + days + " days " + hours +
            " hours " + minutes + " minutes " + secondsCalculated +
            " seconds");
        }
        else if(seconds >= 3600 && seconds <84600){
            System.out.println(seconds+ " seconds equals to " + hours +
            " hours " + minutes + " minutes " + secondsCalculated +
            " seconds");
        }
        else if(seconds >= 60 && seconds < 3600){
            System.out.println(seconds+" seconds equals "+minutes+" minutes "
            +secondsCalculated+" seconds");
        }
        else if(seconds < 60){
            System.out.println(seconds +" seconds is equal to seconds");
        }    
       
    }
   
    static void P2()
    {
        Scanner in = new Scanner(System.in);
        int size;
       
        System.out.println
        ("How many variables would you like to convert to celcius");
        size=in.nextInt();
        Double [] degreeArray = new Double [size]; //creates array the size of the users input
        System.out.println("Enter the elements of the array:");
       
        for(int i=0; i<size; i++)
        {
            degreeArray[i]=in.nextDouble();
            System.out.println(degreeArray[i]+" degrees farenheight");
        }
                       
        Double [] degreeArray2 = new Double [size]; //creates identical array but will be converted to celsius in the loop
       
        for(int i=0; i<size; i++)
        {
            Double celsius = (degreeArray[i] - 32)/1.8;
            degreeArray2[i]=celsius;
            System.out.println
            (degreeArray[i]+
            " degrees farenheight is "+celsius+" degrees celsius");
        }
       
        System.out.println("The sum is "+Sum(degreeArray)+" fahrenheit");
        System.out.println("The sum is "+Sum(degreeArray2)+" celsius");
       
        System.out.println("The sum of the array in celsius is "
        +Sum(degreeArray2));
        System.out.println
        ("The sum of the array in fahrenheit is "+Sum(degreeArray));
       
        System.out.println
        ("The average of the array in fahrenheit is "+Average(degreeArray));
        System.out.println
        ("The average of the array in celsius is "+Average(degreeArray2));
       
        System.out.println
        ("The variance of the array in fahrenheit is "+Variance(degreeArray));
        System.out.println
        ("The variance of the array in celsius is "+Variance(degreeArray2));
       
         System.out.println
        ("The standard deviation of the array in fahrenheit is "
        +StandardDeviation(degreeArray));
        System.out.println
        ("The standard deviation of the array in celsius is "
        +StandardDeviation(degreeArray2));
               
        System.out.println("The median in fahrenheit is "
        +Median(degreeArray,size));
        System.out.println("The median in celsius is "
        +Median(degreeArray2,size));
       
       
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
    static void P3() // same as p2() but formats to two decimal places
    {
        Scanner in = new Scanner(System.in);
        int size;
       
        System.out.println
        ("How many variables would you like to convert to celcius");
        size=in.nextInt();
        Double [] degreeArray = new Double [size];
        System.out.println("Enter the elements of the array:");
       
        for(int i=0; i<size; i++){
            degreeArray[i]=in.nextDouble();
            System.out.println(degreeArray[i]+" degrees farenheight");
        }
                       
        Double [] degreeArray2 = new Double [size]; //creates identical array but will be converted to celsius in the loop
       
        for(int i=0; i<size; i++)
        {
            Double celsius = (degreeArray[i] - 32)/1.8;
            degreeArray2[i]=celsius;
            System.out.println
            (degreeArray[i]+
            " degrees farenheight is "+celsius+" degrees celsius");
        }
       
        System.out.printf("The sum is: %.2f", Sum(degreeArray));
        System.out.print(" fahrenheit");
        System.out.println();
        System.out.printf("The sum is: %.2f", Sum(degreeArray2));
        System.out.print(" celsius");
        System.out.println();
       
        System.out.printf("The average is: %.2f", Average(degreeArray));
        System.out.print(" fahrenheit");
        System.out.println();
        System.out.printf("The average is: %.2f", Average(degreeArray2));
        System.out.print(" celsius");
        System.out.println();
       
        System.out.printf("The variance is: %.2f", Variance(degreeArray));
        System.out.print(" fahrenheit");
        System.out.println();
        System.out.printf("The varience is: %.2f", Variance(degreeArray2));
        System.out.print(" celsius");
        System.out.println();
       
        System.out.printf("The standard deviation is: %.2f", StandardDeviation(degreeArray));
        System.out.print(" fahrenheit");
        System.out.println();
        System.out.printf("The standard deviation is: %.2f", StandardDeviation(degreeArray2));
        System.out.print(" celsius");
        System.out.println();
       
        System.out.printf("The median is: %.2f", Median(degreeArray,size));
        System.out.print(" fahrenheit");
        System.out.println();
        System.out.printf("The median is: %.2f", Median(degreeArray2,size));
        System.out.print(" celsius");
        System.out.println();
       
    }
    static void P4()
    {
        Scanner in = new Scanner(System.in);  
        char [][] board = {{'.', '.', '.', '.', '.'},
                           {'.', '.', '*', '.', '.'},
                           {'.', '*', '*', '*', '.'},
                           {'.', '.', '*', '.', '.'},
                           {'.', '.', '.', '.', '.'}};
        System.out.println("Enter the number of generations:");
        int nGens = in.nextInt();
        System.out.println("Start State");
        PrintBoard(board);
        for (int i = 0; i < nGens; i++) {
            board = Iterate(board);
            PrintBoard(board);
        }
        System.out.println("End State");
    }
    static void P5() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("gameoflife.txt"));
            int rows = 0;
            int columns = 0;
            String str;
            List<String> lineList = new ArrayList<>(); //using list of strings to hold file lines after reading
            //looping thru file line by line 
            while ((str = br.readLine()) != null && str.length() != 0) {
                rows++; // getting size of board rows
                columns++; // getting size of board columns 
                lineList.add(str); // adding file line into list 
            }
            br.close(); // closing file 

            char[][] board = new char[rows][columns]; // creating 2D Array
            for (int i = 0; i < columns; i++) 
            {
                String currentLine = lineList.get(i);
                int idx = 0;
                for (int row = 0; row < currentLine.length(); row++) {
                    board[row][i] = currentLine.charAt(idx);
                    idx++;
                }
            }

            Scanner in = new Scanner(System.in);
            System.out.println("Enter the number of generations:");
            int nGens = in.nextInt();
            in.close(); // closing in 
            System.out.println("Start State");
            PrintBoard(board);
            for (int i = 0; i < nGens; i++) 
            {
                board = Iterate(board);
                PrintBoard(board);
            }
            System.out.println("End State");

        } catch (Exception e) {
            System.out.println("Exception Occured:" + e.getMessage());
        }
    }
    /**
     * Method to Iterate to next generation
     * 
     */
    static char [][] Iterate(char[][] board)
    {
        // Need to create a copy of the matrix board
        // Then need two loops simuluar to loops in Grid.jav
        // visit each i,j cell and check number of neighbors
        // Then follow the rules to place a '*' or '.' in cell i,j
        // After all iterations copy the temporary board back to the original board
        char copy[][] = board;
        int height = copy.length;
        int width = copy[0].length;
        for (int y = 0; y < height; y++) 
        {
            for (int x = 0; x < width; x++) 
            {
                int aliveNeighbors = FindNeighbors(copy, x, y);

                if (getState(copy, x, y) == 1) {
                    if (aliveNeighbors < 2) {
                        copy[x][y] = '.';
                    } else if (aliveNeighbors == 2 || aliveNeighbors == 3) {
                        copy[x][y] = '*';
                    } else if (aliveNeighbors > 3) {
                        copy[x][y] = '.';
                    }
                } else {
                    if (aliveNeighbors == 3) {
                        copy[x][y] = '*';
                    }
                }
            }
        }
        return copy;
    }

    /**
     * Method to display Life game board
     * 
     */
    static void PrintBoard(char [][] board)
    {
        System.out.println();
        int height = board.length;
        int width = board[0].length;
        for (int y = 0; y < height; y++) {
            String line = "|";
            for (int x = 0; x < width; x++) {
                line += board[x][y];
            }
            line += "|";
            System.out.println(line);
            
        }
    }
    
    static int FindNeighbors(char [][] board, int x, int y)
    {
        int neighbors = 0;
        neighbors += getState(board,x - 1, y - 1);
        //diagnol left down: move 1 space left on x axis and 1 down on y axis
        neighbors += getState(board,x, y - 1);
        // bottom: stay on current spot on x axis and 1 down on y axis
        neighbors += getState(board,x + 1, y - 1);
        //diagnol right down: move 1 space right on x axis 1 down on y axis

        neighbors += getState(board,x - 1, y);
        //Left: move left 1 on x axis stay on current y axis
        neighbors += getState(board,x + 1, y);
        //Right: move right 1 on x axis stay on current y axis

        neighbors += getState(board,x - 1, y + 1);
        //diagnol left up: move 1 space left on x axis 1 up on y axis
        neighbors += getState(board,x, y + 1);
        // top: stay on current spot on x axis and 1 up on y axis
        neighbors += getState(board,x + 1, y + 1);
        //diagnol right up: move 1 space right on x axis 1 up on y axis

        return neighbors;
    }

    public static int getState(char[][] board, int x, int y) 
    {
        int height = board.length;
        int width = board[0].length;
        int state = 0;
        if (x < 0 || x >= width) {
            return 0;
        }
        if (y < 0 || y >= height) {
            return 0;
        }
        if (board[x][y] == '*') {
            state = 1;
        }
        return state;
    }
}