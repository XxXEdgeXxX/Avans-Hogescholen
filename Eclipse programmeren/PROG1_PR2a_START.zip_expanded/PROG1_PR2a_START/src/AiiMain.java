public class AiiMain {

	public static void main(String[] args) {
		int windowWidth = 600;
		int windowHeight = 600;
		AiiCanvas c = new AiiCanvas("Playfield", windowWidth, windowHeight);
		@SuppressWarnings("unused")
		PlayBall playing = new PlayBall(c);
	}
}