package class_07;

import java.util.Arrays;
import java.util.Comparator;
/**
 * 给定一个字符串类型的数组strs，找到一种拼接方式，使得把所
 * 有字 符串拼起来之后形成的字符串具有最低的字典序。
 * @author Administrator
 *
 */
public class Code_05_LowestLexicography {

	public static class MyComparator implements Comparator<String> {
		@Override
		public int compare(String a, String b) {
			return (a + b).compareTo(b + a);
		}
	}

	public static String lowestString(String[] strs) {
		if (strs == null || strs.length == 0) {
			return "";
		}
		// 锟斤拷锟斤拷锟铰的比较凤拷式锟斤拷锟斤拷
		Arrays.sort(strs, new MyComparator()); // 根据指定比较器产生的顺序对指定对象数组进行排序。
		String res = "";
		for (int i = 0; i < strs.length; i++) {
			res += strs[i];
		}
		return res;
	}

	public static void main(String[] args) {
		String[] strs1 = { "jibw", "ji", "jp", "bw", "jibw" };
		System.out.println(lowestString(strs1));

		String[] strs2 = { "ba", "b" };
		System.out.println(lowestString(strs2));

	}

}
