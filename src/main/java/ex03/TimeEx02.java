package ex03;

import java.time.LocalDateTime;

public class TimeEx02 {
    public static void main(String[] args) {
        // 1. 로컬 데이트 타임 (벽시계 - 문자열로 박힌 시계)
        LocalDateTime now1 = LocalDateTime.now(); // 현재 시간
        System.out.println("now : " + now1);
        System.out.println("==============================================");

        // 년, 월, 일, 시, 분, 초
        System.out.println("년 : " + now1.getYear());
        System.out.println("월 : " + now1.getMonth());
        System.out.println("일 : " + now1.getDayOfMonth());
        System.out.println("시 : " + now1.getHour());
        System.out.println("분 : " + now1.getMinute());
        System.out.println("초 : " + now1.getSecond());
        System.out.println("==============================================");

        // 날짜 더하기, 시간 더하기
        System.out.println("now + 5년 : " + now1.plusYears(5));
        System.out.println("now + 5개월 : " + now1.plusMonths(5));
        System.out.println("now + 5일 : " + now1.plusDays(5));
        System.out.println("now + 5시간 : " + now1.plusHours(5));
        System.out.println("now + 5분 : " + now1.plusMinutes(5));
        System.out.println("now + 5초 : " + now1.plusSeconds(5));
        System.out.println("==============================================");

        // 2026-01-30T15:43:11.740733800
        // 2026-01-30T06:43:11.740733800Z (Z 붙어있으면 UTC(초)로 저장되어 있음)


    }
}
