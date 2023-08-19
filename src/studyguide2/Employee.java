package studyguide2;

import java.util.Arrays;

// Employee( ): Initialize the empty array empIDs to store 11 integer values. Assign the 
// value 1 to each element in empIDs. Print "A new JIRA team has been formed".

public class Employee implements EmployeeInterface{
	 final int NO_OF_EMPS = 11;
	 int[] empIDs;

	 Employee(){
	// The **1-based** index of a player is the player's ID 
	//  1-based index !!!!!!!!!!!!!!!!!!!!!!!!  <<<<<<
		 
	  empIDs = new int[NO_OF_EMPS + 1];
	  Arrays.fill(this.empIDs, 1);
	  this.empIDs[0] = -1;
	  System.out.println("A new JIRA team has been formed");
	 
	 }

	// void calculateAvgAge(int[] age): age contains the age of every Employee. Print the average 
	// age of the jira team with two digits after the decimal in the form 
	// "The average age of the JIRA team is {avgAge}".
	 
	 public void calculateAvgAge(int[] ages){
	  float sum = 0;
	  for(int i : ages)
	   sum += i;

	  System.out.format("The average age of the JIRA team is %.2f\n",sum/11f);     
	 }

	 // void promoteEmployee(int id): Assign -1 to empIds[id].  Print "Employee with id: {id} has 
	 // promoted". If the emp has already been promoted, print "Player {id} has already been promoted".
	 
	 public void promoteEmployee(int empID){
    
	  if(this.empIDs[empID] == 1){
	  System.out.println("Employee with id: "+empID+" has been promoted!!");
	  this.empIDs[empID] = -1;
	  }
	  else System.out.println("Employee "+empID+" has already been promoted");    
	 }	 
}
