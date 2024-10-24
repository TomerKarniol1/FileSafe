package com.example.filesafe.model.pieces;

public class Rook extends Piece{

    public Rook(String color)
    {
        super(color);
    }

    @Override
    public String getImageName()
    {
        return getColor() + "_rook.png";
    }
}
