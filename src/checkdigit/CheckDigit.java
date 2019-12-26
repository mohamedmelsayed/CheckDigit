/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkdigit;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author MOH OSMAN
 */
public class CheckDigit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CheckDigit c = new CheckDigit();
        System.out.println(c.chechDigit("888000-0001"));
    }

    public String chechDigit(String NID) {
        String str = "";
        String str1 = "";
        String str2 = this.ExtractNumbers(NID);
        int sumOfOdd = 0;
        int sumOfEven = 0;
        int result=0;
        System.out.println("str2  :" + str2);
        if (str2.trim().length() == 10) {
//            String str3 = "";
//            int item = 0;
            ArrayList<Integer> nums = new ArrayList<>();

            nums.add(Integer.parseInt(String.valueOf(str2.charAt(0))));
            nums.add(Integer.parseInt(String.valueOf(str2.charAt(2))));
            nums.add(Integer.parseInt(String.valueOf(str2.charAt(4))));
            nums.add(Integer.parseInt(String.valueOf(str2.charAt(6))));
            nums.add(Integer.parseInt(String.valueOf(str2.charAt(8))));

            for (Iterator<Integer> iterator = nums.iterator(); iterator.hasNext();) {

                Integer next = iterator.next();
                sumOfOdd += next;
            }
            ArrayList<Integer> nums2 = new ArrayList<>();

            nums2.add(Integer.parseInt(String.valueOf(str2.charAt(1))));
            nums2.add(Integer.parseInt(String.valueOf(str2.charAt(3))));
            nums2.add(Integer.parseInt(String.valueOf(str2.charAt(5))));
            nums2.add(Integer.parseInt(String.valueOf(str2.charAt(7))));
            nums2.add(Integer.parseInt(String.valueOf(str2.charAt(9))));

            for (Iterator<Integer> iterator = nums2.iterator(); iterator.hasNext();) {

                Integer next = iterator.next();
                sumOfEven += next;
            }
            
            int oddM3=sumOfOdd*3;
            
            int oddM3plusEven=oddM3+sumOfEven;
            
            
            result=oddM3plusEven%10;
            
//            int count = nums.size();
//            int num = count - 1;
//            for (int i = 0; i <= num; i = i + 1) {
//                item = item + nums.get(i);
//            }
//            int num1 = count - 1;
//            for (int j = 0; j <= num1; j = j + 1) {
//                str3 = str3.concat(nums.get(j).toString());
//            }
//            int integer = Integer.parseInt(String.valueOf(str2.charAt(6)));
//            integer = integer + 1;
//            int num2 = integer * item;
//            String str4 = num2 + "";
//            int num3 = str4.length();
//            ArrayList<Integer> nums1 = new ArrayList<>();
//            int item1 = 0;
//            int num4 = num3 - 1;
//            for (int k = 0; k <= num4; k = k + 1) {
//                nums1.add(Integer.parseInt(String.valueOf(str4.charAt(k))));
//            }
//            int num5 = num3 - 1;
//            for (int l = 0; l <= num5; l = l + 1) {
//                item1 = item1 + nums1.get(l);
//            }
//            str = item1 + "";
//            int num6 = str.length();
//            System.out.println("num 6 :"+item1);
//            str1 = str.substring(num6 - 1, 1);
        }
        return result+"";
    }

    private String ExtractNumbers(String value) {
        String str = "";
        String str1 = value;
        int num = 0;
        int length = str1.length();
        while (num < length) {
            String chr = str1.substring(num, num + 1);
            try {
                if ((Integer.parseInt(chr) >= 0) && (Integer.parseInt(chr) <= 9)) {
                    str = str + chr;
                }
                num = num + 1;
            } catch (Exception ex) {
                System.out.println("" + ex);
                num = num + 1;

            }

        }
        return str;
    }

}
