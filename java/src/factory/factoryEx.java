package factory;

public class factoryEx {
    public static void main(String[] args) {
        Computer computer = ComputerStaticFactory.newInstance("Computer");
        computer.run();
        Computer pc = ComputerStaticFactory.newInstance("PC");
        pc.run();
    }

    static class Computer {
        private long ram;
        private long cpu;
        //ABCDEFG
        void run(){
            String name = this.getClass().getSimpleName();
            System.out.printf("%s is start to run\n",name);
        }
    }
    static class PC extends Computer { };
    static class LapTop extends Computer { };

    class ComputerStaticFactory {
        public static Computer newInstance (String type) {
            if (type.equals("Computer")) {
                return new Computer();
            } else if (type.equals("PC")) {
                return new PC();
            } else if (type.equals("LapTop")) {
                return new LapTop();
            }
            return null;
        }
    }
}
