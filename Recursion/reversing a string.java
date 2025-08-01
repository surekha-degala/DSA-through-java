// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static String revstr(String str) {
        if (str.length() <=1) {
            return str;
        }
        return revstr(str.substring(1)) + str.charAt(0);
    }
    public static void main(String[] args) {
        String result = "suku";
        System.out.println(revstr(result));
    }
}
