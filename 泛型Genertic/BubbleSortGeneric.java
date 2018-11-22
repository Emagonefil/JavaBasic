
public class BubbleSortGeneric<E extends Comparable<E>> {

	public E[] result;	
	
	public static void main(String[] args) {
	
/*
 * list1 = [3, 4, 2, 1, 5]
 * list2 = [89, 45, 2, 49, 10, 21]
 * 
 *     for i in range(len(alist)-1):
        for j in range(len(alist)-1-i):
            if alist[j] > alist[j+1]:
                alist[j], alist[j+1] = alist[j+1], alist[j]
            print(alist)
 */
		
		Integer[] list1 = {3, 4, 2, 1, 5,8};
		String[] list2 = {"haha", "Lori", "pig", "13gds", "wefdjsk"};
		BubbleSortGeneric bs = new BubbleSortGeneric<Integer>((Integer[]) list1);
		BubbleSortGeneric bs2 = new BubbleSortGeneric<String>((String[]) list2);
		list1 = (Integer[]) bs.result;
		list2 = (String[]) bs2.result;
		
		
		for (Integer item : (Integer[]) list1) {
			System.out.println(item);
		}
		for (String item : (String[]) list2) {
			System.out.println(item);
		}
		
		/*BubbleSort bs = new BubbleSort();
		bs.bubbleSort(alist);
		如果不是static的东西，要让一个对象/实例用，new。。。
		static的东西是放在heap中， 都是放已经确定了的东西
		*/
		
		
		
	}

	//将bubbleSort原本的方法，做成了构造器 E[] 是一个 array generic
	public BubbleSortGeneric(E[] alist) {
		for(int i = 0; i < (alist.length-1); i++) {
			for(int j = 0; j < alist.length-1-i;j++) {
				if(alist[j].compareTo(alist[j+1]) > 0) {
					E t = alist[j];
					alist[j] = alist[j+1];
					alist[j+1] = t;
				}
				System.out.println(alist);
			}
		}
		
		this.result = alist;
	}
	
//	public BubbleSort(E<String> alist) {
//		for(int i = 0; i < (alist.length-1); i++) {
//			for(int j = 0; j < alist.length-1-i;j++) {
//				if(alist[j].compareTo(alist[j+1]) > 0) {
//					E t = alist[j];
//					alist[j] = alist[j+1];
//					alist[j+1] = t;
//				}
//				System.out.println(alist);
//			}
//		}
//		
//		this.result = alist;
//	}
}
