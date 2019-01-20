Abstract Factory
Concepts
* Factory of Factories
* Factory of related objects
* Common Interface
* Defer to subclasses

Examples
* DocumentBuilder
* Frameworks

    DocumentBuilderFactory abstractFactory = DocumentBuilderFactory.newInstance();
    DocumentBuilder factory = abstractFactory.newDocumentBuilder();
    Document doc = factory.parse(bais);


Design
* Group Factories together
* Factory is responsible for lifecycle
* Common interface
* Concrete Classes
* Parameterized create method
* Composition


Pitfalls
* Complexity
* Runtime switch
* Pattern within pattern
* Problem specific

Contrast
Factory
* returns various instances
    * multiple constructors
* interface driven
* adaptable to environment more easily

Abstract Factory
* implemented with a Factory
* Hides the Factory
* Abstract Environment
* Build through Composition
