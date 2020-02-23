# design-patterns-in-java

Implementing Design Patterns in Java.

# Patterns implemented:

## Behavioral Patterns

### Strategy

- **GoF Definition: "Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary independently from clients that use it.".**
- Strategy pattern is used when we have multiple algorithm for a specific task and client decides the actual implementation to be used at runtime.
- One generic implementation (strategy.generic).
- Example 1, operations with numbers (strategy.examples.numbers)
- Other examples where pattern can be used:
    - Compress a list a files, where strategy could be zip, rar, etc.
    - Trip between to locations, where strategy could be: car, bus, bicycle, etc.
    - Sort elements of a collection, where strategy could be different implementations for sorting elements.
    - Different methods of pay, like: PayPal, Credit Card, etc.

## Creational Patterns

### Abstract Factory (TODO)

- GoF Definition: "Provide an interface for creating families of related or dependent objects without specifying their concrete classes".

### Builder

- GoF Definition: "Separate the construction of a complex object from its representation so that the same construction process can create different representations".
- Builder pattern is used to construct complex objects step by step.
- One generic implementation (builder.generic).
- Example 1, constructing cars.
- Other examples where pattern can be used:
    - Construct computers with different configurations (hardware).
    - Food in restaurants: meals which consists of hamburger, fries, coke. 
    
### Factory Method (TODO)

- GoF Definition: "Provide an interface for creating families of related or dependent objects without specifying their concrete classes".    

### Prototype (TODO)

- GoF Definition: "Specify the kinds of objects to create using a prototypical instance, and create new objects by copying this prototype".

### Singleton (TODO)

- GoF Definition: "Ensure a class only has one instance, and provide a global point of access to it.".
