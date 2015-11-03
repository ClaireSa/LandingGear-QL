package LandingGear;

import java.util.Observable;


public class SensorModel extends Observable /*implements Runnable*/ {
	
	private boolean door_opened;
	private boolean door_closed=true;
	private boolean doorIsMoving;
	private boolean gear_retracted;
	private boolean gearIsMoving;
	private boolean gear_extended=true;
	int i;
	
	
	//constructor
	public SensorModel(){}	
	
	//sequence to extend the gears
	public void outgoingSequence(){	
		
		//simulate a treatment
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//doors are moving
		synchronized(this){		
			setDoor_opened(false);
			setDoor_closed(false);
			setDoorIsMoving(true);
			
			setChanged();
			notifyObservers();
		}
		
		//simulate a treatment
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//doors are opened
		synchronized(this){		
			setDoor_closed(false);
			setDoorIsMoving(false);
			setDoor_opened(true);
			
			setChanged();
			notifyObservers();
		}
		
		//simulate a treatment
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//gears are moving
		synchronized(this){		
			setGear_retracted(false);
			setGear_extended(false);
			setGearIsMoving(true);
			
			setChanged();
			notifyObservers();
		}
		
		//simulate a treatment
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//gears are extended
		synchronized(this){
			setGearIsMoving(false);
			setGear_retracted(false);
			setGear_extended(true);
			
			setChanged();
			notifyObservers();	
		}
		
		//simulate a treatment
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//doors are moving
		synchronized(this){		
			setDoor_opened(false);
			setDoor_closed(false);
			setDoorIsMoving(true);
					
			setChanged();
			notifyObservers();
		}
		
		//simulate a treatment
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//doors are closed
		synchronized(this){
			setDoorIsMoving(false);
			setDoor_opened(false);
			setDoor_closed(true);
			
			setChanged();
			notifyObservers();	
		}

	}

	//sequence to retract the gears
	public void retractSequence(){
		
		//simulate a treatment
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//doors are moving
		synchronized(this){		
			setDoor_opened(false);
			setDoor_closed(false);
			setDoorIsMoving(true);
			
			setChanged();
			notifyObservers();
		}
		
		//simulate a treatment
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//doors are opened
		synchronized(this){		
			setDoor_closed(false);
			setDoorIsMoving(false);
			setDoor_opened(true);
			
			setChanged();
			notifyObservers();
		}
		
		//simulate a treatment
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//gears are moving
		synchronized(this){		
			setGear_retracted(false);
			setGear_extended(false);
			setGearIsMoving(true);
			
			setChanged();
			notifyObservers();
		}
		
		//simulate a treatment
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//gears are retracted
		synchronized(this){		
			setGear_extended(false);
			setGearIsMoving(false);
			setGear_retracted(true);
			
			setChanged();
			notifyObservers();
		}
		
		//simulate a treatment
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//doors are moving
		synchronized(this){		
			setDoor_opened(false);
			setDoor_closed(false);
			setDoorIsMoving(true);
							
			setChanged();
			notifyObservers();
		}
				
		//simulate a treatment
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//doors are closed
		synchronized(this){
			setDoorIsMoving(false);
			setDoor_opened(false);
			setDoor_closed(true);
			
			setChanged();
			notifyObservers();	
		}
		
		
	}
	
	//getters and setters
	public boolean isDoor_opened() {
		return door_opened;
	}

	public void setDoor_opened(boolean door_opened) {
		this.door_opened = door_opened;
	}

	public boolean isDoor_closed() {
		return door_closed;
	}

	public void setDoor_closed(boolean door_closed) {
		this.door_closed = door_closed;
	}

	public boolean isDoorIsMoving() {
		return doorIsMoving;
	}

	public void setDoorIsMoving(boolean doorIsMoving) {
		this.doorIsMoving = doorIsMoving;
	}

	public boolean isGear_retracted() {
		return gear_retracted;
	}

	public void setGear_retracted(boolean gear_retracted) {
		this.gear_retracted = gear_retracted;
	}

	public boolean isGearIsMoving() {
		return gearIsMoving;
	}

	public void setGearIsMoving(boolean gearIsMoving) {
		this.gearIsMoving = gearIsMoving;
	}

	public boolean isGear_extended() {
		return gear_extended;
	}

	public void setGear_extended(boolean gear_extended) {
		this.gear_extended = gear_extended;
	}

	
}
