# **Aggregation:**
-->Aggregation is a key concept in object-oriented programming (OOP) that represents a "has-a" relationship between two classes, but with a crucial distinction: the lifecycle of the contained object is independent of the container object. This means that while one class contains another, the contained object can exist independently of the container.

-->It is a stronger form of association where one class is a part of another class, but still can exist independently.

# **What is Aggregation?**

>Aggregation is a form of association in OOP where an object of one class contains a reference to an object of another class. However, the contained object can exist independently of the container. This means that even if the container object is destroyed, the contained object can still be used elsewhere in the application.

>**Example:**

      _____________
      
     |             |-->Teacher_class(container_class)
     
     |   _______   |
     
     |  |       |--|-->Student_class(contained_class)
     
     |  |______ |  |
     
     |_____________|
            
