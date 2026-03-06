class Member {

    int memberId;
    String name;

    Member(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }

    void displayMember() {
        System.out.println(memberId + " | " + name);
    }
}