package lab2;

public interface Printer_interface {
	void print(String filename, Printer printer);   // prints file filename on the specified printer
	void queue(Printer printer);   // lists the print queue for a given printer on the user's display in lines of the form <job number>   <file name>
	void topQueue(String printer, int job);   // moves job to the top of the queue
	void start();   // starts the print server
	void stop();   // stops the print server
	void restart();   // stops the print server, clears the print queue and starts the print server again
	void status(String printer);  // prints status of printer on the user's display
	void readConfig(String parameter);   // prints the value of the parameter on the user's display
	void setConfig(String parameter, String value);   // sets the parameter to value
}
