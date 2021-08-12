/*
 * @author Rowena
 * This class contains a method called maxDegree which computes the maximum number of 
 * children a node has within the tree.
 */

public class Degree {

  public int maxDegree(Node r) {
	  
	  if(r.isLeaf()) { // returns 0 as the degree if the root has no children
		  return 0;
	  }
	  else {
		  int maxDeg = -1; // stores the max degree
		  int numChild = r.numChildren();
		  Node[] children = r.getChildren();
		  for(Node u : children) {
			  if(u.numChildren() > maxDeg) { // if the degree is larger than maxDeg, maxDeg is updated
				  maxDeg = u.numChildren();
				  numChild = maxDegree(u); // recursively calls the functions
			  }
		  }
		  return maxDeg;
	  }
  }
  
}