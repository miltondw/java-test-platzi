package vercel.miltondw.util;

public class StringUtil {
    public static String repeat(String str,int repeat){
        if (repeat<0){
            throw new IllegalArgumentException("Negative times no allowed");
        }
        String res="";
        for (int i = 0; i < repeat; i++) {
            res+=str;
        }
        return res;
    }
    public static boolean isEmpty(String str) {
        if(str==null){
            return true;
        }
        if(str.trim()==""){
            return true;
        }
        return false;
    }
}
