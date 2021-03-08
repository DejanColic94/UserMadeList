package solution;

public abstract class ListItem {
    protected ListItem next = null;
    protected ListItem previous = null;
    protected Object value;

    public ListItem(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    abstract ListItem next();

    abstract ListItem setNext(ListItem nextItem);

    abstract ListItem previous();

    abstract ListItem setPrevious(ListItem previousItem);

    abstract int compareTo(ListItem item);


}
