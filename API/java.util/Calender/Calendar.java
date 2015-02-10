import java.util.Calendar;

class MonthlyCalendar{
	private int year;
	private int month;
	private int[][] calendarMatrix = new int[6][7];
	private int startDay;
	private int lastDate;

	public MonthlyCalendar(int year, int month){
		this.year = year;
		this.month = month;
		calcFields();
	}

	private void calcFields(){
		Calendar calendar = Calendar.getInstance();
		calendar.clear();

		calendar.set(year, month-1,1);
		startDay = calendar.get(Calendar.DAY_OF_WEEK);

		calendar.add(Calendar.MONTH, 1);
		calendar.add(Calendar.DATE, -1);
		lastDate = calendar.get(Calendar.DATE);

		int row = 0;
		int column = startDay-1;
		for(int date = 1 ; date <= lastDate; date++){
			calendarMatrix[row][column] = date;
			if(column == 6 ){
				row ++;
				column = 0;
			}else {
				column++;
			}
		}
	}

	public String toString(){
		StringBuffer sb = new StringBuffer();

		loop : for(int i = 0 ; i < calendarMatrix.length; i++){
					for(int j = 0 ; j < calendarMatrix[i].length ; j++){
						int day = calendarMatrix[i][j];
						if(day == 0){
							if(i != 0){
								break loop;
							}
							sb.append("   ");
						}else if(day < 10){
							sb.append("  ").append(day);
						}else{
							sb.append(" ").append(day);
						}
					}
					sb.append("\r\n");
		}
		return sb.toString();
	}

	public static void main(String[] args){
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		for(int month = 1; month <= 12 ; month++){
			System.out.println();
			System.out.println(currentYear + "”N" + month + "ŒŽ");
			System.out.println(new MonthlyCalendar(currentYear,month));
		}
	}
}