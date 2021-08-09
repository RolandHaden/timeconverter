/*
Title: Time_Converter
Created By: Davis Haden
Date Created: 9/10/2020
Last Date Modified: 9/14/2020
Description: This program can convert time to seconds and seconds to a total time format of (Hours : Minutes : Seconds)
*/
import java.util.Scanner;
public class timeconverter
{
   public static void main(String[] args)
   {
   //Standard Time Units
   int unitSecond = 60;
   int unitMinute = 60;
   int unitHour = 24;
   //Found units through Scanner
   int hourFound = 0;
   int minuteFound = 0;
   int secondFound = 0;
   //Loop
   boolean loop = true;
   //Asking for Mode
   Scanner mode = new Scanner(System.in);
   //Value Inputs
   Scanner input = new Scanner(System.in);
   //Creating a loop to turn it on just set loop to false
   while (loop == true){
     System.out.print("Would you like to start the time converter? (Y/N): ");
   String modeSet = mode.nextLine();
   //If you want to start the time converter
   if (modeSet.equals("Y")){
     System.out.println("");
     System.out.print("Would you like to convert to seconds or convert from seconds (TO/FROM): ");
      String secondSet = mode.nextLine();
      System.out.println("");
      //Using seconds to find time
      if(secondSet.equals("FROM")){
        System.out.println("Instructions \n~~~~~~~~~~~~~~~~ \nSubmit values and if you have zero just input zero.\n~~~~~~~~~~~~~~~~");
      System.out.print("Hours?: ");
      hourFound = input.nextInt(); //FINAL VARIABLE
      System.out.print("Minutes?: ");
      int hourMinute = input.nextInt(); //hour before the unit shows the final value it can add up to.
      System.out.print("Seconds?: ");
      int hourSecond = input.nextInt();
      //Looking for a greater value than its max
      if (hourMinute >= 60){
         hourFound = (hourMinute/60) + hourFound;
         hourMinute = hourMinute%60;
      }
      if (hourSecond >= 60){
         minuteFound = hourSecond/60;
         hourMinute = hourMinute + minuteFound;
         hourSecond = hourSecond%60;
         //Reupdate Values if Seconds excede
         if (hourMinute >= 60){
            hourFound = (hourMinute/60) + hourFound;
            hourMinute = hourMinute%60;
         }
      }
      System.out.print("Output: " + hourFound + " hours : ");
      System.out.print(hourMinute + " minutes : ");
      System.out.println(hourSecond + " seconds");
      System.out.println("~~~~~~~~~~~~~~~~");
      }
      //Using total time to find the number of total seconds
      if(secondSet.equals("TO")){
        System.out.println("Instructions \n~~~~~~~~~~~~~~~~ \nSubmit values and if you have zero just input zero.\n~~~~~~~~~~~~~~~~");
        System.out.print("Hours?: ");
        hourFound = input.nextInt();
        System.out.print("Minutes?: ");
        int hourMinute = input.nextInt();
        System.out.print("Seconds?: ");
        int hourSecond = input.nextInt();
        //Converting greater values to seconds
        hourSecond = hourSecond + ((hourFound*60)*60) + (hourMinute*60);
      
        System.out.println("Output: "+ hourSecond + " seconds");
        System.out.println("~~~~~~~~~~~~~~~~");
        }
      }
    //if you said no I guess
    if(modeSet.equals("N")){
      System.out.println("Silly, go restart the program and actually do the time converion.");
     }
   }
  }
}
