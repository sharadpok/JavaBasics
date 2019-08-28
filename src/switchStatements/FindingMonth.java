package switchStatements;

public class FindingMonth {

	public static void main(String[] args)
	{
		int monthNumber=8;
		String stringMonth="";
		switch(monthNumber)
		{
		case 1:stringMonth="1-Jan";
		break;
		case 2:stringMonth="2-Feb";
		break;
		case 3:stringMonth="3-March";
		break;
		case 4:stringMonth="4-April";
		break;
		case 5:stringMonth="5-May";
		break;
		case 6:stringMonth="6-Jun";
		break;
		case 7:stringMonth="7-July";
		break;
		case 8:stringMonth="8-Aug";
		break;
		case 9:stringMonth="9-Sept";
		break;
		case 10:stringMonth="10-Oct";
		break;
		case 11:stringMonth="11-Nov";
		break;
		case 12:stringMonth="12-Dec";
		break;

		default:System.out.println("Invalid Month Number");
		}
		System.out.println(stringMonth);

	}

}
