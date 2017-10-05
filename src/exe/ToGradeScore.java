package exe;

public class ToGradeScore {
	public String[] trans(int[] score)
	{
		String[] grade=new String[score.length];
		for(int i=0;i<score.length;i++)
		{
			if(score[i]>=90&&score[i]<=100) {
				grade[i]="优";
			}
			if(score[i]>=80&&score[i]<90) {
				grade[i]="良";
			}
			if(score[i]>=70&&score[i]<80) {
				grade[i]="中";
			}
			if(score[i]>=60&&score[i]<70) {
				grade[i]="及格";
			}
			if(score[i]<60) {
				grade[i]="不及格";
			}
			
		}
		return grade;
	}
	public static void main(String args[]) {
		int[] testscore={90,80,75,65,56};
		ToGradeScore change=new ToGradeScore();
		String[] tst=change.trans(testscore);
		for(int k=0;k<tst.length;k++) {
			System.out.println(tst[k]);
		}
		
		
	}

}
