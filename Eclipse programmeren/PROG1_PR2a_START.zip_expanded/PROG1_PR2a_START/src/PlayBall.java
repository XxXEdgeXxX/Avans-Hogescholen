
public class PlayBall {
	
	@SuppressWarnings("unused")
	private AiiCanvas canvas ;
	private int windowWidth;
	private int windowHeight;
	private AiiBall ball;
	private int ballDiameter = 20;
    
	/*
	 * Constructor
	 * 
	 */
	public PlayBall(AiiCanvas canvas) {       
		this.canvas = canvas;
		// windowWidth becomes the width of the playfield
		windowWidth = canvas.getWidth();
		// // windowHeight becomes the height of the playfield
		windowHeight = canvas.getHeight();
		// the ball is created and placed on the playfield
		ball = new AiiBall(windowWidth/2 - ballDiameter/2, windowHeight - ballDiameter, ballDiameter,canvas);
		ball.draw();
	    playWithBall();
	}
	
	/*
	 * the ball moves over the playfield. It can jump up and down and
	 * it can roll over the surface
	 */
	public void playWithBall()
	{
		int jumpHeight = 500;
		int rollDistance = 100;
		int direction = 1; //1 -> to the right, -1 to the left
		
		ball.jump(jumpHeight);
			
		ball.roll(rollDistance, direction);
		direction = -1;
		ball.roll(rollDistance, direction);	
	}
}