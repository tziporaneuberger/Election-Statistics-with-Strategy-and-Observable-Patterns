import java.util.Observable;
import java.util.Observer;

public class DemocraticReport extends CentralObserver implements Observer {

public DemocraticReport(Observable observable) {

	ElectoralCollegeStrategy = new democratFavoringOne();
	PopularStateStrategy = new democraticStrategy();

	observable.addObserver(this);
}

public void VotingInformationDisplay() {
	{
		System.out.println(reportPopular());
		System.out.println(reportElectoral());
	}
}
}
