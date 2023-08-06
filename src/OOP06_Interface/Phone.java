package OOP06_Interface;

public class Phone extends NeedCase{
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

}
