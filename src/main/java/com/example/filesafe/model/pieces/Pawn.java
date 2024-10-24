package com.example.filesafe.model.pieces;

public class Pawn extends Piece{

    public Pawn(String color)
    {
        super(color);
    }

    @Override
    public String getImageName()
    {
        return getColor() + "_pawn.png";
    }
}
