package day17;

public class Task2 {
    public static void main(String[] args) {
        ChessPiece[][] gamePosition = new ChessPiece[8][8];
        fillTheBoard(gamePosition);
        fillTheBoardManually(gamePosition, ChessPiece.KING_BLACK,new int[][]{{0,6}});
        fillTheBoardManually(gamePosition, ChessPiece.QUEEN_BLACK,new int[][]{{3,0}});
        fillTheBoardManually(gamePosition, ChessPiece.ROOK_BLACK,new int[][]{{0,0}, {0,5}});
        fillTheBoardManually(gamePosition, ChessPiece.BISHOP_BLACK,new int[][]{{4,3}});
        fillTheBoardManually(gamePosition, ChessPiece.KNIGHT_BLACK,new int[][]{{2,2}});
        fillTheBoardManually(gamePosition, ChessPiece.PAWN_BLACK,new int[][]{{1,4}, {1,5}, {1,7}, {2,0}, {2,6}});
        fillTheBoardManually(gamePosition, ChessPiece.KING_WHITE,new int[][]{{7,6}});
        fillTheBoardManually(gamePosition, ChessPiece.QUEEN_WHITE,new int[][]{{6,3}});
        fillTheBoardManually(gamePosition, ChessPiece.ROOK_WHITE,new int[][]{{1,1}, {7,5}});
        fillTheBoardManually(gamePosition, ChessPiece.BISHOP_WHITE,new int[][]{{3,3} , {5,4}});
        fillTheBoardManually(gamePosition, ChessPiece.PAWN_WHITE,new int[][]{{4,4}, {5,5}, {1,7}, {6,0}, {6,5}, {6,7}});

        ChessBoard chessBoard = new ChessBoard(gamePosition);
        chessBoard.print();
    }

    private static void fillTheBoard(ChessPiece[][] gamePosition) {
        for (int i = 0; i < gamePosition.length; i++) {
            for (int y = 0; y < gamePosition.length; y++) {
                gamePosition[i][y] = ChessPiece.EMPTY;
            }
        }
    }

    private static void fillTheBoardManually(ChessPiece[][] gamePosition, ChessPiece chessPiece,int[][] positions) {
        for (int[] position : positions) {
            gamePosition[position[0]][position[1]] = chessPiece;
        }
    }
}
