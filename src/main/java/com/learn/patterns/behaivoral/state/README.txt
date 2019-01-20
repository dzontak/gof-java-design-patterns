State pattern

* Localize state behavior
* state object
* separates what from where
* Open closed principle

Design

* Abstract class / interface
* Class based
* Context unaware
* Context,  State, ConcreteState

Pitfall
* know your states
* more classes
* keeping logic out of context
* state change triggers could be difficult to determine

Contrast
* interface based
* transitions
* class per state

strategy
* interface based
* deals with strategies
* algorithms are independent
* class per state


Summary

* simplifies cyclomatic complexity (many if/else)
* Adding additional states is easy
* more classes
* similar  to Strategy
