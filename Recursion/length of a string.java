
class Main {
    public static int lenstr(String str) {
        if (str.equals("")) {
            return 0;
        }
        return lenstr(str.substring(1))+1;
    }
    public static void main(String[] args) {
        String str = "suku";
        System.out.println(lenstr(str));
    }
}
