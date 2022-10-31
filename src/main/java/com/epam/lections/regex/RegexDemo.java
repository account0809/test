package com.epam.lections.regex;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.CASE_INSENSITIVE;

public class RegexDemo {

    public static void main(String[] args) {
//        firstExample();
        //splitExample();
//        matcherExample();
        javaExample();
    }

    public static void firstExample() {
        Pattern pattern = Pattern.compile("[abc]");
        Pattern patternWithFlag = Pattern.compile("[abc]");
        // flag
        //System.out.println(pattern.flags());

        System.out.println(patternWithFlag.matcher("abc").find());
        System.out.println(patternWithFlag.matcher("ABC").find());

//        Pattern patternUnion = Pattern.compile("[a-c[m-o]]");
//        System.out.println(patternUnion.matcher("abc").find());
//
//        Pattern patternRange = Pattern.compile("[a-cm-o]");
//        System.out.println(patternRange.matcher("amno").find());
//
//        Pattern patternIntersection = Pattern.compile("[a-z&&[def]]");
//        System.out.println(patternIntersection.matcher("abc").find());
    }

    public static void splitExample() {
        String text = "Apple Banana Orange Plum";
        Pattern pattern = Pattern.compile("\\s+");

        Arrays.asList(pattern.split(text)).forEach(System.out::println);
        //Arrays.asList(pattern.split(text, 3)).forEach(System.out::println);
    }

    public static void matcherExample() {
        String text = "fish cut cat dog cought bbb";

        Pattern pattern = Pattern.compile("cat");
        //Pattern pattern = Pattern.compile("\\w*a\\w*");
        //Pattern pattern = Pattern.compile("c.+t");

        Matcher matcher = pattern.matcher(text);
        //Matcher matcher = pattern.matcher(text);
        System.out.println("Is found = " + matcher.find());
        System.out.println("Group = " + matcher.group());
        System.out.println("Start = " + matcher.start());
        System.out.println("End = " + matcher.end());
        System.out.println(matcher.replaceAll("tiger"));
    }

    private static void  javaExample() {
        Pattern p = Pattern.compile("J(\\w*)", Pattern.CASE_INSENSITIVE);
        String text = "Java is fun; JavaScript is funny.; JFunny ; just";

        Matcher m = p.matcher(text);

        while (m.find()) {
            System.out.printf("Found %s at position %d-%d", m.group(), m.start(), m.end());
//            System.out.printf("\n (1):%s\n", m.group(1));
            System.out.printf("\n (1):%s\n (2):%s\n", m.group(1), m.group(2));
        }
    }
}