package mpjp.game;
import java.util.List;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import mpjp.shared.*;

import mpjp.shared.geom.*;
import mpjp.shared.*;

public class PuzzleStructure implements Iterable <Integer> {
	int rows,columns;
	double width,height;
	
	

	//Puzzle Structure constructor using raw data  
	
	public PuzzleStructure(int rows, int columns, double width, double height) {
		super();
		this.rows = rows;
		this.columns = columns;
		this.width = width;
		this.height = height;
	}

	//Puzzle Structure from info 
	
	public PuzzleStructure(PuzzleInfo info) {
		super();
		this.width = info.getWidth();
		this.height = info.getHeight();
		this.rows = info.getRows();
		this.columns = info.getColumns();


	}

	//Structure Rows getter
	
	public int getRows() {
		return rows;
	}

	//Structure Rows setter

	public void setRows(int rows) {
		this.rows = rows;
	}

	//Structure Columns getter

	public int getColumns() {
		return columns;
	}

	//Structure Columns setter

	public void setColumns(int columns) {
		this.columns = columns;
	}

	//Structure width getter

	public double getWidth() {
		return width;
	}

	//Structure width setter

	public void setWidth(double width) {
		this.width = width;
	}

	//Structure Height getter

	public double getHeight() {
		return height;
	}

	//Structure Height setter

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public Iterator<Integer> iterator() {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < this.getColumns() * this.getRows(); i++) {
			list.add(i);
		}
		return list.iterator();
	}
	
	//Structure Piece width getter
	
	public double getPieceWidth() {
		double pieceWidth = getWidth()/getColumns();
		return pieceWidth;
	}
	
	//Structure Piece height getter
	
	public double getPieceHeight() {
		double pieceHeight = getHeight()/getRows();
		return pieceHeight;
	}
	
	// getter for the row of a given piece 
	
	public int getPieceRow​(int id){
		int cols = getColumns();
		id++;
		int count=0;
		while(id>=cols) {
			id-=cols;
			count++;
		}
		if(id>0) count++;
		return count;
	}
	
	// getter for the collumn of a given piece 
	
	public int getPieceColumn​(int id){
		int cols = getColumns();
		id++;
		while(id>=cols) {
			id-=cols;
		}
		if(id==0) return getColumns();
		else return id;
	}
	
	//Number of pieces in the structure
	
	public int getPieceCount() {
		return getRows()*getColumns();
	}
	
	//get the id of the piece facing the given piece in the given direction

	public java.lang.Integer getPieceFacing​(Direction direction, java.lang.Integer id){
		int row = getPieceRow(id);
		int col = getPieceColumn(id);
		int res;
		switch(direction) {
		case NORTH: 
		if(row==1) System.out.println("ERRO");
		row-=1;
		res = getColumns()*(row-1);
		res+= col-1;
		break;
		case EAST: 
		if(col==getColumns()) System.out.println("ERRO");
		col+=1;
		res = getColumns()*(row-1);
		res+= col-1;
		break;
		case SOUTH: 
		if(row==getRows()) System.out.println("ERRO");
		row+=1;
		res = getColumns()*(row-1);
		res+= col-1;
		break;
		case WEST: 
		if(col==1) System.out.println("ERRO");	
		col-=1;
		res = getColumns()*(row-1);
		res+= col-1;
		break;
		}
		return res;
	}
	
	//get the center of the piece facing the given piece in the given direction
	
	Point getPieceCenterFacing​(Direction direction, Point point) {
		double x= point.getX()+direction.getSignalX()*getPieceWidth();
		double y= point.getY()+direction.getSignalY()*getPieceHeight();
		
		return new Point(x,y);

	}
	
	//map out pieces id and their postions
	
	public java.util.Map<java.lang.Integer,​Point> getStandardLocations(){
		HashMap<Integer,Point > map = new HashMap<Integer,Point >();
		Point center = new Point(0,0);
		
		for(int i=0;i<getPieceCount();i++) {
        	center=getPieceStandardCenter(i);
			map.put(i,center);
        }
		return map;
	}
	

	//get a piece's center coordinates through its id
	
	public Point getPieceStandardCenter​(int id){
		
		double x = getPieceRow(id)*getPieceWidth()-getPieceWidth()/2;
		double y= getPieceColumn(id)*getPieceHeight()-getPieceHeight()/2 ;
		return new Point (x,y);

	}
	
	//Given a point get the pieces to which it might belong too 
	
	public java.util.Set<java.lang.Integer> getPossiblePiecesInStandarFor​(Point point){
        Set<Integer> answer = new HashSet<Integer>();
        double x_offset= getPieceWidth()/2;
        double y_offset= getPieceHeight()/2;
        double p_x = point.getX();
        double p_y = point.getY();
        for(int i=0;i<getPieceCount();i++) {
        	Point currentCenter = getPieceStandardCenter(i);
        	double horizontal_limit_left = currentCenter.getX()-x_offset;
        	double horizontal_limit_right = currentCenter.getX()+x_offset;
        	double vertical_limit_top = currentCenter.getY()-y_offset;
        	double vertical_limit_bottom = currentCenter.getY()+y_offset;
        	if(horizontal_limit_left<=p_x<=horizontal_limit_right && vertical_limit_top<=p_y<=vertical_limit_bottom) {
        		answer.add(i);
        	}
        }
        return answer;
	}
	
	//get a random point in the puzzle
	
	public Point getRandomPointInStandardPuzzle() {
		
		Random rand = new Random();
		double y= getHeight()*rand.nextDouble();
		
		double x= getWidth()*rand.nextDouble();
		
		return new Point(x,y);
	}

	//init method 
	
	void init​(int rows, int columns, double width, double height) {
		this.rows = rows;
		this.columns = columns;
		this.width = width;
		this.height = height;
	}

}