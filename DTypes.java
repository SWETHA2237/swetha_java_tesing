public class DTypes {
    short a = 5;
    int b = 5;
    long c = 5L;
    short aa = 32767;
    int bb = 32768;
    int bbb = 2147483647;
    long bbb1 = 2147483648L;
    long bbb4 = 2147483648124254254L;
    float aaa= 654132123.2313654f;
    float aaaa = -1354354.1356431f;
    double bbbb=1.0;
    double bbbbb=1;
    double bbbbbb=-1;
    double bbbbbbb=-1.541235613;
    double bbbbbbbb=64612.56135;
    boolean cc = true;
    boolean ccc = false;
    char dd='a';
    char ddd='&';
    char dddd='3';
    char ddddd='\n';
    char dddddd='\t';
    char ddddddd='\"';
    char dddddddd='\'';
    double ccccc=dddddddd;

    String s = "test";
    String ss = new String("testa");

    Integer i = 400;
    Integer ii = new Integer(152);
    Double d1 = 12.5;
    Short s1=1;
    Long l1 = 123L;
    Float f1 = 12.5f;
    Character c1 = 'f';
/*
char
short
int
long
float
double
 */

    public static void main(String[] args) {
        DTypes typ = new DTypes();


        System.out.print(typ.bbb1);
        System.out.print(typ.bbb4);
        System.out.print(typ.a);
        System.out.print(typ.bbb);
        System.out.println(typ.aaaa);
        System.out.println(typ.bbbbbbbb);
        System.out.println(typ.cc);
        System.out.println(typ.dddddd);
        System.out.println(typ.ddd);
        System.out.println(typ.dd);
        System.out.println(typ.ddddd);
        System.out.println(typ.ddddddd);
        System.out.println(typ.dddddddd);

        System.out.println(typ.i);
        System.out.println(typ.ii);
        System.out.println(typ.s1);
        System.out.println(typ.d1);
        System.out.println(typ.c1);
        System.out.println(typ.f1);
        System.out.println(typ.l1);
        System.out.println(typ.s);
        System.out.println(typ.ss);


        System.out.println(typ.i.doubleValue());
        System.out.println(typ.i.compareTo(typ.ii));

    }
}
