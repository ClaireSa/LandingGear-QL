package LandingGear;

import java.util.ArrayList;
import java.util.Observable;


public class SensorModel extends Observable {
	
	private boolean door_opened1;
	private boolean door_opened2;
	private boolean door_opened3;
	private boolean door_closed1=true;
	private boolean door_closed2=true;
	private boolean door_closed3=true;
	private boolean doorIsMoving1;
	private boolean doorIsMoving2;
	private boolean doorIsMoving3;
	private boolean gear_retracted1;
	private boolean gear_retracted2;
	private boolean gear_retracted3;
	private boolean gearIsMoving1;
	private boolean gearIsMoving2;
	private boolean gearIsMoving3;
	private boolean gear_extended1=true;
	private boolean gear_extended2=true;
	private boolean gear_extended3=true;
	private String handleState="";
	String doorState1;
	String gearState1;
	String doorState2;
	String gearState2;
	String doorState3;
	String gearState3;
	private boolean anomalie1;
	private boolean anomalie2;
	private boolean anomalie3;
	private ArrayList<String> myDoorsStates1 = new ArrayList<String>();
	private ArrayList<String> myDoorsStates2 = new ArrayList<String>();
	private ArrayList<String> myDoorsStates3 = new ArrayList<String>();
	private ArrayList<String> myGearsStates1 = new ArrayList<String>();
	private ArrayList<String> myGearsStates2 = new ArrayList<String>();
	private ArrayList<String> myGearsStates3 = new ArrayList<String>();
	
	//constructor
	public SensorModel(){}	
	
	public void fillDoorsList1(){
				//door1
				if(door_opened1==true){
					myDoorsStates1.add("door opened");
				}
				else if(door_opened1==false){
					for(int i=0; i<myDoorsStates1.size();i++){
						if(myDoorsStates1.get(i).equals("door opened")){
							myDoorsStates1.remove(myDoorsStates1.get(i));
						}
					}
				}
				if(doorIsMoving1==true){
					myDoorsStates1.add("door moving");
				}
				else if (doorIsMoving1==false){
					for(int i=0; i<myDoorsStates1.size();i++){
						if(myDoorsStates1.get(i).equals("door moving")){
							myDoorsStates1.remove(myDoorsStates1.get(i));
						}
					}
				}
				if(door_closed1==true){
					myDoorsStates1.add("door closed");
				}
				else if(door_closed1==false){
					for(int i=0; i<myDoorsStates1.size();i++){
						if(myDoorsStates1.get(i).equals("door closed")){
							myDoorsStates1.remove(myDoorsStates1.get(i));
						}
					}
				}
				
	}
	public void fillDoorsList2(){
		if(door_opened2==true){
			myDoorsStates2.add("door opened");
		}
		else if(door_opened2==false){
			for(int i=0; i<myDoorsStates2.size();i++){
				if(myDoorsStates2.get(i).equals("door opened")){
					myDoorsStates2.remove(myDoorsStates2.get(i));
				}
			}
		}
		if(doorIsMoving2==true){
			myDoorsStates2.add("door moving");
		}
		else if (doorIsMoving2==false){
			for(int i=0; i<myDoorsStates2.size();i++){
				if(myDoorsStates2.get(i).equals("door moving")){
					myDoorsStates2.remove(myDoorsStates2.get(i));
				}
			}
		}
		
		if(door_closed2==true){
			myDoorsStates2.add("door closed");
		}
		else if(door_closed2==false){
			for(int i=0; i<myDoorsStates2.size();i++){
				if(myDoorsStates2.get(i).equals("door closed")){
					myDoorsStates2.remove(myDoorsStates2.get(i));
				}
			}
		}
	}
	
	public void fillDoorsList3(){
				
				if(door_opened3==true){
					myDoorsStates3.add("door opened");
				}
				else if(door_opened3==false){
					for(int i=0; i<myDoorsStates3.size();i++){
						if(myDoorsStates3.get(i).equals("door opened")){
							myDoorsStates3.remove(myDoorsStates3.get(i));
						}
					}
				}
				if(doorIsMoving3==true){
					myDoorsStates3.add("door moving");
				}
				else if (doorIsMoving3==false){
					for(int i=0; i<myDoorsStates3.size();i++){
						if(myDoorsStates3.get(i).equals("door moving")){
							myDoorsStates3.remove(myDoorsStates3.get(i));
						}
					}
				}
				if(door_closed3==true){
					myDoorsStates3.add("door closed");
				}
				else if(door_closed3==false){
					for(int i=0; i<myDoorsStates3.size();i++){
						if(myDoorsStates3.get(i).equals("door closed")){
							myDoorsStates3.remove(myDoorsStates3.get(i));
						}
					}
				}
			}

		
	
	
	public void fillGearsList1(){
		//**GEARS EXTENDED**//
				//gearExtended1
				if(gear_extended1==true){
					myGearsStates1.add("gear extended");
				}
				else if(gear_extended1==false){
					for(int i=0; i<myGearsStates1.size();i++){
						if(myGearsStates1.get(i).equals("gear extended")){
							myGearsStates1.remove(myGearsStates1.get(i));
						}
					}
				}
				
				if(gearIsMoving1==true){
					myGearsStates1.add("gear moving");
				}
				else if(gearIsMoving1==false){
					for(int i=0; i<myGearsStates1.size();i++){
						if(myGearsStates1.get(i).equals("gear moving")){
							myGearsStates1.remove(myGearsStates1.get(i));
						}
						
					}
				}
				
				if(gear_retracted1==true){
					myGearsStates1.add("gear retracted");
				}
				else if(gear_retracted1==false){
					for(int i=0; i<myGearsStates1.size();i++){
						if(myGearsStates1.get(i).equals("gear retracted")){
							myGearsStates1.remove(myGearsStates1.get(i));
						}
					}
				}
			}
			
	
	public void fillGearsList2(){
				//gearExtended2
				if(gear_extended2==true){
					myGearsStates2.add("gear extended");
				}
				else if(gear_extended2==false){
					for(int i=0; i<myGearsStates2.size();i++){
						if(myGearsStates2.get(i).equals("gear extended")){
							myGearsStates2.remove(myGearsStates2.get(i));
						}
					}
				}
				
				if(gearIsMoving2==true){
					myGearsStates2.add("gear moving");
				}
				else if(gearIsMoving2==false){
					for(int i=0; i<myGearsStates2.size();i++){
						if(myGearsStates2.get(i).equals("gear moving")){
							myGearsStates2.remove(myGearsStates2.get(i));
						}
					}
				}
				
				if(gear_retracted2==true){
					myGearsStates2.add("gear retracted");
				}
				else if(gear_retracted2==false){
					for(int i=0; i<myGearsStates2.size();i++){
						if(myGearsStates2.get(i).equals("gear retracted")){
							myGearsStates2.remove(myGearsStates2.get(i));
						}
					}
				}
	}
	
	public void fillGearsList3(){
				//gearExtended3
				if(gear_extended3==true){
					myGearsStates3.add("gear extended");
				}
				else if(gear_extended3==false){
					for(int i=0; i<myGearsStates3.size();i++){
						if(myGearsStates3.get(i).equals("gear extended")){
							myGearsStates3.remove(myGearsStates3.get(i));
						}
					}
				}
				
				if(gearIsMoving3==true){
					myGearsStates3.add("gear moving");
				}
				else if(gearIsMoving3==false){
					for(int i=0; i<myGearsStates3.size();i++){
						if(myGearsStates3.get(i).equals("gear moving")){
							myGearsStates3.remove(myGearsStates3.get(i));
						}
					}
				}
				
				if(gear_retracted3==true){
					myGearsStates3.add("gear retracted");
				}
				else if(gear_retracted3==false){
					for(int i=0; i<myGearsStates3.size();i++){
						if(myGearsStates3.get(i).equals("gear retracted")){
							myGearsStates3.remove(myGearsStates3.get(i));
						}
						
					}
				}
			}
		

	
	public String readDoorsList1(){
		//doorState1
		for(int i=0; i<myDoorsStates1.size();i++){
			doorState1 = myDoorsStates1.get(i).toString();
		}
		return doorState1;
		
	}
	public String readDoorsList2(){
		//doorState2
		for(int i=0; i<myDoorsStates2.size();i++){
			doorState2 = myDoorsStates2.get(i).toString();
		}
		return doorState2;
	}
	public String readDoorsList3(){
		//doorState3
		for(int i=0; i<myDoorsStates3.size();i++){
			doorState3 = myDoorsStates3.get(i).toString();
		}
		return doorState3;
		
	}
	
	
	public String readGearsList1(){
		//gearState1
		for(int i=0; i<myGearsStates1.size();i++){
			gearState1 = myGearsStates1.get(i).toString();
		}
		return gearState1;
	}
	public String readGearsList2(){
		//gearState2
		for(int i=0; i<myGearsStates2.size();i++){
			gearState2 = myGearsStates2.get(i).toString();
		}
		return gearState2;
	}
	public String readGearsList3(){
		//gearState3
		for(int i=0; i<myGearsStates3.size();i++){
			gearState3 = myGearsStates3.get(i).toString();
		}
		return gearState3;
	}
	
		

	//**PUT DOORS MOVING**//
	//door1
	public void putDoorsMoving1(){
		
		if(doorIsMoving1==false){
			//simulate a treatment
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					//doors are moving
					synchronized(this){		
						setDoor_opened1(false);
						setDoor_closed1(false);
						setDoorIsMoving1(true);
						fillDoorsList1();
						setChanged();
						notifyObservers();
						
						
					}
		}
	}
	//door1
	public void putDoorsMoving2(){
			
			if(doorIsMoving2==false){
				//simulate a treatment
						try {
							Thread.sleep(5000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						
						//doors are moving
						synchronized(this){		
							setDoor_opened2(false);
							setDoor_closed2(false);
							setDoorIsMoving2(true);
							fillDoorsList2();
							setChanged();
							notifyObservers();
							
							
						}
						
			}
		}
	//door1
	public void putDoorsMoving3(){
			
			if(doorIsMoving3==false){
				//simulate a treatment
						try {
							Thread.sleep(5000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						
						//doors are moving
						synchronized(this){		
							setDoor_opened3(false);
							setDoor_closed3(false);
							setDoorIsMoving3(true);
							fillDoorsList3();
							setChanged();
							notifyObservers();
							
							
						}
			}
		}
		
	//**DOORS OPENED**//
	public void putDoorsOpened1(){
		if(door_opened1==false){
			//simulate a treatment
					try {
			Thread.sleep(5000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					//doors are opened
					synchronized(this){		
						setDoor_closed1(false);
						setDoorIsMoving1(false);
						setDoor_opened1(true);
						fillDoorsList1();
						setChanged();
						notifyObservers();
						
						
					}
		}
	}
	public void putDoorsOpened2(){
		if(door_opened2==false){
			//simulate a treatment
					try {
			Thread.sleep(5000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					//doors are opened
					synchronized(this){		
						setDoor_closed2(false);
						setDoorIsMoving2(false);
						setDoor_opened2(true);
						fillDoorsList2();
						setChanged();
						notifyObservers();
						
						
					}
		}
	}
	public void putDoorsOpened3(){
		if(door_opened3==false){
			//simulate a treatment
					try {
			Thread.sleep(5000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					//doors are opened
					synchronized(this){		
						setDoor_closed3(false);
						setDoorIsMoving3(false);
						setDoor_opened3(true);
						fillDoorsList3();
						setChanged();
						notifyObservers();
						
						
					}
		}
	}
	//**GEARS MOVING**//
	//gearMoving1
	public void putGearsMoving1(){
		if(gearIsMoving1==false&&door_opened1==true){
			//simulate a treatment
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					//gears are moving
					synchronized(this){		
						setGear_retracted1(false);
						setGear_extended1(false);
						setGearIsMoving1(true);
						fillGearsList1();
						setChanged();
						notifyObservers();
						
						
					}
		}
	}
	//gearMoving2
	public void putGearsMoving2(){
		if(gearIsMoving2==false&&door_opened2==true){
			//simulate a treatment
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					//gears are moving
					synchronized(this){		
						setGear_retracted2(false);
						setGear_extended2(false);
						setGearIsMoving2(true);
						fillGearsList2();
						setChanged();
						notifyObservers();
						
						
					}
		}
	}
	//gearMoving3
	public void putGearsMoving3(){
		if(gearIsMoving3==false&&door_opened3==true){
			//simulate a treatment
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					//gears are moving
					synchronized(this){		
						setGear_retracted3(false);
						setGear_extended3(false);
						setGearIsMoving3(true);
						fillGearsList3();
						setChanged();
						notifyObservers();
						
						
					}
		}
	}
	//**GEARS EXTENDED**//
	//gear1
	public void putGearsExtended1(){
		if(gear_extended1==false){
			//simulate a treatment
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					//gears are extended
					synchronized(this){
						setGearIsMoving1(false);
						setGear_retracted1(false);
						setGear_extended1(true);
						fillGearsList1();
						setChanged();
						notifyObservers();
						
						
						
					}
		}
	}
	//gear2
	public void putGearsExtended2(){
		if(gear_extended2==false){
			//simulate a treatment
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					//gears are extended
					synchronized(this){
						setGearIsMoving2(false);
						setGear_retracted2(false);
						setGear_extended2(true);
						fillGearsList2();
						setChanged();
						notifyObservers();
						
						
						
					}
		}
	}
	//gear3
	public void putGearsExtended3(){
		if(gear_extended3==false){
			//simulate a treatment
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					//gears are extended
					synchronized(this){
						setGearIsMoving3(false);
						setGear_retracted3(false);
						setGear_extended3(true);
						fillGearsList3();
						setChanged();
						notifyObservers();
						
						
						
					}
		}
	}
	
	//**DOORS CLOSED**//
	//door1
	public void putDoorsClosed1(){
		if(door_closed1==false){
			//simulate a treatment
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					//doors are closed
					synchronized(this){
						setDoorIsMoving1(false);
						setDoor_opened1(false);
						setDoor_closed1(true);
						fillDoorsList1();
						
						setChanged();
						notifyObservers();	
						
						
					}
	
		}
	}
	//door2
	public void putDoorsClosed2(){
		if(door_closed2==false){
			//simulate a treatment
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					//doors are closed
					synchronized(this){
						setDoorIsMoving2(false);
						setDoor_opened2(false);
						setDoor_closed2(true);
						fillDoorsList2();
						
						setChanged();
						notifyObservers();	
						
						
					}
	
		}
	}
	//door3
	public void putDoorsClosed3(){
		if(door_closed3==false){
			//simulate a treatment
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					//doors are closed
					synchronized(this){
						setDoorIsMoving3(false);
						setDoor_opened3(false);
						setDoor_closed3(true);
						fillDoorsList3();
						
						setChanged();
						notifyObservers();	
						
						
					}
	
		}
	}
	


	//**GEARS RETRACTED**//
	//gear1
	public void putGearsRetracted1(){
		if(gear_retracted1==false){
			//simulate a treatment
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					//gears are retracted
					synchronized(this){		
						setGear_extended1(false);
						setGearIsMoving1(false);
						setGear_retracted1(true);
						fillGearsList1();
						setChanged();
						notifyObservers();
						
						
					}
		}
	}
	//gear2
	public void putGearsRetracted2(){
		if(gear_retracted2==false){
			//simulate a treatment
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					//gears are retracted
					synchronized(this){		
						setGear_extended2(false);
						setGearIsMoving2(false);
						setGear_retracted2(true);
						fillGearsList2();
						setChanged();
						notifyObservers();
						
						
					}
		}
	}
	//gear3
	public void putGearsRetracted3(){
		if(gear_retracted3==false){
			//simulate a treatment
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					//gears are retracted
					synchronized(this){		
						setGear_extended3(false);
						setGearIsMoving3(false);
						setGear_retracted3(true);
						fillGearsList3();
						setChanged();
						notifyObservers();
						
						
					}
		}
	}
	
	
	
	//getters and setters
	public boolean isDoor_opened1() {
		return door_opened1;
	}
	
	public void setDoor_opened1(boolean door_opened1) {
		this.door_opened1 = door_opened1;
	}
	
	public boolean isDoor_opened2() {
		return door_opened2;
	}
	
	public void setDoor_opened2(boolean door_opened2) {
		this.door_opened2 = door_opened2;
	}
	
	public boolean isDoor_opened3() {
		return door_opened3;
	}
	
	public void setDoor_opened3(boolean door_opened3) {
		this.door_opened3 = door_opened3;
	}
	
	public boolean isDoor_closed1() {
		return door_closed1;
	}
	
	public void setDoor_closed1(boolean door_closed1) {
		this.door_closed1 = door_closed1;
	}
	
	public boolean isDoor_closed2() {
		return door_closed2;
	}
	
	public void setDoor_closed2(boolean door_closed2) {
		this.door_closed2 = door_closed2;
	}

	public boolean isDoor_closed3() {
		return door_closed3;
	}
	
	public void setDoor_closed3(boolean door_closed3) {
		this.door_closed3 = door_closed3;
	}
	
	public boolean isDoorIsMoving1() {
		return doorIsMoving1;
	}
	
	public void setDoorIsMoving1(boolean doorIsMoving1) {
		this.doorIsMoving1 = doorIsMoving1;
	}
	
	public boolean isDoorIsMoving2() {
		return doorIsMoving2;
	}
	
	public void setDoorIsMoving2(boolean doorIsMoving2) {
		this.doorIsMoving2 = doorIsMoving2;
	}
	
	public boolean isDoorIsMoving3() {
		return doorIsMoving3;
	}
	
	public void setDoorIsMoving3(boolean doorIsMoving3) {
		this.doorIsMoving3 = doorIsMoving3;
	}
	
	public boolean isGear_retracted1() {
		return gear_retracted1;
	}
	
	public void setGear_retracted1(boolean gear_retracted1) {
		this.gear_retracted1 = gear_retracted1;
	}
	
	public boolean isGear_retracted2() {
		return gear_retracted2;
	}
	
	public void setGear_retracted2(boolean gear_retracted2) {
		this.gear_retracted2 = gear_retracted2;
	}
	
	public boolean isGear_retracted3() {
		return gear_retracted3;
	}
	
	public void setGear_retracted3(boolean gear_retracted3) {
		this.gear_retracted3 = gear_retracted3;
	}
	
	public boolean isGearIsMoving1() {
		return gearIsMoving1;
	}
	
	public void setGearIsMoving1(boolean gearIsMoving1) {
		this.gearIsMoving1 = gearIsMoving1;
	}
	
	public boolean isGearIsMoving2() {
		return gearIsMoving2;
	}
	
	public void setGearIsMoving2(boolean gearIsMoving2) {
		this.gearIsMoving2 = gearIsMoving2;
	}
	
	public boolean isGearIsMoving3() {
		return gearIsMoving3;
	}
	
	public void setGearIsMoving3(boolean gearIsMoving3) {
		this.gearIsMoving3 = gearIsMoving3;
	}
	
	public boolean isGear_extended1() {
		return gear_extended1;
	}
	
	public void setGear_extended1(boolean gear_extended1) {
		this.gear_extended1 = gear_extended1;
	}
	
	public boolean isGear_extended2() {
		return gear_extended2;
	}
	
	public void setGear_extended2(boolean gear_extended2) {
		this.gear_extended2 = gear_extended2;
	}
	
	public boolean isGear_extended3() {
		return gear_extended3;
	}
	
	public void setGear_extended3(boolean gear_extended3) {
		this.gear_extended3 = gear_extended3;
	}
	
	public ArrayList<String> getMyDoorsStates1() {
		return myDoorsStates1;
	}
	
	public void setMyDoorsStates1(ArrayList<String> myDoorsStates1) {
		this.myDoorsStates1 = myDoorsStates1;
	}
	
	public ArrayList<String> getMyDoorsStates2() {
		return myDoorsStates2;
	}
	
	public void setMyDoorsStates2(ArrayList<String> myDoorsStates2) {
		this.myDoorsStates2 = myDoorsStates2;
	}
	
	public ArrayList<String> getMyDoorsStates3() {
		return myDoorsStates3;
	}
	
	public void setMyDoorsStates3(ArrayList<String> myDoorsStates3) {
		this.myDoorsStates3 = myDoorsStates3;
	}
	
	public ArrayList<String> getMyGearsStates1() {
		return myGearsStates1;
	}
	
	public void setMyGearsStates1(ArrayList<String> myGearsStates1) {
		this.myGearsStates1 = myGearsStates1;
	}
	
	public ArrayList<String> getMyGearsStates2() {
		return myGearsStates2;
	}
	
	public void setMyGearsStates2(ArrayList<String> myGearsStates2) {
		this.myGearsStates2 = myGearsStates2;
	}
	
	public ArrayList<String> getMyGearsStates3() {
		return myGearsStates3;
	}
	
	public void setMyGearsStates3(ArrayList<String> myGearsStates3) {
		this.myGearsStates3 = myGearsStates3;
	}

	public String getHandleState() {
		return handleState;
	}

	public void setHandleState(String handleState) {
		this.handleState = handleState;
		
		setChanged();
		notifyObservers();
	}

	
	public boolean isAnomalie1() {
		return anomalie1;
	}
	
	public boolean isAnomalie2() {
		return anomalie2;
	}
	
	public boolean isAnomalie3() {
		return anomalie3;
	}

	public void setAnomalie1(boolean anomalie1) {
		this.anomalie1 = anomalie1;
		setChanged();
		notifyObservers();
	}
	
	public void setAnomalie2(boolean anomalie2) {
		this.anomalie2 = anomalie2;
		setChanged();
		notifyObservers();
	}
	
	public void setAnomalie3(boolean anomalie3) {
		this.anomalie3 = anomalie3;
		setChanged();
		notifyObservers();
	}

	
}
