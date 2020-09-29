package validating;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
            
        if (name == null || name.length() > 40 || name.equals("") || age < 0 || age > 120 ) {
            throw new IllegalArgumentException("Age 0 - 120, name cannot be empty");
        }
        
        this.name = name;
        this.age = age;
    }

    public String getName() {
        
        return name;
    }

    public int getAge() {
        return age;
    }
}
