import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegrexEx {
    public static void main(String[] args){
        int count=0;
        Pattern p = Pattern.compile("\\p{Upper}");
        Matcher m= p.matcher("https://127.0.0.1:3000/teSt/");
        while (m.find()){
            count++;
            System.out.println("Start "+m.start()+"________"+"End "+m.end()+"_________"+"Group "+m.group());
        }

        int count1=0;
        Pattern p1 = Pattern.compile("\\p{Lower}");
        Matcher m1= p1.matcher("https://127.0.0.1:3000/teSt/");
        while (m1.find()){
            count1++;
            System.out.println("Start "+m1.start()+"________"+"End "+m1.end()+"_________"+"Group "+m1.group());
        }
        int count2=0;
        Pattern p2 = Pattern.compile("\\p{Digit}");
        Matcher m2= p2.matcher("https://127.0.0.1:3000/teSt/");
        while (m2.find()){
            count2++;
            System.out.println("Start "+m2.start()+"________"+"End "+m2.end()+"_________"+"Group "+m2.group());
        }

        int count3=0;
        Pattern p3 = Pattern.compile("\\W");
        Matcher m3= p3.matcher("https://127.0.0.1:3000/teSt/");
        while (m3.find()){
            count3++;
            System.out.println("Start "+m3.start()+"________"+"End "+m3.end()+"_________"+"Group "+m3.group());
        }
        System.out.println("Total number of upper case alphabets="+count);
        System.out.println("Total number of upper case alphabets="+count1);
        System.out.println("Total number of Digits="+count2);
        System.out.println("Total number of Special Character="+count3);
    }
}
