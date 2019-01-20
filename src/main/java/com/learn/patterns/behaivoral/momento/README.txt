Momento

Used to provide rollback functionality

Concepts

* Restore Object to previous state
* Externalize internal state
* Undo/Rollback
* Shields complex internals

Examples
* java.util.Date
* java.io.Serializable

Design

* Class based
Roles
    * Originator ( object we want to copy)
    * Caretaker ( manages the copy)
    * momento ( represents the copy )

PitFalls
* Can be expensive keeping alot of history
* Deletes history
* Exposing information


Contrast
Momento
* State captured
* Independent State
* Caretaker / History



Command
* Requests captured
* Independent request
* History side benefit


Summary
* Captures state
* Can get heavy with history
* Recreate state
* Similar to Command pattern
