/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package boscoproj;
import java.security.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.*
;
/**
 *
 * @author BOSCO
 */
public class Boscoproj {

    /* @param args the command line arguments
     */
    
 public static void main (String[] args) throws ParseException{
   
   String name="Bosco";
   String age = "1989-12-15";
   boolean isMyage;
   
//   DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Date date = new Date();
//        System.out.println(dateFormat.format(date));
        //imestamp timestamp = new Timestamp(age);
        
        String dateString = "1989-12-15";
DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
Date date = dateFormat.parse(dateString);
long unixTime = (long)date.getTime()/1000;
System.out.println(unixTime);




// DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date_ = new Date();
        long unixTime_ = (long)date_.getTime()/1000;
        
        System.out.println(unixTime_);
        
        long diff = 0;
                diff = unixTime_ - unixTime;
                
        System.out.println(diff) ;
        
        
      LocalDate dateOfBirth = LocalDate.of(1989, Month.DECEMBER, 15);
     LocalDate currentDate = LocalDate.now();
     long diffInDays = ChronoUnit.DAYS.between(dateOfBirth, currentDate);
     long diffInMonths = ChronoUnit.MONTHS.between(dateOfBirth, currentDate);
     long diffInYears = ChronoUnit.YEARS.between(dateOfBirth, currentDate);
     
     
      System.out.println(diffInYears) ;
   
 } 
   
   
  ///Get current date
        

     
    
    
     
    
}
     
 
     
 
  
  

 
 


    
            


        

           
   

   
        
        
       
       
        
   


//Hello David
//Hello Emmy
//      public int calculateAddition(int age, int number){
//        int igiteranyo = age + number;
//        return igiteranyo;
//    }

