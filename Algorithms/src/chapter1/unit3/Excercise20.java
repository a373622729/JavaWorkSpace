package chapter1.unit3;

/**
 * Created by ios on 17/3/9.
 * 链表的逆序
 */
public class Excercise20 {

    private class Node<Item> {
        Item item;
        Node<Item> next;
    }

    //循环的方式
    public Node reverse(Node x) {
        Node first = x;        //原来的头结点
        Node reverse = null ;  //逆序后的头结点
        while (first.next != null) {
            Node second = first.next;   //second指向first后面那个节点,使得后面可以拿到
            first.next = reverse;       //将first节点的next调转箭头指向前面的节点
            reverse = first;            //reverse指向已经调转箭头了的节点
            first = second;             //first还是指向原来那个列表 当前的头结点
        }
        return reverse;
    }

    //递归方式实现
    public Node reverseRecur(Node first) {
        if (first == null) return null;
        if (first.next == null) return first;
        Node second = first.next;
        Node res = reverseRecur(second);  //返回后面一个节点
        second.next = first;              //后面这个节点调转箭头指向前面
        first.next = null;                //前面指向后面这个节点的箭头消失
        return res;
    }

}
