package stream;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class exStream3 {
    public static void main(String[] args) {
        List<StudentVO> resultList = Stream.iterate(1, i -> ++i).map(e -> {
            StudentVO studentVO = new StudentVO();
            studentVO.setSeq(e);
            return studentVO;
        }).limit(10).toList();


        IntSummaryStatistics stat = resultList.stream().mapToInt(StudentVO::getSeq).summaryStatistics();
        System.out.println(stat.getSum());

        //List<Integer> integers = Stream.iterate(1, l -> ++l).limit(10).toList();
        //integers.forEach(System.out::println);

        List<Integer> integers = IntStream.range(1, 10).boxed().toList();
    }
}
