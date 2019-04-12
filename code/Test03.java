/**
 * Author: 沈博
 * Date: 2019-04-12
 * Declaration: 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 */
import java.util.ArrayList;

public class Test03 {
	
    static public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
	
	public static void main(String[] args) {
        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next = new ListNode(3);
        root.next.next.next = new ListNode(4);
        root.next.next.next.next = new ListNode(5);
        
        ArrayList<Integer> list = new ArrayList<>();
        list = printListFromTailToHead(root);
        System.out.println(list);
	}
	
	static public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		ListNode node = listNode;
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		while(node != null){
			list.add(node.val);
			node = node.next;
		}
		for(int i = list.size()-1; i>=0;i--){
			list2.add(list.get(i));
		}
		return list2;
    }
}
