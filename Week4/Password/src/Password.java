import javax.swing.JOptionPane;

public class Password {

    public Password() {

    }

    public void getPassword() {

        String password1 = JOptionPane.showInputDialog(null,
                "Please enter your password ", "Password", 1);

        while (true) {

            int length = password1.length();
            boolean valid = true;
            if (length < 6 || length > 10) {
                valid = false;

            } else {

                boolean charactersFound = false;
                boolean digitsFound = false;

                int characterCount = 0;
                int digitCount = 0;

                char[] chars = password1.toCharArray();
                int charsLength = chars.length;

                for (int i = 0; i < charsLength; i++) {
                    if (Character.isLetter(chars[i])) {
                        characterCount += 1;
                        if (characterCount > 0) {
                            charactersFound = true;
                        }
                    }

                    if (Character.isDigit(chars[i])) {
                        digitCount += 1;
                        if (digitCount > 0) {
                            digitsFound = true;
                        }
                    }
                }

                if (charactersFound && digitsFound) {
                    valid = true;
                } else {
                    valid = false;
                }
            }

            if (valid) {
                break;
            }

            password1 = JOptionPane.showInputDialog(
                    null,
                    "Password must be between 6 and 10 characters\n"
                            + "Password must contain at least 1 character and 1 digit"
                            + "\nPlease re-enter your password",
                    "Invalid Password", 1);
        }

        String password2 = JOptionPane.showInputDialog(null,
                "Please confirm your password ", "Password Confirmation", 1);
        while (true) {
            if (password1.equals(password2)) {
                break;
            }

            password2 = JOptionPane.showInputDialog(null, "Password Mismatch"
                    + "\nPlease re-enter your password ", "Password Confirmation", 1);
        }

        JOptionPane.showMessageDialog(null, "Password Is Confirmed! ",
                "Password Confirmed", 1);
    }

    public static void main(String[] args) {

        Password password = new Password();
        password.getPassword();
    }

}
