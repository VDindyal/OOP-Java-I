import java.util.ArrayList;

public class Phonebook {
    private ArrayList<Person> members;

    public Phonebook() {
        this.members = new ArrayList<Person>();
    }

    public void add(String name, String number) {
        members.add(new Person(name, number));
    }

    public void printAll() {
        for(Person member: members) {
            System.out.println(member);
        }
    }

    public String searchNumber(String name) {
        for(Person member: members) {
            if (member.getName().contains(name)) {
                return member.getNumber();
            }
        }
        return "number not known";
    }
}