package software.designpatterns.utils;

import java.util.List;
import java.util.stream.Collectors;

public class ListUtil {

    public static <T> List<T> clone(List<T> list) {
        return list.stream().collect(Collectors.toList());
    }
}
