import java.util.*;
public class main {

//	Given the logs for users' actions on Facebook, find a user’s active minutes spent.
//	The logs are represented by a 2D integer array logs where each logs[i] = [UserIDi, timei] indicates that the user with UserIDi performed an action at the minute timei.
//
//	Constraints:
//
//	1 <= logs.length <= 10^4
//
//	0 <= UserIDi <= 10^9
//
//	1 <= timei <= 10^5
//	
//	public class UserSession {
//
//	long[] uL;
	static HashMap<Integer,HashSet<Integer>> map;
	    public static void UserSession(ArrayList<ArrayList<Integer>> logs) {
	    	
	    	map = new HashMap<>();
	    	
	    	for(int i=0;i<logs.size();i++)
	    	{
//	    		logs.get(i);
	    		HashSet<Integer> set = new HashSet<>();
	    		if( map.containsKey(logs.get(i).get(0)))
	    		{
	    			set = map.get(logs.get(i).get(0));
	    		}
	    		set.add(logs.get(i).get(1));
	    		map.put(logs.get(i).get(0), set);
	    		
	    	}
	    	
//	    	[ [ 1, 100],
//	    	  [2,1000]];
	    	
//	    	logs: [ [0,5], [0,2], [0,2], [0,5], [1,3]]
//	    	5 - 0
//	    	2- 0
//	    	5 - 0 
	    	 
	    	// 0 - 2

	    }

	    public static int findUserActiveMinutes(int userId) {
	    	if(!map.containsKey(userId)) return 0;
	    	return map.get(userId).size();
	    }
	

	
    public static void main (String args[]) {
    	
    	ArrayList<ArrayList<Integer>> logs = new ArrayList<>();
    	ArrayList<Integer> l1 = new ArrayList<>();
    	l1.add(0);
    	l1.add(5);
    	logs.add(l1);
    	l1 = new ArrayList<>();
    	l1.add(0);
    	l1.add(2);
    	logs.add(l1);
    	l1.add(0);
    	l1.add(5);
    	logs.add(l1);
//    	l1.add(1);
//    	l1.add(5);
//    	logs.add(l1);
    	
    	UserSession(logs);
    	System.out.println(findUserActiveMinutes(2));
    	[];
//    	int[] logs = [[0,5], [0,2], [0,2], [1,5], [1,3]];
    	[ 0,1,1,0 ,0,2  ] 
    }
}
