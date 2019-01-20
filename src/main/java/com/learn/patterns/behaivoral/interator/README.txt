Iterator pattern

Concepts:
* Traverse a container
* Does not expose underlying structure
* Decouples algorithms
* Sequential

Examples
* java.util.Iterator
* java.util.Enumeration

Design
* Interface based
* Factory Method based, List.iterator()
* Independent, but fail fast ( 2 iterators can't modify the same collection)
* Enumerator is fail safe
* Iterator interface, ConcreteIterator


Pitfalls
* Access to the index
* Directional (goes in one direction) for bi-directional see java.util.ListIterator
* Speed/Efficiency

Contrast
Iterator
* Interface based
* Algorithm is removed
* no Idex
* Concurrent modification

for loop
* exposes index
* does not change the underlying object
* does not allow foreach syntax
* typically slower than iterator

Summary

* Efficient way to traverse
* Hides algorithm
* Simplify client
* works well with Foreach


