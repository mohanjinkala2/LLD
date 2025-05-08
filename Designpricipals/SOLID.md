# **SOLID**

# Reason Why SOILD Principal are important:

-->(1) **Scalability**

-->(2) **Maintainability**

-->(3) **Testability**

-->(4) **Readability**

# S->SINGLE RESPONSIBILITY PRINCIPAL:

  -->This principal states that a class should have only one reason to change--which means **Every class should have a single responsibility**(single job or single purpose).

   --># **Advantages Of Following S**:

      -->(1)**Improve Maintainability**

      -->(2)**Improve Readability**

   -->**Example:** Imagine a baker who is responsible for baking bread. The baker’s role is to focus on the task of baking bread, ensuring that the bread is of high quality, properly baked, and meets the bakery’s standards.However, if the baker is also responsible for managing the inventory, ordering supplies, serving customers, and cleaning the bakery, this would violate the SRP. Each of these tasks represents a separate responsibility, and by combining them, the baker’s focus and effectiveness in baking bread could be compromised.


# O->Open/Closed Principle:

-->This principle states that Software entities (classes, modules, functions, etc.) should be **open for extension, but closed for modification** which means you should be able to extend a class behavior, without modifying it.

--># **Advantages Of Following O**:

   -->(1)**Prevents breaking existing code**

   -->(2)**Encourages reusable components**

-->**Example:** Suppose we have a Shape class that calculates the area of different shapes. Initially, it supports only circles and rectangles. Adding a new shape, like a triangle, would require modifying the existing code.The Open/Closed Principle states that software entities should be open for extension but closed for modification. Here since we are modifying the existing code and not extending it, that is why the current approach is problematic.

‍# **L->Liskov Substitution Principle**

-->according to this principle Derived or child classes must be substitutable for their base or parent classes. This principle ensures that any class that is the child of a parent class should be usable in place of its parent without any unexpected behavior.

--># **Advantages Of Following L**:

   -->(1)**Ensures reliability when using polymorphism**

   -->(2)**Avoids unexpected behaviors in subclass implementations**

-->**Example:** Consider a Vehicle class and a Car subclass. If the Vehicle class has a startEngine method, a subclass like Car would work fine but if a subclass Bicycle is created, then it will violate LSP because bicycles do not have engines.

‍# **I->Interface Segregation Principle**

-->This principle is the first principle that applies to Interfaces instead of classes in SOLID and it is similar to the Single Responsibility principle. It states that do not force any client to implement an interface which is irrelevant to them. Here your main goal is to focus on avoiding fat interface and give preference to many small client-specific interfaces. You should prefer many client interfaces rather than one general interface and each interface should have a specific responsibility.

--># **Advantages Of Following I**:

   -->(1)**Reduces unnecessary dependencies**

   -->(2)**Simplifies implementation for specific use cases**

-->**Example:** Consider a software system modeling various office equipment through a Machine interface that encompasses multiple functionalities: printing, scanning, and faxing. This design presents a violation of the Interface Segregation Principle when implementing a basic printer device.The fundamental issue arises when a BasicPrinter class, which is designed solely for printing operations, must implement the complete Machine interface. This forces the class to provide implementations for scan() and fax() methods, despite these capabilities being outside its core functionality.

‍# **D->Dependency Inversion Principle**

-->DIP suggests that classes should rely on abstractions (e.g., interfaces or abstract classes) rather than concrete implementations. This allows for more flexible and decoupled code, making it easier to change implementations without affecting other parts of the codebase.

--># **Advantages Of Following D**:

   -->(1)**Promotes decoupled architecture**

   -->(2)**Facilitates testing and maintainability**

