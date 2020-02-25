package day3;

public class Position {
	private int xCoordenate;
	private int yCoordenate;
	
	
	
	public Position(int xCoordenate, int yCoordenate) {
		super();
		this.xCoordenate = xCoordenate;
		this.yCoordenate = yCoordenate;
	}
	public int getxCoordenate() {
		return xCoordenate;
	}
	public void setxCoordenate(int xCoordenate) {
		this.xCoordenate = xCoordenate;
	}
	public int getyCoordenate() {
		return yCoordenate;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + xCoordenate;
		result = prime * result + yCoordenate;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Position other = (Position) obj;
		if (xCoordenate != other.xCoordenate)
			return false;
		if (yCoordenate != other.yCoordenate)
			return false;
		return true;
	}
	public void setyCoordenate(int yCoordenate) {
		this.yCoordenate = yCoordenate;
	}
	
	
}
