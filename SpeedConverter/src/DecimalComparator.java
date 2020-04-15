public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2){

       int a = (int) (number1/1000);
        int b = (int ) (number2/1000);
        System.out.println(a + " "+ b );
       if (a==b){
           return true;
       }else

        return false;

    }
}
