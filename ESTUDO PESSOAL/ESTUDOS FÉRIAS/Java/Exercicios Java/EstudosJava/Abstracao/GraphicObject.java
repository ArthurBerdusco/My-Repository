
public abstract class GraphicObject {
	int x, y;
	
	void moveto(int newX, int newY) {
		System.out.println("Movo to x: " + x + "and y: " + y);
	}
	
	abstract void draw();
	abstract void resize();
}
