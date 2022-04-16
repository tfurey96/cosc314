package project2;
import java.util.*;

public  class Path implements Comparable<Path> {
  int distanceofPath;
 private  ArrayList<Airport> shortestPath= new ArrayList<Airport>();
  Airport dest;
 
 
 public Airport getDest() {
	 return dest;
 }
 
 
 public ArrayList<Airport> getshortestPath() {
	 return shortestPath;
 }
 
 public int getDistanceofPath() {
	 return distanceofPath;
 }
 
 public Path(Airport start, Airport dest, int distance) {
	 this.dest=dest;
	 shortestPath.add(start);
	 shortestPath.add(dest);

	 distanceofPath=distance;
 }
 public Path(Path old, Airport dest,int distancefromEndtoNewEnd) {
	 this.dest=dest;
	 shortestPath=old.getshortestPath();
	 shortestPath.add(dest);
	 distanceofPath=old.getDistanceofPath()+distancefromEndtoNewEnd;
	 
}
 public String toString() {
	 String pathtaken="";
	 for ( Airport airport : shortestPath){
	 pathtaken+=airport.getAirportName()+" ";
 }
	 return pathtaken;
}
 
@Override
public int compareTo(Path anotherPath) {
	return this.getDistanceofPath()- anotherPath.getDistanceofPath();
}


}

