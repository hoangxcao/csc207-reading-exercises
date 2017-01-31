
public class EndsWithRep {

	public static void main(String[] args) {
		boolean result1 = endsWithRep("foobarbar", "bar", 2);
		boolean result2 = endsWithRep("foobarbar", "baz", 1);
		System.out.println(result1);
		System.out.println(result2);
	}

	public static boolean endsWithRep(String s1, String s2, int n) {
		String Str = new String("");

		for (int i = 0; i < n; i++) {
			Str += s2;
		}

		if (s1.endsWith(s2)) {
			return true;
		} else {
			return false;
		}
	}
}
