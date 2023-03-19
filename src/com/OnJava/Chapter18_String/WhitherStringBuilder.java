package com.OnJava.Chapter18_String;

public class WhitherStringBuilder {
    public String implicit(String[] fields) {
        String result = "";
        for (String field : fields) {
            result += field;
        }
        return result;
    }

    public String explicit(String[] fields) {
        StringBuilder sb = new StringBuilder();
        for (String field : fields) {
            sb.append(field);
        }
        return sb.toString();
    }

    public static void main(String[] args) {

    }
}
