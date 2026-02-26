package org.example.datastructures;

public class NodeSL {
    public int data;
    public NodeSL next;

    public NodeSL(int data){
        this.data = data;
        this.next = null;
    }

    public NodeSL deleteSpecificNode(NodeSL head, NodeSL nodeToDelete){
        // nodeToDelete is a first node, link head to next
        if ( head == nodeToDelete) {
            return head.next;
        }

        NodeSL currentNode = head;
        // until the node has next and is not nodeToDelete, set node.next
        while ( currentNode.next != null && currentNode.next != nodeToDelete){
            currentNode = currentNode.next;
        }

        // no nodeToDelete found
        if ( currentNode.next == null ){
            return head;
        }

        // skip the nodeToDelete, delink it
        currentNode.next = currentNode.next.next;

        return head;
    }
}
