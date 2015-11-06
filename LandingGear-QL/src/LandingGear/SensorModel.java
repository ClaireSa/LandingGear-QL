package LandingGear;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;


public class SensorModel extends Observable {
	
	private boolean door_opened;
	private boolean door_closed=true;
	private boolean doorIsMoving;
	private boolean gear_retracted;
	private boolean gearIsMoving;
	private boolean gear_extended=true;
	private String handleState="";
	String doorState;
	String gearState;
	private ArrayList myDoorsStates = new ArrayList();
	private ArrayList myGearsStates = new ArrayList();
	private Iterator d = myDoorsStates.iterator();
	private Iterator g = myGearsStates.iterator();
	
	//constructor
	public SensorModel(){}	
	
	public void fillDoorsList(){
		if(door_opened==true){
			myDoorsStates.add("door opened");
		}
		else if(door_opened==false){
			for(int i=0; i<myDoorsStates.size();i++){
				if(myDoorsStates.get(i).equals("door_opened")){
					myDoorsStates.remove(myDoorsStates.get(i));
				}
				
			}
			
		}
			
		if(doorIsMoving==true){
			myDoorsStates.add("door moving");
		}
		else if (doorIsMoving==false){
			for(int i=0; i<myDoorsStates.size();i++){
				if(myDoorsStates.get(i).equals("doorIsMoving")){
					myDoorsStates.remove(myDoorsStates.get(i));
				}
				
			}
		}
		if(door_closed==true){
			myDoorsStates.add("door closed");
		}
		else if(door_opened==false){
			for(int i=0; i<myDoorsStates.size();i++){
				if(myDoorsStates.get(i).equals("door_opened")){
					myDoorsStates.remove(myDoorsStates.get(i));
				}
				
			}
		}
	}
	
	public void fillGearsList(){
		if(gear_extended==true){
			myGearsStates.add("gear extended");
		}
		else if(gear_extended==false){
			for(int i=0; i<myGearsStates.size();i++){
				if(myGearsStates.get(i).equals("gear extended")){
					myGearsStates.remove(myGearsStates.get(i));
				}
				
			}
		}
		if(gearIsMoving==true){
			myGearsStates.add("gear moving");
		}
		else if(gearIsMoving==false){
			for(int i=0; i<myGearsStates.size();i++){
				if(myGearsStates.get(i).equals("gearIsMoving")){
					myGearsStates.remove(myGearsStates.get(i));
				}
				
			}
		}
		if(gear_retracted==true){
			myGearsStates.add("gear retracted");
		}
		else if(gear_retracted==false){
			for(int i=0; i<myGearsStates.size();i++){
				if(myGearsStates.get(i).equals("gear_retracted")){
					myGearsStates.remove(myGearsStates.get(i));
				}
				
			}
		}
	}
	
	public String readDoorsList(){
		for(int i=0; i<myDoorsStates.size();i++){
			doorState = myDoorsStates.get(i).toString();
		}
		return doorState;
	}
	public String readGearsList(){
		for(int i=0; i<myGearsStates.size();i++){
			gearState = myGearsStates.get(i).toString();
		}
		return gearState;
	}
	
	
	

//sequence to extend the gears
	//public void outgoingSequence(){	
public void putDoorsMoving(){
	
	if(doorIsMoving==false){
		//simulate a treatment
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				//doors are moving
				//synchronized(this){		
					setDoor_opened(false);
					setDoor_closed(false);
					setDoorIsMoving(true);
					
					setChanged();
					notifyObservers();
					
					//fillDoorsList();
				//}
	}
}
	
public void putDoorsOpened(){
	if(door_opened==false){
		//simulate a treatment
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				//doors are opened
				//synchronized(this){		
					setDoor_closed(false);
					setDoorIsMoving(false);
					setDoor_opened(true);
					
					setChanged();
					notifyObservers();
					
					//fillDoorsList();
				//}
	}
}
	
public void putGearsMoving(){
	if(gearIsMoving==false&&door_opened==true){
		//simulate a treatment
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				//gears are moving
				//synchronized(this){		
					setGear_retracted(false);
					setGear_extended(false);
					setGearIsMoving(true);
					
					setChanged();
					notifyObservers();
					
					//fillGearsList();
				//}
	}
}
	
public void putGearsExtended(){
	if(gear_extended==false){
		//simulate a treatment
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				//gears are extended
				//synchronized(this){
					setGearIsMoving(false);
					setGear_retracted(false);
					setGear_extended(true);
					
					setChanged();
					notifyObservers();
					
					//fillGearsList();
					
				//}
	}
}
	
		
	/*if(doorIsMoving==false){
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
	}*/
public void putDoorsClosed(){
	if(door_closed==false){
		//simulate a treatment
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				//doors are closed
				//synchronized(this){
					setDoorIsMoving(false);
					setDoor_opened(false);
					setDoor_closed(true);
					
					
					setChanged();
					notifyObservers();	
					
					//fillDoorsList();
				//}

	}
}
	
		
	//}

	//sequence to retract the gears
	//public void retractSequence(){
public void putGearsRetracted(){
	if(gear_retracted==false){
		//simulate a treatment
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				//gears are retracted
				//synchronized(this){		
					setGear_extended(false);
					setGearIsMoving(false);
					setGear_retracted(true);
					
					setChanged();
					notifyObservers();
					
					//fillGearsList();
				//}
	}
}
	/*if(doorIsMoving==false){
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
		}
		
	if(door_opened==false){
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
	}
		
	if(gearIsMoving==false){
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
	}
		
	if(gear_retracted){
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
	}
		
	if(doorIsMoving==false){
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
	}
		
	if(door_closed==false){
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
		
		
		
	}*/
	
	public void SystemState(){
		
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

	public String getHandleState() {
		return handleState;
	}

	public void setHandleState(String handleState) {
		this.handleState = handleState;
		
		setChanged();
		notifyObservers();
	}
	
	public ArrayList getMyDoorsStates() {
		return myDoorsStates;
	}

	public void setMyDoorsStates(ArrayList myDoorsStates) {
		this.myDoorsStates = myDoorsStates;
	}

	public ArrayList getMyGearsStates() {
		return myGearsStates;
	}

	public void setMyGearsStates(ArrayList myGearsStates) {
		this.myGearsStates = myGearsStates;
	}

	
}
