Interpreter Pattern

Concepts

* Represents grammar
* Interpret a sentence
* Map a domain
* AST (abstract syntax tree)

Example
* java.util.Pattern
* java.text.Format

Design
* AbstractExpression
* Interpret
* TerminalExpression
* NoneTerminalExpression
UML
Context, AbstractExpression, TerminalExpression, NoneTerminalExpression, Client


Pitfalls
* Complexity
* Class per Rule
* Specific to the problem its trying to solve

Contrast
Interpreter
* Access to properties
* function as methods
* Adding new functionality changes every variant


Visitor
* needs Observer functionality
* Functionality found in one place
* Adding a new variant requires changing every visitor

Summary
* Define a grammar
* Rules of Validation
* Special case pattern
* Consider the Visitor pattern
