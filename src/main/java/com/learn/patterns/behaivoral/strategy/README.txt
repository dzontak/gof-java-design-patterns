Strategy

Concepts

* Eliminate conditional statements
* Behaivior encapsulated in classes
* Difficult to add new strategies
* Client aware of strategies
* Client choses strategy

Examples
* java.util.Comarator

Design
* Abstract base class
* Concreate class per strategy
* Removes if/else conditions
* Strategies are independent
* Context, Strategy, ConcreateStrategy


Pitfalls

* Client has to be aware of Strategies
* Increased number of classes


Compare to State pattern

Strategy
 * Interface based
 * algorothms are independent
 * class per algorithms
State
* interface based
* transitions
* class per state


Summary
* Externalize algorithms
* client knows different strategies
* class per strategy
* reduces conditional statement
