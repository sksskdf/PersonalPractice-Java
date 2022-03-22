package ref;

import java.util.List;

public class varEx {
    public static void main(String[] args) {
        var list = List.of(1,2,3,4,5);
        for(var element:list){
            System.out.println(element);
        }

        var list2 = List.of(1,"3",4,5,"abc");
        for(var element:list2){
            System.out.println(element);
        }

        /*var path = Path.of("/a.txt");
        try(var stream = Files.newInputStream(path)){
            System.out.println(path.getFileName());
        }catch(Exception e){
            e.printStackTrace();
        }*/
    }
}
