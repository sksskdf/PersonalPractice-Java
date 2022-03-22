package ref;

public class refRecord {
    public record point(int x){
        public point{
            if(x>10) {
                throw new IllegalArgumentException("it can't be over 10");
            }
        }
    }

    public static void main(String[] args) {
        point p = new point(9);
        System.out.println(p.toString());
    }
}


