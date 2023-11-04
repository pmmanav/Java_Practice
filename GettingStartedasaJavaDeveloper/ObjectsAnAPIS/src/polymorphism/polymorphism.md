#polymorphism
Polymorphism happens when sub class define some of their unique behaviour yet share same behhaviour of their super class.

**Type vs. Instance**
An object can have a superclass type and subclass instance.

**Overridden Methods**
If a method is overridden by subclass, the polymorphic object will execute the overridden method at runtime.

**Object TypeCasting**
The act of convverting an object's type into a different type.
    
**instanceof operator**
```
Animal sasha = new dog();

//true
boolean  isDog = sasha instanceof Animal; 

//true
boolean  isDog = sasha instanceof dog; 

//false
boolean  isDog = sasha instanceof Cat; 
```