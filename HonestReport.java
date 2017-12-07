import java.util.Observable;
import java.util.Observer;

public class HonestReport extends CentralObserver implements Observer {

	public HonestReport(Observable observable) {

		ElectoralCollegeStrategy = new honestFavoring();
		PopularStateStrategy = new honestStrategy();

		observable.addObserver(this);
	}

	public void VotingInformationDisplay() {
		{
			System.out.println(reportPopular());
			System.out.println(reportElectoral());
		}
	}

}
