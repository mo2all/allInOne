package niuke.offer;

/**
 * @Description 合并两个单调递增的链表，并且结果是单调不减的
 * @Author Skye
 * @Date 2019/1/11 10:33
 * @Version 1.0
 **/
public class MergeSolution {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if (list1 == null ) return list2;
        if (list2 == null ) return list1;
        ListNode resultList=null,curList1=list1,nextList1=list1.next,curList2=list2,nextList2=list2.next,lastNode =null;
        int minVal;
        if (list1.val <= list2.val ){
            minVal = list1.val;
        }else {
            minVal = list2.val;
        }
        while (curList1 != null || curList2 != null) {
            while ( curList1!= null && curList1.val <= minVal) {

                if (resultList == null) {
                    resultList = curList1;
                    lastNode = curList1;
                    continue;
                }
                lastNode.next = curList1;
                lastNode = lastNode.next;
                curList1=nextList1;
                if (nextList1 == null) break;
                nextList1=nextList1.next;
                if(curList2!=null&&(curList1.val > curList2.val)) {
                    minVal = curList2.val;
                    break;
                }else {
                    minVal = curList1.val;
                }
            }
            while (curList2 != null&&curList2.val <= minVal) {

                if (resultList == null) {
                    resultList = curList2;
                    lastNode = curList2;
                    continue;
                }
                lastNode.next = curList2;
                lastNode = lastNode.next;
                curList2=nextList2;
                if (nextList2 == null) break;
                nextList2=nextList2.next;
                if(curList1!=null&&(curList2.val > curList1.val)) {
                    minVal = curList1.val;
                    break;
                }else {
                    minVal = curList2.val;
                }
            }

            while (curList1 == null || curList2 == null){
                if (curList1 == null){
                    lastNode.next = curList2;
                    lastNode = lastNode.next;
                    curList2=nextList2;
                    if (nextList2 == null) break;
                    nextList2=nextList2.next;
                }else {
                    lastNode.next = curList1;
                    lastNode = lastNode.next;
                    curList1=nextList1;
                    if (nextList1 == null) break;
                    nextList1=nextList1.next;
                }
            }

        }
        return resultList;
}

    public static void main(String[] args) {
        ListNode list1 = new ListNode(2);
        list1.add(4).add(6).add(9).add(11);
        ListNode list2 = new ListNode(1);
        list2.add(5).add(8).add(12).add(13);
        MergeSolution solution = new MergeSolution();
        ListNode merge = solution.Merge(list1,list2);
        System.out.println(merge);
    }
}
