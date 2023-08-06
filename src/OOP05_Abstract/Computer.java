package OOP05_Abstract;

public class Computer extends ElectDevice {
	@Override
	void email() {
		System.out.println("Send PC Mail");
	}
	@Override
	void memo() {
		System.out.println("Write PC Memo");
	}
	void hdd() { // 고유기능
		System.out.println("Change Hdd");
	}

}
