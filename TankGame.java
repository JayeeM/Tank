
public class TankGame {
	public static void main (String[]args){
		Zen.connect("techlabtanks");
		Zen.create(500, 500);
		Zen.fillRect(0, 0, 500,500);
		Tank player1= new Tank(250,250);
		player1.draw();
		Zen.sleep(3000);
		Tank2 ryan= new Tank2("ryan");
		Tank2 jasper= new Tank2("jasper");
		Tank2 isaac= new Tank2("isaac");
		Tank2 jui= new Tank2("jui");
		Tank2 ojas= new Tank2("ojas");
		Tank2 keshav= new Tank2 ("keshav");
		while(true){
			Zen.setColor(255, 255, 255);
			Zen.fillRect(0, 0, 500, 500);
			player1.draw();
			jasper.draw();
			isaac.draw();
			ojas.draw();
			jui.draw();
			ryan.draw();
			keshav.draw();
			player1.move();
			jui.move();
			ojas.move();
			jasper.move();
			isaac.move();
			ryan.move();
			keshav.move();
			Zen.flipBuffer();
			Zen.sleep(33);

		}
	}
}



