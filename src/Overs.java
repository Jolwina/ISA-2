public class Overs
{

	private int Ball;
	static int totalScore=0;
	
	public Overs(int ball) 
	{
		this.Ball=ball;
	}

	public int getBall() 
	{
		return Ball;
	}

	public void setBall(int ball) 
	{
		Ball = ball;
	}
	
	public int get_score()
	{
		return this.getBall();
	}
	public int get_tot_score()
	{
		int tot=0;
		tot=this.getBall();
		totalScore=totalScore+tot;
		return tot;
	}
	public void introduction()
	{
		System.out.println("**********************************************");
		System.out.println("************Cricket Match Score***************");
		System.out.println("**********************************************");
		System.out.println("The Match is of 5 overs");
		System.out.println("**********************************************");
	}
}