package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
	
	private Board board;
	
	public ChessMatch() {
		board = new Board(8, 8);//create the board
		initialSetup();
	}
	
	public ChessPiece[][] getPieces(){ //return a matrix from the chess pieces (getPieces)
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i=0; i<board.getRows(); i++)
			for (int j=0; j<board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i,j);
			}
		return mat;
	}
	
	private void initialSetup() {//put the pieces on the board
		board.placePiece(new Rook(board, Color.WHITE), new Position(0,0));
		board.placePiece(new King(board, Color.BLACK), new Position(0,4));
		board.placePiece(new King(board, Color.WHITE), new Position(7,4));
	}
}
