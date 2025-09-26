package functionalInterface;

@FunctionalInterface
public interface Calsy {
    int add(int a,int b);

    //int sub(int a,int b);

}

class child implements Calsy {

    @Override
    public int add(int a, int b) {
        return 0;
    }
}


//after java 1.8
class Driver{
    public static void main(String[] args) {
       Calsy oper =(a,b)->a+b;
        System.out.println(oper.add(5,5));
    }
}
