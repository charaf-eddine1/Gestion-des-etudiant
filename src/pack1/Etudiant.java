package pack1;

/**
 * Represents a student with an ID, name, and note.
 */
public class Etudiant implements Comparable<Etudiant> {
    private int id;
    private double note;
    private String nom;

    /**
     * Constructs a new Etudiant with the given ID and name.
     *
     * @param id  the unique identifier of the student (must be positive)
     * @param nom the name of the student (cannot be null or empty)
     */
    public Etudiant(int id, String nom) {
        if (id <= 0) {
            throw new IllegalArgumentException("ID must be positive.");
        }
        if (nom == null || nom.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }
        this.id = id;
        this.nom = nom;
        this.note = 10; // Default note
    }

    /**
     * Returns a string representation of the student.
     */
    public String toString() {
        return nom + ":" + note;
    }

    /**
     * Checks if two students are equal based on their ID.
     */
    public boolean equals(Object o) {
        if (!(o instanceof Etudiant)) return false;
        return ((Etudiant) o).id == this.id;
    }

    /**
     * Compares two students based on their notes.
     */
    public int compareTo(Etudiant e) {
        return Double.compare(this.note, e.note);
    }

    /**
     * Gets the note of the student.
     */
    public double getNote() {
        return note;
    }

    /**
     * Sets the note of the student (must be between 0 and 20).
     */
    public void setNote(double note) {
        if (note < 0 || note > 20) {
            throw new IllegalArgumentException("Note must be between 0 and 20.");
        }
        this.note = note;
    }
}