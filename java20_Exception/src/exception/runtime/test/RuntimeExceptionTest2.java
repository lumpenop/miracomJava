package exception.runtime.test;

public class RuntimeExceptionTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = {
				"hello",
				"no, i mean it",
				"nice to meet you"
		};
		
		int i=0;
		while(i<=3) {
			try {
				System.out.println(str[i]);				
			}catch(NullPointerException e) {
				System.out.println("Nice Catch1~~~!!");
			}catch(ArithmeticException e) {
				System.out.println("Nice Catch2~~~!!");
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Nice Catch3~~~!!");
			}
			i++;
		}//

		System.out.println("while loop the end...");
	}

}
