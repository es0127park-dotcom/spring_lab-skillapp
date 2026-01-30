package ex03;

import java.sql.Timestamp;
import java.time.*;

public class TimeEx01 {
    public static void main(String[] args) {
        // 1. 로컬 데이트 타임
        LocalDateTime now1 = LocalDateTime.now(); // 자바 레벨의 타임존
        System.out.println("LocalDateTime : " + now1);

        // 2. 존을 설정해서 시간 만들기 (X)
        ZonedDateTime now2 = ZonedDateTime.now(ZoneOffset.UTC);
        System.out.println("ZonedDateTime : " + now2);

        // 3. Instant 시간 (O)
        Instant now3 = Instant.now();
        System.out.println("Instant : " + now3);

        // 4. Timestamp (milliseconds - 1/1000초) 내부적으로 컴버팅해줌
        // 시간이 변환되서 출력됨(위험) -> 안쓰는 것이 좋음
        Timestamp now4 = new Timestamp(1000 * 300);
        System.out.println("Timestamp(1) : " + now4);

        Timestamp now5 = new Timestamp(System.currentTimeMillis());
        System.out.println(System.currentTimeMillis());
        System.out.println("Timestamp(2) : " + now5);
    }
}
