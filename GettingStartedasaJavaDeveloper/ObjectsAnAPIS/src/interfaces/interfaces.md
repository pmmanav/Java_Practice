# **Interfaces**
- Interfaces are based on abstract class, but they are meant to be purely abstract, therefor they do not have state.
- Do not have constructors
- Fields are final
- Must be implemented by other classes, not extended.
- Interfaces should not have private field.
- Fields defined in interfaces should be constant. Therefore they should be either **Static** or **Final**
- By convention, constants are all written in caps.
### **Static:**
Can be accessed from any other class without an object instantiation.

### **Final**
Value assigned at initialization and can not be changed.

- **A class can implement multiple interfaces to achieve multiple inheritance.**
- If a class implements multiple inheritance, and two are more interfaces have methods with same signature(returnType, name, parameters), You only have to implement one overridden mthod in the class.  

- Interfaces can also contain default and static methods.
#### **Default Methods**
Methods within an interface that contain a default implementation.

### **Static Methods**
Methods within an interface that contain implementation but are not inherited by implementing class.
