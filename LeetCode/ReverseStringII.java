public class ReverseStringII {
    public static void main(String[] args) {
        // 557. Reverse Words in a String III
       
        // Example 1:      
        // Input: s = "Let's take LeetCode contest"
        // Output: "s'teL ekat edoCteeL tsetnoc"
        // Example 2:
        // Input: s = "God Ding"
        // Output: "doG gniD"

        String s="Let's take LeetCode contest";

        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        String[] words = s.split(" ");
      StringBuilder result = new StringBuilder();
      
      for (String word : words) {
          result.append(new StringBuilder(word).reverse()).append(" ");
      }
      
      return result.toString().trim();
  }
}
