public class NodeCount {

    static class Node {

       int data;
       Node next;

       Node (int data){
           this.data = data;
       }
    }

    static int countNodes (Node head) {

        int numberOfNodes = 0;

        Node temp = head;


        while (temp.next != null)
            {
                numberOfNodes++;
                temp = temp.next;

            }

            System.out.println("koniec wezlow");

        return numberOfNodes;
    }


    public static void main(String[] args) {
        Node head = new Node(4);
        Node nodeB = new Node(2);
        Node nodeC = new Node(3);
        Node nodeD = new Node(4);
        Node nodeE = new Node(5);
        Node nodeF = new Node(6);
        Node nodeG = new Node(7);

        head.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;
        nodeD.next = nodeE;
        nodeE.next = nodeF;
        nodeG.next = null;

        System.out.println("liczba wezlow to: "+ countNodes(head));

    }

}
