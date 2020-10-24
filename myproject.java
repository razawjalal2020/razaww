import java.util.Scanner;

public class myproject{
	public static void main(String[] args){
	Scanner r = new Scanner(System.in);
	System.out.println("please enter number of your name's letter");
	int size = r.nextInt();
	char myName[] = new char[size];

	System.out.println("enter the letters");
	for(int m=0; m<myName.length; m++){
	myName[m]=r.next().charAt(0);
	}
	System.out.print("your name is: ");
	for(int m=0; m<myName.length; m++){
	System.out.print(myName[m]);
	}
	System.out.println("");
	}
}
