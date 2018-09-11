public class CharacterCheck {

    public String main(char input) {

        if (input>=65 && input<=90)
            return ("Character is a capital letter");

        else if (input>=97 && input<=122) //condition for small letters
            return ("Character is a small letter");

        else if (input>=48 && input<=57) //condition for digits
            return ("Character is a Number");

        else //condition for special characters
            return "Character is a special symbol";
    }
}