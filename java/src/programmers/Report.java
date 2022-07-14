package programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Report {
    public int[] solution(String[] id_list, String[] report, int k) {
        List<String> distReport = Arrays.stream(report).distinct().collect(Collectors.toList());
        int[] result = new int[id_list.length];

//        Map<String, HashSet<String>> map = Arrays.stream(id_list).collect(Collectors.toMap(key -> key, value -> new HashSet<>()));
//
//        distReport.stream().map(e -> Arrays.stream(e.split(" ")).collect(Collectors.toList())).forEach(e -> {
//            String from = e.get(0);
//            String to = e.get(1);
//            map.get(to).add(from);
//
//        });
//
//        IntStream.range(0, id_list.length).forEach(e -> {
//            HashSet<String> send = map.get(id_list[e]);
//            if (send.size() >= k) {
//                for (String name : send) {
//                    result[Arrays.stream(id_list).collect(Collectors.toList()).indexOf(name)]++;
//                }
//            }
//        });

        List<String> list = Arrays.stream(report).distinct().collect(Collectors.toList());
        HashMap<String, Integer> count = new HashMap<>();
        for (String s : list) {
            String target = s.split(" ")[1];
            count.put(target, count.getOrDefault(target, 0) + 1);
        }

        HashMap<String, Integer> abc = new HashMap<>();
//        abc.put("a" , abc.getOrDefault("a", 0) + 1);
//        abc.put("a" , abc.getOrDefault("a", 0) + 1);
        

        return result;

//        int[] answer = new int[id_list.length];
//        Map<String, HashSet<String>> map = new HashMap<>();
//        Map<String, Integer> idxMap = new HashMap<>();
//
//        for (int i = 0; i < id_list.length; i++) {
//            String name = id_list[i];
//            map.put(name, new HashSet<>());
//            idxMap.put(name, i);
//        }
//
//        for (String s : report) {
//            String[] str = s.split(" ");
//            String from = str[0];
//            String to = str[1];
//            map.get(to).add(from);
//        }
//
//        for (int i = 0; i < id_list.length; i++) {
//            HashSet<String> send = map.get(id_list[i]);
//            if (send.size() >= k) {
//                for (String name : send) {
//                    answer[idxMap.get(name)]++;
//                }
//            }
//        }
//        return answer;
    }

    public static void main(String[] args) {
        String[] id_list = {"frodo", "neo", "muzi", "ryan"};
        String[] reports = {"frodo neo","frodo neo","frodo muzi","ryan neo","ryan muzi","neo ryan","muzi ryan"};
        int k = 2;

        Report report = new Report();
        int[] solution = report.solution(id_list, reports, k);
    }
}
