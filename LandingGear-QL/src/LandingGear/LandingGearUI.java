package LandingGear;

import java.util.*;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

//add image in project
//add panel in frame panel
public class  LandingGearUI extends JFrame implements Observer{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//private JFrame frame = new JFrame();
	
	//Panel instantiation
	private JPanel handlePan = new JPanel();
	private JPanel gearsPan =new JPanel();
	private JPanel doorsPan = new JPanel();
	private JPanel Pan = new JPanel();

	//Images
	final BufferedImage Im_handle = ImageIO.read(new File("handle1.png"));
	final BufferedImage Im_handleUp = ImageIO.read(new File("handleUp1.png"));
	final BufferedImage Im_handleDown = ImageIO.read(new File("handleDown1.png"));
	final BufferedImage Im_gearsRetracted = ImageIO.read(new File("Gear_retracted.png"));
	final BufferedImage Im_gearsExtended = ImageIO.read(new File("Gear_extracted.png"));
	final BufferedImage Im_gearsMoving = ImageIO.read(new File("Gear_manoeuvring.png"));
	final BufferedImage Im_doorsClosed = ImageIO.read(new File("door2_closed.jpg"));
	final BufferedImage Im_doorsOpened = ImageIO.read(new File("door2_opened.jpg"));
	final BufferedImage Im_doorsMoving = ImageIO.read(new File("door2_moving.jpg"));
	final BufferedImage Im_anomalie = ImageIO.read(new File("Gear_manoeuvring_Anomalie.png"));
	static BufferedImage Im_up; /*ImageIO.read(new File("bouton.png"));*/
	static BufferedImage Im_down;
	
	
//Handle, doors and gears Panel containing Images 
	private JPanel ImPan_handle = new JPanel() {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		@Override
        protected void paintComponent(Graphics g) {
			super.setSize(101, 284);
            super.paintComponent(g);
            g.drawImage(Im_handle, 0, 0, getWidth(), getHeight(), this);
        }
	};
	
	private JPanel ImPan_handleUp = new JPanel() {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		@Override
        protected void paintComponent(Graphics g) {
			super.setSize(101, 284);
            super.paintComponent(g);
            g.drawImage(Im_handleUp, 0, 0, getWidth(), getHeight(), this);
        }
	};
	
	private static JPanel ImPan_up = new JPanel() {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		@Override
        protected void paintComponent(Graphics g) {
			super.setSize(56, 25);
			super.setLocation(17, 18);
            super.paintComponent(g);
            g.drawImage(Im_up, 0, 0, getWidth(), getHeight(), this);
        }
	};
	
	private static JPanel ImPan_down = new JPanel() {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		@Override
        protected void paintComponent(Graphics g) {
			super.setSize(56, 25);
			super.setLocation(20, 231);
            super.paintComponent(g);
            g.drawImage(Im_down, 0, 0, getWidth(), getHeight(), this);
        }
	};
	
	private JPanel ImPan_handleDown = new JPanel() {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		@Override
        protected void paintComponent(Graphics g) {
			super.setSize(101, 284);
            super.paintComponent(g);
            g.drawImage(Im_handleDown, 0, 0, getWidth(), getHeight(), this);
        }
	};
	
	private JPanel ImPan_gearsRetracted = new JPanel() {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		@Override
        protected void paintComponent(Graphics g) {
			super.setSize(146,166);
            super.paintComponent(g);
            g.drawImage(Im_gearsRetracted, 0, 0, getWidth(), getHeight(), this);//changer
        }
	};
	
	private JPanel ImPan_gearsMoving = new JPanel() {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		@Override
        protected void paintComponent(Graphics g) {
			super.setSize(146,166);
            super.paintComponent(g);
            g.drawImage(Im_gearsMoving, 0, 0, getWidth(), getHeight(), this);//changer
        }
	};
	
	private JPanel ImPan_gearsExtended = new JPanel() {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		@Override
        protected void paintComponent(Graphics g) {
			super.setSize(146,166);
            super.paintComponent(g);
            g.drawImage(Im_gearsExtended, 0, 0, getWidth(), getHeight(), this);//changer
        }
	};
	
	private JPanel ImPan_doorsOpened = new JPanel() {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		@Override
        protected void paintComponent(Graphics g) {
			super.setSize(116,110);
            super.paintComponent(g);
            g.drawImage(Im_doorsOpened, 0, 0, getWidth(), getHeight(), this);//changer
        }
	};
	
	private JPanel ImPan_doorsMoving = new JPanel() {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		@Override
        protected void paintComponent(Graphics g) {
			super.setSize(116,110);
            super.paintComponent(g);
            g.drawImage(Im_doorsMoving, 0, 0, getWidth(), getHeight(), this);//changer
        }
	};
	
	private JPanel ImPan_doorsClosed = new JPanel() {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		@Override
        protected void paintComponent(Graphics g) {
			super.setSize(116,110);
            super.paintComponent(g);
            g.drawImage(Im_doorsClosed, 0, 0, getWidth(), getHeight(), this);//changer
        }
	};
	private JPanel ImPan_Anomalie = new JPanel() {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		@Override
        protected void paintComponent(Graphics g) {
			super.setSize(146,166);
            super.paintComponent(g);
            g.drawImage(Im_anomalie, 0, 0, getWidth(), getHeight(), this);//changer
        }
	};
	
	
	//list of panels
	private List<JPanel> myHandlePanels = new ArrayList<JPanel>();
	private List<JPanel> myDoorsPanels = new ArrayList<JPanel>();
	private List<JPanel> myGearsPanels = new ArrayList<JPanel>();

	TitledBorder title1;
	TitledBorder title2;
	Color backcolor = Color.decode("#3b3a3a");
	
	
	
	//create a new model object
	SensorModel model = new SensorModel();
		
	//Constructor
	public LandingGearUI(SensorModel model) throws IOException{
		
		this.model = model;
		Im_up = ImageIO.read(new File("bouton.png"));
		Im_down = ImageIO.read(new File("bouton.png"));
		Border loweredetched = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
		title1 = BorderFactory.createTitledBorder(loweredetched, "Gears states");
		title2 = BorderFactory.createTitledBorder(loweredetched, "Doors states");
		
		setTitle("LandingGearInterface");
		//setSize(500, 450);
		setSize(800, 450);
		setLayout(new GridLayout(1,3));
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.BOTH;
		
		//panel containing the handle
		handlePan.setBackground(backcolor);
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth=1;
		add(handlePan, c);
		
		//panel containing the gears and doors panels
		Pan.setLayout(new GridLayout(2,1));
		GridBagConstraints cc = new GridBagConstraints();
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 1;
		c.gridy = 0;
		c.gridwidth=2;
		add(Pan, c);
		
		//panel containing the gears
		gearsPan.setBackground(backcolor);
		GridBagConstraints ccc = new GridBagConstraints();
		cc.fill = GridBagConstraints.BOTH;
		cc.gridx = 0;
		cc.gridy = 0;
		Pan.add(gearsPan,cc);
		
		//panel containing the 
		doorsPan.setBackground(backcolor);
		cc.fill = GridBagConstraints.BOTH;
		cc.gridx = 0;
		cc.gridy = 1;
		Pan.add(doorsPan, cc);
		
		//add border and title to the gears and doors panels
		gearsPan.setBorder(title1);
		doorsPan.setBorder(title2);
		
		//Initial state of the view
		//Gears images
		ccc.gridx=1;
		ccc.gridy=0;
		gearsPan.add(ImPan_gearsExtended,ccc);
		myGearsPanels.add(ImPan_gearsExtended);
		//Doors Images
		doorsPan.add(ImPan_doorsClosed,ccc);
		myDoorsPanels.add(ImPan_doorsClosed);
		//Images
		handlePan.add(ImPan_handle);
		myHandlePanels.add(ImPan_handle);
		//boutons
		ImPan_up.setOpaque(false);
		ImPan_down.setOpaque(false);
		ImPan_handle.add(ImPan_up);
		ImPan_handle.add(ImPan_down);
		
		//make view observer of the model
		model.addObserver(this);
		
		//create a new controller object
		DigitalController dcontroller = new DigitalController(model,this);
		//make the controller listener of the view
		addController(dcontroller);

	}
	
	
	//update the view
	public void update(Observable o, Object obj){
		refreshHandleView();
		refreshDoorsView();
		refreshGearsView();
		refreshAnomalieView();
	}
	
//methods to update the view
	
	//update doors panel
	private void refreshDoorsView() {
	 
		if(model.isDoor_closed()==true){
			
			doorsPan.remove(myDoorsPanels.get(myDoorsPanels.size()-1));
			doorsPan.add(ImPan_doorsClosed);
			myDoorsPanels.add(ImPan_doorsClosed);
			doorsPan.validate();
			doorsPan.repaint();
			
		}
		if(model.isDoor_opened()==true){
		
			doorsPan.remove(myDoorsPanels.get(myDoorsPanels.size()-1));
			doorsPan.add(ImPan_doorsOpened);
			myDoorsPanels.add(ImPan_doorsOpened);
			doorsPan.validate();
			doorsPan.repaint();
		}
		if(model.isDoorIsMoving()==true){
			
			doorsPan.remove(myDoorsPanels.get(myDoorsPanels.size()-1));
			doorsPan.add(ImPan_doorsMoving);
			myDoorsPanels.add(ImPan_doorsMoving);
			doorsPan.validate();
			doorsPan.repaint();
	
		}
		
	}
	
	//update gears panel
	private void refreshGearsView() {
		
		if(model.isGear_extended()==true){
			
			gearsPan.remove(myGearsPanels.get(myGearsPanels.size()-1));
			gearsPan.add(ImPan_gearsExtended);
			myGearsPanels.add(ImPan_gearsExtended);
			gearsPan.validate();
			gearsPan.repaint();
		}
		if(model.isGear_retracted()==true){
		
			gearsPan.remove(myGearsPanels.get(myGearsPanels.size()-1));
			gearsPan.add(ImPan_gearsRetracted);
			myGearsPanels.add(ImPan_gearsRetracted);
			gearsPan.validate();
			gearsPan.repaint();
			
		}
		if(model.isGearIsMoving()==true){
		
			gearsPan.remove(myGearsPanels.get(myGearsPanels.size()-1));
			gearsPan.add(ImPan_gearsMoving);
			myGearsPanels.add(ImPan_gearsMoving);
			gearsPan.validate();
			gearsPan.repaint();
		}
	}
	
	private void refreshHandleView(){
		if(model.getHandleState().equals("up")){
			handlePan.remove(myHandlePanels.get(myHandlePanels.size()-1));
			handlePan.add(ImPan_handleUp);
			myHandlePanels.add(ImPan_handleUp);
			ImPan_handleUp.add(ImPan_up);
			ImPan_handleUp.add(ImPan_down);
			handlePan.validate();
			handlePan.repaint();
		}
		if(model.getHandleState().equals("down")){
			handlePan.remove(myHandlePanels.get(myHandlePanels.size()-1));
			handlePan.add(ImPan_handleDown);
			myHandlePanels.add(ImPan_handleDown);
			ImPan_handleDown.add(ImPan_up);
			ImPan_handleDown.add(ImPan_down);
			handlePan.validate();
			handlePan.repaint();
		}
	}
	
	public void refreshAnomalieView(){
		if(model.isAnomalie()==true){
			gearsPan.remove(myGearsPanels.get(myGearsPanels.size()-1));
			gearsPan.add(ImPan_Anomalie);
			myGearsPanels.add(ImPan_Anomalie);
			gearsPan.validate();
			gearsPan.repaint();
		}
	}
	//controller listen of the view
	public void addController(MouseListener dcontroller){
		ImPan_up.addMouseListener(dcontroller);
		ImPan_down.addMouseListener(dcontroller);
	}
	
//getters and setters
	public static JPanel getImPan_down() {
		return ImPan_down;
	}


	public static void setImPan_down(JPanel imPan_down) {
		ImPan_down = imPan_down;
	}


	public static JPanel getImPan_up() {
		return ImPan_up;
	}


	public void setImPan_up(JPanel imPan_up) {
		ImPan_up = imPan_up;
	}



}
