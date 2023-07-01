public class BitManipulation {

    int n;

    BitManipulation(int n) {
        this.n = n;
    }
    //n=5
    //101
    //get Ith Bit
    public int getIthIndexBit(int i) {
        if ( (n & (1<<i)) == 0)
            return 0;
        return 1;
    }

    //set Ith Bit
    public int setIthIndexBit(int i) {
        return ( n | (1<<i));
    }

    //clear Ith Bit
    public int clearIthIndexBit(int i) {
        return (n& ~(1<<i));
    }
}
