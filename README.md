# 📚 Library Management System (LLD in Java)

A **console-based Library Management System** implemented in Java using **Object-Oriented Programming (OOP)** principles. This project is commonly asked in **SDE low-level design interviews** at companies like Amazon, Google, and Microsoft.

It demonstrates how real-world entities can be modeled using clean code and design principles like **abstraction, inheritance, and encapsulation**.

---

##  Features

-  Search books by title, author, or category
-  Borrow and return books
-  Track availability of each book
-  Admin privileges to add or remove books
-  Designed using clean class structures and enums

---

##  OOP Concepts Applied

- **Encapsulation**: All class variables are private, accessed via getters/setters
- **Inheritance**: `Admin` inherits from `User` to extend functionality
- **Abstraction**: Exposed only relevant behavior in classes like `Book` and `Library`
- **Enum Usage**: `BookStatus` tracks book availability

---

##  Class Overview

| Class        | Responsibility |
|--------------|----------------|
| `Book`       | Represents a book with title, author, ISBN, category, and status |
| `User`       | Can borrow and return books |
| `Admin`      | Inherits `User`; can also add and remove books |
| `Library`    | Manages books and provides search features |
| `BookStatus` | Enum for book status: `AVAILABLE`, `BORROWED` |

---

##  Sample Flow

```java
Library library = new Library();
Admin admin = new Admin("Pavan", "admin01");
Book book1 = new Book("DSA in Java", "Kunal", "123", "Programming");

admin.addBook(book1, library);

User user1 = new User("Rahul", "u101");
user1.borrowBook(book1);
user1.returnBook(book1);


library-management-system/
├── Book.java
├── User.java
├── Admin.java
├── Library.java
├── Main.java
└── README.md

##  How to Run
git clone https://github.com/your-username/library-management-system.git
cd library-management-system

javac Main.java
java Main

## Future Enhancements
  * Implement due dates and fine calculation
  * Add book reservation and waitlist features
  * Integrate database for persistent storage
  * RESTful API using Spring Boot
  * Add login/authentication system

##  Learning Objectives
  * Understand and apply OOP principles using Java
  * Model real-world systems through LLD
  * Practice interview-level design questions
  * Gain experience writing clean, modular, and extensible code
  * Prepare for SDE-1 LLD/System Design interview rounds

## Author
Eluri Pavan Kumar
Aspiring SDE-1 | Java | DSA | System Design Enthusiast
https://www.linkedin.com/in/eluripavankumar/

Feel free to connect with me and give feedback!





