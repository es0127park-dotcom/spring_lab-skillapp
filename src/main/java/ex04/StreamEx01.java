package ex04;

import java.util.List;

/**
 * Stream : 임시 개울 (임시 수도관)
 */

public class StreamEx01 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4);

        // 1. 가공
        List<Integer> newList = list.stream()  // 개울에 던지기
                .map(i -> i * 2)        // 가공 or 연산 (N번) : 중간 연산
                .toList();                     // 수집

        // for문으로 출력
        // newList.stream().forEach(i -> {
        //    System.out.println(i);
        // });

        // 2. filter
        List<Integer> newList2 = list.stream()
                .map(i -> i+1)
                // .peek(i -> System.out.print(i + " "))  // 한 줄만 적으면 중괄호도 생략 가능
                .filter(i -> i < 3)
                .toList();

        // for (Integer i : newList2) {
        //    System.out.print(i + " ");
        // }

        // 3. Max
        int maxNum = list.stream()
                .mapToInt(i -> i)
                .max()
                .getAsInt();
        // System.out.println(maxNum);

        // 4. limit
        List<Integer> newList4 = list.stream()
                .limit(2)
                // .peek(i -> System.out.print(i + " "))
                .toList();
    }
}
