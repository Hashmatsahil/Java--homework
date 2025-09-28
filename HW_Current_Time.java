
package hw_current_time;


public class HW_Current_Time {

   
    public static void main(String[] args) {
      long current_mili_seconds= System.currentTimeMillis();
      long total_seconds = current_mili_seconds/1000;
      long current_seconds = total_seconds%60;
      long total_minutes = total_seconds/60;
      long current_minutes = total_minutes%60;
      long total_hour = total_minutes/60;
      long current_hour = total_hour%24;
        System.out.println("current time is :");
        System.out.println(current_hour+":"+current_minutes+":"+current_seconds);
        
              
    }
    
}
