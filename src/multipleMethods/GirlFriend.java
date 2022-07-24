package multipleMethods;

public class GirlFriend {
    private String girlName;                // Only methods inside this class can access girlName
    public void setName(String girlName) {  // A constructor Method to set the girlName
        this.girlName = girlName;
    }
    public String getName () {              // A method To access the girlName
        return girlName;
    }
    public void saying() {
        System.out.printf("Your first girlfriend was %s", getName()); // Using printf of C language.
    }
}
