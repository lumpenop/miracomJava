package access.child;


import access.parent.Parent;

public class Child extends Parent {

	@Override
	public void access() {
		// TODO Auto-generated method stub
		super.access();
		System.out.println(publicTest);
		System.out.println(protectedTest);
//		System.out.println(defaultTest); ���� �Ұ�
//		System.out.println(privateTest); ���� �Ұ�
		
		
	}
	
}
