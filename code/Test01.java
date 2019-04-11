/**
 * Author: 沈博
 * Date: 2019-04-11
 * Declaration: 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 *请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */

public class Test01 {
	public static void main(String[] args) {
		int[][] array = new int[][] { { 0, 1, 2, 5 }, { 2, 3, 4, 7 }, { 4, 4, 4, 8 }, { 5, 7, 7, 9 } };
		System.out.println(Find(2, array));
	}

	public static boolean Find(int target, int[][] array) {
		int i = array.length - 1;
		int j = 0;
		while (i >= 0 && j < array[i].length) {
			if(target == array[i][j]){
				return true;
			}else if(target < array[i][j]){
				i --;
			}else{
				j++;
			}
		}
		return false;
	}

}
