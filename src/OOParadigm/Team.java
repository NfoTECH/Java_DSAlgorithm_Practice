package OOParadigm;

public class Team {
    Member member;
    public Team(Member member) {
        this.member = member;
    }

    public static void main(String[] args) {
        Member myMember = new Member("Fortunate", "Student", 10, 2);
        Team myTeam = new Team(myMember);
        System.out.println(myTeam.member.getName());
        System.out.println(myTeam.member.getType());
        System.out.println(myTeam.member.getLevel());
        System.out.println(myTeam.member.getRank());

    }
}
