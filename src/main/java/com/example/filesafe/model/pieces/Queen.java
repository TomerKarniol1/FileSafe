package com.example.filesafe.model.pieces;

public class Queen extends Piece{

    public Queen(String color)
    {
        super(color);
    }

    @Override
    public String getImageName()
    {
        return getColor() + "_queen.png";
    }
}
