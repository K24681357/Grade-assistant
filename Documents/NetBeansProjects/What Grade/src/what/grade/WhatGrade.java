
package what.grade;

import java.util.Scanner;


    public class WhatGrade {
     public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
         double i=0;
     double resulta = 0;
     double resultb = 0;
     double result = 0;
     double answer = 0;
        
       while (i>=0){
            System.out.print("What assignment grade(%): ");
     double grade = Double.parseDouble(reader.nextLine());
     
     if(grade==0){
            break;
        }  
        System.out.print("What is the assignment weighting?: ");
        int weight = Integer.parseInt(reader.nextLine());
        
           System.out.print("What is the overall weight (0 if none): ");
           int m = Integer.parseInt(reader.nextLine());
        
         if (m ==0){
         resulta +=((grade/100)*weight);
         i++;
        }
          
        if( m >=i){
               resultb += grade/100 * weight/100 * m;
               i++;
           }
      result = resulta + resultb; 
      answer = 100 - result;
       }  System.out.println("You current marks total: " + result);
      
    
  
         if(result >=85){
                System.out.println("Your current grade is at High Distinction");
    }   
      else if (result <=75 && result >=84){
                System.out.println("Your curent grade is at Distinction");
    }else if (result <= 74 && result >=65){
                System.out.println("Your current grade is at Credit");
    }else if (result <=64 && result >=55){
                System.out.println("Your current grade is at Pass 1");
    }else if (result <=54 && result >=50){
                System.out.println("Your current grade is at Pass 2");
    }else 
              System.out.println("Your current grade is at a fail");
               System.out.println("You need " + answer + "marks to get a High Distinction");
     
     }
    }


         
         
    


      
       

     