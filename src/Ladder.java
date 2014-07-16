import java.util.ArrayList;
import java.util.Random;


public class Ladder {
	
	private final int HEIGHTRATE = 2;
	private int height;
	ArrayList<Axis> axisList;

	public Ladder(int peopleNum){
		this.height = peopleNum * HEIGHTRATE;
		initBoard(peopleNum);
		drawLine();
	}

	private void initBoard(int peopleNum) {
		axisList = new ArrayList<Axis>();
		for (int i = 0; i < peopleNum; i++) {
			axisList.add(new Axis(height));
		}
	}
	
	private void drawLine() {
		Random randomGenerator = new Random();
		int randomRange = axisList.size()-1;
		
		for (int i = 0; i < height ; i++) {
			int axisNum = randomGenerator.nextInt(randomRange);
			int nextAxisNum = axisNum + 1;
			axisList.get(axisNum).drawLine(Direction.RIGHT, i);
			axisList.get(nextAxisNum).drawLine(Direction.LEFT, i);
		}
	}
	
	public int move(int row) {
		People people = new People(row, height);
		int curRow = people.getRow();
		while (!people.arriveDestination()) {
			Axis curAxis = axisList.get(curRow);
			curAxis.move(people);
			curRow = people.getRow();
		}
		return curRow;
	}

	public String printLadder() {
		StringBuilder sb = new StringBuilder();
		for (Axis axis : axisList) {
			sb.append("L-");
			sb.append(axis.printAxis());
			sb.append("\n");
		}
		return sb.toString();
	}

}
