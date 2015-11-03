package LandingGear;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DigitalController implements MouseListener{

	protected SensorModel model;
	private LandingGearUI LgUI ;
	
	//constructor
	public DigitalController(SensorModel model, LandingGearUI LgUI){
		this.model=model;
		this.LgUI=LgUI;
	}

	
	//Action when the pilot pushes the handle up or down
	@Override
	public void mouseClicked(MouseEvent e) {
		
		ExecutorService executor = Executors.newCachedThreadPool();
		
		//Pilot pushes handle up
		if(e.getSource().equals(LandingGearUI.getUpbtn())){
			//get the doors and gears state
			//if the doors are closed and gears are extended
			if((model.isDoor_closed()==true) && (model.isGear_extended()==true)){
				
				executor.submit(new Runnable(){
					public void run(){
						//retract the gears
						model.retractSequence();
					}
				});
			}
		}
		
		//Pilot pushes handle down
		if(e.getSource().equals(LandingGearUI.getDownbtn())){
			//get the doors and gears state
			//if the doors are closed and gears are retracted
			if((model.isDoor_closed()==true) && (model.isGear_retracted()==true)){
				
				executor.submit(new Runnable(){
					public void run(){
						//extend the gears
						model.outgoingSequence();
					}
				});
			}
		}
		
		/*executor.shutdown();
		try {
			executor.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}*/
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

