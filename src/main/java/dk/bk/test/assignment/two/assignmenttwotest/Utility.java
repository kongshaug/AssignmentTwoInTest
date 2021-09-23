package dk.bk.test.assignment.two.assignmenttwotest;

public class Utility {

    public String reverseString(String text) {
        StringBuilder sb=new StringBuilder(text);
        sb.reverse();
        return sb.toString();

    }

    public String capitalizeString(String text) {
        return text.toUpperCase();
    }
    public String lowerString(String text) {
        return text.toLowerCase();
    }
}
