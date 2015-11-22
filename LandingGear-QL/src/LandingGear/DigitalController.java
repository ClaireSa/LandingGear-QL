package LandingGear;


import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class DigitalController implements MouseListener{

	protected SensorModel model;
	private boolean stop = true;
	
	//constructor
	public DigitalController(SensorModel model, LandingGearUI LgUI){
		this.model=model;
	}

	
	//Action when the pilot pushes the handle up or down
	@Override
	public void mouseClicked(MouseEvent e) {
			
		model.fillDoorsList1();
		model.fillDoorsList2();
		model.fillDoorsList3();
		
		model.fillGearsList1();
		model.fillGearsList2();
		model.fillGearsList3();
		
		
	Thread tR1 = new Thread(new Runnable(){
		public void run(){
			
			synchronized(this){
				
				while(stop==true){
					if(model.readDoorsList1().equals("door closed")&&model.readGearsList1().equals("gear extended")){
						model.putDoorsMoving1();
						break;
					}
				}
				 while(stop==true){
					if(model.readDoorsList1().equals("door moving")&&model.readGearsList1().equals("gear extended")){
						model.putDoorsOpened1();
						break;
					}
				 }
				 
				 while(stop==true){
					if(model.readGearsList1().equals("gear extended")&&model.readDoorsList1().equals("door opened")){
						model.putGearsMoving1();
						break;
					}
					
				 }
				 
				 while(stop==true){
					if(model.readGearsList1().equals("gear moving")&&model.readDoorsList1().equals("door opened")){
						model.putGearsRetracted1();	
						break;
					}
					
				 }
				 
				
				 while(stop==true){
					if(model.readDoorsList1().equals("door opened")&&model.readGearsList1().equals("gear retracted")){
						model.putDoorsMoving1();
						break;
					}
				 }
				 
				 while(stop==true){
					if(model.readDoorsList1().equals("door moving")&&model.readGearsList1().equals("gear retracted")){
						model.putDoorsClosed1();
						break;
					}
				 }
					 
					 if(model.readGearsList1().equals("gear moving")&&model.readDoorsList1().equals("door moving")){
							model.setAnomalie1(true);
					}
				}
			}
		});
		
	Thread tR2 = new Thread(new Runnable(){
		public void run(){
				
				try {
				    Thread.sleep(5000);                 //sleep for 5 seconds
				} catch(InterruptedException ex) {
				    Thread.currentThread().interrupt();
				}
				
			synchronized(this){
				
				while(stop==true){
					
					if(model.readDoorsList2().equals("door closed")&&model.readGearsList2().equals("gear extended")){
						model.putDoorsMoving2();
						break;
					}
				}
				 while(stop==true){
					if(model.readDoorsList2().equals("door moving")&&model.readGearsList2().equals("gear extended")){
						model.putDoorsOpened2();
						break;
					}
				 }
				 
				 while(stop==true){
					if(model.readGearsList2().equals("gear extended")&&model.readDoorsList2().equals("door opened")){
						model.putGearsMoving2();	
						break;
					}
					
				 }
				 
				 while(stop==true){
					if(model.readGearsList2().equals("gear moving")&&model.readDoorsList2().equals("door opened")){
						model.putGearsRetracted2();
						break;
					}
					
				 }
				 
				
				 while(stop==true){
					if(model.readDoorsList2().equals("door opened")&&model.readGearsList2().equals("gear retracted")){
						model.putDoorsMoving2();
						break;
					}
				 }
				 
				 while(stop==true){
					if(model.readDoorsList2().equals("door moving")&&model.readGearsList2().equals("gear retracted")){
						model.putDoorsClosed2();
						break;
						}
					 }
					 
					 if(model.readGearsList2().equals("gear moving")&&model.readDoorsList2().equals("door moving")){
							model.setAnomalie2(true);
					}
				}
				
			}
		});
	
	Thread tR3 = new Thread(new Runnable(){
		public void run(){
			
			try {
			    Thread.sleep(10000);                 //sleep for 10 seconds
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}
			
			synchronized(this){
				
				while(stop==true){
					if(model.readDoorsList3().equals("door closed")&&model.readGearsList3().equals("gear extended")){
						model.putDoorsMoving3();
						break;
					}
				 }
		
				 while(stop==true){
					if(model.readDoorsList3().equals("door moving")&&model.readGearsList3().equals("gear extended")){
						model.putDoorsOpened3();
						break;
					}
				 }
				 
				 while(stop==true){
					if(model.readGearsList3().equals("gear extended")&&model.readDoorsList3().equals("door opened")){
						model.putGearsMoving3();	
					}
					break;
				 }
				 
				 while(stop==true){
					if(model.readGearsList3().equals("gear moving")&&model.readDoorsList3().equals("door opened")){
						model.putGearsRetracted3();	
					}
					break;
				 }
				 
				
				 while(stop==true){
					if(model.readDoorsList3().equals("door opened")&&model.readGearsList3().equals("gear retracted")){
						model.putDoorsMoving3();
						break;
					}
				 }
				 
				 while(stop==true){
					if(model.readDoorsList3().equals("door moving")&&model.readGearsList3().equals("gear retracted")){
						model.putDoorsClosed3();
						break;
						}
					 }
					 
					 if(model.readGearsList3().equals("gear moving")&&model.readDoorsList3().equals("door moving")){
							model.setAnomalie3(true);
					}
					 
				}
			}
		});
	
		
		Thread tE1 = new Thread(new Runnable(){
			
				public void run(){
					
					stop=false;
					
					synchronized(this){
						if(model.readDoorsList1().equals("door closed")&&model.readGearsList1().equals("gear retracted")){
							model.putDoorsMoving1();
						}
					
						if(model.readDoorsList1().equals("door moving")&&model.readGearsList1().equals("gear retracted")){
							model.putDoorsOpened1();
						}
			
						if(model.readGearsList1().equals("gear retracted")&&model.readDoorsList1().equals("door opened")){
							model.putGearsMoving1();
						}
						
						if(model.readGearsList1().equals("gear moving")&&model.readDoorsList1().equals("door opened")){
							model.putGearsExtended1();
						}
						
						if(model.readDoorsList1().equals("door opened")&&model.readGearsList1().equals("gear extended")){
							model.putDoorsMoving1();
						}
						
						if(model.readDoorsList1().equals("door moving")&&model.readGearsList1().equals("gear extended")){
							model.putDoorsClosed1();
						}
						
						if(model.readGearsList1().equals("gear moving")&&model.readDoorsList1().equals("door moving")){
							model.setAnomalie1(true);
						}
					}	
				}
			});
						
		Thread tE2 = new Thread(new Runnable(){
			
			public void run(){
				
				stop=false;	
				
				try {
				    Thread.sleep(5000);                 //sleep for 5 seconds
				} catch(InterruptedException ex) {
				    Thread.currentThread().interrupt();
				}
				
					synchronized(this){
						if(model.readDoorsList2().equals("door closed")&&model.readGearsList2().equals("gear retracted")){
							model.putDoorsMoving2();
						}
					
						if(model.readDoorsList2().equals("door moving")&&model.readGearsList2().equals("gear retracted")){
							model.putDoorsOpened2();
						}
			
						if(model.readGearsList2().equals("gear retracted")&&model.readDoorsList2().equals("door opened")){
							model.putGearsMoving2();
						}
						
						if(model.readGearsList2().equals("gear moving")&&model.readDoorsList2().equals("door opened")){
							model.putGearsExtended2();
						}
						
						if(model.readDoorsList2().equals("door opened")&&model.readGearsList2().equals("gear extended")){
							model.putDoorsMoving2();
						}
						
						if(model.readDoorsList2().equals("door moving")&&model.readGearsList2().equals("gear extended")){
							model.putDoorsClosed2();
						}
						
						if(model.readGearsList2().equals("gear moving")&&model.readDoorsList2().equals("door moving")){
							model.setAnomalie2(true);
						}
					}	
				}
			});
		
		Thread tE3 = new Thread(new Runnable(){
			
			public void run(){
				
				stop=false;
				
				try {
				    Thread.sleep(10000);                 //sleep for 5 seconds
				} catch(InterruptedException ex) {
				    Thread.currentThread().interrupt();
				}
				
					synchronized(this){
						
						if(model.readDoorsList3().equals("door closed")&&model.readGearsList3().equals("gear retracted")){
							model.putDoorsMoving3();
						}
					
						if(model.readDoorsList3().equals("door moving")&&model.readGearsList3().equals("gear retracted")){
							model.putDoorsOpened3();
						}
			
						if(model.readGearsList3().equals("gear retracted")&&model.readDoorsList3().equals("door opened")){
							model.putGearsMoving3();
						}
						
						if(model.readGearsList3().equals("gear moving")&&model.readDoorsList3().equals("door opened")){
							model.putGearsExtended3();
						}
						
						if(model.readDoorsList3().equals("door opened")&&model.readGearsList3().equals("gear extended")){
							model.putDoorsMoving3();
						}
						
						if(model.readDoorsList3().equals("door moving")&&model.readGearsList3().equals("gear extended")){
							model.putDoorsClosed3();
						}
						
						if(model.readGearsList3().equals("gear moving")&&model.readDoorsList3().equals("door moving")){
							model.setAnomalie3(true);
						}
					}
				}
			});
		
		
		if(e.getSource().equals(LandingGearUI.getImPan_up())){
			model.setHandleState("up");
			tR1.start();
			tR2.start();
			tR3.start();
		}
		else if(e.getSource().equals(LandingGearUI.getImPan_down())){
			model.setHandleState("down");
			tR1.interrupt();
			tR2.interrupt();
			tR3.interrupt();
			tE1.start();
			tE2.start();
			tE3.start();
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

