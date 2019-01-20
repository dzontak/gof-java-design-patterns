Mediator pattern

Concepts
* Loose coupling
* Well-defined, but complex objects
* Reusable components
* Hub/Router

Examples
* java.util.Timer
* java.lang.reflect.method.invoke()

Design
* Interface based
* Concrete class
* Minimizes inheritance
* Mediator knows about colleages
* UML diagram - Mediator, ConcreteMediator


Pitfalls
* the Mediator class can grow to be to big
* Limits subclassing
* Can be confused with command.


Contrast

Mediator
* Defines interaction
* object decoupling
* more specific

Observer
* one-to-many broadcast
* object decoupling
* more generic

Summary

* Loose coupling
* Simplified communication
* Mediator complexity
* Use with Command pattern




