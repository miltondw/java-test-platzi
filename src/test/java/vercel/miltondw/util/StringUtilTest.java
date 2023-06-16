package vercel.miltondw.util;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {
    /*Test Repeat String Start*/
    @Test
    public void repeat_string_one() {Assert.assertEquals("hi",StringUtil.repeat("hi",1));}
    @Test
    public void repeat_string_multiple_times() {
        Assert.assertEquals("hihi",StringUtil.repeat("hi",2));
    }
    @Test
    public void repeat_string_zero_times() {
        Assert.assertEquals("",StringUtil.repeat("hi",0));
    }
    @Test(expected = IllegalArgumentException.class)
    public void repeat_string_negative_times() {
        StringUtil.repeat("hi",-1);
    }
    /*End*/
    /*Test Empty String Start*/
    @Test
    public void empty_string(){
        Assert.assertTrue(StringUtil.isEmpty(""));
    }
    @Test
    public void string_null(){
        Assert.assertTrue(StringUtil.isEmpty(null));
    }
    @Test
    public void string_space(){
        Assert.assertTrue(StringUtil.isEmpty("    "));
    }
    @Test
    public void string_not_empty(){
        Assert.assertFalse(StringUtil.isEmpty("a"));
    }
}