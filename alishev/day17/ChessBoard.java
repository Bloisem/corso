package alishev.day17;

public class ChessBoard {
	private ChessPiece[][] chessGame;

	public ChessBoard(ChessPiece[][] chessGame) {
		this.chessGame = chessGame;
	}

	@Override
	public String toString() {
		StringBuffer result= new StringBuffer();
		for(int i=0;i<chessGame.length;i++) {
			for(int j=0;j<chessGame[i].length;j++) {
				result.append(chessGame[i][j]);
			}
			result.append("\n");
		}
		return result.toString();
	}
}
