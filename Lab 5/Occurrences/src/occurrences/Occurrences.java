// Name: Laiba Rafiq, Roll No:2022F-BSE-064
package occurrences;
public class Occurrences {
    public static void main(String[] args) {
        int[] A={3,45,12,0,12,1,0,45,3,3};
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
            System.out.println(values[i]+" "+occurrences[i]);
        }
    }
}

