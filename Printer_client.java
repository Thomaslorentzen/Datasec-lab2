package lab2;

public class Printer_client implements Printer_interface{
	
	String[] printer_queue = {};
	
	public void print(String filename, Printer printer) {
		printer.printer_queue.add(filename);
		System.out.println("file name: " + filename);
	}   // prints file filename on the specified printer
	
	public void queue(Printer printer) {	
		
	}
	
	public void topQueue(String printer, int job) {
		// moves job to the top of the queue
	}
	
	public void start() {
		// starts the print server
	}
	
	public void stop() {
		// stops the print server
	}
	
	public void restart(){
		
	}  
	// stops the print server, clears the print queue and starts the print server again
	public void status(String printer) {
		// prints status of printer on the user's display
	}
	
	public void readConfig(String parameter) {
		// prints the value of the parameter on the user's display
	}
	
	public void setConfig(String parameter, String value) {
		// sets the parameter to value
	}

}
