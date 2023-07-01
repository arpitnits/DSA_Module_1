public class Fibonacci {

    public int nthFibonacci(int n) {
        int a=0, b=1, c;
        //O(n)
        //O(1)
        for(int i=2;i<=n;i++) {
            c=a+b;
            a=b;
            b=c;
        }
        return b;
    }
}
