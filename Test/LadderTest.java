import static org.junit.Assert.*;

import org.junit.Test;


public class LadderTest {
	
	@Test
	public void Ladder(){
		int peopleNum = 10;
		Ladder ladder = new Ladder(peopleNum);
		
		String ladderPrint = ladder.printLadder();
		System.out.println(ladderPrint);
		
		int result = ladder.move(0);
		System.out.println(result);
	}

}
