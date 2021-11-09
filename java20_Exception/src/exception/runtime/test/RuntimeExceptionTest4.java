package exception.runtime.test;

public class RuntimeExceptionTest4 {

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
			}catch(Exception e) {
				System.out.println("Nice Catch1~~~!!");
			}catch(ArithmeticException e) {
				System.out.println("Nice Catch2~~~!!");
			}catch(NegativeArraySizeException e) {
				System.out.println("Nice Catch3~~~!!");
			}
			i++;
		}//

		System.out.println("while loop the end...");
	}

}
