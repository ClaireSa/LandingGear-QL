package LandingGear;

import java.io.IOException;

import javax.swing.JFrame;

public class LandingGear {


	public static void main(String[] args) throws IOException {
	
		SensorModel model =new SensorModel();
		LandingGearUI frame = new LandingGearUI(model);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
