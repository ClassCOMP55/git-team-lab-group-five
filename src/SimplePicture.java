//comment on top of java file
//second comment
import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

//We did this
public class SimplePicture extends GraphicsProgram {
	public static int SIZE = 700;
	public static final String robotImage = "robot.png";
	
	public void init() {
		setSize(SIZE, SIZE);
	}
	public void run() {
		GImage robot = new GImage(robotImage, 200, 100);
		add(robot);
		GLabel label = new GLabel("We will pass", 200, 400);
		add(label);
	}
	
	public static void main(String[] args) {
		new SimplePicture().start();
	}
}