/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasecondproblem;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Urvi Sailor
 */
public class JavaSecondProblem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc=new Scanner(System.in);
       
        System.out.println("Enter number of Test Cases:");
        //List of opposite Seats
        LinkedList<String> oppseatno_type=new LinkedList<>();
        int no_of_testcase=sc.nextInt();
        int[] seatno=new int[no_of_testcase];
        
        
        //Check For TestCase Range
        if(no_of_testcase>105 && no_of_testcase<1)
        {
            //if testcase is >105 and <1 then print below statement
            System.out.println("Enter correct test case between 1 to 105");    
        }
        else
        {
            //Enter seats
            for(int x=0;x<no_of_testcase;x++)
            {
                System.out.println("Enter Seat No: ");
                seatno[x]=sc.nextInt();
           
                
               
                // mod 12 because there are 12 seat in one compartment 
                int y=seatno[x]%12;
                int oppseat=0;
                //the as per the remainder we will get the opposite seat nunber and type
                //eg take seatno 20 then 20 mod 12 is 8 so lets go where x==8
                switch(y)
                {
                    //Switch Case will give Opposite Seat Number
                    case 0:
                        oppseat=seatno[x]-11;
                    oppseatno_type.add(oppseat+" WS");
                        break;
                        
                    case 1:
                        oppseat=seatno[x]+11;
                        oppseatno_type.add(oppseat+" WS");
                        break;
                        
                    case 2:
                         oppseat=seatno[x]+9;
                    oppseatno_type.add(oppseat+" MS");
                        break;
                        
                    case 3:
                        oppseat=seatno[x]+7;
                   oppseatno_type.add(oppseat+" AS");
                        break;
                        
                    case 4:
                        oppseat=seatno[x]+5;
                    oppseatno_type.add(oppseat+" AS");
                        break;
                        
                    case 5:
                        oppseat=seatno[x]+3;
                    oppseatno_type.add(oppseat+" MS");
                        break;
                        
                    case 6:
                        oppseat=seatno[x]+1;
                    
                    oppseatno_type.add(oppseat+" WS");
                        break;
                        
                    case 7:
                         oppseat=seatno[x]-1;
                    oppseatno_type.add(oppseat+" WS");
                        break;
                        
                    case 8:
                        oppseat=seatno[x]-3;
                    oppseatno_type.add(oppseat+" MS");
                        break;
                        
                    case 9:
                        oppseat=seatno[x]-5;
                    oppseatno_type.add(oppseat+" AS");
                        break;
                        
                    case 10:
                         oppseat=seatno[x]-7;
                    oppseatno_type.add(oppseat+" AS");
                        break;
                        
                    case 11:
                        oppseat=seatno[x]-9;
                    oppseatno_type.add(oppseat+" MS");
                        break;    
                }
            
            }
           //Getting the Lists of opposite seats
           for(int x=0;x<oppseatno_type.size();x++)
           {
               System.out.println(oppseatno_type.get(x));
           }
    }
    }
}
