Decorator
Use when you don't want to modify the base object to add functionality


Concepts:
* Also called a wrapper
* Add behavior without affecting others
* more than just inheritance
* single responsibility principle
* compose behavior dynamical

Examples:
* java.io.InputStream

Design:
* Inheritance based
* Utilizes composition and inheritance (is-a, has-a)
* Alternative subclassing
* Constructor requires instance from hierarchy
* Component, ConcreteComponent, Decorator, ConcreteDecorator

Pitfalls
* new class for every feature added
* Multiple little object
* often confused with simple inheritance

Contrast
Composite
* tree structure
* leaf and composite have same interface
* unity between object

Decorator
* contains other entity
* modifies behavior (adds)
* does not change underlying object

Summary
* Original object stays the same
* Unique way to add functionality
* Confused with inheritance
* Can be more complex for clients





