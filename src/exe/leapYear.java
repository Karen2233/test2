package exe;

public class leapYear {
	public boolean jugg(int year) {
		if(year%4==0&&year%100!=0) {
			return true;
		}
		if(year%400==0) {
			return true;
		}
		  return false; 
	}
    public static void main(String args[]) {
	    leapYear l=new leapYear();
	    int j=0;
	    for(int i=1990;i<=2007;i++) {
		  if(l.jugg(i)) {
			  System.out.print(i);
			  j++;
			  if(j==1) {
				  System.out.print(" ");
			  }
			  if(j==2) {
			      System.out.print("\n");
			      j=0;
			  }
			
		  }
		
	    }
   }  
}
