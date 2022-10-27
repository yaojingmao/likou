package com.tc;

//力扣第二题
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class day01_2 {


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //相当于一个头指针不动
        ListNode listNode = new ListNode(0);
        //相当于可移动的指针，来组织各个节点的相加
        ListNode course = listNode;
        //记录进位数
        int curr = 0;
        //当l1对象或l2对象不为空时并且当链表最后两个数有进位时进入循环
        while (l1 != null || l2 != null || curr != 0) {
            //当有值时赋给l1没有值则赋0保持高位有数与l2相加
            int l1Value = l1 != null ? l1.val : 0;
            //当有值时赋给l2没有值则赋0保持高位有数与l1相加
            int l2Value = l2 != null ? l2.val : 0;
            int sum = l1Value + l2Value + curr;
            //取进位
            curr = sum / 10;
//            不能直接赋值给 course.next，因为 course.next需要listNode1类型
           ListNode  listNode1 = new ListNode(sum % 10);
            course.next = listNode1;
//            将course链表向后移
            course = course.next;
//            将l1链表向后移
            if (l1 != null) l1 = l1.next;
            //            将l2链表向后移

            if (l2 != null) l2 = l2.next;


        }
//        返回头节点
        return listNode.next;
    }
}
