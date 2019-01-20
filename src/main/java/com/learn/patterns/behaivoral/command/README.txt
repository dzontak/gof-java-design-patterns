Command Pattern

Concepts:
* Encapsulate requests as a Object
* Object-oriented callback
* Decouple sender from processor
* Often used for "undo" functionality

Example
* java.lang.Runnable
* java.util.concurrent.Callable
* javax.swing.Action

Design
* Object per command
* Command Interface
    * Execute Method
* Undo method
    * uses Reflection typically
* Command, Invoker ConcreteCommand

Pitfalls
* Dependence on other patters
* Multiple Command


Contrast
    Command
        * Object per command
        * Class contains the 'what'
        * Encapsulates action


Strategy
        * Object per strategy
        * Class contains the "how"
        * Encapsulates the algorithm


Summary:
    * Encapsulates each request as an object
    * Decouples sender from process
    * very few drawbacks
    * Often used for Undo functionality


