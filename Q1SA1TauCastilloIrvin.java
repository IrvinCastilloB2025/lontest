/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1sa1taucastilloirvin;
import java.util.Scanner;

/**
 *
 * @author TAU
 */
public class Q1SA1TauCastilloIrvin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double study = 0, watch = 0, play = 0, chores = 0, socialize = 0;
        double studyHrs = 0, watchHrs = 0, playHrs = 0, choresHrs = 0, socializeHrs = 0;
        double totalMood = 0, totalHrs = 0, HrsLimit = 0;
        String YorN = "";
        
        Scanner sc = new Scanner(System.in);
        String input = "";
        
        
        
        System.out.print("How does studying impact your mood? ");
        input = sc.nextLine();
        study = intnator(input);
        
        System.out.print("How does watching videos impact your mood? ");
        input = sc.nextLine();
        watch = intnator(input);
        
        System.out.print("How does playing games impact your mood? ");
        input = sc.nextLine();
        play = intnator(input);
        
        System.out.print("How does doing chores impact your mood? ");
        input = sc.nextLine();
        chores = intnator(input);
        
        System.out.print("How does socializing impact your mood? ");
        input = sc.nextLine();
        socialize = intnator(input);
        
        
        
        do{
            System.out.print("\nHow many hours will you study? ");
            input = sc.nextLine();
            studyHrs = intnator(input);
            
            System.out.print("How many hours will you watch? ");
            input = sc.nextLine();
            watchHrs = intnator(input);
        
            System.out.print("How many hours will you play games? ");
            input = sc.nextLine();
            playHrs = intnator(input);
        
            System.out.print("How many hours will you do chores? ");
            input = sc.nextLine();
            choresHrs = intnator(input);
        
            System.out.print("How many hours will you socialize? ");
            input = sc.nextLine();
            socializeHrs = intnator(input);
            
            totalMood = (study * studyHrs) + (watch * watchHrs) + (play * playHrs) +
                        (chores * choresHrs) + (socialize * socializeHrs);
            totalHrs = studyHrs + watchHrs + playHrs + choresHrs + socializeHrs;
            HrsLimit += totalHrs;
        
            
        
            System.out.printf("\nResulting mood score after %.2f hours: %.2f", totalHrs, totalMood);
            if (totalMood < 0){
                System.out.print("\nYour predicted mood is bad");
            }
            else if (totalMood >= 0)
            {
                if (totalMood < 20){
                    System.out.print("\nYour predicted mood is okay");
                }
                else{
                    System.out.print("\nYour predicted mood is good");
                }
            }
            
            
            
            if(HrsLimit > 24){
                break;
            }
            else {
                System.out.print("\n\nWill you continue the program (y/n)? ");
                YorN = sc.nextLine();
            }
        }while(YorN.equals("y"));
        
    }
    
    
    
    public static double intnator(String input)//turns string to itn
    {
        double intInput = Integer.valueOf(input);
        return intInput;
    }
    
}
