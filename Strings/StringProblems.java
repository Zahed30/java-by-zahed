public class StringProblems {
    public static void main(String[] args) {
        String word = "madam";
        String rev = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            rev += word.charAt(i);
        }

        if (word.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}

    

