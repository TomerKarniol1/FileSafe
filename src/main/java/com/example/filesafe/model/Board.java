package com.example.filesafe.model;

import com.example.filesafe.model.pieces.*;

public class Board {
    private final Piece[][] board;
    private final int ROW = 8;
    private final int COL = 8;

    public Board()
    {
        board = new Piece[8][8];
        initializeBoard();
    }


    // set up the pieces in their initial position
    public void initializeBoard()
    {
        for (int i = 0; i < ROW; i ++)
        {
            for (int j = 0; j < COL; j++)
            {
                board[i][j] = null;
            }
        }


        // white pieces
        board[0][0] = new Rook("white");
        board[0][1] = new Knight("white");
        board[0][2] = new Bishop("white");
        board[0][3] = new Queen("white");
        board[0][4] = new King("white");
        board[0][5] = new Bishop("white");
        board[0][6] = new Knight("white");
        board[0][7] = new Rook("white");
        for (int i = 0; i < 8; i++) {
            board[1][i] = new Pawn("white");
        }

        // black pieces
        board[7][0] = new Rook("black");
        board[7][1] = new Knight("black");
        board[7][2] = new Bishop("black");
        board[7][3] = new Queen("black");
        board[7][4] = new King("black");
        board[7][5] = new Bishop("black");
        board[7][6] = new Knight("black");
        board[7][7] = new Rook("black");
        for (int i = 0; i < 8; i++) {
            board[6][i] = new Pawn("black");
        }
    }

    public Piece getPiece(int row, int col)
    {
        return board[row][col];
    }
}
