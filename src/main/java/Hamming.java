public class Hamming {
	private String leftStrand, rightStrand;

  Hamming(String leftStrand, String rightStrand) {
    this.leftStrand = leftStrand;
    this.rightStrand = rightStrand;
  }

  public int getHammingDistance() {

    checkValidStrands(leftStrand, rightStrand);

    int hammingDistance = 0;
    for(int i = 0; i < leftStrand.length(); i++) {
      if(leftStrand.charAt(i) != rightStrand.charAt(i)) {
        hammingDistance++;
      }
    }
    return hammingDistance;
  }

  private void checkValidStrands(String leftStrand, String rightStrand) {
    if(leftStrand.length() != rightStrand.length()) {
      throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
    }
  }
}
