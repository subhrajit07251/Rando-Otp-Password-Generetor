
import java.util.*;
public class passwordGenerator {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
           int length ;
           System.out.println("Enter The length You want to make password:-");
           length =sc.nextInt();
           System.out.println(password(length));

	}
	static char[]password(int len){
		System.out.println("Suggested Passwrod is:");
		String cap="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String small="abcdefghijklmnopqrstuvwxyz";
		String num="0123456789";
		String sym="!@#$%^&*.+-*/";
		
		String values=cap+small+num+sym;
		Random rndm=new Random();
		char [] password=new char[len];
		for(int i=0;i<len;i++) {
			password[i]=values.charAt(rndm.nextInt(values.length()));
		}
		return  password;
		}
}
