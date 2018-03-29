/*
 	Author : Jolwina Fernandes
 	Roll No : 1614
 	Purpose : Application for announcing cricket match score
 */
public class Score
{
	public static void main(String[] args) 
	{
		Overs[] ball1=new Overs[6];
		ball1[0]=new Overs(2);
		ball1[1]=new Overs(1);
		ball1[2]=new Overs(0);
		ball1[3]=new Overs(4);
		ball1[4]=new Overs(1);
		ball1[5]=new Overs(0);
		
		Overs[] ball2=new Overs[6];
		ball2[0]=new Overs(6);
		ball2[1]=new Overs(4);
		ball2[2]=new Overs(0);
		ball2[3]=new Overs(1);
		ball2[4]=new Overs(2);
		ball2[5]=new Overs(1);
		
		Overs[] ball3=new Overs[6];
		ball3[0]=new Overs(3);
		ball3[1]=new Overs(5);
		ball3[2]=new Overs(0);
		ball3[3]=new Overs(1);
		ball3[4]=new Overs(6);
		ball3[5]=new Overs(3);
		
		Overs[] ball4=new Overs[6];
		ball4[0]=new Overs(1);
		ball4[1]=new Overs(4);
		ball4[2]=new Overs(0);
		ball4[3]=new Overs(2);
		ball4[4]=new Overs(6);
		ball4[5]=new Overs(1);
		
		Overs[] ball5=new Overs[6];
		ball5[0]=new Overs(6);
		ball5[1]=new Overs(6);
		ball5[2]=new Overs(1);
		ball5[3]=new Overs(2);
		ball5[4]=new Overs(1);
		ball5[5]=new Overs(2);
		
		
		ball1[0].introduction();
		int i;
		System.out.print("Score for 1st over :");
		for(i=0; i<6; i++)
		{
			System.out.print("  "+ball1[i].get_score());
		}
		
		System.out.print("\nScore for 2nd over :");
		for(i=0; i<6; i++)
		{
			System.out.print("  "+ball2[i].get_score());
		}
		
		System.out.print("\nScore for 3rd over :");
		for(i=0; i<6; i++)
		{
			System.out.print("  "+ball3[i].get_score());
		}
		
		System.out.print("\nScore for 4th over :");
		for(i=0; i<6; i++)
		{
			System.out.print("  "+ball4[i].get_score());
		}
		
		System.out.print("\nScore for 5th over :");
		for(i=0; i<6; i++)
		{
			System.out.print("  "+ball5[i].get_score());
		}
		
		for(i=0; i<6; i++)
		{
			ball1[i].get_tot_score();
			ball2[i].get_tot_score();
			ball3[i].get_tot_score();
			ball4[i].get_tot_score();
			ball5[i].get_tot_score();
		}
		
		System.out.println("\n**********************************************");
		System.out.println("Total Score for the match is "+Overs.totalScore);
		System.out.println("**********************************************");
	}
}