package Java.OTHER;

public class QueueUsingStack {

    public static void main(String[] args) {
        MyQueue x = new MyQueue();
        x.push(1);
        x.push(2);
        x.push(3);
        x.push(4);
        x.push(5);
        System.out.println(x.pop());
        System.out.println(x.pop());
        System.out.println(x.pop());
        System.out.println(x.pop());
        System.out.println(x.pop());

    }
}
