package pack1;

import java.util.Collections;

/**
 * Demonstrates the functionality of the Etudiant and ListEtudiant classes.
 */
public class main {

    public static void main(String[] args) {
        // Create students
        Etudiant e1 = new Etudiant(1, "hamid");
        Etudiant e2 = new Etudiant(2, "driss");
        Etudiant e3 = new Etudiant(1, "youssef");

        // Set their notes
        e1.setNote(15);
        e3.setNote(16);
        e2.setNote(12);

        // Create a list of students
        ListEtudiant mesEtudiants = new ListEtudiant();

        // Add students to the list
        mesEtudiants.add(e1);
        mesEtudiants.add(e2);
        mesEtudiants.add(e3);

        // Display the initial list
        System.out.println("Initial list: " + mesEtudiants);

        // Sort the list
        Collections.sort(mesEtudiants);
        System.out.println("Sorted list: " + mesEtudiants);

        // Filter students with notes >= 13
        condition c = new condition() {
            @Override
            public boolean estVrai(Etudiant e) {
                return e.getNote() >= 13;
            }
        };

        mesEtudiants = mesEtudiants.filtrer(c);
        System.out.println("Filtered list: " + mesEtudiants);

        // Calculate and display the average note
        double moyenne = mesEtudiants.calculerMoyenne();
        System.out.println("Average note: " + moyenne);
    }
}
