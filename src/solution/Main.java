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


        UserLinkedList list1 = new UserLinkedList(null);
        String stringData1 = " 1 4 6 23 7 8 3 9 0 12 5 2";

        String[] data1 = stringData1.split(" ");
        for (String s : data1) {
            list1.addItem(new Node(s));
        }
        list1.traverse(list1.getRoot());
        list1.removeItem(new Node("23"));
        list1.traverse(list1.getRoot());

        list1.traverse(list1.getRoot());
        list1.removeItem(new Node("12"));
        list1.traverse(list1.getRoot());

        System.out.println("================================================================");

        SearchTree tree = new SearchTree(null);


        String stringData2 = " 5 0 8 2 7 6 1 4 3 9";

        String[] data2 = stringData2.split(" ");
        for (String s : data2) {
            tree.addItem(new Node(s));
        }

        tree.traverse(tree.getRoot());

        tree.traverse(tree.getRoot());
        tree.removeItem(new Node("6"));
        tree.traverse(tree.getRoot());

        tree.traverse(tree.getRoot());
        tree.removeItem(new Node("9"));
        tree.traverse(tree.getRoot());

    }
}
