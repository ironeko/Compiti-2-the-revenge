
public class Screen {
	//dispositive characteristic
	
	private int inch;
	private String screen;
	private String color;
	
	//state attribute
	
	private int channel;
	private int lum;
	private int volume;
	private boolean on;
	
	//costractor
	
	public Screen(int inch, String screen, String color, int channel, int lum, int volume, boolean on) {
		setInch(inch);
		setScreen(screen);
		setColor(color);
		channel = 1;
		volume = 10;
		lum = 40;
		on = false;
		
	}
}
