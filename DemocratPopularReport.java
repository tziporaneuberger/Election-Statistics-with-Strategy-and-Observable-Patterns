import java.util.Observable;
import java.util.Observer;

public class DemocratPopularReport extends CentralObserver implements Observer {

	public DemocratPopularReport(Observable observable) {

		ElectoralCollegeStrategy = new honestFavoring();
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
