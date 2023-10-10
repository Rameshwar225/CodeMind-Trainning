
package Interface;



class a implements test2 {
    @Override
    public void method1() {
        System.out.println("In m1");
    }

    @Override
    public void method2() {
        System.out.println("In m2");
    }
}




public class Test {
    public static void main(String[] args) {
        test2 obj = new a(); // Loose coupling
        obj.method1();
        obj.method2();
        
        a obj1 = new a(); // Tight coupling
        obj1.method1();
        obj1.method2();
    }
}


