package com.programming;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MessageDemonstration {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String message = "Hello <<name>> , we have your full name as <<fullname>> in our system" + " Your contact number is " +
                "91-**********." + " Please let us know in case of any clarification , Thank you BridgeLabz 01/01/2016. ";

        System.out.println("Enter your first name: ");
        String firstName = scanner.next();

        System.out.println("Enter your last name: ");
        String lastName = scanner.next();

        System.out.println("Enter your mobile number: ");
        String mobileNumber = scanner.next();

        String REGEX1 = "<<name>>";
        String REGEX2 = "<<fullname>>";
        String REGEX3 = "<<**********>>";

        String replaceFirstName = firstName;
        String replaceFullName = firstName+ " " + lastName;
        String replacePhoneNumber = mobileNumber;

        Pattern p1 = Pattern.compile(REGEX1);
        Pattern p2 = Pattern.compile(REGEX2);
        Pattern p3 = Pattern.compile(REGEX3);

        Matcher m1 = p1.matcher(message);
        message = m1.replaceAll(replaceFirstName);


        Matcher m2 = p2.matcher(message);
        message = m2.replaceAll(replaceFullName);


        Matcher m3 = p3.matcher(message);
        message = m3.replaceAll(replacePhoneNumber);


    }
}
