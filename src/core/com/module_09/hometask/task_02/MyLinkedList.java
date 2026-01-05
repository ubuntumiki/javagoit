package core.com.module_09.hometask.task_02;

public class MyLinkedList<T> {
    private Node<T> first;
    private Node<T> last;
    private int size = 0;

    public void add(T value) {
        Node<T> node = new Node<>(value);

        if (first == null) {
            first = node;
            last = node;
        } else {
            last.next = node;
            node.prev = last;
            last = node;
        }
        size++;
    }

    public T remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Error");
        }

        Node<T> current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        T removed = current.value;

        if (current.prev != null) {
            current.prev.next = current.next;
        } else {
            first = current.next;
        }

        if (current.next != null) {
            current.next.prev = current.prev;
        } else {
            last = current.prev;
        }

        size--;
        return removed;

    }

    public void clear() {
        first = null;
        last = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Error");
        }

        Node<T> current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current.value;
    }
}
