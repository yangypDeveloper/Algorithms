//import edu.princeton.cs.algs4.StdDraw;
//import edu.pri
///**
// * 排序算法类的模板
// */
//public class Cp2Demo1 {
//    public static void sort(Comparble[] a){
//    }
//    public static void boolean less(Comparable v,Comparable w){
//        return v.compareTo(w) < 0;
//    }
//    private static void exch(Comparable[] a,int i, int j){
//        Comparable t = a[i];a[i] = a[j];a[j] = t;
//    }
//
//    private  static void show(Comparable[] a){
//        for(int i = 0; i < a.length;i++){
//            Stdout.print(a[i] + " ");
//        }
//        StdOut.println();
//    }
//
//
//}


import edu.princeton.cs.algs4.StdDraw;

public class Cp2Demo1 {
    public static void main(String[] args) {
        int N = 100;
        StdDraw.setXscale(0, N);
        StdDraw.setYscale(0, N*N);
        StdDraw.setPenRadius(.01);
        for(int i = 1; i <= N; ++i) {
            StdDraw.point(i, i);
            StdDraw.point(i, i*i);
            StdDraw.point(i, i*Math.log(i));
        }
    }
}