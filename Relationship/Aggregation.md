# **Aggregation:**
-->Aggregation is a key concept in object-oriented programming (OOP) that represents a "has-a" relationship between two classes, but with a crucial distinction: the lifecycle of the contained object is independent of the container object. This means that while one class contains another, the contained object can exist independently of the container.

-->It is a stronger form of association where one class is a part of another class, but still can exist independently.

# **What is Aggregation?**

>Aggregation is a form of association in OOP where an object of one class contains a reference to an object of another class. However, the contained object can exist independently of the container. This means that even if the container object is destroyed, the contained object can still be used elsewhere in the application.

>**Example:**

        _____________ 
       |             |-->University_object(container_object)
       |   _______   |
       |  |       |--|-->Professor_object(contained_object)
       |  |______ |  |
       |_____________|


       class Professor {
       private String name;
       private String subject;
    
       public Professor(String name, String subject) {
        this.name = name;
        this.subject = subject;
       }
    
       public void teach() {
        System.out.println(name + " is teaching " + subject);
       }
       }

       class University {
       private String universityName;
       private List<Professor> professors;
    
       public University(String universityName) {
        this.universityName = universityName;
        this.professors = new ArrayList<>();
       }
    
       public void addProfessor(Professor professor) {
        professors.add(professor);
       }
    
        public void showProfessors() {
        System.out.println("Professors at " + universityName + ":");
        for (Professor professor : professors) {
            System.out.println(" - " + professor.name);
        }
        }
        }

        import java.util.*;

        public class AggregationExample {
        public static void main(String[] args) {
        Professor prof1 = new Professor("Dr. Smith", "Computer Science");
        Professor prof2 = new Professor("Dr. Johnson", "Mathematics");
        
        University university = new University("Harvard University");
        university.addProfessor(prof1);
        university.addProfessor(prof2);
        
        university.showProfessors();
        
        // Professors can exist independently
        prof1.teach();
        prof2.teach();
        }
        }
>**Key Characteristics of Aggregation:**

    -->Represents a has-a relationship.
    -->The contained object can exist independently of the container.
    -->Implemented using references (pointers) to objects.
    -->Promotes loose coupling between objects.
