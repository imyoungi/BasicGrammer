package OOP06_Interface;

public class Notebook extends BigThing{
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
