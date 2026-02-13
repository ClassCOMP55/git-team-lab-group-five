import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.program.GraphicsProgram;
//i'm color blind//
//lucas is a bully//
//i hate him//
public class SimplePicture extends GraphicsProgram {
	public static int SIZE = 700;
	private static final String robotname = "robot.png";
	
	public void init() {
		setSize(SIZE, SIZE);
	}
	
	public void run() {
		GImage robot = new GImage(robotname, 200, 100);
		add(robot);
		GLabel label = new GLabel("How I feel when using github!", 200, 400);
		add(label);
	}
	
	public static void main(String[] args) {
		new SimplePicture().start();
	}
}