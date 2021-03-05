# Interface-in-JAVA

**PROBLEM :**

Create one interface Shape with two member functions

public double perimeterCalculation();

public double areaCalculation();

Create class Circle which uses Shape interface with one attribute double radius.

Create class Ellipse which uses Shape interface with two attributes double majorRadius and double minorRadius. Override interface’s methods in both the classes. In Main class with main() you need to declare reference of Shape. You need to enter a comma String. If the String is 15,0 then system will automatically attach the Shape reference to Circle object . Again if input is 15,10 then Shape reference refers to Ellipse object. Finally you need to display area and perimeter of respective shape.


**WHAT IS AN INTERFACE:**

An interface in Java is a blueprint of a class. It has static constants and abstract methods. The interface in Java is a mechanism to achieve abstraction. There can be only abstract methods in the Java interface, not method body. It is used to achieve abstraction and multiple inheritance in Java.Implementing an interface allows a class to become more formal about the behavior it promises to provide. Interfaces form a contract between the class and the outside world, and this contract is enforced at build time by the compiler. If your class claims to implement an interface, all methods defined by that interface must appear in its source code before the class will successfully compile.
