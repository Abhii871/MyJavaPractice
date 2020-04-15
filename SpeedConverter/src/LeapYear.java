public class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year != 0) {
            if (year >= 1 || year <= 9999) {
                if (year % 4 == 0) {
                    System.out.println("1");
                    if (year % 100 == 0) {
                        System.out.println("2");
                        if (year % 400 == 0) {
                            System.out.println("3");
                            return true;
                        }
                    } else {
                        return false;
                    }
                }
            } else {
                return false;
            }

        }
        else{
            return  false;
        }
        return false;
    }
}