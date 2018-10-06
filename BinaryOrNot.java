//Program is to check that a number is binary or not.
//Input: Number.
//Output: Binary or not.
public class isBinaryNumber {
	public static void isBinaryorNot(int number) {
		boolean isBinary = true;
		int copyofnumber = number;
		while(copyofnumber != 0) {
			int temp = copyofnumber%10;
			if(temp > 1) {
				isBinary = false;
				break;
			}
			else {
				copyofnumber = copyofnumber/10;
			}
		}
		if(isBinary) {
				System.out.println(number +" is a binary number");
		}
		else {
			System.out.println(number +" not a binary number");
		}
	}

	public static void main(String[] args) {
		isBinaryorNot(1100011);
		isBinaryorNot(426745);
  }
}
