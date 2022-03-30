package ref;

import jdk.jshell.spi.ExecutionControlProvider;

public class refException {
    public static void main(String[] args) {
        try{
            Exception e = new Exception("Exception");
            throw e;
        }catch(Exception e){
            System.err.println(String.format("Error : %s",e.getMessage()));
            System.err.println(String.format("Cause : %s",e.getCause()));
        }

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        try{
            Exception e = new IllegalArgumentException("IllegalArgExc");
            throw e;
        }catch(Exception e){
            System.err.println(String.format("Error : %s",e.getMessage()));
            System.err.println(String.format("StackTrace : %s",e.getStackTrace()));
            System.err.println(e.getLocalizedMessage());
            System.err.println(e.getStackTrace());
            System.err.println(e.getSuppressed());
            System.err.println(e.getClass());
        }
    }
}
