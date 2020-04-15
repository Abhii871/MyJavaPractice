import java.sql.SQLOutput;
import java.util.SortedMap;

public class BarkingDog {

    public static boolean shouldWakeUp (boolean barking, int hourOfDay){

         if (barking){
             if ( hourOfDay <0 ||  hourOfDay>23) {
                 System.out.println("false");
             }
             else if ( hourOfDay <8 ||  hourOfDay>22) {
                System.out.println("Dog is barking");
                return true;
            }
            else {
                return  false;
            }
         }
    return false;
    }
}
