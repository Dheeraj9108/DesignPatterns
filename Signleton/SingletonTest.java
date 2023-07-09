public class SingletonTest {
    public static void main(String[] args) {
        A obj = A.getInstance();
        A obj1 = A.getInstance();
        System.out.println(obj1.equals(obj));
    }    
}

class A{
    static A obj = new A();
    private A(){

    }
    static A getInstance(){
        return obj;
    }
}