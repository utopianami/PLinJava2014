import java.util.ArrayList;
import java.util.List;



public class Axis {
	
	private int height;
	private List<Point> pointList;

	public Axis(int height) {
		this.height = height;
		pointList = new ArrayList<Point>();
		initPointList();
	}
	
	public void initPointList() {
		for (int i = 0; i < height; i++) {
			pointList.add(new Point());
		}
	}

	public void drawLine(Direction dir, int height) {
		pointList.get(height).drawLine(dir);
	}

	public void move(People people) {
		int index = people.getCol();
		
		while (!people.arriveDestination()) {
			Point curPoint = pointList.get(index);
			curPoint.move(people);
			if ( curPoint.existLine() ) 
				break;
			index ++;
		}
	}

	public String printAxis() {
		StringBuilder sb = new StringBuilder();
		for (Point point : pointList) {
			if (point.existLine())
				sb.append("|");
			else
				sb.append("-");
		}
		return sb.toString();
		
	}

}
