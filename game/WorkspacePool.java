package mpjp.game;
import java.util.TreeMap;
import java.util.Map;
import java.io.File;
import mpjp.shared.*;


public class WorkspacePool {
	
	static String poolDir;
	private Map<String, Workspace> availableWork = new TreeMap<>();
	private Map<String, PuzzleSelectInfo> availablePuzzleInfo=new TreeMap<>();

	static final java.lang.String SERIALIAZTION_SUFFIX=".ser";

	//constructor for workspace pool
	
	public WorkspacePool() {
		super();
		availablePuzzleInfo;
		availableWork;

	}
	
	
	public static java.io.File getPoolDirectory(){
		
	}
	/**
	 * Change pool directory, the directory where workspace serializations are saved.
	 * @param poolDirectory
	 */
	public static void setPoolDiretory​(java.io.File poolDirectory) {
		WorkspacePool.poolDir = poolDirectory.getPath().toString();
	}

	/**
	 * Convenience method for setting pool directory as a string
	 * @param pathname
	 */
	public static void setPoolDiretory​(java.lang.String pathname) {
		WorkspacePool.poolDir = pathname;
	}

	/**
	 * Create a workspace that is stored using its id as key. The new workspace is also serialized.
	 * @param info
	 * @return worspaceId
	 * @throws MPJPException
	 */
	String createWorkspace​(PuzzleInfo info) throws MPJPException{
		
	}

	Workspace getWorkspace​(java.lang.String id) throws MPJPException{
		
	}
	
	/**
	 * A map of workspace IDs to PuzzleSelectInfo used for selecting an existing puzzle to solve.
	 * @return map of workspaceIds to PuzzleSelectInfo
	 */
	java.lang.Map<java.lang.String,​PuzzleSelectInfo> getAvailableWorkspaces(){
		return availablePuzzleInfo;
	}
	
	/**
	 * A File object for given ID. The file name is the ID with suffix .ser and its parent directory is given by property poolDirectory. 
	 * File objects are stored to avoid being constantly recreated.
	 * @param workspaceId
	 * @return file
	 */
	File getFile​(java.lang.String workspaceId){ 
		File file = new File(poolDir + "/" + workspaceId + SERIALIAZTION_SUFFIX);
		return file;

	}
	
	void backup​(java.lang.String workspaceId,Workspace workspace) throws MPJPException{
		
	}
	
	Workspace recover​(java.lang.String workspaceId) throws MPJPException{
		
	}
	
	void reset() {
		
	}

}