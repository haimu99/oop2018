package week2.task1;

public class Task1 {

    public static int gcd(int a, int b) {
        // TODO: Tính ước chung lớn nhất của 2 số a, b
        a=Math.abs(a);
        b=Math.abs(b);
        if (a==0) return b;
        else if (b==0) return a;
        while (a!=b){
            if (a>b) a=a-b;
            else b=b-a;
        }
        return a;
    }

    public static int fibonacci(int n) {
        // TODO: Tìm số fibonacci ở vị trí n
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
    public static void main(String[] args) {
        int a=3,b=9;
        System.out.println(gcd(a,b));
        
        int n=0;
       
        System.out.println(fibonacci(n));
    }
}
