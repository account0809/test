package com.epam.lections.annotations;

import java.lang.reflect.Method;
import java.util.Arrays;
/*
    - override
    - deprecate + suppresswarning
    - author + book (params & without params)
    - reflection
 */
@SuppressWarnings("deprecation")
@Book
@Author(name = "", lastName = "")
public class AnnotationDemo {

    public static void main(String[] args) {
        AnnotationDemo annotationDemo = new AnnotationDemo();
        annotationDemo.methodWithAnnotation();
    }

    @Author(name = "Richard", lastName = "Garrot")
    public void methodWithAnnotation() {
        Arrays.asList(this.getClass().getMethods()).forEach(System.out::println);
        Method method = this.getClass().getMethods()[0];
        Arrays.asList(this.getClass().getAnnotations()).forEach(System.out::println);
    }

    @Test(description = "Test to verify login", ticketId = "PR1356")
    public void methodWithBookAnnotation() {
    }
}
