public class HammingHelper {

	public static void main(String[] args) {
		Hamming one = new Hamming("GGACTGSA", "GGASAAALLA");

		try {
			one.getHammingDistance();
		} catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}