package assignment;

public class Def<Person> implements ADT<Person> {


    @Override
    public boolean add(Person details) {
        return false;
    }

    @Override
    public boolean delete(int index) {
        return false;
    }

    @Override
    public void search(String person) {

    }

    @Override
    public void viewAllDetails() {

    }

    private static class Node<Person> {
        private Node next = null;
        private Person data = null;

        public Node(Person data) {
            this.data = data;

            this.next = null;
        }

        public Node(Node next, Person data) {
            this.next = next;
            this.data = data;

        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Person getData() {
            return data;
        }

        public void setData(Person data) {
            this.data = data;
        }
    }


}
