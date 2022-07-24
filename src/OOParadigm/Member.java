package OOParadigm;

public class Member {
    private String name;    // We used private to limit access from users
    private String type;    // you can only return private members through getter functions
    private int level;
    private int rank;

    public Member(String name, String type, int level, int rank){
        this.name= name;
        this.type = type;
        this.level =level;
        this.rank = rank;
    }

    public String getName() {   // What is your name?
        return this.name;   // My name is ...
    }

    public String getType() {   // What is your type?
        return this.type;   // My type is ...
    }

    public int getLevel() {     // What is your level?
        return this.level;  // My Level is ...
    }

    public int getRank() {      // What is your rank?
        return this.rank;   // My rank is ...
    }
}
