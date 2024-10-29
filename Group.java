public class Group {
    int a = 5;
    int b = 6;
    String Name = "Name";
    Integer i = 400;
    Double d1 = 12.5;
    Short s1=1;
    Long l1 = 123L;
    Float f1 = 12.5f;
    Character c1 = 'f';

    public static void main(String[] args) {
        Group G = new Group();
        int local_var = 50;


        System.out.println(G.a);
        System.out.println(G.b);
        System.out.println(local_var);
        System.out.println(G.Name);
        System.out.println(G.i);
        System.out.println(G.d1);
        System.out.println(G.s1);
        System.out.println(G.l1);
        System.out.println(G.c1);
        System.out.println(G.f1);

    }
}