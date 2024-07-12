package org.example.OOPs.InnerClass;



public class Main {
    public static void main(String[] args) {
        SimpleInnerClass innerClass = new SimpleInnerClass();
        System.out.println(innerClass.a);
        SimpleInnerClass.Inner  inner = innerClass.new Inner();
        System.out.println(inner.b);

        StaticInnerClass.StaticInner staticInnerClass = new StaticInnerClass.StaticInner();
        staticInnerClass.showData();

        TestInterface testInterface = new TestInterface() {
            @Override
            public int sum(int a, int b) {
                System.out.println("At testInterface");
                return a + b;
            }
        };

        testInterface.sum(4, 5);

        TestInterface testInterface1 = new AnonymousClassUsageExample();
        testInterface1.sum(3,3);

        SingletonClass singletonClass = SingletonClass.getSingletonClass();
        System.out.println(singletonClass);
        System.out.println("SingletonClass hashcode= "+ singletonClass.hashCode());

        SingletonClass singletonClass1 = SingletonClass.getSingletonClass();
        System.out.println(singletonClass1);
        System.out.println("SingletonClass hashcode= "+ singletonClass1.hashCode());

    }
}
