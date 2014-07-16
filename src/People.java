
public class People {
	
	private int row;
	private int col = 0;
	private int destination;
	
	public People(int row, int height){
		this.row = row;
		destination = height;
	}
	
	public void move(Direction dir){
		if (isDown(dir)) {
			this.col +=1;
		}
		else {
			this.col +=1;
			this.row += dir.getValue();
		}
	}
	
	public boolean isDown(Direction dir){
		if (dir == Direction.DOWN)
			return true;
		return false;
	}

	public int getCol() {
		return this.col;
	}

	public int getRow() {
		return this.row;
	}

	public boolean arriveDestination() {
		if ( this.col == this.destination)
			return true;
		return false;
	}

}
