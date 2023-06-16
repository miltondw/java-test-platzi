package vercel.miltondw.util;

public class DateUtil {
    /*
    All years divisible by 400 ARE Leap years (1600, 2000, 2400)
    All years divisible by 100 but not by 400 are NOT leap years (1700, 1880, 1900),
    All years divisible by 4 but not by 100 ARE 1eap years (1996, 2004, 2008),
    All years not divisible by 4 are NOT Leap years (2017, 2018, 2019)*/
    public static boolean isLeapYear(int year){
        if(
                year % 100 == 0 && year % 400 !=0
                        || year % 4 !=0
        ){
            return false;
        }
        if (
            year % 400 == 0
            || year % 4 == 0 && year % 100 !=0
        ){
            return true;
        }else{
            return false;
        }


    }
}
