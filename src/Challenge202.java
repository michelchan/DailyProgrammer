import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Michelle Chan, 109303129
 */
public class Challenge202 {

    public static void main (String [] args){
        System.out.println("Enter binary:");
        Scanner s = new Scanner(new BufferedInputStream(System.in));
        StringBuilder binary = new StringBuilder();
        while(s.hasNext()){
            binary.append(s.nextLine());

        }
        seperateBinary(binary);
    }

    public static void seperateBinary(StringBuilder string){
        List<String> array = new ArrayList<String>();
        while (string.length() > 8){
            array.add(string.substring(0, 8));
            string.delete(0,8);
        }
        array.add(string.substring(0,string.length()));
        for (int i = 0; i<array.size();i++){
            char c = printChar(array.get(i));
            System.out.print(c);
        }
    }

    public static char printChar(String s){
        int total = 0;
        for (int i = 0; i<s.length(); i++){
//            total += (Integer.valueOf(s.charAt(s.length()- 1 -i)) * ((int)Math.pow(2,i)));
            total += (Character.getNumericValue(s.charAt(s.length()- 1 -i))) * ((int)Math.pow(2,i));
        }
        return (char)total;
    }
}
