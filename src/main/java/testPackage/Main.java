package testPackage;

import java.util.ResourceBundle;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        var resourceBundle = ResourceBundle.getBundle("testPackage.testResourceBundle");
        System.out.println(resourceBundle.getString("testProperty"));
    }
}
