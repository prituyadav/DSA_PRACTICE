public class RotatedString {

    public static void main(String[] args) {
        String s="abc";
        String g="cda";

        System.out.println(rotateString(s, g));

    }

    public static boolean rotateString(String s, String goal) {
        return (s.length()==goal.length() && (s+s).contains(goal)); 

}
}