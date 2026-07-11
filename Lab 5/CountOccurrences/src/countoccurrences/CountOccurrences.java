// Name: Muhammad Ahmer, Roll No:2022F-BSE-165
package countoccurrences;
public class CountOccurrences {
    public static void main(String[] args) {
        int[] A ={0,2,2,55,0,5,1,5,0,2};
        occurrences(A);
     }
    static void occurrences(int[] A) {
        int[] values=new int[A.length];
        int[] occurrences=new int[A.length];
        int count=0;

        for (int i=0;i<A.length;i++) {
            int value=A[i];
            int j;
            for (j=0;j<count;j++) {
                if (values[j]==value) {
                    occurrences[j]++;
                    break;
                }
            }
            if (j==count) {
                values[count]=value;
                occurrences[count]=1;
                count++;
            }
        }
        for (int i=0;i<count;i++) {
            System.out.print(values[i]+" "+occurrences[i]+" ");
            if (i<count-1) {
                System.out.print("; ");
            }
        }
    }
}

