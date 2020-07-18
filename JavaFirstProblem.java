/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafirstproblem;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Urvi Sailor
 */
public class JavaFirstProblem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> Players=new ArrayList<>();
        //ArrayList<Integer> SecondPlayer=new ArrayList<>();
        int NoOfPlayers=0;
        int NoOfCoins=0;
        int[] coins=new int[100];
        LinkedList<Integer> queue=new LinkedList<>();
         //Total Number of Players
        System.out.println("Enter No of Players");
        NoOfPlayers=sc.nextInt();
         //Total Number Of coins
        System.out.println("Enter Number of Coins");
         NoOfCoins=sc.nextInt();
        int[] flag=new int[NoOfPlayers];
         List<Integer> list[]=new LinkedList[10];
        // list=new LinkedList<>[2]();
        //Dymically Define Flag State Flag state 4 is for Toggling the players
        for(int i=0;i<NoOfPlayers;i++)
        {
            flag[i]=4;
        }
        //Dynamically Creating ArrayList With Number Of players
        for(int j=0; j<NoOfPlayers; j++){ 
            list[j]= new LinkedList(); 
        }
        
        //Check for Multiple coins of Players
         if(NoOfCoins%NoOfPlayers==0)
         {
             //Adding Coins in linkedList
             System.out.println("Enter Coins-->");
             for(int i=0;i<NoOfCoins;i++)
             {
                 queue.add(sc.nextInt());
             }
             for(int i=0;i<NoOfCoins;i++)
             {
                    for(int l=0;l<NoOfPlayers;l++)
                    {
                         int p=l+1;
                           //Check If LinkedList is Empty or not
                        if(!queue.isEmpty())
                        {
                            //check for Max value from List
                        if(queue.getFirst()>queue.getLast())
                        {
                            System.out.println("\n"+p+" Player Picks "+queue.getFirst()+",now number of coin is");
                            //checking player state
                            if(flag[l]==4)
                            {
                                //Adding coins to players choice
                                list[l].add(queue.getFirst());
                                flag[l]=2;
                                queue.removeFirst();
                            }
                            for(int w=0;w<queue.size();w++)
                            {
                                System.out.print(queue.get(w)+"\t");
                            }
                        }
                        else{
                            System.out.println("\n"+p+" Player Picks "+queue.getLast()+",now number of coin is");
                            if(flag[l]==4)
                            {
                                list[l].add(queue.getLast());
                                flag[l]=2;
                                queue.removeLast();
                            }
                            if(!queue.isEmpty())
                            {
                            for(int w=0;w<queue.size();w++)
                            {
                                System.out.print(queue.get(w)+"\t");
                            }
                            }
                            else
                                System.out.print("Game Over");
                        }
                           for(int f=0;f<NoOfPlayers;f++)
                          {
                            flag[f]=4;
                          } 
                        }
                    }
             }
             
             int[] sum=new int[NoOfPlayers];             
         //sum of the players coin's choice
             for(int k=0;k<NoOfPlayers;k++)
             {           
                    for(int o=0;o<list[k].size();o++)
                    {
                        
                       sum[k]=sum[k]+list[k].get(o);                     
                    }
                                     
             }
                        
               //finding maximum Addition of the Number from the sum Array         
                int max=sum[0];
                int index=0;
                    for(int m=0;m<sum.length;m++)
                    {
                      if(max<sum[m])
                      {
                          max=sum[m];
                         index=m;
                      }
                    }
                    System.out.println("");
                    //Listing Out Player's Choices
                    for(int k=0;k<NoOfPlayers;k++)
                    {
                        int p=k+1;
                        System.out.println(p+" Player Choices: "+list[k]);                                          
                    }
                    
                    //Displaying Winner
                 System.out.print("Winner is "+(index+1) +" Player By"+max);
                            
             
         }
         else{
             System.out.println("Sorry,Coins can't Match multiple of the players!!");
         }
    }
    
}
