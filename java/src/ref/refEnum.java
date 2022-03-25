package ref;

public class refEnum {
    public static void main(String[] args) {
        enum color { RED,ORANGE,YELLOW,GREEN }

        enum Rainbow{
            RED(3),ORANGE(10),YELLOW(21),GREEN(5);
            private final int value;
            Rainbow(int value){
                this.value = value;
            }
            public int getValue(){
                return value;
            }
        }

        System.out.println(Rainbow.RED.getValue());
        Rainbow[] arr = Rainbow.values();
        for(Rainbow rb : arr){
            System.out.println(rb);
        }

        Rainbow rb = Rainbow.valueOf("GREEN");
        System.out.println(rb);

    }
}
