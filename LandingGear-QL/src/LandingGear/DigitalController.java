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
					
					stop=true;
					model.setHandleState("up");
					
				 while(stop==true){
					if(model.readDoorsList().equals("door closed")&&model.readGearsList().equals("gear extended")){
						model.putDoorsMoving();
						break;
					}
				 }
		
				 while(stop==true){
					if(model.readDoorsList().equals("door moving")&&model.readGearsList().equals("gear extended")){
						model.putDoorsOpened();
						break;
					}
				 }
				 
				 while(stop==true){
					if(model.readGearsList().equals("gear extended")&&model.readDoorsList().equals("door opened")){
						model.putGearsMoving();	
					}
					break;
				 }
				 
				 while(stop==true){
					if(model.readGearsList().equals("gear moving")&&model.readDoorsList().equals("door opened")){
						model.putGearsRetracted();	
					}
					break;
				 }
				 
				
				 while(stop==true){
					if(model.readDoorsList().equals("door opened")&&model.readGearsList().equals("gear retracted")){
						model.putDoorsMoving();
						break;
					}
				 }
				 
				 while(stop==true){
					if(model.readDoorsList().equals("door moving")&&model.readGearsList().equals("gear retracted")){
						model.putDoorsClosed();
						break;
						}
					 }
					 
					 if(model.readGearsList().equals("gear moving")&&model.readDoorsList().equals("door moving")){
							model.setAnomalie(true);
					} 
				 }
			});
		
		
		Thread t2 = new Thread(new Runnable(){
				public void run(){
				
						stop=false;
						model.setHandleState("down");
						
						if(model.readDoorsList().equals("door closed")&&model.readGearsList().equals("gear retracted")){
							model.putDoorsMoving();
						}
					
						if(model.readDoorsList().equals("door moving")&&model.readGearsList().equals("gear retracted")){
							model.putDoorsOpened();
						}
			
						if(model.readGearsList().equals("gear retracted")&&model.readDoorsList().equals("door opened")){
							model.putGearsMoving();
						}
						
						if(model.readGearsList().equals("gear moving")&&model.readDoorsList().equals("door opened")){
							model.putGearsExtended();
						}
						
						if(model.readDoorsList().equals("door opened")&&model.readGearsList().equals("gear extended")){
							model.putDoorsMoving();
						}
						
						if(model.readDoorsList().equals("door moving")&&model.readGearsList().equals("gear extended")){
							model.putDoorsClosed();
						}
						
						if(model.readGearsList().equals("gear moving")&&model.readDoorsList().equals("door moving")){
							model.setAnomalie(true);
						}
					}
				});
		
		
		if(e.getSource().equals(LandingGearUI.getUpbtn())){
			t.start();
		}
		else if(e.getSource().equals(LandingGearUI.getDownbtn())){
			t2.start();
		}
		
		
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

