public class Stequeue {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.push(18);
        list.push(45);
        list.push(12);
        list.enqueue(25);
        list.enqueue(555);

        list.show();
        list.pop();
        list.show();
    }
}
