package feel; 

import java.util.Date; 
import feel.Feelings;  

public class Time implements Feelings{
 
 	@Override
    public void depict() {
        System.out.println("Время, прошедшее, с момента входа в пешеру: ", r, "миллисекунд");
    }

	public long mainn () {

	   Date date = new Date();
       long start = 0;
       long r = 0;

       start = date.getTime();

       while ( r > -1 ){
       Date date1 = new Date();
       r = date1.getTime() - start;
       return r;
       
   }
}

}