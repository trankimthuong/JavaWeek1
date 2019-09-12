package testexe2;

public class ListPhoneNumber {

    public class Node<E>{
        private Node next;
        private Node prev;
        private String data[] = new String[3];

        public Node(String[] newPhone) {
            this.data = newPhone;
        }

        public String[] getData() {
            return data;
        }

        public void setData(String[] data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;
    public int numNodes;

    public void display(){
        System.out.println();
        Node temp = head;
        int count = 1;
        while (temp != null){
            System.out.println("phone number at position: " + count + " is: ");
            String result = "";
            result = "first name: " + temp.getData()[0]
                    + " last name: " + temp.getData()[1]
                    + " phone number: " + temp.getData()[2];
            count++;
            System.out.println(result);
            temp = temp.next;
        }
    }

    public void addFirst(String[] newPhone){
        Node<String[]> newNode = new Node<>(newPhone);
        if (this.head == null) {
            this.head = this.tail = newNode;
        } else {
            this.head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
        this.numNodes++;
    }

    public void addLast(String[] newPhone){
        Node<String[]> newNode = new Node<>(newPhone);
        if(tail == null){
            this.head = this.tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        this.numNodes++;
    }

    public void add(int index, String[] newPhone){
        if(index == 0) addFirst(newPhone);
        else if(index >= this.numNodes) addLast(newPhone);
        else{
            Node<String[]> current = head;
            for(int i = 1; i < index; i++){
                current = current.next;
            }
            Node<String[]> temp = current.next;
            current.next = new Node<>(newPhone);
            (current.next).next = temp;
            temp.prev = current.next;
            (current.next).prev = current;
            this.numNodes++;
        }
    }

    public void fix(String firstName, String[] newElement){
        boolean check = true;
        Node temp = head;
        while (temp != null){
            if(temp.getData()[0] == firstName){
                temp.setData(newElement);
                check = false;
            }
            temp = temp.next;
        }
        if(check){
            System.out.println("don't found this firstname: " + firstName);
        }
    }

    public void remove(String phoneNumber){
        boolean check = true;
        int count = 0;
        Node temp = head;
        while(temp != null){
            if(temp.getData()[2] == phoneNumber){
                check = false;
                remove(count);
            }
            temp = temp.next;
            count++;
        }
        if(check){
            System.out.println("Not found phone number ar this list");
        }
    }


    public String[] remove(int index){
       if(index < 0 || index >= this.numNodes) return null;
       else if(index == 0) return removeFirst();
       else if(index == this.numNodes - 1) return removeLast();
       else{
           Node<String[]> current = head;
           for(int i = 0; i < index; i++){
               current = current.next;
           }
           Node<String> temp = current.next;
           current.next = temp.next;
           temp.next.prev = current;
           this.numNodes--;
           return temp.data;
       }
    }

    public String[] removeFirst(){
        if(this.numNodes == 0) return null;
        else{
            Node<String[]> temp = this.head;
            head.next.prev = null;
            head = head.next;
            this.numNodes--;
            return temp.getData();
        }
    }

    public String[] removeLast(){
        if(this.numNodes == 0) return null;
        else if(this.numNodes == 1){
            Node<String[]> temp = head;
            head = tail = null;
            this.numNodes = 0;
            return temp.getData();
        }else {
            Node<String[]> current = head;
            for(int i = 1; i < this.numNodes - 1; i++){
                current = current.next;
            }

            Node<String[]> temp = tail;
            tail = current;
            tail.next = null;
            this.numNodes--;
            return temp.data;
        }
    }

    public void findFollowFirstName(String firstName){
        Node temp = head;
        boolean check = false;
        while (temp != null){
            if(temp.getData()[0] == firstName){
                check = true;
            }
            temp = temp.next;
        }
        if(check){
            System.out.println("Find this first name in the phonebook, firstname = " + firstName);
        }else{
            System.out.println("Not found this first name in the phonebook, firstname = " + firstName);
        }
    }

    public void findFollowLastName(String lastName){
        Node temp = head;
        boolean check = false;
        while (temp != null){
            if(temp.getData()[1] == lastName){
                check = true;
            }
            temp = temp.next;
        }
        if(check){
            System.out.println("Find this last name in the phonebook, lastname = " + lastName);
        }else{
            System.out.println("Not found this last name in the phonebook, lastname = " + lastName);
        }
    }

    public void findFollowPhoneNumber(String phoneNumber){
        Node temp = head;
        boolean check = false;
        while (temp != null){
            if(temp.getData()[2] == phoneNumber){
                check = true;
            }
            temp = temp.next;
        }
        if(check){
            System.out.println("Find this phone number in the phonebook, phonenumber = " + phoneNumber);
        }else{
            System.out.println("Not found this phone number in the phonebook, phonenumber = " + phoneNumber);
        }
    }

}
