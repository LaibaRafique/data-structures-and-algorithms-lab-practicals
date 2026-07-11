
package countdigits;
public class CountDigits {
    public static void main(String[] args) {
        int num=5889324;
        int countDigits= digitCounter(num);
        System.out.println("Number of Digits: "+countDigits);
    }
    private static int digitCounter(int num){
        if(num==0){
            return 0;
        }
        else{
            return 1+digitCounter(num/10);
        }
    }
}
