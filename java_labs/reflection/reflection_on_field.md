# Field Object
 A field of a class is represented by an object of the java.lang.reflect.Field class. 
 The following four methods in the Class class can be used to get information about the fields of a class:
 1. Field[] getFields()
 2. Field[] getDeclaredFields()
 3. Field getField(String name)
 4. Field getDeclaredField(String name)
 
The **getFields()** method returns all the accessible public fields of the class or interface.

The **getDeclaredFields()** method returns all the fields that appear in the declaration of the class. It does not include inherited fields.

The other two methods, **getField()** and **getDeclaredField( )**, are used to get the Field object if you know the name of the field.


