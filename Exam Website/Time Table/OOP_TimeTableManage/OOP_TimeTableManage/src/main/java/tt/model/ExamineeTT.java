package tt.model;

public class ExamineeTT {
	private String Eid;
	private String Type;
	private String Year;
	private String Semester;
	private String Module;
	private String Date;
	private String Time;
	
	
	public ExamineeTT(String eid, String type, String year, String semester, String module, String date, String time) {
		super();
		Eid = eid;
		Type = type;
		Year = year;
		Semester = semester;
		Module = module;
		Date = date;
		Time = time;
	}


	public String getEid() {
		return Eid;
	}


	public String getType() {
		return Type;
	}


	public String getYear() {
		return Year;
	}


	public String getSemester() {
		return Semester;
	}


	public String getModule() {
		return Module;
	}


	public String getDate() {
		return Date;
	}


	public String getTime() {
		return Time;
	}


	public void setEid(String eid) {
		Eid = eid;
	}


	public void setType(String type) {
		Type = type;
	}


	public void setYear(String year) {
		Year = year;
	}


	public void setSemester(String semester) {
		Semester = semester;
	}


	public void setModule(String module) {
		Module = module;
	}


	public void setDate(String date) {
		Date = date;
	}


	public void setTime(String time) {
		Time = time;
	}
	
	
	
}