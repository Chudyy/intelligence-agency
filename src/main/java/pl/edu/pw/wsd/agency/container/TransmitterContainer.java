package pl.edu.pw.wsd.agency.container;

import jade.core.Agent;
import pl.edu.pw.wsd.agency.agent.TransmitterAgent;
import pl.edu.pw.wsd.agency.container.launcher.RunnableContainer;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents transmitter instance
 * @author marcin.czerwinski
 *
 */
public class TransmitterContainer extends RunnableContainer {

	@Override
	public List<Agent> getAgentsToRun() {
		List<Agent> descriptions = new ArrayList<>();
		descriptions.add(new TransmitterAgent("TransmitterAgent1.properties"));
		descriptions.add(new TransmitterAgent("TransmitterAgent2.properties"));
		return descriptions;
	}

}
