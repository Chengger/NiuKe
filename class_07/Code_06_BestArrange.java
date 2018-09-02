package class_07;

import java.util.Arrays;
import java.util.Comparator;

public class Code_06_BestArrange {

	public static class Program {
		public int start;
		public int end;

		public Program(int start, int end) {
			this.start = start;
			this.end = end;
		}
	}

	public static class ProgramComparator implements Comparator<Program> {

		@Override
		public int compare(Program o1, Program o2) {
			return o1.end - o2.end; //根据最早结束的项目来排序
		}

	}

	public static int bestArrange(Program[] programs, int cur) {//单前时刻
		Arrays.sort(programs, new ProgramComparator());
		int result = 0;
		for (int i = 0; i < programs.length; i++) {
			if (cur <= programs[i].start) {
				result++;
				cur = programs[i].end;
			}
		}
		return result;
	}

	public static void main(String[] args) {

	}

}
