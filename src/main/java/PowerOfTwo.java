public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
        return (n & (n-1))==0;

    }

    public static void main(String[] args) {
        PowerOfTwo pt = new PowerOfTwo();
        System.out.println(pt.isPowerOfTwo(5));
    }
}
