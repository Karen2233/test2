package exe;

public class narcissisticNumber {
	public static void main (String args[]) {
		int tmp,a,b,c;
		for(int i=100;i<=999;i++) {
			a=i%10;
			tmp=i%100;
			b=tmp/10;
			c=i/100;
			if(((a*a*a)+(b*b*b)+(c*c*c))==i) {
				System.out.print(i);
				System.out.print(" ");
			}
			
		}
	}

}
