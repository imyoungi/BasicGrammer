package OOP05_Abstract;

public class Phone extends ElectDevice{
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
