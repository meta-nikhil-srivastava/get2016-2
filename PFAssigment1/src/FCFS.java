package Assignment4;
public class FCFS
{
	
	int [][]FirstComeFirstServe( int arrivaltime [], int endtime[] )
	{
		int n,i,j;
		int[][] result = new int[endtime.length][3];
		n=endtime.length;
		
	    
	    for ( i = 0; i <= n; i++)	// Sort by arrival Times
	    {
	        for ( j = i + 1; j < n; j++)
	        {
	        	if (arrivaltime[i] >arrivaltime[j]) // swap in arrival times
	        	{
	                int tempA = arrivaltime[i];
	                arrivaltime[i] = arrivaltime[j];
	                arrivaltime[j] = tempA;

	                int tempB = endtime[i];  //swap in execution times too
	                endtime[i] = endtime[j];
	                endtime[j] = tempB;
	            }
	        }
	    }
	    
	    result[0][0]=0; //Initializing arrival time
	    result[0][1]=1; //Initializing wait time
	    result[0][2]=endtime[0]; //Initializing job time

	    for ( i = 1; i < n; i++) 
	    {
	    	if(arrivaltime[i]<result[i-1][2])     //if processor is busy
	    	{
	    		result[i][0]=result[i-1][2]-arrivaltime[i]; //calculating wait time
	    		result[i][0]++;
	    		result[i][1]=result[i][0]+arrivaltime[i];	//calculating Start time
	    		result[i][2]=result[i-1][2]+endtime[i];		//calculating finish time
	    	}
	    	else		//if processor is free
	    	{
	    		result[i][0]=0;								
	    		result[i][1]=result[i][0]+arrivaltime[i];	//calculating Start time
	    		result[i][2]=arrivaltime[i]+endtime[i];		//calculating finish time
	    		result[i][2]--;
	    	}
	    }

	    return result;
	}

}
