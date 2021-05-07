package mpjp.shared;

import java.util.List;
import java.util.Map;

public class PuzzleLayout extends java.lang.Object implements java.io.Serializable {
    //Fields
    private static final long serialVersionUID = 1L;

    // Map from block IDs to the list IDs of the pieces it contains
    java.util.Map<java.lang.Integer,java.util.List<java.lang.Integer>> blocks; 
    //Percentage of the puzzle already solved
    int percentageSolved;
    // Map from piece IDs to piece status
    java.util.Map<java.lang.Integer,PieceStatus> pieces;

    //Constructors

    public PuzzleLayout() {
        super();
    }

    public PuzzleLayout(Map<Integer, PieceStatus> pieces, Map<Integer, List<Integer>> blocks, int percentageSolved) {
        super();
        this.blocks = blocks;
        this.percentageSolved = percentageSolved;
        this.pieces = pieces;
    }

    //Methods

    // The list of pieces belonging to a block indexed by a block id 
    public java.util.Map<java.lang.Integer, java.util.List<java.lang.Integer>> getBlocks() {
        return blocks;
    }

    // Percentage in which puzzle is solved
    public int getPercentageSolved() {
        return percentageSolved;
    }

    // Pieces status indexed by their ids
    public java.util.Map<java.lang.Integer, PieceStatus> getPieces() {
        return pieces;
    }

    // Returns if the puzzle is complete or not
    public boolean isSolved() {
        if (getBlocks().size() == 1) {
            return true;
        }
        return false;
    }
}
