package xiaowen.sorts;

public class Recursion {

    //递归方法求阶乘   fact(n):  n=0,fact(0)=1;  n>0,fact(n)=n*fact(n-1);
    public static int fact(int n) {
        if (0 == n ) {
            return 1;
        }
        return n * fact(n - 1);

    }

    public int factorial(int n) {
        int p = 1;
        for (int x = 1; x <= n; x++) {
            p = p * x;
        }
        return p;
    }

    public static void main(String[] args) {

        System.out.println(Recursion.fact(3));

        Recursion r = new Recursion();
        System.out.println(r.factorial(5));
    }

}
