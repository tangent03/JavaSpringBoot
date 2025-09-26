package WrapperClasses;

public class Demo {
    public static void main(String[] args) {
        Integer i=Integer.valueOf(20);  //wrapper object
        Integer i2=Integer.valueOf("123");  //wrapper object
        System.out.println(i);
        System.out.println(i2);

        int obj1 = Integer.parseInt("2323");   //"2323"--->
        boolean aTrue = Boolean.parseBoolean("true");

        Double d=9.88;
        int i3=d.intValue();

        System.out.println(i3);

        Integer k=66;
        String ks = k.toString();

        Integer a1=1000;
        Integer b1=1000;
        System.out.println(a1==b1);

        Integer a=100;
        Integer b=100;
        System.out.println(a==b);
        //Note : -128 -- 127 cache

        Integer pa = 128;
        Integer pb = 128;
        System.out.println(pa.equals(pb)); // content compaire
    }
}

