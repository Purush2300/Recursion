public class Rec3 {
    public static void main(String[] args) {
        String s = "A man a plan, a canal: Panama";
        String cleaned = "";

        // Step 1: Clean the string (lowercase + keep letters and digits)
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
                if (ch >= 'A' && ch <= 'Z') {
                    cleaned += (char)(ch + 32);  // convert uppercase to lowercase
                } else {
                    cleaned += ch;
                }
            }
        }

        // Step 2: Check palindrome
        boolean isPalindrome = true;
        int n = cleaned.length();
        for (int i = 0; i < n / 2; i++) {
            if (cleaned.charAt(i) != cleaned.charAt(n - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Step 3: Output
        if (isPalindrome) {
            System.out.println("Palindrome sentence");
        } else {
            System.out.println("Not a palindrome sentence");
        }
    }
}