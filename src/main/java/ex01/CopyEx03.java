package ex01;

import lombok.Data;

@Data
class UserDTO3 {
    private int id;
    private String username;
    private String email;

    public UserDTO3(User user) {
        this.id = user.getId();
        this.username = user.getUsername();
        this.email = user.getEmail();
    }
}

public class CopyEx03 {
    public static void main(String[] args) {
        // 3. 생성자의 매개변수에 User 클래스 넘기기
        User user = new User();
        user.setId(1);
        user.setUsername("ssar");
        user.setEmail("ssar@nate.com");

        UserDTO3 dto3 = new UserDTO3(user);

        System.out.println(dto3);
    }
}
