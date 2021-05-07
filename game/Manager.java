package mpjp.game;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import mpjp.shared.*;



public class Manager {
	
	public static Manager manager = new Manager();
	private Map<String, PuzzleSelectInfo> availablePuzzleInfo;
	public Map<String, Workspace> avaiableWork;
	
	//method to create a workspace
	
	public java.lang.String createWorkspace​(PuzzleInfo info) throws MPJPException{
	
		Workspace workspace = new Workspace(info);
		String name = workspace.getId();
		avaiableWork.put(name, workspace);
		availablePuzzleInfo.put(workspace.worspaceId,new PuzzleSelectInfo(workspace.info, workspace.start, workspace.getPercentageSolved()));
		return name;
	}
	
	//The single instance of this class
	
	public static Manager getInstance() {
		return manager;
	}
	
	//reset method 

	void reset() {
		manager.avaiableWork = new TreeMap<>();
		manager.availablePuzzleInfo = new TreeMap<>();
	}

	//A set of cutting names available to produce puzzle pieces
	
	public java.util.Set<java.lang.String> getAvailableCuttings(){
		return cuttingFactory.getAvaiableCuttings();
	}
	
	//getter for the avaiable images
	
	public java.util.Set<java.lang.String> getAvailableImages(){
		return Images.getAvailableImages();
	}
	
	//get a map of the avaiable workspaces
	
	public java.util.Map<java.lang.String,​PuzzleSelectInfo> getAvailableWorkspaces(){
		return avaiableWork.getAvaiableWorkspaces();
	}

	//Select a piece in the given workspace, with its "center" near the given point
	
	public java.lang.Integer selectPiece​(java.lang.String workspaceId, Point point) throws MPJPException{
		return avaiableWork.get(workspaceId).selectPiece(point);
	}
	
	//In the workspace with the given ID, connect piece with given iD after moving its center to the given point.
	
	public PuzzleLayout connect​(java.lang.String workspaceId, int pieceId, Point point) throws MPJPException{
		return avaiableWork.get(workspaceId).connect(pieceId,point);
	}
	
	//Puzzle view of given workspace
	
	public PuzzleView getPuzzleView​(java.lang.String workspaceId) throws MPJPException{
		return avaiableWork.get(workspaceId).getPuzzleView();
	}
		
	
	// get the puzzle layout 
	
	public PuzzleLayout getCurrentLayout​(java.lang.String workspaceId) throws MPJPException{
		return avaiableWork.getWorkspace(workspaceId).getCurrentLayout();
	}
	
}