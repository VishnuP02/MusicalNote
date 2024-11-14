public class Note {
    private int length; // Length of the note (e.g., 1 for whole, 2 for half, 4 for quarter, etc.)
    private int value; // Distance from middle C; middle C = 0
    private static final int A440 = 440; // Default frequency for A440

    /**
     * Default constructor that initializes the note to A440 as a quarter note.
     */
    public Note() {
        this.length = 4; // default to quarter note
        this.value = 0; // default to middle C
    }

    /**
     * Constructor that allows specifying the length and value of the note.
     * @param length The length of the note.
     * @param value The distance of the note from middle C.
     */
    public Note(int length, int value) {
        this.length = length;
        this.value = value;
    }

    /**
     * Returns the letter name of the note (e.g., C, C#, D).
     * @return The letter name of the note.
     */
    public String getLetterName() {
        String[] noteNames = {"C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B"};
        int index = (value + 12) % 12; // Adjust to ensure index is within bounds
        return noteNames[index];
    }

    /**
     * Returns whether the note is natural or sharp.
     * @return "Natural" if the note is white key, "Sharp" if it is black key.
     */
    public String getNoteType() {
        return getLetterName().contains("#") ? "Sharp" : "Natural";
    }

    /**
     * Calculates the frequency of the note in Hertz.
     * @return The frequency of the note in Hertz.
     */
    public double getFrequency() {
        return A440 * Math.pow(2, (value / 12.0));
    }

    // Getters and Setters
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    /**
     * Returns a string representation of the note.
     * @return A string with note details.
     */
    @Override
    public String toString() {
        return "Note: " + getLetterName() +
                ", Type: " + getNoteType() +
                ", Frequency: " + getFrequency() + " Hz" +
                ", Length: " + length;
    }
}