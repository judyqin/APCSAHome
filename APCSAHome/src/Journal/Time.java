package Journal;

public class Time {

	public long currentHour; 
	public long currentMinute; 
	public long currentSecond;
	public long totalHours; 
	public long totalMinutes; 
	public long totalSeconds; 
	public long totalMilliseconds; 
	
	public Time() { 
		totalMilliseconds = System.currentTimeMillis(); 
		totalSeconds = totalMilliseconds/1000;
		totalMinutes = totalSeconds/60;
		totalHours = totalMinutes/60; 	
}
	
	public long getHour() {
		currentHour = totalHours%24;
		return currentHour; 
	}

	public long getMinute() {
		currentMinute = totalMinutes%60; 
		return currentMinute; 
	}
	   
	public long getSecond() {
		currentSecond = totalSeconds%60;	
		return currentSecond; 
	}
	
	public String setTime(long elapseTime) {
		totalMilliseconds = elapseTime;
		totalSeconds = totalMilliseconds/1000; 
		totalMinutes = totalSeconds/60;
		totalHours = totalMinutes/60; 

	    return getHour() + ":" + getMinute() + ":" + getSecond(); 
	}
	
	public String toString(){
	      return "Current time is " + getHour() +":" 
	       + getMinute() +":" + getSecond() + " GMT";
	    }
	  
	
	public static void main(String args[]) {
		
		Time t = new Time();
		System.out.println(t.toString());
		System.out.println(t.setTime(555550000));
	
	}
}
