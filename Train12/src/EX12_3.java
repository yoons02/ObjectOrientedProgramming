abstract class Pet12 {
    protected String name;
    protected int age;
    protected String owner;
    protected boolean isVaccinated;

    public Pet12(String name, int age, String owner, boolean isVaccinated) {
        this.name = name;
        this.age = age;
        this.owner = owner;
        this.isVaccinated = isVaccinated;
    }

    public String getName() {
        return name;
    }

    public boolean isVaccinated() {
        return isVaccinated;
    }

    public abstract void makeSound();
}


interface Groomable {
    void groom();
}
interface Walkable {
    void walk();
}

class Dog12 extends Pet12 implements Groomable, Walkable {
    // todo: 내부 구현
    private String color;
    public Dog12(String name, int age, String owner, boolean isVaccinated, String color) {
        super(name, age, owner, isVaccinated);
        this.name = name;
        this.age = age;
        this.owner = owner;
        this.isVaccinated = isVaccinated;
        this.color = color;
    }

    public void makeSound(){
        System.out.println("Bark!");
    }
    public void groom(){
        System.out.println("Grooming the dog...");
    }

    public void walk(){
        System.out.println("Walking the dog...");
    }
}


class Cat12 extends Pet12 implements Groomable, Walkable {
    private String color;

    //todo: 내부 구현
    public Cat12(String name, int age, String owner, boolean isVaccinated, String color) {
        super(name, age, owner, isVaccinated);
        this.name = name;
        this.age = age;
        this.owner = owner;
        this.isVaccinated = isVaccinated;
        this.color = color;
    }

    public void makeSound(){
        System.out.println("Meow!");
    }
    public void groom(){
        System.out.println("Grooming the cat...");
    }

    public void walk(){
        System.out.println("Walking the cat...");
    }
}


public class EX12_3 {
    public static void main(String[] args) {
        // 펫 객체 생성
        Pet12 bobby = new Dog12("Bobby", 3, "Alice", true, "White");
        Pet12 coco = new Cat12("Coco", 2, "Bob", false, "Gray");

        // 펫 소리 출력 (your code)
        bobby.makeSound();
        coco.makeSound();

        // 예방 접종 여부 출력 (your code)
        System.out.printf("Is %s vaccinated ? %s\n", bobby.name, bobby.isVaccinated());
        System.out.printf("Is %s vaccinated ? %s\n", coco.name, coco.isVaccinated());

        // 그루밍 (your code)
        ((Dog12) bobby).groom();
        ((Cat12) coco).groom();

        // 산책 (your code)
        ((Dog12) bobby).walk();
        ((Cat12) coco).walk();
    }
}
