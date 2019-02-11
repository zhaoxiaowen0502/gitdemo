package xiaowen.sorts;

public class Recursion {
    public static int f(int x) {
        if (0 == x) {
            return 1;
        }
        return x * f(x - 1);
    }

    public int jiecheng(int n){
        int s=1;
        for(int x=1;x<=n;x++){
            s=s*x;
        }
        return s;
    }

    public static void main(String[] args) {
        Recursion r=new Recursion();
        System.out.println(Recursion.f(5));
        System.out.println(r.jiecheng(5));
    }

}
