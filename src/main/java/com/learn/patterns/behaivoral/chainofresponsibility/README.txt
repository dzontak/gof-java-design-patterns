Chain of Responsibility

Concepts
* decouple of sender and receiver
* receiver contains a reference to the next receiver
* promote loose coupling
* no handler is OK

Example
* java.util.Logger.log
* javax.servlet.filter
* Spring Security Filter Chain

Design
* Chain of reciver objects (A list)
* Handler is interface based
* ConcreteHandler for each implementation
* Each Handler has reference to the next

Example: java.util.logging.Logger

logger.setLevel(Level.FINER)
ConsoleHandler handler =  new ConsoleHandler();
handler.setLevel(Level.FINER)
logger.addHandler(handler)

logger.finest("Finest level of logging"); // this wont print
logger.finer("Finer level, but not as fine as finest");
logger.fine("Fine level, but not as fine as finer");


Pitfalls:

* handling/handler guarantee
* Runtime configuration risk
* chain length/performance issues


Compare to Command pattern

chain of responsibility
* handler is unique
* successor
* can utilize the command

Command
* command is also unique
* encapsulates function
* reversible or trackable in nature


Summary
* Decouples Sender and Receiver
* Runtime configuration
* Hierarchical in nature
* Be careful with large chain





