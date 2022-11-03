package studio7;

public class Die {

	private int side;

	public Die(int theSide) {
		this.side = theSide;
	}

	public int getSide() {
		return (int) (Math.random() * this.side + 1);
	}

	@Override
	public String toString() {
		return "Die [side=" + side + ", getSide()=" + getSide() + "]";
	}

	public static void main(String[] args) {
		Die D1 = new Die(10);
		System.out.println(D1);
	}

}
