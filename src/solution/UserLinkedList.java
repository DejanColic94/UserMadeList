package solution;

public class UserLinkedList implements INodeList{

    private ListItem root = null;

    public UserLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if(root == null) {
            this.root = item;
            return true;
        }
        ListItem currentItem = root;
        while(currentItem != null) {
            int comparison = currentItem.compareTo(item);
            if(comparison < 0) {
                if(currentItem.next() != null) {
                    currentItem = currentItem.next();
                }else {
                    currentItem.setNext(item);
                    item.setPrevious(currentItem);
                    return true;
                }
            }else if(comparison > 0) {
                if(currentItem.previous() != null) {
                   currentItem.previous().setNext(item);
                   item.setPrevious(currentItem.previous());
                   item.setNext(currentItem);
                   currentItem.setPrevious(item);
                }else {
                    item.setNext(this.root);
                    this.root.setPrevious(item);
                    this.root = item;
                }
                return true;
            }else {
                System.out.println(item.getValue() + " is already in the list. Item NOT added!");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if(root == null) {
            System.out.println("The list is empty!");
        }else {
            while(root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }

    }



























}
