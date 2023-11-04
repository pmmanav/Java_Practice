# Polymorphism
Polymorphism happens when a subclass defines some of its unique behavior yet shares the same behavior as its superclass.

### **Type vs. Instance:**
An object can have a superclass type and subclass instance.

### **Overridden Methods**
If a method is overridden by a subclass, the polymorphic object will execute the overridden method at runtime.

### **Object TypeCasting**
The act of converting an object's type into a different type.
    
### **instanceof operator**
```
Animal sasha = new dog();

//true
boolean  isDog = sasha instanceof Animal; 

//true
boolean  isDog = sasha instanceof dog; 

//false
boolean  isDog = sasha instanceof Cat; 
```
