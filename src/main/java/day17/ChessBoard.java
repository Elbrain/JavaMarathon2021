package day17;

public class ChessBoard {
    ChessPiece[][] figures;

    public ChessBoard(ChessPiece[][] figures){
        this.figures = figures;
    }

    public void print(){
        for (ChessPiece[] figure : figures) {
            for (ChessPiece chessPiece : figure) {
                System.out.print(chessPiece.getModel());
            }
            System.out.println();
        }
    }
}
