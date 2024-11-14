public class NoteTest {
    public static void main(String[] args) {
        // Test default note
        Note defaultNote = new Note();
        System.out.println("Default Note:");
        System.out.println("Letter: " + defaultNote.getLetterName());
        System.out.println("Type: " + defaultNote.getNoteType());
        System.out.println("Frequency: " + defaultNote.getFrequency() + " Hz");
        System.out.println("Length: " + defaultNote.getLength());
        System.out.println("Value: " + defaultNote.getValue()); // Added call to getValue()
        System.out.println(defaultNote);
        System.out.println();

        // Test custom note
        Note customNote = new Note(8, 3); // Example of a different note
        System.out.println("Custom Note:");
        System.out.println("Letter: " + customNote.getLetterName());
        System.out.println("Type: " + customNote.getNoteType());
        System.out.println("Frequency: " + customNote.getFrequency() + " Hz");
        System.out.println("Length: " + customNote.getLength());
        System.out.println("Value: " + customNote.getValue()); // Added call to getValue()
        System.out.println(customNote);
        System.out.println();

        // Test setting note length and value
        customNote.setLength(16); // e.g., set to sixteenth note
        customNote.setValue(7); // e.g., some other note
        System.out.println("Updated Custom Note:");
        System.out.println("Letter: " + customNote.getLetterName());
        System.out.println("Type: " + customNote.getNoteType());
        System.out.println("Frequency: " + customNote.getFrequency() + " Hz");
        System.out.println("Length: " + customNote.getLength());
        System.out.println("Value: " + customNote.getValue()); // Added call to getValue()
        System.out.println(customNote);
    }
}