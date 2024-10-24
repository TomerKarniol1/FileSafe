package com.example.filesafe.model.pieces;

public class Bishop extends Piece {

    public Bishop(String color)
    {
        super(color);
    }

    @Override
    public String getImageName()
    {
        return getColor() + "_bishop.png";
    }
}
