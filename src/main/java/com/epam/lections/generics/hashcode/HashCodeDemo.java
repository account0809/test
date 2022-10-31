package com.epam.lections.generics.hashcode;

public class HashCodeDemo {

    public static void main(String[] args) {
        String a = "200";
        String b = "200";

        if(a.equals(b)){
            System.out.printf("Equal objects:\n%d\n%d\n", a.hashCode(), b.hashCode());
        }

        String c = "10";
        String d = "50";

        if(!c.equals(d)){
            System.out.printf("Un-equal objects:\n%d\n%d\n", c.hashCode(), d.hashCode());
        }
    }
}
