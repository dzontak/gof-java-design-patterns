Visitor

Separate algorithm from object structure
Adding new features
Maintain open closed principle
Visitor changes

Examples
java.lang.model.element.Element
java.lang.model.element.ElementVisitor

Design
* Interface based
* Visitor and Element
* Elements have visit methods
* Visitor knows every element
* Visitor, ConcreteVisitor, Element, ConcreteElement


Pitfalls
* Plan for adaptability
* Indirection somewhat confusing
* Adapter pattern


Contrast
Visitor
* interface based
* Externalize changes
* Multiple visitors / easy to add

Iterator
* Interface based / anonymous
* encapsulates

Summary
* Expect changes
* minor complexity
* externalize change
