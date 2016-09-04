import java.util.List;
import java.util.PriorityQueue;

public abstract class Algorithm {
	int error;
	double timeLimit;
//	int startingNum;
	Problem problem;
	int numOfNodesExpanded;
	double currTime;
	OptionNodeList options;
	PriorityQueue<Integer> expandedNodesQueue = new PriorityQueue<Integer>();
	OptionNodeList result = new OptionNodeList();

	public Algorithm(double time, int startingNum, int targetNum, List<Action> actions) {
		this.error = 0;
		this.timeLimit = time;
//		this.startingNum = startingNum;
		this.problem = new Problem(startingNum, targetNum, actions);
		this.numOfNodesExpanded = 0;
	}

/**
 * do search
 * @param startingNum the initial state
 * @return OptionNodeList if result found, otherwise null
 */
	public abstract OptionNodeList search();

//
//	public boolean reachGoal(int currentNum) {
//		return currentNum == this.targetNum;
//	}
	
//	public PriorityQueue<Integer> expandNode(PriorityQueue<Integer> currentQueue) {
//		return currentQueue;
//	}
}
