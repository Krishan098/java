/*
Multiple classes can be created within the same source file if needed for encapsulation purposes.
*/
public class MultipleClassesInSameFile {
    public static void main(String[] args) {
        IO.println(GenerateMessage.generateMessage());
        IO.println(AnotherMessage.generateAnotherMessage());
    }
}
class GenerateMessage{
    static String generateMessage(){
        return "You are going to get lucky!";
    }
}

class AnotherMessage{
    static String generateAnotherMessage(){
        return "Nah! Better luck next time";
    }
}