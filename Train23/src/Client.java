//interface MovingStrategy{
//    public void move();
//
//}
//
//interface AttackStrategy{
//    public void move();
//}
//
//class WalkingStrategy implements MovingStrategy{
//    public void move(){
//
//    }
//}
//
//class FlyingStrategy implements MovingStrategy{
//    public void move(){
//
//    }
//}
//
//class PunchStrategy implements AttackStrategy {
//    public void move(){
//
//    }
//}
//
//class MissileStrategy implements AttackStrategy{
//    public void move(){
//
//    }
//}
//
//abstract class Robot{
//    private String name;
//
//    public Robot(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    // 공격
//    public abstract void attack();
//
//    // 이동
//    public abstract void move();
//
//    public abstract void setMovingStrategy(MovingStrategy MovingStrategy);
//    public abstract void setAttackStrategy(AttackStrategy AttackStrategy);
//}
//
//// 태권브이 클래스 : 로봇 클래스 상속
//class TaeKwonV extends Robot {
//
//    public TaeKwonV(String name) {
//        super(name);
//    }
//
//    @Override
//    public void attack() {
//        System.out.println("I have Missile and can attack with it.");
//    }
//
//    @Override
//    public void move() {
//        System.out.println("I can only walk.");
//    }
//
//    @Override
//    public void setMovingStrategy(MovingStrategy WalkingStrategy) {
//
//    }
//
//    @Override
//    public void setAttackStrategy(AttackStrategy PunchStrategy) {
//
//    }
//}
//
//// 아톰 클래스 : 로봇 클래스 상속
//class Atom extends Robot {
//
//    public Atom(String name) {
//        super(name);
//    }
//
//    @Override
//    public void attack() {
//        System.out.println("I have strong punch and can attack with it.");
//    }
//
//    @Override
//    public void move() {
//        System.out.println("I can fly.");
//    }
//
//    @Override
//    public void setMovingStrategy(MovingStrategy WalkingStrategy) {
//
//    }
//
//    @Override
//    public void setAttackStrategy(AttackStrategy PunchStrategy) {
//
//    }
//
//}
//
//public class Client {
//    public static void main(String[] args) {
//        Robot taekwonV = new TaeKwonV("TaekwonV");
//        Robot atom = new Atom("Atom");
//
//        taekwonV.setMovingStrategy(new WalkingStrategy());
//        taekwonV.setAttackStrategy(new AttackStrategy());
//
//        atom.setMovingStrategy(new FlyingStrategy());
//        atom.setMovingStrategy(new PunchStrategy());
//
//        System.out.println("My name is " + taekwonV.getName());
//        taekwonV.move();
//        taekwonV.attack();
//
//        System.out.println("My name is " + atom.getName());
//        atom.move();
//        atom.attack();
//    }
//}
