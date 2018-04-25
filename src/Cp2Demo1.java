import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;
/**
 * 排序算法类的模板
 */
public class Cp2Demo1 {
    public static void sort(Comparable[] a){
    }
    public static boolean less(Comparable v,Comparable w){
        return v.compareTo(w) < 0;
    }
    private static void exch(Comparable[] a,int i, int j){
        Comparable t = a[i];a[i] = a[j];a[j] = t;
    }

    private  static void show(Comparable[] a){
        for(int i = 0; i < a.length;i++){
            StdOut.print(a[i] + " ");
        }
        StdOut.println();
    }


}