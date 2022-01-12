import java.util.*;
public class OTP {
    
	static char[]otp(int len){
		System.out.println("Your otp is:");
		String num="0123456789";
		Random rndm=new Random();
		char[] otp=new char[len];
		for(int i=0;i<len;i++) {
			otp[i]=num.charAt(rndm.nextInt(num.length()));
		}
		return otp;
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The length:-");
	int length=sc.nextInt();
	System.out.println(otp(length));

	}
}
