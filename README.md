# Library Management System

## Task Description
Create a simple library management system that demonstrates object composition in Java. The system should represent a hierarchical structure of a library consisting of multiple components.

## System Structure
The library system should have the following hierarchy:
- Library (contains sections)
- Section (contains bookshelves)
- Bookshelf (contains books)
- Book (basic unit)

## Required Classes

### 1. Book Class
Create a `Book` class with:
- Properties:
    - title
    - author
    - isbn
- Methods:
    - Constructor to initialize all properties
    - Method to print book information

### 2. Bookshelf Class
Create a `Bookshelf` class that:
- Properties:
    - shelf ID
    - list of books
- Methods:
    - Constructor to initialize shelf
    - Method to add a book
    - Method to print all books on the shelf

### 3. Section Class
Create a `Section` class that:
- Properties:
    - section name
    - list of bookshelves
- Methods:
    - Constructor to initialize section
    - Method to add a bookshelf
    - Method to print all shelves and their books

### 4. Library Class
Create a `Library` class that:
- Properties:
    - library name
    - list of sections
- Methods:
    - Constructor to initialize library
    - Method to add a section
    - Method to print entire library structure

## Example Usage
Your implementation should be able to:
1. Create several books
2. Add books to bookshelves
3. Add bookshelves to sections
4. Add sections to the library
5. Print the complete structure

## Requirements
- Use ArrayList instead of arrays for storing collections of objects
- Implement proper encapsulation (private fields with public methods)
- Provide clear console output showing the hierarchy

## Sample Output
```
=== City Library ===

Section: Fiction
--------------------
Shelf F1:
Book: The Hobbit by J.R.R. Tolkien
Book: The Fellowship of the Ring by J.R.R. Tolkien

Shelf S1:
Book: 1984 by George Orwell
Book: Brave New World by Aldous Huxley
```

## Bonus Tasks (Optional)
1. Add method to find a book by its ISBN
2. Add method to count total number of books in the library
3. Add method to remove books/shelves/sections
4. Add validation for ISBN format (consists of 13 digits)
5. Add capacity limit for bookshelves

## Learning Objectives
- Understanding object composition
- Working with ArrayLists
- Implementing hierarchical data structures
- Practicing encapsulation
- Using proper naming conventions
- Creating readable output formatting

## Hints
- Start by implementing the smallest unit (Book) and work your way up
- Test each class separately before combining them
- Pay attention to proper indentation in the output to show the hierarchy