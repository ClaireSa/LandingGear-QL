package LandingGear;

import java.awt.List;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class DigitalController implements MouseListener{

	protected SensorModel model;
	private LandingGearUI LgUI ;
	private boolean stop = true;
	
	//constructor
	public DigitalController(SensorModel model, LandingGearUI LgUI){
		this.model=model;
		this.LgUI=LgUI;
	}

	
	//Action when the pilot pushes the handle up or down
	@Override
	public void mouseClicked(MouseEvent e) {
			
		model.fillDoorsList();
		model.fillGearsList();
		
		
		//ExecutorService executor = Executors.newFixedThreadPool(1);
		Thread t = new Thread(new Runnable(){
			
			
				//retract the gears
				public void run(){
				if(e.getSource().equals(LandingGearUI.getUpbtn())&&!e.getSource().equals(LandingGearUI.getDownbtn())){
						
				
					System.out.println(" gear state : "+model.readGearsList());
					
					if(model.readDoorsList().equals("door closed")&&model.readGearsList().equals("gear extended")){
						System.out.println("retracted sequence - doors moving");
						model.putDoorsMoving();
						model.fillDoorsList();
						System.out.println(" dorr state : "+model.readDoorsList());
					}
				
					
					if(model.readDoorsList().equals("door moving")&&model.readGearsList().equals("gear extended")){
						System.out.println("retracted sequence - doors opened");
						model.putDoorsOpened();
						model.fillDoorsList();
					System.out.println(" dorr state : "+model.readDoorsList());
					System.out.println(" gear state : "+model.readGearsList());
					}
		
					if(model.readGearsList().equals("gear extended")&&model.readDoorsList().equals("door opened")){
						System.out.println("retracted sequence - gears moving");
						model.putGearsMoving();
						model.fillGearsList();
						System.out.println(" gear state : "+model.readGearsList());
					}
					
					if(model.readGearsList().equals("gear moving")&&model.readDoorsList().equals("door opened")){
						System.out.println("retracted sequence - gears retracted");
						model.putGearsRetracted();
						model.fillGearsList();
						System.out.println(" gear state : "+model.readGearsList());
					}
					
					
					if(model.readDoorsList().equals("door opened")&&model.readGearsList().equals("gear retracted")){
						System.out.println("retracted sequence - doors moving 2");
						model.putDoorsMoving();
						model.fillDoorsList();
					System.out.println(" door state : "+model.readDoorsList());
					}
					
					if(model.readDoorsList().equals("door moving")&&model.readGearsList().equals("gear retracted")){
						System.out.println("retracted sequence - doors closed");
						model.putDoorsClosed();
						model.fillDoorsList();
					
					System.out.println(" door state : "+model.readDoorsList());
					}
					
					}
					else if(e.getSource().equals(LandingGearUI.getDownbtn())&&!e.getSource().equals(LandingGearUI.getUpbtn())){
						
						System.out.println("sortie du if retracted sequence + " +stop);
						model.setHandleState("down");
						
						System.out.println(" gear state : "+model.readGearsList());
						
						if(model.readDoorsList().equals("door closed")&&model.readGearsList().equals("gear retracted")){
							System.out.println("extended sequence - doors moving");
							model.putDoorsMoving();
							
							System.out.println(" dorr state : "+model.readDoorsList());
						}
					
						if(model.readDoorsList().equals("door moving")&&model.readGearsList().equals("gear retracted")){
							System.out.println("extended sequence - doors opened");
							model.putDoorsOpened();
						
						System.out.println(" dorr state : "+model.readDoorsList());
						System.out.println(" gear state : "+model.readGearsList());
						}
			
						if(model.readGearsList().equals("gear retracted")&&model.readDoorsList().equals("door opened")){
							System.out.println("extended sequence - gears moving");
							model.putGearsMoving();
							
							System.out.println(" gear state : "+model.readGearsList());
						}
						
						if(model.readGearsList().equals("gear moving")&&model.readDoorsList().equals("door opened")){
							System.out.println("extended sequence - gears retracted");
							model.putGearsExtended();
						
							System.out.println(" gear state : "+model.readGearsList());
						}
						
						
						if(model.readDoorsList().equals("door opened")&&model.readGearsList().equals("gear extended")){
							System.out.println("extended sequence - doors moving 2");
							model.putDoorsMoving();
						System.out.println(" door state : "+model.readDoorsList());
						}
						
						if(model.readDoorsList().equals("door moving")&&model.readGearsList().equals("gear extended")){
							System.out.println("extended sequence - doors closed");
							model.putDoorsClosed();
						
						System.out.println(" door state : "+model.readDoorsList());
						}	
					}
				}
			
				
			});
		t.start();
		
	}
						


	@Override
	public void mousePressed(MouseEvent e) {}


	@Override
	public void mouseReleased(MouseEvent e) {}


	@Override
	public void mouseEntered(MouseEvent e) {}


	@Override
	public void mouseExited(MouseEvent e) {}
		
	}

