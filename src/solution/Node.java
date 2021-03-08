package solution;

public class Node extends ListItem{
    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return this.next;
    }

    @Override
    ListItem setNext(ListItem nextItem) {
        this.next = nextItem;
        return next;
    }

    @Override
    ListItem previous() {
        return this.previous;
    }

    @Override
    ListItem setPrevious(ListItem previousItem) {
        this.previous = previousItem;
        return previous;
    }

    @Override
    int compareTo(ListItem item) {
        if(item != null) {
            return ((String)super.getValue()).compareTo((String)item.getValue());
        }else {
            return -1;
        }
    }

}
