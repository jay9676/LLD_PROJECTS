package Chess_Game;

public class Move {
    private Player player;
    private Box start;
    private  Box end;
    private Piece pieceMoved;
    private Piece pieceKilled;
    private boolean castlingMove = false;
//
    public Move(Player player, Box start, Box end)
    {
        this.player = player;
        this.start = start;
        this.end = end;
        this.pieceMoved = start.getPiece();
    }

    public boolean isCastlingMove()
    {
        return this.castlingMove;
    }

    public void setCastlingMove(boolean castlingMove)
    {
        this.castlingMove = castlingMove;
    }
} 
