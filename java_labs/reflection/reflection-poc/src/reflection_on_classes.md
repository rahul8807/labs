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
  3. Using Class forName() method
  
# Using class literal
  A class literal is the class name or interface name followed by a dot and the word “class.”
  *the class literal is always used with a class name, not with an object reference* 
  ```
  Foo foo = new Foo();
  Class<Foo> fooClass = foo.class; // A compile-time error.
 ```
 you can also get class object for primitive data types and the keyword void using class literals as boolean.class, byte.class, char.class
 
# Using getClass() method of object class
  The Object class contains getClass() method, which returns reference to the Class object for the object. 
```
	Foo foo = new Foo();
	Class<Foo> classFoo = foo.getClass()
	
```   

# Using Class forName() method
  Class forName() method is an static method, which loads the class and return reference to that class.
  Over loaded methods are - 
  ```
  Class<?> forName(String className) throws ClassNotFoundException
  Class<?> forName(String className, boolean initialize, ClassLoader loader) throws ClassNotFoundException
  Class<?> forName(Module module, String className)
  ```

  The **forName(String className)** method takes the fully qualified name of the class to be loaded. 
  It loads the class, initializes it, and returns the reference to its Class object. 
  If the class is already loaded, it simply returns the reference to the Class object of that class.    
  
  The **forName(String className, boolean initialize, ClassLoader loader)** method takes the fully qualified name of the class to be loaded and gives you options -
  - Initialize or not to initialize the class when it is loaded
  - And which class loader should load the class.
  
  *jdk9*
  The **forName(Module module, String className)**  method loads the class with the specified className in the specified module without initializing the loaded class. 
  If the class is not found, the method returns null.
  
  
  
  