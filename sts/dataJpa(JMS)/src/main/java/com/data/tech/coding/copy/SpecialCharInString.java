// Program to find out the special characters in the string.,
package com.data.tech.coding.copy;

public class SpecialCharInString
{
    public static void main(String[] args)
    {
        String s = "GreetLabs@123#";
            int count = 0;
            String withOutSpecialCh = "";
            for (int i=0; i< s.length(); i++)
            {
                if (!Character.isLetter(s.charAt(i)) && !Character.isDigit(s.charAt(i)) && !Character.isWhitespace(s.charAt(i)))
                {
                    count++;
                }
                else
                {
                    withOutSpecialCh = withOutSpecialCh + s.charAt(i);
                }
            }
        System.out.println("String after the special characters-> "+withOutSpecialCh);
        if(count == 0)
        {
            System.out.println("There are no special characters.,");
        }
        else
        {
            System.out.println(" Special characters are present in the given string-> "+ count);
        }
    }

}
