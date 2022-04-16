/*package project2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class FlightPathMatrix {
	final static int nmberOfAirPorts=8;
   Airport[] airports;
   public Path[][] flightmatrix= new Path[nmberOfAirPorts][nmberOfAirPorts];
    
    
    public void readMatrix() throws FileNotFoundException {
    	File matrixfile= new File("distance_matrix.txt");
    	Scanner matrixReader= new Scanner(matrixfile);
    
    	for (int row=0; row< flightmatrix.length;row++)
    	{
    	   for (int col=0; col< flightmatrix[row].length;col++)
    	   {
    	       flightmatrix[row][col]=new Path(start,dest, matrixReader.nextInt());
    	   }
    	} 
    }


	public Path[][] getFlightmatrix() {
		return flightmatrix;
	}


	public void setFlightmatrix(Path[][] flightmatrix) {
		this.flightmatrix = flightmatrix;
	}
}

*/