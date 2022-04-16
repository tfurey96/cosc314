package project2;

import java.io.*;
import java.util.*;

public class Project2Runner {
	
	static Airport[] airports= new Airport[8];
	static Path[][] flightpaths= new Path[8][8];

	public static void main(String[] args) {
		File airportCodes = new File("airport_codes.txt");

		
		try {
		  
			createAirports(); 
			createflightPathMatrix();
			System.out.println(flightpaths[1][0]);
			System.out.print(dijkstraShortesPath(airports[0],airports[1]).getDistanceofPath());
			

		} catch (FileNotFoundException e) {
			System.out.println("file not found");
		}
		
		

	}

	public static void createAirports() throws FileNotFoundException {
		File airportCodes = new File("airport_codes.txt");
		Scanner airportReader = new Scanner(airportCodes);
	
		for (int i = 0; i < 8; i++) {
			airports[i] = new Airport(airportReader.next(), i);
		}
		
	}
	public static Path dijkstraShortesPath(Airport start, Airport dest) {
		ArrayList<Airport> availableAirports= new ArrayList<>();
		for(Airport ap : airports) {
			availableAirports.add(ap);
			availableAirports.remove(start.getAirportNum());
		}
		
		
		
		while (!availableAirports.isEmpty()) {
		Path[] shortestPaths= flightpaths[start.getAirportNum()];
	    shortestPaths[start.getAirportNum()]= new Path(start, start, 0);		
		Airport visiting = shortestAvailable(availableAirports, start);
		
		}
		return  flightpaths[0][1];
	}
	
	public static Airport shortestAvailable(ArrayList<Airport> available, Airport start) {
		int apNum=start.getAirportNum();
		ArrayList<Path> availablePaths= new ArrayList<>();
		for (Airport ap: available) {
			availablePaths.add(flightpaths[start.getAirportNum()][ap.getAirportNum()]);
		}
		availablePaths.sort(null);;
		return availablePaths.get(0).getDest();
	}
	/*public static Path dijkstraShortesPath(Airport start, Airport dest) throws FileNotFoundException {
		if (start.getAirportNum()==dest.getAirportNum())
			return new Path(start,dest,0);
		Path[][] flightPaths = createflightPathMatrix();
		 ArrayList<Airport> unVisitedQ = new ArrayList<Airport>();
		for (int i = 0; i < 8; i++)
			unVisitedQ.add(airports[i]);

		
		Path[] paths = flightPaths[start.getAirportNum()];
	
		while (!unVisitedQ.isEmpty()) {
			if (unVisitedQ.get(0) != start) {
				Airport visitingAirport = unVisitedQ.remove(0);
				int shortestDistancetoVisiting = paths[visitingAirport.getAirportNum()].getDistanceofPath();
				int i = 0;
				for (Path pathfromVisitng : flightPaths[visitingAirport.getAirportNum()]) {
					if (pathfromVisitng.getDistanceofPath() + shortestDistancetoVisiting < paths[i].getDistanceofPath()) {
						paths[i]= new Path(paths[i], airports[i],flightPaths[visitingAirport.getAirportNum()][i].getDistanceofPath());
					}
					i++;
				}

			}else unVisitedQ.remove(0);
		}

		return paths[dest.getAirportNum()];// placeholder

	}*/
 public static void createflightPathMatrix() throws FileNotFoundException{

 File matrixfile= new File("distance_matrix.txt");
	Scanner matrixReader= new Scanner(matrixfile);

	for (int row=0; row< flightpaths.length;row++)
	{
	   for (int col=0; col< flightpaths[row].length;col++)
	   {
		   flightpaths[row][col]=new Path(airports[row],airports[col], matrixReader.nextInt());
	   }
	} 


		 }


}