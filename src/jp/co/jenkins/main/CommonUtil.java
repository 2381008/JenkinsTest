package jp.co.jenkins.main;

public class CommonUtil {

	public static String Format(String str) {
		return String.format("You said %s.", str);
	}

	public static int CalcAdd(int x, int y) {
		return x + y;
	}

	public static int CalcSub(int x, int y) {
		return x - y;
	}

}
