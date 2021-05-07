package mpjp.shared;
import java.lang.String;

public class PuzzleInfo extends java.lang.Object implements java.io.Serializable {
	//Fields
	private static final long serialVersionUID = 1L;
	private int columns;			// Number of columns in the puzzle
	private String cuttingName;		// Name of the cutting used for producing pieces
	private double height;			// Height of the jigsaw puzzle
	private String imageName;		// Name of the file with the jigsaw puzzle's backgroud
	private int rows;				// Number of rows in the puzzle
	private double width;			// Width of the jigsaw puzzle
	
	//Constructors
	
	public PuzzleInfo() {
		super();
	}

	public PuzzleInfo(String imageName, String cuttingName,int rows,  int columns, double width, double height) {
		super();
		this.columns = columns;
		this.cuttingName = cuttingName;
		this.height = height;
		this.imageName = imageName;
		this.rows = rows;
		this.width = width;
	}

	//Methods
	
	// returns the number of columns in the puzzle
	public int getColumns() {
		return columns;
	}

	// returns the name of the cutting used for producing pieces
	public String getCuttingName() {
		return cuttingName;
	}

	// returns the height of the jigsaw puzzle
	public double getHeight() {
		return height;
	}

	// returns the name of the file with the jigsaw puzzle's backgroud
	public String getImageName() {
		return imageName;
	}

	// returns the number of rows in the puzzle
	public int getRows() {
		return rows;
	}

	// returns the width of the jigsaw puzzle
	public double getWidth() {
		return width;
	}
	
	// set a new number of columns for the puzzle
	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	// set a new name for the cutting used for producing pieces
	public void setCuttingName(String cuttingName) {
		this.cuttingName = cuttingName;
	}

	//set a new height for the jigsaw puzzle
	public void setHeight(double height) {
		this.height = height;
	}

	//set a new name for the file with the jigsaw puzzle's backgroud
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	
	//set a new number for the rows in the puzzle
	public void setRows(int rows) {
		this.rows = rows;
	}
	
	//set a new width for the jigsaw puzzle
	public void setWidth(double width) {
		this.width = width;
	}
	
	
	
	
	
}
