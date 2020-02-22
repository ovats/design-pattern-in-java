# design-patterns-in-java

Implementing Design Patterns in Java.

# Patterns implemented:

## Strategy

- Strategy pattern is used when we have multiple algorithm for a specific task and client decides the actual implementation to be used at runtime.
- One generic implementation (strategy.generic).
- Example 1, operations with numbers (strategy.examples.numbers)
- Other examples where pattern can be used:
    - Compress a list a files, where strategy could be zip, rar, etc.
    - Trip between to locations, where strategy could be: car, bus, bicycle, etc.
    - Sort elements of a collection, where strategy could be different implementations for sorting elements.
    - Different methods of pay, like: PayPal, Credit Card, etc.

## Builder
- Builder pattern is used to construct complex objects step by step.
- One generic implementation (builder.generic).
- Example 1, constructing cars.
- Other examples where pattern can be used:
    - Construct computers with different configurations (hardware).
    - Food in restaurants: meals which consists of hamburger, fries, coke. 