import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava {
    public ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        // To use methods from the Random library you will need to create an instance of Random
        Random randMachine = new Random();
        // From there you can use any of the methods listed in the documentation. For example:
        // randMachine.setSeed(35679); // <--- you won't need to use this method.

        for(int i = 0; i <10; i++){
            list.add(randMachine.nextInt(21));
        }
    
        return list;

    }

    public String getRandomLetter() {
        Random rand = new Random();
        // String[] alphabet = new String[26];
        String alphabetString = "abcdefghijklmnopqrstuvwxyz";
        String[] alphabet = new String[26];
        for (int i = 0; i < 26; i++) {
            alphabet[i] = String.valueOf(alphabetString.charAt(i)); 
        }
        String letter = alphabet[rand.nextInt(26)];
        return letter;
    }

    public String generatePassword() { 
        String password = "";
        for (int i = 0; i <8; i++){
            password +=this.getRandomLetter();
        }
        return password;
    }

    public ArrayList<String> generateNewPasswordSet(int numberOfPasswords) {
        ArrayList<String> passwords = new ArrayList<String>();

        for (int i = 0; i < numberOfPasswords; i++){
            String newPassword = this.generatePassword();
            passwords.add(newPassword);
        }
        return passwords;
    }

    public ArrayList<String> shuffleArrayList(ArrayList<String> array){
        Random rand = new Random();
        for (int i = 0; i < array.size(); i++){
            int indexOne = rand.nextInt(array.size());
            int indexTwo = rand.nextInt(array.size());
            String temp = array.get(indexOne);
            array.set(indexOne, array.get(indexTwo));
            array.set(indexTwo, temp);
        }
        return array;
    }
}