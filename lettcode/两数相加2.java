public class 两数相加2 {
    /**
     * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储    一位 数字。
     *
     * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
     *
     * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
     *
     * 示例：
     *
     * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
     * 输出：7 -> 0 -> 8
     * 原因：342 + 465 = 807
     */
    public static void main(String[] args) {
        //TODO

    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null){
            l1 = new ListNode(0);
        }
        if(l2 == null){
            l2 = new ListNode(0);
        }


        if(l1.next == null && l2.next == null){
            int val = l1.val + l2.val;
            if(val >9){
                //取余设置第二位的值
                ListNode node = new ListNode(val%10);
                ;//设置第一位
                node.next = new ListNode(val/10);
                return node;
            }else{
                return  new ListNode(val);
            }
        }else{
            int val = l1.val+l2.val;
            if(val>9){
                val = val-10;
                if(l1.next!=null) {
                    l1.next.val++;
                }else if(l2.next!=null){
                    l2.next.val++;
                }
            }
            ListNode node = new ListNode(val);
            //开始迭代
            node.next = addTwoNumbers(l1.next,l2.next);
            return node;
        }

    }

}

 class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }
