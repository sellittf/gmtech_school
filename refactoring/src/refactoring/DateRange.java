package refactoring;

import java.util.Date;

public class DateRange {

	private Date start, end;
	
	DateRange(Date start, Date end){
		this.setStart(start);
		this.setEnd(end);
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}
	
	public boolean includes(Date date){
		return date.equals(start)
				|| date.equals(end)
				|| (date.after(start) && date.before(end));		
	}
	
}
