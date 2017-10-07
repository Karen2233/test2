package exe;

public class printImage {
	public static void main(String args[]) {
		int j=1;
		int l=1;
		int z=1;
		int q=5;
		for(int i=0;i<=6;i++) {
			if(i<4) {
				for(int k=0;k<=3-j;k++) {
				  System.out.print(" ");
			  }
			    j++;
			    for(int p=0;p<l;p++) {
				  System.out.print("*");
			  }
			    l=l+2;
			    System.out.print("\n");
				
			}
			if(i>=4) {
				for(int k=1;k<=z;k++) {
					  System.out.print(" ");
				  }
				    z++;
				    for(int p=0;p<q;p++) {
					  System.out.print("*");
				  }
				    q=q-2;
				    System.out.print("\n");
			}
		}
		
	}

}
