import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestingOneTwoThree{
    //https://www.codewars.com/kata/54bf85e3d5b56c7a05000cf9/

    public class LineNumbering {
        public List<String> number(List<String> lines) {
            return IntStream.range(0, lines.size())
                    .mapToObj(i -> (i + 1) + ": " + lines.get(i))
                    .collect(Collectors.toList());
        }
    }
}