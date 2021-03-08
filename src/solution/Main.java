package solution;

public class Main {
    public static void main(String[] args) {
        UserLinkedList list = new UserLinkedList(null);
        list.traverse(list.getRoot());

        String stringData = " Kyoto Osaka Nara Mie Sendai Sapporo Tokyo Kitakyushu Fukushima Okashima Sato Okinawa Kagoshima Kochi Nagoya";

        String[] data = stringData.split(" ");
        for (String s : data) {
            list.addItem(new Node(s));
        }

        list.traverse(list.getRoot());







    }
}
