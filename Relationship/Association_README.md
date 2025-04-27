# **What is Association:**
---> 1)Association defines a connection between two classes, where one class is linked to another. The association can be **one-to-one,one-to-many,many-to-one, or many-to-many**. Objects in an association can exist independently of each other.

-->  2)here they are **just connected**.

**Characteristics of Association:**

>Represents a **uses-a** or **knows-a** relationship.

>**Objects in an association can exist independently**.

>Can be **unidirectional** or **bidirectional**.

**Types of Association:**


>**(1)One-to-One Association:**

      <i>Each object of class A is associated with one object of class B.
   
      <ii>A Person has one Passport.

>**(2)One-to-Many Association:**

    <i>One object of class A can be associated with multiple objects of class B.
    
    <ii>Example: A Teacher teaches multiple Students.
    
>**(3)Many-to-One Association:**

    <i>Multiple objects of class A can be associated with one object of class B.
    
    <ii>Example: Multiple Students belong to one School.
    
>**(4)Many-to-Many Association:**

    <i>Multiple objects of class A can be associated with multiple objects of class B.
    
    <ii>Example: Teachers and Students (a student can have multiple teachers, and a teacher can have multiple students).

**Example:A Student And Teacher(many to many relationship)**

     import java.util.*;

     class Teacher {
     private String name;
     private List<Student> students;
    
     public Teacher(String name) {
        this.name = name;
        this.students = new ArrayList<>();
     }
    
     public void addStudent(Student student) {
        students.add(student);
     }
    
     public void showStudents() {
        System.out.println(name + " teaches:");
        for (Student student : students) {
            System.out.println(" - " + student.getName());
        }
     }
    
     public String getName() {
        return name;
     }
     }

     class Student {
     private String name;
    
     public Student(String name) {
        this.name = name;
     }
    
     public String getName() {
        return name;
     }
     }

     public class AssociationExample {
     public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Mr. Smith");
        Teacher teacher2 = new Teacher("Mrs. Johnson");
        
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");
        
        teacher1.addStudent(student1);
        teacher1.addStudent(student2);
        teacher2.addStudent(student2);
        
        teacher1.showStudents();
        teacher2.showStudents();
     }
     }
