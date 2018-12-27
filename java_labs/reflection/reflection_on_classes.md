# Class object
  When an new object is created, Java load's the class byte code and creates an object of the type Class to represent the byte code, and uses this Class object to create any object of that class.
  Only one object of type Class is created, for each class loaded by a class loader in a JVM.
  
# How a Class object is identified
  A class is uniquely identified by its fully qualified name, its class loader, and its module.
  
# What will happen if two different class loaders load the same class?
  The loaded classes are considered two different classes and the objects are not compatible with each other.

# What are the different ways create Class object
  1. Using class literal
  2. Using getClass() method of the object class
  
 

# Using getClass() method of object class
```
	Foo foo = new Foo();
	Class<Foo> classFoo = foo.getClass()
	
```   
