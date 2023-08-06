package OOP07_Interface;

public class Phone extends NeedCase implements NotFold{
	@Override
	void email() {
		System.out.println("Send Mobile Mail");
	}
	@Override
	void memo() {
		System.out.println("Write Phone Memo");
	}
	void call() { // 고유기능 
		System.out.println("Ring Call");
	}
	@Override
	public void DoNotFold() {
		System.out.println("Phone is Not Fold");
		
	}

}
