public class SpeedConverter {
    // write your code here
    public static long toMilesPerHour(double kiloMetersPerHour){
        if (kiloMetersPerHour <0){
            return -1;
        }
        long milesPerHour= Math.round(kiloMetersPerHour/1.609);
        return milesPerHour;

    }
    public static void printConversion(double kilometersPerHour){
        if (kilometersPerHour<0){
            System.out.println("Invalid Value");
        }else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }

    }
    public static void printMegaBytesAndKilobytes (int kiloBytes){
        if (kiloBytes <0){
            System.out.println("Invalid input");
        }else {
            int megaBytes = kiloBytes/1024;
            int kilo = kiloBytes % 1024;

            System.out.println(kiloBytes+" KB = "+ megaBytes +" MB and "+ kilo +" KB ");
        }


    }
}