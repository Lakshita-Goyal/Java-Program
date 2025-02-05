//import java.io.*;
//import java.util.Scanner;

public class reverse {
    public static void main(String[] args)
    {
        String str= "Star",nstr="";

        char ch;

        System.out.print("Original Words:");
        System.out.println("Star");

        for(int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            nstr=ch+nstr;

        }
        System.out.println("reversed word:"+nstr);
    }
}
