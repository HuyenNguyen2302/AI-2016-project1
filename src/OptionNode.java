import java.util.ArrayList;
import java.util.List;

public class OptionNode {
	int currentState;
	Action action;
	List<OptionNode> childrenList;

	public OptionNode(int currentState, Action action) {
		this.currentState = currentState;
		this.action = action;
		this.childrenList = new ArrayList();
	}

	public int getCurrentState(){
	return this.currentState;
	}
	
	public int getChildState(){
		return action.getOperationResult(currentState);
	}
	
	public String printNode(){
		if(action == null){
			return Integer.toString(this.currentState);
		}
		return Integer.toString(this.currentState) + " " + action.operatorStr + " " + Integer.toString(action.operationValue) + " = " + action.getOperationResult(this.currentState);
	}
}
