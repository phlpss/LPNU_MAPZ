package com.example.registrationsystem.util;

public class EmailUtil {

    private static EmailUtil instance;

    private EmailUtil() {
        // private constructor to prevent instantiation
    }

    public static EmailUtil getInstance() {
        if (instance == null) {
            synchronized (EmailUtil.class) {
                if (instance == null) {
                    instance = new EmailUtil();
                }
            }
        }
        return instance;
    }

    public void sendEmail(String to, String subject, String body) {
        // email sending logic
    }
}
