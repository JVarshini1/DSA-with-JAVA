public class TowerSeries {
	private static int steps = 0;

	public static void toh(int n, String s, String d, String h) {
		if (n == 0) return;
		toh(n - 1, s, h, d);
		System.out.println("Move disk from " + s + " to " + d);
		steps++;
		toh(n - 1, h, d, s);
	}

	public static void main(String[] args) {
		toh(3, "source", "destination", "helper");
		System.out.println("Total steps: " + steps);
	}
}