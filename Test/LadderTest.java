import static org.junit.Assert.*;

import org.junit.Test;


public class LadderTest {
	
	@Test
	public void Ladder(){
		int peopleNum = 6;
		Ladder ladder = new Ladder(peopleNum);
		
		String ladderPrint = ladder.printLadder();
		System.out.println(ladderPrint);
		
		int result = ladder.move(4);
		System.out.println(result);
	}

}
