package pack1;

import java.util.ArrayList;

/**
 * Represents a list of students with additional functionality.
 */
public class ListEtudiant extends ArrayList<Etudiant> {

    /**
     * Adds a student to the list. If the student already exists, updates the existing entry.
     *
     * @param e the student to add
     * @return true if the student was added, false if updated
     */
    public boolean add(Etudiant e) {
        if (this.contains(e)) {
            set(indexOf(e), e);
            return false;
        } else {
            return super.add(e);
        }
    }

    /**
     * Filters the list of students based on a given condition.
     *
     * @param c the condition to filter students
     * @return a new ListEtudiant containing students that satisfy the condition
     */
    public ListEtudiant filtrer(condition c) {
        ListEtudiant l = new ListEtudiant();
        for (int i = 0; i < size(); i++) {
            if (c.estVrai(get(i))) l.add(get(i));
        }
        return l;
    }

    /**
     * Calculates the average note of the students in the list.
     *
     * @return the average note, or 0 if the list is empty
     */
    public double calculerMoyenne() {
        if (this.isEmpty()) {
            return 0;
        }
        double somme = 0;
        for (Etudiant e : this) {
            somme += e.getNote();
        }
        return somme / this.size();
    }
}
