package encapsulating;

public class ex {
    interface Character {

    }

    private static class Warrior implements Character {

    }

    private static class Archer implements Character {

    }

    class CharacterFactory {
        static Character newInstanceOfCharacter (String type) {
            switch (type) {
                case "Warrior" :
                    return new Warrior();
                case "Archer" :
                    return new Archer();
                default :
                    return null;
            }
        }
    }
}
