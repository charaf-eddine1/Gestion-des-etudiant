# Gestion des Étudiants

## Description
This project is a simple Java application for managing a list of students. It demonstrates object-oriented programming concepts such as inheritance, interfaces, and collections.

## Features
- **Student Management**: Add, update, and manage students with attributes like ID, name, and note.
- **Sorting**: Sort students based on their notes.
- **Filtering**: Filter students based on custom conditions.
- **Average Calculation**: Calculate the average note of the students in the list.

## Project Structure
```
Gestion des Étudiants/
├── src/
│   └── pack1/
│       ├── condition.java       # Interface for filtering conditions
│       ├── Etudiant.java        # Class representing a student
│       ├── ListEtudiant.java    # Class extending ArrayList for student management
│       └── main.java            # Main class demonstrating the functionality
├── bin/                         # (Optional) Compiled class files
├── .classpath                   # Eclipse-specific file
├── .project                     # Eclipse-specific file
├── .settings/                   # Eclipse-specific folder
└── README.md                    # Project documentation
```

## How to Run
1. Compile the project:
   ```
   javac -d bin src/pack1/*.java
   ```
2. Run the main class:
   ```
   java -cp bin pack1.main
   ```

## Requirements
- Java Development Kit (JDK) 8 or higher


## License
This project is licensed under the MIT License.