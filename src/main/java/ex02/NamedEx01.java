package ex02;

import lombok.Data;

@Data
class User {
    // 공통
    private int id;
    private String username;
    private String password;
    private String type;              // 학생, 선생 구분

    // 학생
    private String classRoom;         // 교실
    private String classYear;         // 학년

    // 선생
    private String subject;           // 담당 과목
    private String teacherName;       // 이름

    private User() {} // 외부에서 절대 new 못함! 이름 있는 생성자에서 new 해줘야 함!

    // 이름 있는 생성자 (목적에 맞게 new 가능 / 대신 기본생성자 접근 못하게 private로 막아야 함)
    public static User createTeacher(int id, String username, String password, String subject, String teacherName) {
        User user = new User();
        user.id = id;
        user.username = username;
        user.password = password;
        user.type = "선생";
        user.subject = subject;
        user.teacherName = teacherName;

        return user;
    }

    public static User createStudent(int id, String username, String password, String classRoom, String classYear) {
        User user = new User();
        user.id = id;
        user.username = username;
        user.password = password;
        user.type = "학생";
        user.classRoom = classRoom;
        user.classYear = classYear;

        return user;
    }
}

public class NamedEx01 {
    public static void main(String[] args) {
        User student = User.createStudent(1,"ssar","1234","101", "3");
        User teacher = User.createTeacher(2,"cos","1234","수학", "cos");

        System.out.println(student);
        System.out.println(teacher);
    }
}
