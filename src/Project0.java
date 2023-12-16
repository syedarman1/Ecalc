import javax.swing.JOptionPane;

public class Project0 {
    public static void main(String[] args) {
        while (true) {
            // Prompts the user to enter a sentence (or 'STOP' TO exit)
            String sentence = JOptionPane.showInputDialog("Please enter a sentence. (type 'STOP' to exit)");

            // Checks to see if the user clicked cancel on the Input
            if (sentence == null) {
                break; // Exits the program if the User cancels
            }

            // Checks to see if user entered 'STOP'
            if (sentence.equalsIgnoreCase("STOP")) {
                break;
            }
            // Initialize counters for upperCaseE and lowercaseE
            int upperCaseE = 0;
            int lowerCaseE = 0;

            // Loops through each character in the sentence
            for (int i = 0; i < sentence.length(); i++) {
                char thisChar = sentence.charAt(i);
                // Checks to see if Current Character is an uppercaseE
                if (thisChar == 'E') {
                    upperCaseE++; // Increments the count of uppercaseE
                }
                // Checks to see if Current character is a lowercaseE
                else if (thisChar == 'e') {
                    lowerCaseE++; // Increments the count of lowercaseE
                }
            }

            // Displays the dialog with how many counts of uppercaseE and lowercaseE
            JOptionPane.showMessageDialog(
                    null,
                    "Number of upper case e's: " + upperCaseE + "\nNumber of lower case e's: " + lowerCaseE,

                    "E Count",
                    JOptionPane.INFORMATION_MESSAGE
            );

        }
    }
}
