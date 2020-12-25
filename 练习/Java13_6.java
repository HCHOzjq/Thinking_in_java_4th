public class Java13_6{
    public static int a;
    public static long b;
    public static double c;
    public static float d;
    public static void  main(String[] args) {
        Java13_6 z=new Java13_6();
        z.a=1;z.b=123123;
        z.c=1.3;
        z.d=(float)123.23;
        System.out.println(z);
        return ;
    }
    public String toString() {
        StringBuilder ans = new StringBuilder();kj
        ans.append("INT: ").append(a).append(" ");
        ans.append("LONG: ").append(b).append(" ");
        ans.append("DOUBLE: ").append(c).append(" ");
        ans.append("FLOAT: ").append(d).append("\n");
        return ans.toString();
        
    }
}