package stream;

import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class exStream4 {
    public static void main(String[] args) {
        Stream<AccountVO> stream = Stream.generate(() -> Math.random() + 1).map(e -> {
            AccountVO accountVO = new AccountVO();
            accountVO.setBalance(e.longValue());
            accountVO.setNumber(e.toString());
            return accountVO;
        }).limit(10);

        //Double collect = stream.collect(Collectors.averagingDouble(AccountVO::getBalance));
        //System.out.println(collect);
//        AccountVO accountVO = stream.reduce((x, y) -> x.getBalance() > y.getBalance() ? x : y).orElse(null);
//        System.out.println(Objects.requireNonNull(accountVO).toString());
    }
}
