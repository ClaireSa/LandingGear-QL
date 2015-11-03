package LandingGear;

import java.util.*;
import java.util.List;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.MouseListener;

public class LandingGearUI extends JFrame implements Observer{

	//private JFrame frame = new JFrame();
	private JPanel handlePan = new JPanel();
	private JPanel gearsPan =new JPanel();
	private JPanel doorsPan = new JPanel();
	private JPanel Pan = new JPanel();
	private static JButton upbtn = new JButton("up");
	private List<JLabel> myDoorsLabels = new ArrayList<JLabel>();
	private List<JLabel> myGearsLabels = new ArrayList<JLabel>();

	private static JButton downbtn = new JButton("down");
	
	private JLabel gearsLbExtracted = new JLabel("Gears extracted");
	private JLabel gearsLbRetracted = new JLabel("gears retracted");
	private JLabel gearsLbMoving = new JLabel("gears moving");
	
	private JLabel doorsLbOpened = new JLabel("doors opened");
	private JLabel doorsLbClosed = new JLabel("doors closed");
	private JLabel doorsLbMoving= new JLabel("doors moving");
	
	TitledBorder title1;
	TitledBorder title2;
	Color backcolor = Color.decode("#6365ff");//à changer

	
	SensorModel model = new SensorModel();
		
	public LandingGearUI(SensorModel model){
		
		this.model = model;
		
		Border loweredetched = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
		title1 = BorderFactory.createTitledBorder(loweredetched, "Gears states");
		title2 = BorderFactory.createTitledBorder(loweredetched, "Doors states");
		
		setTitle("LandingGearInterface");
		setSize(800, 600);
		setLayout(new GridLayout(1,3));
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.BOTH;
		
		
		
		handlePan.setBackground(Color.GREEN);
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 0;
		add(handlePan, c);
		
		Pan.setLayout(new GridLayout(2,1));
		GridBagConstraints cc = new GridBagConstraints();
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 1;
		c.gridy = 0;
		c.gridwidth=2;
		add(Pan, c);
		
		gearsPan.setBackground(Color.BLUE);
		cc.fill = GridBagConstraints.BOTH;
		cc.gridx = 0;
		cc.gridy = 0;
		Pan.add(gearsPan,cc);
		
		doorsPan.setBackground(Color.ORANGE);
		cc.fill = GridBagConstraints.BOTH;
		cc.gridx = 0;
		cc.gridy = 1;
		Pan.add(doorsPan, cc);
		
		upbtn.setSize(10,10);
		downbtn.setSize(10,10); 
		
		handlePan.add(upbtn);
		handlePan.add(downbtn);
		
		gearsPan.setBorder(title1);
		doorsPan.setBorder(title2);
		
		//system initial state (before take off)
		gearsPan.add(gearsLbExtracted);
		myGearsLabels.add(gearsLbExtracted);
		doorsPan.add(doorsLbClosed);
		myDoorsLabels.add(doorsLbClosed);
		
		model.addObserver(this);
		
		DigitalController dcontroller = new DigitalController(model,this);
		addController(dcontroller);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
	//update the view
	public void update(Observable o, Object obj){
		refreshDoorsView();
		refreshGearsView();
	}
	
//method to update the view
	//update doors panel
	private void refreshDoorsView() {
	 
		if(model.isDoor_closed()==true){
			
			doorsPan.remove(myDoorsLabels.get(myDoorsLabels.size()-1));
			doorsPan.add(doorsLbClosed);
			myDoorsLabels.add(doorsLbClosed);
			doorsPan.validate();
			doorsPan.repaint();
			
		}
		if(model.isDoor_opened()==true){
		
			doorsPan.remove(myDoorsLabels.get(myDoorsLabels.size()-1));
			doorsPan.add(doorsLbOpened);
			myDoorsLabels.add(doorsLbOpened);
			doorsPan.validate();
			doorsPan.repaint();
		}
		if(model.isDoorIsMoving()==true){
			
			doorsPan.remove(myDoorsLabels.get(myDoorsLabels.size()-1));
			doorsPan.add(doorsLbMoving);
			myDoorsLabels.add(doorsLbMoving);
			doorsPan.validate();
			doorsPan.repaint();
	
		}
		
	}
	
	//update gears panel
	private void refreshGearsView() {
		
		if(model.isGear_extended()==true){
			
			gearsPan.remove(myGearsLabels.get(myGearsLabels.size()-1));
			gearsPan.add(gearsLbExtracted);
			myGearsLabels.add(gearsLbExtracted);
			gearsPan.validate();
			gearsPan.repaint();
		}
		if(model.isGear_retracted()==true){
		
			gearsPan.remove(myGearsLabels.get(myGearsLabels.size()-1));
			gearsPan.add(gearsLbRetracted);
			myGearsLabels.add(gearsLbRetracted);
			gearsPan.validate();
			gearsPan.repaint();
			
		}
		if(model.isGearIsMoving()==true){
		
			gearsPan.remove(myGearsLabels.get(myGearsLabels.size()-1));
			gearsPan.add(gearsLbMoving);
			myGearsLabels.add(gearsLbMoving);
			gearsPan.validate();
			gearsPan.repaint();
		}
	}
	
	//controller listen of the view
	public void addController(MouseListener dcontroller){
		upbtn.addMouseListener(dcontroller);;
		downbtn.addMouseListener(dcontroller);
	}
	
//getters and setters
	public static JButton getUpbtn(){
		return upbtn;
	}
	
	public static JButton getDownbtn(){
		return downbtn;
	}

}
