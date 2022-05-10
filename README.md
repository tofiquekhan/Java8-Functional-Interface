# Java8-Functional-Interface

If an interface contain only one abstract method, such type of interfaces are called Functional Interface and the method is called functional method or single abstract method.

Ex :  Runnable        ->    It contains only run() method
      Comparable      ->    It contains only compareTo() method
      ActionListener  ->    It contains only actionPerformed() method
      Callable        ->    It contains only call() method
      
Ex 1: Compile Successfull
interface A{
  void m1();
}
    
Ex 2: Compile Successfull
@FunctionalInterface
interface A{
  void m1();
}



