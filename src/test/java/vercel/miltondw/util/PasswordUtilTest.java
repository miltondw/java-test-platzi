package vercel.miltondw.util;

import org.junit.Test;

import static org.junit.Assert.*;
import static vercel.miltondw.util.PasswordUtil.SecurityLevel.*;

public class PasswordUtilTest {

    @Test
    public void wak_when_has_less_than_8_letters() {
        assertEquals(WEAK,PasswordUtil.assessPassword("1234567"));
    }

    @Test
    public void wak_when_has_only_letters() {
        assertEquals(WEAK,PasswordUtil.assessPassword("abcdefgh"));
    }
    @Test
    public void medium_when_has_letters_and_numbers() {
        assertEquals(MEDIUM,PasswordUtil.assessPassword("abcde123"));
    }
    @Test
    public void strong_when_has_letters_numbers_and_symbols() {
        assertEquals(STRONG,PasswordUtil.assessPassword("abcde12!"));
    }
}