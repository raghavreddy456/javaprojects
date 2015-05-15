/*regular expression progrom for Indian Pan number 
ABCDS1234Y
*/

package regularexpression;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Raghavendra on 5/14/2015.
 */
public class panno {
        private static boolean isValidPAN(String s) {
        String regExp = "[A-Z]{5}(\\d){4}[A-Z]{1}";
        Pattern p = Pattern.compile(regExp);
        Matcher m = p.matcher(s);
        if (m.find( ))
        {
            return true;
        }
        else
        {
            return false;
        }

    }
    public static void main(String[] args) {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int i = Integer.parseInt(br.readLine());
            for (int j = 0; j < i; j++) {
                String s = br.readLine();
                System.out.println(isValidPAN(s) ? "YES" : "NO");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
