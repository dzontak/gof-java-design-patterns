Observer

Concepts
* One-to-many
* decopled
* event handling
* pub/sub (async version of ovserver)
* mvc

Examples
    * java.util.Observer
    * java.util.EventListener
    * javax.jms.Topic

Design
* Subject implements Observable (what we want to monitor)
* Observer
* Subject, ConcreteSubject, Observer, ConcreteObserver are objects of this pattern

Pitfalls
* Unexpected updates
* Large sized consequences
* What changed
* Debugging difficult


Contrast
Observer:
* one-two-many
* decoupled
* broadcast communication

Mediation
* one to one to many
* decoupled
* complex communication


Summary

* decoupled communication
* build in functionality in jdk
* can be used with mediator
