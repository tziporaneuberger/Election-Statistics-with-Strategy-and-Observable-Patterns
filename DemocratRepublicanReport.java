import java.util.Observable;
import java.util.Observer;

public class DemocratRepublicanReport extends CentralObserver implements Observer {

	public DemocratRepublicanReport(Observable observable) {

		ElectoralCollegeStrategy = new republicanFavoringTwo();
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