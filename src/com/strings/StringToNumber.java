package com.strings;

public class StringToNumber {
    /*
         get string chars
         1234
         initialize result to 0
         new result = result * 10 + (x) % 10;
          1- > NR => 0 * 10 + 1 % 10. = 1
          2 -> NR ==> 1 * 10 + 2 % 10 = 10 + 2 = 12
          3 -> NR ==> 12 * 10 + 3 % 10 = 120 + 3 = 123
          4 -> NR ==> 123 * 10 + 4 % 10 = 1230 + 4 = 1234

          -7
          0*10 + -7 % 10 = 0 + -7 = -1

          0
          0*10 + 0 %10 = 0

          605
          0*10 + 6%10 = 6
          6 *10 + 0%10 = 60 + 0 = 60
          60*10 + 5%10 = 600+5 = 605

         integer over flow cases.
         res * 10 ==> overflow
         to handle it ; have prev result and reduce the calculated result in every iteration by res - (x%10) /10
         if reduced res != preres then return 0;

       */
    public static int stringToNumber(String str) {



        /*
        * return Integer.parseInt(str);
        * or
        *
        * Integer.valueOf(str);
        * catch (NumberFormatException NFE)
        * throw NFE;
         * */

        int result =0;
        int prevResult = 0;
        int sign = 1;
        int index = 0;

        if(str.length() == 0) return 0;
        str = str.trim();

        char firstChar = str.charAt(0);

        if(firstChar == '-'){
            sign *= -1;
            index++;
        }

        while(index < str.length()){
            int x = str.charAt(index) - '0';
            x *= sign;

            //  System.out.println(x);

            result = result * 10 + x % 10;
            if((result - (x % 10)) /10 != prevResult){
                return 0;
            }
            prevResult = result;

            index++;
        }


        return result;

    }
}