package ex01;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
class Board {          // 1:N의 관계에서 Board가 1
    private int id;
    private String title;
    private String content;
    private List<Reply> replies = new ArrayList<>();
}

@Data
class Reply {          // 1:N의 관계에서 Reply는 N
    private int id;
    private String comment;
}

@Data
class DetailDTO {
    private int id;
    private String title;
    private String content;
    private List<String> comments = new ArrayList<>();

    public DetailDTO(Board board) {
        this.id = board.getId();
        this.title = board.getTitle();
        this.content = board.getTitle();
        this.comments = board.getReplies().stream()
                .map(i -> i.getComment())
                .limit(2)
                .toList();

        // for (int i = 0; i < board.getReplies().size(); i++) {
        //     this.comments.add(board.getReplies().get(i).getComment());
        // }

        // for문은 복잡! stream이 보기 편함! -> 그래서 stream 배울 것
//        for (Reply reply : board.getReplies()) {
//            // if (id < 3)
//            if (reply.getId() < 3) {
//                this.comments.add(reply.getComment());
//            }
//            // this.comments.add(reply.getComment());
//        }
    }
}

public class CopyEx04 {
    public static void main(String[] args) {
        // 3. 클래스로 넘기기
        Reply r1 = new Reply();
        r1.setId(1);
        r1.setComment("댓글1");

        Reply r2 = new Reply();
        r2.setId(2);
        r2.setComment("댓글2");

        Reply r3 = new Reply();
        r3.setId(3);
        r3.setComment("댓글3");

        Board board = new Board();
        board.setId(1);
        board.setTitle("제목1");
        board.setContent("내용1");
        board.setReplies(List.of(r1, r2, r3));

        DetailDTO detailDTO = new DetailDTO(board);

        System.out.println(detailDTO);
    }
}
