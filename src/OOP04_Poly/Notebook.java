package OOP04_Poly;

public class Notebook extends ElectDevice{
	@Override
	void email() {
		System.out.println("Send Mail");
	}
	@Override
	void memo() {
		System.out.println("Write NoteBook Memo");
	}
	void fold() { // 고유기능
		System.out.println("fold Notebook");
	}

}
