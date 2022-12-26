public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1(){
        int[] a = new int [3];
        a[0] =1;
        a[1]=2;
        a[2]=3;
        System.out.println(a[0] +" "+ a[1] +" "+ a[2]);
        double[] d = {1.57, 7.654, 9.986};
        System.out.println(d[0] +" "+ d[1] +" "+ d[2]);
        for (int i = 0; i<5; i++) {
            int[] c = new int[5];
            c[0] = 5;
            c[1] = 35;
            c[2] = 45;
            c[3] = 15;
            c[4] = 56;
            System.out.println(c[i]);
        }
}
    public static void task2(){
            int[] c = new int[5];
            c[0] = 5;
            c[1] = 35;
            c[2] = 45;
            c[3] = 15;
            c[4] = 56;
            System.out.println(c[0] + ", " + c[1] + ", " + c[2] + ", " + c[3] + ", " + c[4]);
    }
    public static void task3(){
        int[] q = new int[5];
        q[0] = 5;
        q[1] = 35;
        q[2] = 45;
        q[3] = 15;
        q[4] = 56;
        System.out.println(q[4] + ", " + q[3] + ", " + q[2] + ", " + q[1] + ", " + q[0]);
    }
}