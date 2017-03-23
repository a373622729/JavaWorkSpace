import java.util.Arrays;

/**
 * Created by ios on 17/3/21.
 */
public class Test {
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);

        int[] a = {1,2,3,5,8,10};
        int[] b = {10,8,5,3,2,0};
        Arrays.sort(a);
        Arrays.sort(b);
        boolean find = false;
        int starta=0, enda = 0;
        for (int i = 0; i < a.length; i++) {
            int k = i;
            for (int j = 0; j < b.length; j++) {
                if (a[k] == b[j]) {
                    starta = i;
                    while (k < a.length && j < b.length && a[k++] == b[j++])
                        ;
                    find = true;
                    enda = k - 1;
                    break;
                }
            }
            if (find) break;
        }
        int length = enda - starta + 1;
        int[] res = new int[length];
        System.arraycopy(a, starta, res, 0, length);
        System.out.println(Arrays.toString(res));
    }
}
