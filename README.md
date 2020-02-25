# design-patterns-in-java

Implementing Design Patterns in Java.

# Patterns implemented:

## Creational Patterns

### Abstract Factory

- **GoF Definition: "Provide an interface for creating families of related or dependent objects without specifying their concrete classes".**
- One generic implementation (abstractFactory.generic).

### Builder

- **GoF Definition: "Separate the construction of a complex object from its representation so that the same construction process can create different representations".**
- Builder pattern is used to construct complex objects step by step.
- One generic implementation (builder.generic).
- Example 1, constructing cars.
- Other examples where pattern can be used:
    - Construct computers with different configurations (hardware).
    - Food in restaurants: meals which consists of hamburger, fries, coke. 
    
### Factory Method

- **GoF Definition: "Define an interface for creating an object, but let subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.".**    
- Two generic implementations:
    - factoryMethod.generic.regularFactoryMethod: the objects are created in the Creator class, in the method createProduct; there are no subclass of Creator class.
    - factoryMethod.generic.variantAbstractMethod: the method createProduct is abstract. Each subclass must give the implementation of the creation of the object.
- Added a sample of a Pizza Restaurant in factoryMethod.examples.pizzaRestaurant.

### Prototype (TODO)

- **GoF Definition: "Specify the kinds of objects to create using a prototypical instance, and create new objects by copying this prototype".**

### Singleton (TODO)

- **GoF Definition: "Ensure a class only has one instance, and provide a global point of access to it.".**

## Structural Patterns

### Adapter (TODO)

- **GoF Definition: "Convert the interface of a class into another interface clients expect. Adapter lets classes work together that couldn't otherwise because of incompatible interfaces".**

### Bridge (TODO)

- **GoF Definition: "Decouple an abstraction from its implementation so that the two can vary independently".**

### Composite (TODO)

- **GoF Definition: "Compose objects into tree structures to represent part-whole hierarchies. Composite lets clients treat individual objects and compositions of objects uniformly".**

### Decorator (TODO)

- **GoF Definition: "Attach additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality".**

### Facade (TODO)

- **GoF Definition: "Provide an unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that makes the subsystem easier to use".**

### Flyweight (TODO)

- **GoF Definition: "Use sharing to support large numbers of fine-grained objects efficiently".**

### Proxy (TODO)

- **GoF Definition: "Provide a surrogate or placeholder for another object to control access to it.".**

## Behavioral Patterns

### Chain of Responsability (TODO)

- **GoF Definition: "Avoid coupling the sender of a request to its receiver by giving more than one object a chance to handle the request. Chain the receiving objects and pass the request along the chain until an object handles it.".**

### Command (TODO)

- **GoF Definition: "Encapsulate a request as an object, thereby letting you parameterize clients with different requests, queue or log requests, and support undoable operations".**

### Interpreter (TODO)

- **GoF Defintion: "Given a language, define a representation for its grammar along with an interpreter that uses the representation to interpret sentences in the language".**

### Iterator (TODO)

- **GoF Definition: "Given a language, define a representation for its grammar along with an interpreter that uses the representation to interpret sentences in the language".**

### Mediator (TODO)

- **GoF Definition: "Define an object that encapsulates how a set of objects interact. Mediator promotes loose coupling by keeping objects from referring to each other explicitly, and it lets you vary their interaction independently".**

### Memento (TODO)

- **GoF Definition: "Without violating encapsulation, capture and externalize an object's internal state so that the object can be restored to this state later".**.

### Observer (TODO)

- **GoF Definition: "Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically".**

### State (TODO)

- **GoF Definition: "Allow an object to alter its behavior when its internal state changes. The object will appear to change its class"**

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

### Template Method (TODO)

- **GoF Definition: "Define the skeleton of an algorithm in an operation, deferring some steps to subclasses. Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure".**

### Visitor (TODO)

- **GoF Definition: "Represent an operation to be performed on the elements of an object structure. Visitor lets you define a new operation without changing the classes of the elements on which it operates".**



