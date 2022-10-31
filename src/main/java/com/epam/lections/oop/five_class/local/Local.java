package com.epam.lections.oop.five_class.local;

public class Local {

    public static void main(String[] args) {
        String template = "Hello %s, you're our favorite client!";

        class Client {
            private String name;

            public Client(String name) {
                this.name = name;
            }

            public void greet() {
                System.out.println(String.format(template, name));
            }
        }

        Client client = new Client("Ivan");
        client.greet();
    }
}
