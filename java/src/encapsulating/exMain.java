package encapsulating;

public class exMain {
    public static void main(String[] args) {
        String characterName = ex.CharacterFactory.newInstanceOfCharacter("Warrior").getClass().getSimpleName();
        System.out.println(characterName);
    }
}
