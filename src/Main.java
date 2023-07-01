public class Main {
    public static void main(String[] args) {

        Fibonacci fibonacci = new Fibonacci();

        //System.out.println(fibonacci.nthFibonacci(9));

        BitManipulation bitManipulation = new BitManipulation(5);
        System.out.println(bitManipulation.getIthIndexBit(2));
        System.out.println(bitManipulation.setIthIndexBit(2));
        System.out.println(bitManipulation.clearIthIndexBit(2));
    }
}