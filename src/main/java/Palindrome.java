public class Palindrome {
    boolean isPalindrome(int num) {
        int reverse = num;
        int num2 = 0;
        while (num > 0) {
            num2 = num2 * 10 + num % 10;
            num /= 10;
        }
        if (reverse == num2) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindrome(121));
    }
}
