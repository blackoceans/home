package sec01.exam07;

public class SwitchCharExample {

	public static void main(String[] args) {
		char grade = 'B';
		
		switch(grade) {
			case 'A':
			case 'a':
				System.out.println("우수 회원입니다."); //A이거나a이거나 하면 멈춤, case 2개를 합친 것
				break;
			case 'B':
			case 'b':
				System.out.println("일반 회원입니다.");
				break;
			default:
				System.out.println("손님 입니다.");
		}
	}

}
