package vercel.miltondw.util;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class DateUtilShould {
/*
    true All years divisible by 400 ARE Leap years (1600, 2000, 2400)
    false All years divisible by 100 but not by 400 are NOT leap years (1700, 1880, 1900),
    true All years divisible by 4 but not by 100 ARE 1eap years (1996, 2004, 2008),
    false All years not divisible by 4 are NOT Leap years (2017, 2018, 2019)
*/
    @Test
    public void true_when_year_is_divisible_by_400() {
        int[] years={1600, 2000, 2400};
        for (int year: years) {
            assertThat(DateUtil.isLeapYear(year),is(true));
        }
    }
    @Test
    public void false_when_year_is_divisible_by_100_not_by_400() {
        int[] years={1700, 1880, 1900};
        for (int year: years) {
            assertThat(DateUtil.isLeapYear(year),is(false));
        }
    }
    @Test
    public void true_when_year_is_divisible_by_4_not_by_100() {
        int[] years={1996, 2004, 2008};
        for (int year: years) {
            assertThat(DateUtil.isLeapYear(year),is(true));
        }
    }
    @Test
    public void false_when_year_is_not_divisible_by_4() {
        int[] years={2017, 2018, 2019};
        for (int year: years) {
            assertThat(DateUtil.isLeapYear(year),is(false));
        }
    }
}