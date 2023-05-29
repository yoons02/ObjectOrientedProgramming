class AgeOverException extends Exception {
    public AgeOverException(String message) {
    super(message); }
}
class NameErrorException extends Exception {
    public NameErrorException(String message) {
    super(message); }
}
public class EX20_2 {
//    public static void main(String[] args) {
//        try {
//            validateAge(15, "JohnDoe");
//        } catch (AgeOverException e) {
//            System.out.println("Age Validation Exception: " + e.getMessage()); e.printStackTrace();
//        } catch (NameErrorException e) {
//            System.out.println("Name Error Exception: " + e.getMessage()); e.printStackTrace();
//        } }
    public static void main(String[] args) {
        try {
            validateAge(15, "JohnDoe"); }
        catch (AgeOverException e) {
            System.out.println("Age Validation Exception: " + e.getMessage());
            e.printStackTrace(); }
        catch (NameErrorException e) {
            System.out.println("Name Error Exception: " + e.getMessage()); e.printStackTrace();
        }
        catch (Exception e){
            System.out.println("Expetion: " + e.getMessage());
            e.printStackTrace();
        }
    }
    public static void validateAge(int age, String name) throws AgeOverException, NameErrorException { if (age > 18) {
        throw new AgeOverException("Age should be at least 18"); }
        if (name.length() > 5) {
            throw new NameErrorException("Name length should not exceed 5 characters");
        }
        System.out.println("Age and name are valid"); }

}