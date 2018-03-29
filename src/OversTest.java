import static org.junit.Assert.*;

import org.junit.Test;

public class OversTest 
{
	@Test
	public void testGetBall() 
	{
		Overs[] ball1=new Overs[6];
		ball1[0]=new Overs(2);
		assertEquals(2,ball1[0].getBall());
	}

	@Test
	public void testGet_score() 
	{
		Overs[] ball5=new Overs[6];
		ball5[0]=new Overs(6);
		ball5[0].get_score();
		assertEquals(6,ball5[0].get_tot_score(),0);
	}

	@Test
	public void testGet_tot_score() 
	{
		Overs[] ball1=new Overs[6];
		ball1[0]=new Overs(2);
		ball1[1]=new Overs(1);
		ball1[2]=new Overs(0);
		assertEquals(1,ball1[1].get_tot_score(),0);
	}
}