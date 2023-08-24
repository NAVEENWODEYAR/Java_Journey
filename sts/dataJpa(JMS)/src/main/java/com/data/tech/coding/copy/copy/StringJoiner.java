// StringJoiner.,
package com.data.tech.coding.copy.copy;

public class StringJoiner
{
    public static void main(String[] args)
    {
        java.util.StringJoiner sj = new java.util.StringJoiner(",");
                                sj.add("A").add("B").add("C");
                        System.out.println(sj);
        java.util.StringJoiner sj1 = new java.util.StringJoiner(":","[","]");
                                sj1.add("1").add("A").add("2").add("B");
                     System.out.println("StringJoiner-> "+sj1);
                                sj.merge(sj1);
        System.out.println(sj);
    }
}
