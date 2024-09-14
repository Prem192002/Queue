import java.util.LinkedList;
import java.util.Queue;

public class basic{
    public static void main(String[] args) {
        Queue <Integer> q = new LinkedList<>();
        q.add(5);
        q.add(10);
        q.add(15);
        q.add(20);
        q.add(25);

        System.out.println(q);
        q.remove();
        System.out.println(q);
        System.out.println(q.peek());
    }
}