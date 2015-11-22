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
	static BufferedImage Im_up;
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
	
	private JPanel ImPan_gearsRetracted1 = new JPanel() {
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
	
	private JPanel ImPan_gearsRetracted2 = new JPanel() {
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
	
	private JPanel ImPan_gearsRetracted3 = new JPanel() {
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
	
	private JPanel ImPan_gearsMoving1 = new JPanel() {
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
	
	private JPanel ImPan_gearsMoving2 = new JPanel() {
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
	
	private JPanel ImPan_gearsMoving3 = new JPanel() {
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
	
	private JPanel ImPan_gearsExtended1 = new JPanel() {
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
	private JPanel ImPan_gearsExtended2 = new JPanel() {
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
	private JPanel ImPan_gearsExtended3 = new JPanel() {
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
	
	private JPanel ImPan_doorsOpened1 = new JPanel() {
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
	
	private JPanel ImPan_doorsOpened2 = new JPanel() {
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
	
	private JPanel ImPan_doorsOpened3 = new JPanel() {
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
	
	private JPanel ImPan_doorsMoving1 = new JPanel() {
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
	
	private JPanel ImPan_doorsMoving2 = new JPanel() {
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
	
	private JPanel ImPan_doorsMoving3 = new JPanel() {
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
	
	private JPanel ImPan_doorsClosed1 = new JPanel() {
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
	
	private JPanel ImPan_doorsClosed2 = new JPanel() {
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
	
	private JPanel ImPan_doorsClosed3 = new JPanel() {
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
	private JPanel ImPan_Anomalie1 = new JPanel() {
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
	
	private JPanel ImPan_Anomalie2 = new JPanel() {
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
	
	private JPanel ImPan_Anomalie3 = new JPanel() {
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
	private List<JPanel> myDoorsPanels1 = new ArrayList<JPanel>();
	private List<JPanel> myDoorsPanels2 = new ArrayList<JPanel>();
	private List<JPanel> myDoorsPanels3 = new ArrayList<JPanel>();
	private List<JPanel> myGearsPanels1 = new ArrayList<JPanel>();
	private List<JPanel> myGearsPanels2 = new ArrayList<JPanel>();
	private List<JPanel> myGearsPanels3 = new ArrayList<JPanel>();

	TitledBorder title1;
	TitledBorder title2;
	Color backcolor = Color.decode("#3b3a3a");
	
	GridLayout mainContainer = new GridLayout(1,3);
	GridLayout ImContainer = new GridLayout(1,3);
	
	GridBagConstraints c = new GridBagConstraints();
	GridBagConstraints cc = new GridBagConstraints();
	GridBagConstraints ccc1 = new GridBagConstraints();
	GridBagConstraints ccc2 = new GridBagConstraints();
	GridBagConstraints ccc3 = new GridBagConstraints();
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
		setSize(800, 450);
		setLayout(mainContainer);
		c.fill = GridBagConstraints.BOTH;
		
		//panel containing the handle
		handlePan.setBackground(backcolor);
		c.gridx = 1;
		c.gridy = 1;
		c.gridwidth=1;
		add(handlePan, c);
		
		//panel containing the gears and doors panels
		Pan.setLayout(new GridLayout(2,1));
		
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 1;
		c.gridy = 0;
		c.gridwidth=2;
		add(Pan, c);
		
		//panel containing the gears
		gearsPan.setBackground(backcolor);
		gearsPan.setLayout(ImContainer);
		cc.fill = GridBagConstraints.BOTH;
		cc.gridx = 0;
		cc.gridy = 0;
		Pan.add(gearsPan,cc);
		
		//panel containing the 
		doorsPan.setBackground(backcolor);
		doorsPan.setLayout(ImContainer);
		cc.fill = GridBagConstraints.BOTH;
		cc.gridx = 0;
		cc.gridy = 1;
		Pan.add(doorsPan, cc);
		
		//add border and title to the gears and doors panels
		gearsPan.setBorder(title1);
		doorsPan.setBorder(title2);
		
		//Initial state of the view
		//Gears images
		ccc1.gridx=1;
		ccc1.gridy=1;
		ccc2.gridx=2;
		ccc2.gridy=1;
		ccc3.gridx=3;
		ccc3.gridy=1;
		gearsPan.add(ImPan_gearsExtended1);
		myGearsPanels1.add(ImPan_gearsExtended1);
		gearsPan.add(ImPan_gearsExtended2);
		myGearsPanels2.add(ImPan_gearsExtended2);
		gearsPan.add(ImPan_gearsExtended3);
		myGearsPanels3.add(ImPan_gearsExtended3);
		
		//Doors Images
		doorsPan.add(ImPan_doorsClosed1);
		myDoorsPanels1.add(ImPan_doorsClosed1);
		doorsPan.add(ImPan_doorsClosed2);
		myDoorsPanels2.add(ImPan_doorsClosed2);
		doorsPan.add(ImPan_doorsClosed3);
		myDoorsPanels3.add(ImPan_doorsClosed3);
		
		//Images
		handlePan.add(ImPan_handle);
		myHandlePanels.add(ImPan_handle);
		
		//buttons
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
	 
		if(model.isDoor_closed1()==true){
					//doors1
					doorsPan.remove(myDoorsPanels1.get(myDoorsPanels1.size()-1));
					doorsPan.remove(myDoorsPanels2.get(myDoorsPanels2.size()-1));//a enlever ptete
					doorsPan.remove(myDoorsPanels3.get(myDoorsPanels3.size()-1));//a enlever ptete
					doorsPan.add(ImPan_doorsClosed1);
					doorsPan.add(myDoorsPanels2.get(myDoorsPanels2.size()-1));//a enlever ptete
					doorsPan.add(myDoorsPanels3.get(myDoorsPanels3.size()-1));//a enlever ptete
					myDoorsPanels1.add(ImPan_doorsClosed1);
					doorsPan.validate();
					doorsPan.repaint();
		}
		
		if(model.isDoor_closed2()==true){
					//doors2
					doorsPan.remove(myDoorsPanels1.get(myDoorsPanels1.size()-1));//a enlever ptete
					doorsPan.remove(myDoorsPanels2.get(myDoorsPanels2.size()-1));
					doorsPan.remove(myDoorsPanels3.get(myDoorsPanels3.size()-1));//a enlever ptete
					doorsPan.add(myDoorsPanels1.get(myDoorsPanels1.size()-1));//a enlever ptete
					doorsPan.add(ImPan_doorsClosed2);
					doorsPan.add(myDoorsPanels3.get(myDoorsPanels3.size()-1));//a enlever ptete
					myDoorsPanels2.add(ImPan_doorsClosed2);
					doorsPan.validate();
					doorsPan.repaint();
		}
		
		if(model.isDoor_closed3()==true){
					//doors3
					doorsPan.remove(myDoorsPanels1.get(myDoorsPanels1.size()-1));//a enlever ptete
					doorsPan.remove(myDoorsPanels2.get(myDoorsPanels2.size()-1));//a enlever ptete
					doorsPan.remove(myDoorsPanels3.get(myDoorsPanels3.size()-1));
					doorsPan.add(myDoorsPanels1.get(myDoorsPanels1.size()-1));//a enlever ptete
					doorsPan.add(myDoorsPanels2.get(myDoorsPanels2.size()-1));//a enlever ptete
					doorsPan.add(ImPan_doorsClosed3);
					myDoorsPanels3.add(ImPan_doorsClosed3);
					doorsPan.validate();
					doorsPan.repaint();	
		}
		
		if(model.isDoor_opened1()==true){
			
					//doors1
					doorsPan.remove(myDoorsPanels1.get(myDoorsPanels1.size()-1));
					doorsPan.remove(myDoorsPanels2.get(myDoorsPanels2.size()-1));//a enlever ptete
					doorsPan.remove(myDoorsPanels3.get(myDoorsPanels3.size()-1));//a enlever ptete
					doorsPan.add(ImPan_doorsOpened1);
					doorsPan.add(myDoorsPanels2.get(myDoorsPanels2.size()-1));//a enlever ptete
					doorsPan.add(myDoorsPanels3.get(myDoorsPanels3.size()-1));//a enlever ptete
					myDoorsPanels1.add(ImPan_doorsOpened1);
					doorsPan.validate();
					doorsPan.repaint();
		}
		
		if(model.isDoor_opened2()==true){
					//doors2
					doorsPan.remove(myDoorsPanels1.get(myDoorsPanels1.size()-1));//a enlever ptete
					doorsPan.remove(myDoorsPanels2.get(myDoorsPanels2.size()-1));
					doorsPan.remove(myDoorsPanels3.get(myDoorsPanels3.size()-1));//a enlever ptete
					doorsPan.add(myDoorsPanels1.get(myDoorsPanels1.size()-1));//a enlever ptete
					doorsPan.add(ImPan_doorsOpened2);
					doorsPan.add(myDoorsPanels3.get(myDoorsPanels3.size()-1));//a enlever ptete
					myDoorsPanels2.add(ImPan_doorsOpened2);
					doorsPan.validate();
					doorsPan.repaint();
		}	
		
		if(model.isDoor_opened3()==true){
					//doors3
					doorsPan.remove(myDoorsPanels1.get(myDoorsPanels1.size()-1));//a enlever ptete
					doorsPan.remove(myDoorsPanels2.get(myDoorsPanels2.size()-1));//a enlever ptete
					doorsPan.remove(myDoorsPanels3.get(myDoorsPanels3.size()-1));
					doorsPan.add(myDoorsPanels1.get(myDoorsPanels1.size()-1));//a enlever ptete
					doorsPan.add(myDoorsPanels2.get(myDoorsPanels2.size()-1));//a enlever ptete
					doorsPan.add(ImPan_doorsOpened3);
					myDoorsPanels3.add(ImPan_doorsOpened3);
					doorsPan.validate();
					doorsPan.repaint();
		}
		
		if(model.isDoorIsMoving1()==true){
			
					//doors1
					doorsPan.remove(myDoorsPanels1.get(myDoorsPanels1.size()-1));
					doorsPan.remove(myDoorsPanels2.get(myDoorsPanels2.size()-1));//a enlever ptete
					doorsPan.remove(myDoorsPanels3.get(myDoorsPanels3.size()-1));//a enlever ptete
					doorsPan.add(ImPan_doorsMoving1);
					doorsPan.add(myDoorsPanels2.get(myDoorsPanels2.size()-1));//a enlever ptete
					doorsPan.add(myDoorsPanels3.get(myDoorsPanels3.size()-1));//a enlever ptete
					myDoorsPanels1.add(ImPan_doorsMoving1);
					doorsPan.validate();
					doorsPan.repaint();
		}	
		
		if(model.isDoorIsMoving2()==true){
					//doors2
					doorsPan.remove(myDoorsPanels1.get(myDoorsPanels1.size()-1));//a enlever ptete	
					doorsPan.remove(myDoorsPanels2.get(myDoorsPanels2.size()-1));
					doorsPan.remove(myDoorsPanels3.get(myDoorsPanels3.size()-1));//a enlever ptete
					doorsPan.add(myDoorsPanels1.get(myDoorsPanels1.size()-1));//a enlever ptete
					doorsPan.add(ImPan_doorsMoving2);
					doorsPan.add(myDoorsPanels3.get(myDoorsPanels3.size()-1));//a enlever ptete
					myDoorsPanels2.add(ImPan_doorsMoving2);
					doorsPan.validate();
					doorsPan.repaint();
		}
		
		if(model.isDoorIsMoving3()==true){
					//doors3
					doorsPan.remove(myDoorsPanels1.get(myDoorsPanels1.size()-1));//a enlever ptete	
					doorsPan.remove(myDoorsPanels2.get(myDoorsPanels2.size()-1));//a enlever ptete	
					doorsPan.remove(myDoorsPanels3.get(myDoorsPanels3.size()-1));
					doorsPan.add(myDoorsPanels1.get(myDoorsPanels1.size()-1));//a enlever ptete
					doorsPan.add(myDoorsPanels2.get(myDoorsPanels2.size()-1));//a enlever ptete
					doorsPan.add(ImPan_doorsMoving3);
					myDoorsPanels3.add(ImPan_doorsMoving3);
					doorsPan.validate();
					doorsPan.repaint();	
		}
				
	}
		
	
	//update gears panel
	private void refreshGearsView() {
		
		if(model.isGear_extended1()==true){
	
					//gear1
					gearsPan.remove(myGearsPanels1.get(myGearsPanels1.size()-1));
					gearsPan.remove(myGearsPanels2.get(myGearsPanels2.size()-1));
					gearsPan.remove(myGearsPanels3.get(myGearsPanels3.size()-1));
					gearsPan.add(ImPan_gearsExtended1);
					gearsPan.add(myGearsPanels2.get(myGearsPanels2.size()-1));
					gearsPan.add(myGearsPanels3.get(myGearsPanels3.size()-1));
					myGearsPanels1.add(ImPan_gearsExtended1);
					gearsPan.validate();
					gearsPan.repaint();	
		}
		
		if(model.isGear_extended2()==true){		
					//gear2
					gearsPan.remove(myGearsPanels1.get(myGearsPanels1.size()-1));
					gearsPan.remove(myGearsPanels2.get(myGearsPanels2.size()-1));
					gearsPan.remove(myGearsPanels3.get(myGearsPanels3.size()-1));
					gearsPan.add(myGearsPanels1.get(myGearsPanels1.size()-1));
					gearsPan.add(ImPan_gearsExtended2);
					gearsPan.add(myGearsPanels3.get(myGearsPanels3.size()-1));
					myGearsPanels2.add(ImPan_gearsExtended2);
					gearsPan.validate();
					gearsPan.repaint();
		}
		
		if(model.isGear_extended3()==true){
					//gear3
					gearsPan.remove(myGearsPanels1.get(myGearsPanels1.size()-1));
					gearsPan.remove(myGearsPanels2.get(myGearsPanels2.size()-1));
					gearsPan.remove(myGearsPanels3.get(myGearsPanels3.size()-1));
					gearsPan.add(myGearsPanels1.get(myGearsPanels1.size()-1));
					gearsPan.add(myGearsPanels2.get(myGearsPanels2.size()-1));
					gearsPan.add(ImPan_gearsExtended3);
					myGearsPanels3.add(ImPan_gearsExtended3);
					gearsPan.validate();
					gearsPan.repaint();
		}	
		
		if(model.isGear_retracted1()==true){
			
					//gear1
					gearsPan.remove(myGearsPanels1.get(myGearsPanels1.size()-1));
					gearsPan.remove(myGearsPanels2.get(myGearsPanels2.size()-1));
					gearsPan.remove(myGearsPanels3.get(myGearsPanels3.size()-1));
					gearsPan.add(ImPan_gearsRetracted1);
					gearsPan.add(myGearsPanels2.get(myGearsPanels2.size()-1));
					gearsPan.add(myGearsPanels3.get(myGearsPanels3.size()-1));
					myGearsPanels1.add(ImPan_gearsRetracted1);
					gearsPan.validate();
					gearsPan.repaint();
		}
		
		if(model.isGear_retracted2()==true){
			
					//gear2
					gearsPan.remove(myGearsPanels1.get(myGearsPanels1.size()-1));
					gearsPan.remove(myGearsPanels2.get(myGearsPanels2.size()-1));
					gearsPan.remove(myGearsPanels3.get(myGearsPanels3.size()-1));
					gearsPan.add(myGearsPanels1.get(myGearsPanels1.size()-1));
					gearsPan.add(ImPan_gearsRetracted2);
					gearsPan.add(myGearsPanels3.get(myGearsPanels3.size()-1));
					myGearsPanels2.add(ImPan_gearsRetracted2);
					gearsPan.validate();
					gearsPan.repaint();
		}
		
		if(model.isGear_retracted3()==true){
					//gear3
					gearsPan.remove(myGearsPanels1.get(myGearsPanels1.size()-1));
					gearsPan.remove(myGearsPanels2.get(myGearsPanels2.size()-1));
					gearsPan.remove(myGearsPanels3.get(myGearsPanels3.size()-1));
					gearsPan.add(myGearsPanels1.get(myGearsPanels1.size()-1));
					gearsPan.add(myGearsPanels2.get(myGearsPanels2.size()-1));
					gearsPan.add(ImPan_gearsRetracted3);
					myGearsPanels3.add(ImPan_gearsRetracted3);
					gearsPan.validate();
					gearsPan.repaint();
		}
		
		if(model.isGearIsMoving1()==true){
		
					//gear1
					gearsPan.remove(myGearsPanels1.get(myGearsPanels1.size()-1));
					gearsPan.remove(myGearsPanels2.get(myGearsPanels2.size()-1));
					gearsPan.remove(myGearsPanels3.get(myGearsPanels3.size()-1));
					gearsPan.add(ImPan_gearsMoving1);
					gearsPan.add(myGearsPanels2.get(myGearsPanels2.size()-1));
					gearsPan.add(myGearsPanels3.get(myGearsPanels3.size()-1));
					myGearsPanels1.add(ImPan_gearsMoving1);
					gearsPan.validate();
					gearsPan.repaint();
		}
		
		if(model.isGearIsMoving2()==true){		
					//gear2
					gearsPan.remove(myGearsPanels1.get(myGearsPanels1.size()-1));
					gearsPan.remove(myGearsPanels2.get(myGearsPanels2.size()-1));
					gearsPan.remove(myGearsPanels3.get(myGearsPanels3.size()-1));
					gearsPan.add(myGearsPanels1.get(myGearsPanels1.size()-1));
					gearsPan.add(ImPan_gearsMoving2);
					gearsPan.add(myGearsPanels3.get(myGearsPanels3.size()-1));
					myGearsPanels2.add(ImPan_gearsMoving2);
					gearsPan.validate();
					gearsPan.repaint();
		}
		
		if(model.isGearIsMoving3()==true){
					//gear3
					gearsPan.remove(myGearsPanels1.get(myGearsPanels1.size()-1));
					gearsPan.remove(myGearsPanels2.get(myGearsPanels2.size()-1));
					gearsPan.remove(myGearsPanels3.get(myGearsPanels3.size()-1));
					gearsPan.add(myGearsPanels1.get(myGearsPanels1.size()-1));
					gearsPan.add(myGearsPanels2.get(myGearsPanels2.size()-1));
					gearsPan.add(ImPan_gearsMoving3);
					myGearsPanels3.add(ImPan_gearsMoving3);
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
		if(model.isAnomalie1()==true){
			
					gearsPan.remove(myGearsPanels1.get(myGearsPanels1.size()-1));
					gearsPan.add(ImPan_Anomalie1);
					myGearsPanels1.add(ImPan_Anomalie1);
					gearsPan.validate();
					gearsPan.repaint();
					
		}
		if(model.isAnomalie2()==true){
					gearsPan.remove(myGearsPanels2.get(myGearsPanels2.size()-1));
					gearsPan.add(ImPan_Anomalie2);
					myGearsPanels2.add(ImPan_Anomalie2);
					gearsPan.validate();
					gearsPan.repaint();
					
		}
		if(model.isAnomalie3()==true){
					gearsPan.remove(myGearsPanels3.get(myGearsPanels3.size()-1));
					gearsPan.add(ImPan_Anomalie3);
					myGearsPanels3.add(ImPan_Anomalie3);
					gearsPan.validate();
					gearsPan.repaint();
					
		}
	}
	//controller listen of the view
	public void addController(MouseListener dcontroller){
		ImPan_up.addMouseListener(dcontroller);
		ImPan_down.addMouseListener(dcontroller);
	}
	
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

	public BufferedImage getIm_gearsRetracted() {
		return Im_gearsRetracted;
	}


	public BufferedImage getIm_gearsExtended() {
		return Im_gearsExtended;
	}


	public BufferedImage getIm_gearsMoving() {
		return Im_gearsMoving;
	}


}
