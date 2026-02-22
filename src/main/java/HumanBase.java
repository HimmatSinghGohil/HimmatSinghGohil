public class HumanBase {
    private final String name;
    private final int age;

    public HumanBase(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String introduce() {
        return "Hi, I am " + name + " and I am " + age + " years old.";
    }

    public static void main(String[] args) {
        HumanBase human = new HumanBase("Human", 25);
        System.out.println(human.introduce());
    }
}
