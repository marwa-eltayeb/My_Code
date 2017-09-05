package data.types;

import java.util.Scanner;


public class DataTypes {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        //1. Write a Java program to convert temperature from Fahrenheit to Celsius degree   (212)
        System.out.println("Input a degree in Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        
        double celsius =  (5 *(fahrenheit - 32)) / 9;
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
        
        
       
       //2. Write a Java program that reads a number in inches, converts it to meters (1000)
       //Note: One inch is 0.0254 meter.
       System.out.println("Input a value for inch: ");
       double inches = input.nextDouble();
       double meters = inches * 0.0254;
       System.out.println(inches + " inch is " + meters + " meters");
       
       
       //3. Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer (565)
       //one way
       System.out.println("Input an integer between 0 and 1000: ");
       int num, n, sum = 0;
       num = input.nextInt();
       while(num > 0)
       {
          n = num % 10;
          sum = sum + n;
          num = num / 10;
       }
       System.out.println("Sum of Digits:" + sum);
        
       
       //Second way
       
       System.out.println("Input an integer between 0 and 1000: ");
       int num_ = input.nextInt();
       int firstDigit = num_ % 10;
       int remainingNumber = num_ / 10;
       int SecondDigit = remainingNumber % 10;
       remainingNumber = remainingNumber / 10;
       int thirdDigit = remainingNumber % 10;

       int sum_ = thirdDigit + SecondDigit + firstDigit;

       System.out.println("The sum of all digits in " + num_ + " is " + sum_);
       
       
       
        //4. Write a Java program to convert minutes into a number of years and days. (3456789)
        
        //One Way
        System.out.println("Input the number of minutes: ");
        int minutes = input.nextInt();
       
        int year = minutes / 525600;
        int remainingMinutes = minutes % 525600;
        int day = remainingMinutes / 1440; //number of munites in a day = 60m * 24h= 1440

        System.out.println(minutes + " minutes is approximately " + year + " years and " + day + " days.");
        
        
       
        //Another Way
        double minutesInYear = 60 * 24 * 365;   //60m * 24h *365d
        System.out.print("Input the number of minutes: ");

        double min = input.nextDouble();

        long years = (long) (min / minutesInYear);
        int days = (int) (min / 60 / 24) % 365;

        System.out.println((int) min + " minutes is approximately " + years + " years and " + days + " days");
       
        
       
       //5. Write a Java program that prints the current time in GMT  (256)
        System.out.print("Input the time zone offset to GMT: ");
        long timeZoneChange = input.nextInt();
        
        // Obtain the total milliseconds since midnight, Jan 1, 1970
        long totalMilliseconds = System.currentTimeMillis();

        // Obtain the total seconds since midnight, Jan 1, 1970
        long totalSeconds = totalMilliseconds / 1000;

        // Compute the current second in the minute in the hour
        long currentSecond = totalSeconds % 60;

        // Obtain the total minutes
        long totalMinutes = totalSeconds / 60;

        // Compute the current minute in the hour
        long currentMinute = totalMinutes % 60;

        // Obtain the total hours
        long totalHours = totalMinutes / 60;

        // Compute the current hour
        long currentHour = ((totalHours + timeZoneChange) % 24);
        
       
        // Display results
        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);
        
       
       
       //6. Write a Java program to compute body mass index (BMI)  (weight>452,height>72)
        System.out.print("Input weight in pounds: ");
        double weight = input.nextDouble();

        System.out.print("Input height in inches: ");
        double inches_ = input.nextDouble();
        
        double BMI = weight * 0.45359237 / (inches_ * 0.0254 * inches_ * 0.0254);
        System.out.print("Body Mass Index is " + BMI+"\n");
        
       
       
       //7. Write a Java program to takes the user for a distance (in meters) and the time was taken (as three numbers: hours, minutes, seconds), and display the speed, in meters per second, kilometers per hour and miles per hour (hint: 1 mile = 1609 meters). 
       //Input distance in meters: 2500   Input hour: 5                                                                               
       //Input minutes: 56      Input seconds: 23                                                                                  
                                                                                             
       float timeSeconds;
       float mps,kph, mph;

       System.out.print("Input distance in meters: ");
       float distance = input.nextFloat();

       System.out.print("Input hour: ");
       float hr = input.nextFloat();

       System.out.print("Input minutes: ");
       float min_ = input.nextFloat();

       System.out.print("Input seconds: ");
       float sec = input.nextFloat();

       timeSeconds = (hr*3600) + (min_*60) + sec;
       mps = distance / timeSeconds;
       kph = ( distance/1000.0f ) / ( timeSeconds/3600.0f );
       mph = kph / 1.609f;

       System.out.println("Your speed in meters/second is "+mps);
       System.out.println("Your speed in km/h is "+kph);
       System.out.println("Your speed in miles/h is "+mph);
		
       input.close();
       
       
       
       //8. Write a Java program that reads a number and display the square, cube, and fourth power.  (15)
        System.out.print("Input the side length value: ");
        double val = input.nextDouble();

        System.out.printf("Square: %12.2f\n", val * val);
        System.out.printf("Cube: %14.2f\n", val * val * val);
        System.out.printf("Fourth power: %6.2f\n", Math.pow(val, 4));
       
        
       
       //9. Write a Java program that accepts two integers from the user and then prints the sum, the difference, the product, the average, the distance (the difference between integer), the maximum (the larger of the two integers), the minimum (smaller of the two integers).
       //Input 1st integer: 25   Input 2nd integer: 5                                                                                     
        System.out.print("Input 1st integer: ");
        int firstInt = input.nextInt();
        System.out.print("Input 2nd integer: ");
        int secondInt = input.nextInt();

        System.out.printf("Sum of two integers: %d%n", firstInt + secondInt);
        System.out.printf("Difference of two integers: %d%n", firstInt - secondInt);
        System.out.printf("Product of two integers: %d%n", firstInt * secondInt);
        System.out.printf("Average of two integers: %.2f%n", (double) (firstInt + secondInt) / 2);
        System.out.printf("Distance of two integers: %d%n", Math.abs(firstInt - secondInt));
        System.out.printf("Max integer: %d%n", Math.max(firstInt, secondInt));
        System.out.printf("Min integer: %d%n", Math.min(firstInt, secondInt));
       
       
       //10. Write a Java program to break an integer into a sequence of individual digits.  (123456)
        System.out.print("Input six non-negative digits: ");
        int inputNum = input.nextInt();
        int n1 = inputNum / 100000 % 10;
        int n2 = inputNum / 10000 % 10;
        int n3 = inputNum / 1000 % 10;
        int n4 = inputNum / 100 % 10;
        int n5 = inputNum / 10 % 10;
        int n6 = inputNum % 10;
        System.out.println(n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5 + " " + n6);
       
       
       
       
       //11.Write a Java Program tio reverse the number  (123456)
        System.out.print("Input the Number: ");
        int number = input.nextInt();
        while (number > 0) {
            System.out.print( number % 10);
            number = number / 10;
        }   
         
           
           
           
           
           
           
           
           
           
           
           
          
    }
    
     
}





        
        
        
        
        
        
 
       
       
       
       
    
    

