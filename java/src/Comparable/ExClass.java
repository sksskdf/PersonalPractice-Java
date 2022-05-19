package Comparable;

public class ExClass implements Comparable<ExClass>{
    private int number;
    private String name;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(ExClass o) {
        final int compareByNum = Integer.compare(getNumber(), o.getNumber());
        final int compareByName = getName().compareTo(o.getName());
        return (compareByNum != 0 ? compareByNum : compareByName);
    }
}
