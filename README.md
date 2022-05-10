# Java8-Functional-Interface

If an interface contain only one abstract method, such type of interfaces are called Functional Interface and the method is called functional method or single abstract method.

Ex :  Runnable        ->    It contains only run() method
      Comparable      ->    It contains only compareTo() method
      ActionListener  ->    It contains only actionPerformed() method
      Callable        ->    It contains only call() method
      
Ex 1: Compile Successfull
`interface A{
  void m1();
}`
    
Ex 2: Compile Successfull
`@FunctionalInterface
interface A{
  void m1();
}`

Inside functional Interface in addition to Single Abstract Method(SAM) we write any number of default & static method.

Ex 3: Compile Successfull
    `@FunctionalInterface
    interface A{
    void m1();
    default void m2(){
    System.out.println("He")
    }
    static  void m3(){
    System.out.println("m3 Method");
    }
    }`

In JDK8, @FunctionalInterface annotation is introduced to specify that the interface is Functional Interface.

Inside FunctionalInterface we can take only one abstract method, if we take more than one abstract method then
compiler raise an error : multiple non-overriding abstract method found

Ex : Compilation Error

    @FunctionalInterface

    public interface A {

    void m1();
    void m2();
    }

FunctionalInterface contains exactly only one abstract method. If we not declare abstract method it cause error : no abstract method found 

Ex : Compilation Error
`@FunctionalInterface
public interface A {

}`




