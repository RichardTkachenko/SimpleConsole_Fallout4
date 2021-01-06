import java.util.Scanner;

class MenuManage{
	private boolean door01 = false;
	private boolean door02 = false;
	private boolean lights01 = false;
	
	public MenuManage() {
		System.out.println("Созданно точка входа...");
	}
	
	public void showMenu() {
		System.out.println("Richard Indastries");
		String s = "";
		if (door01) {
			s = "Opened";	
		} else {
			s = "Closed";
		}
		System.out.println("1 - Open door 01. Current status = " + s);
		if (door02) {
			s = "Opened";	
		} else {
			s = "Closed";
		}
		System.out.println("2 - Open door 02. Current status = " + s);
		
		if (lights01) {
			s = "Turned on";	
		} else {
			s = "Turned off";
		}
		System.out.println("3 - Turn lights 01. Current status = " + s);
		System.out.println();
	}
	
	public void inputData () {
		Scanner s = new Scanner(System.in);
		String string = s.nextLine();
		switch(string) {
			case ("1"):
				if (door01 == false) {
					door01 = true;
				} else { 
					door01 = false;
				}
				break;
			case ("2"):
				if (door02 == false) {
					door02 = true;
				} else { 
					door02 = false;
				}
				break;
			case("3"):
				if (lights01 == false) {
					lights01 = true;
				} else { 
					lights01 = false;
				}
				break;
			default:
				System.out.println("Incorrect command ");
				System.out.println();
		}		
	}
	 
}

public class Terminal001 {
	public static void main(String[] args) {
		
		MenuManage menu = new MenuManage();
		
		while(true) {
			menu.showMenu();
			menu.inputData();
		}
	
	
	}
}
