import java.util.ArrayList;
public class Main {
	public static void main(String []args) {
		ArrayList <State>sts = new ArrayList<State>();
		 State Georgia =new State(stateName.GEORGIA,1140.00,1500.00, 16);
		 sts.add(Georgia);
		 State Maine = new State(stateName.MAINE,1345.00, 1300.00, 11);
		 sts.add(Maine);
		 State Alabama =new State(stateName.ALABAMA,200.00, 1200.00,13);
		 sts.add(Alabama);
		State Mississippi =  new State(stateName.MISSISSPI,100.00, 1350.00,12);
		sts.add(Mississippi);
	    State California = new State(stateName.CALIFORNIA,40000,250,26);
	    sts.add(California);
	   
	    VotingInformation vt = new VotingInformation();
	
		RepublicanReport display1 = new RepublicanReport(vt);
		
		DemocraticReport display2 = new DemocraticReport(vt);
	
		DemocratRepublicanReport display3 = new DemocratRepublicanReport(vt);
		
		DemocratPopularReport display4 = new DemocratPopularReport(vt);
		HonestReport display5 = new HonestReport(vt);
		
		

		vt.setStates(sts);

		Georgia.setStatePopVoteDem(1700);
		vt.setStates(sts);
		Mississippi.setElectoralCollegeNumber(30);
		vt.setStates(sts);

	}

}
