package org.launchcode.java.demos.java4python;

public class Message {

    public static String getMessage(String lang) {

        if (lang.equals("sp")) {
            return "Hola Mundo";
        } else if (lang.equals("fr")) {
            return "Bounjour le monde";
        } else {
            return "Hello world!";
        }
    }
}
