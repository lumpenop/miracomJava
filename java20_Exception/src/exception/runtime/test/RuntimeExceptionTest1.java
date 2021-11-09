package exception.runtime.test;

public class RuntimeExceptionTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = {
				"hello",
				"no, i mean it",
				"nice to meet you"
		};
		
		int i=0;
		while(i <= 3) {
			
			try {
				System.out.println(str[i]);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
			
			i++;
		}
		System.out.println("while loop the end...");
	}

}
