package hackerrank.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

        /*
         * Complete the 'timeConversion' function below.
         *
         * Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
         *
         *Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
         *- 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
         *
         * The function is expected to return a STRING.
         * The function accepts STRING s as parameter.
         */
public class Q_010_TimeConversion {

        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter the time in hh:mm:ssAM/PM");
            String s = bufferedReader.readLine();

            String result = timeConversion(s);
            System.out.println("\nTime Conversion is " + result);

            bufferedReader.close();
        }

        public static String timeConversion(String time) {

            char ap = time.charAt(time.length() - 2);
            time = time.substring(0, time.length() - 2);

            if (ap == 'A') {
                String s = "";
                int hh = Integer.parseInt(time.substring(0, 2));
                if (hh == 12){
                    s = "00";
                }
                if (s.length() == 1) {
                    s = "0" + s;
                }
                return (s + time.substring(2, time.length()));
            } else {
                int hh = Integer.parseInt(time.substring(0, 2));
                String s = "";
                if (hh != 12){
                    hh += 12;
                    s = Integer.toString(hh);
                }
                if (s.length() == 1) {
                    s = "0" + s;
                }
                return (s + time.substring(2, time.length()));
            }

        }
}

