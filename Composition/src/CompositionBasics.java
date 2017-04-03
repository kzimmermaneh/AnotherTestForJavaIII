

//CompositionBasics.java
public class CompositionBasics {
public static void main(String[] args) {
Person bobby = new Person();
System.out.println(bobby.getSalary());
System.out.println(bobby.toString());
}
}




/***********************************************
Complex objects (in real-life) are often built from smaller, simple objects. A car contains a frame, an engine, tires, a transmission, a steering wheel, and other parts. A personal computer contains a CPU, motherboard, memory, etc... Even you are composed of smaller parts: a head, body, legs, arms, and so on. Composition is process of building complex objects from simple ones. This type of relationship is a containing relationship.

Composition is used for objects that have what we call a has-a relationship to each other. A car has-a metal frame, has-an engine, and has-a transmission. A personal computer has-a CPU, a motherboard, and other components. You have-a head, a body, some limbs.

The classes we have used so far have had member variables composed of existing data types (e.g. int, double, boolean). This may suffice for designing and implementing small, simple classes. It becomes burdensome for complex classes. Java allows us to build complex classes by using classes as member variables in other classes.

Java composition works by using instance variables that refer to other objects. A Person (object) has a Job (object). You'll find the Job object as a variable in the Person object below.

Don't worry about the Job object not knowing what Person holds it. The Person object has a Job. That information is available to the program through the Person object. It does not need to go both ways.
****************************************************/