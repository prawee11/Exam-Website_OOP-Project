package TT.model;

public class TimeTable {

		private String EID;
		private String Year;
		private String Semester;
		private String Module;
		private String Date;
		private String Time;
		
		
		public TimeTable(String eID, String year, String semester, String module, String date, String time) {
			super();
			EID = eID;
			Year = year;
			Semester = semester;
			Module = module;
			Date = date;
			Time = time;
		}


		public String getEID() {
			return EID;
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


		public void setEID(String eID) {
			EID = eID;
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
