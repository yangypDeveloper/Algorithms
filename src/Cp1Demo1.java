/**
 * 欧几里得算法
 */
public class Cp1Demo1 {
    public static int gcd(int p, int q)
    {
        if (q == 0){
            return p;
        }
        int r = p%q;
        return gcd(q,r);
    }
    public static void main(String[]args)
    {
        int result = gcd(12,48);
        System.out.println(result);
    }
}
