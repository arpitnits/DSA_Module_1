public class Maths {

    //GCD
    public int bruteForceGCD(int a, int b) {

        //O(min(a,b))
        int x = Math.min(a,b);
        while(x>0) {
            if(a%x==0 && b%x==0) {
                break;
            }
            x--;
        }
        return x;
    }


    public int Euclid(int a ,int b) {

        //GCD(A,0) = A
        while(a>0 && b>0) {
            if(a>b) {
                a= a%b;
            } else {
                b = b % a;
            }
        }
        if(a==0)
            return b;
        else
            return a;
    }


    public void swap(int a, int b) {
        System.out.println("Before swap " +"a -> " + a + " b-> " + b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swap " +"a -> " + a + " b-> " + b);
    }


    //LCM
}
