package  LinkedList;
 class ListNode {
      int val;
     ListNode next;
      ListNode() {}

      ListNode(int val) {
          this.val = val;
      }

      ListNode(int val, ListNode next) {
          this.val = val;
          this.next = next;
      }

     public ListNode deleteMiddle(ListNode head) {
         //Using Tortoise and haire method

         if(head == null || head.next == null) return null;//null pointer at head

         ListNode slow = head, fast = head;
         fast = head.next.next;//update pointer

         while(fast != null && fast.next != null){
             slow = slow.next;
             fast = fast.next.next;
         }

         if(slow.next != null) slow.next = slow.next.next;

         return head;
     }
  }


