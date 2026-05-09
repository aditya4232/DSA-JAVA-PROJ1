public class binarytodecimal {
    public static int binarytodecimal(int binNum){
        int pow = 0;
        int decNum = 0;
        int original = binNum;

        while (binNum > 0){
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;
        }
        System.out.println("decimal of " + original + " = " + decNum);
        return decNum;
    }

    public static void main(String[] args){
        binarytodecimal(1011);
    }
}

