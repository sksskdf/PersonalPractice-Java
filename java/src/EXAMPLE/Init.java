package EXAMPLE;

public class Init {
    public static Citizen[] initCitizens() {
        Citizen mark = new Citizen();
        mark.setName("Mark Olson");
        mark.setPassport("503143798");

        Address markAddress = new Address();
        markAddress.setState("Arkansas");
        markAddress.setCity("Conway");
        markAddress.setStreet("1661  Dawson Drive");

        mark.setAddress(markAddress);

        Citizen anna = new Citizen();
        anna.setName("Anna Flores");
        anna.setPassport("60513321");

        Address annaAddress = new Address();
        annaAddress.setState("Georgia");
        annaAddress.setCity("Atlanta");
        annaAddress.setStreet("4353  Flint Street");

        anna.setAddress(annaAddress);

        return new Citizen[]{ mark, anna };
    }
}
