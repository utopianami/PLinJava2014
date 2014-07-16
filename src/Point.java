
public class Point {
	
	private Direction dir;
	private boolean line = false;

	public Point() {
		this.dir = Direction.DOWN;
	}
	
	public void drawLine(Direction dir){
		this.line = true;
		this.dir = dir;
	}
	
	public boolean existLine() {
		return line;
	}

	public void move(People people) {
		people.move(this.dir);
	}
}
