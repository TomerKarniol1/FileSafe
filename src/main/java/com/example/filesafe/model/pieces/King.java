package com.example.filesafe.model.pieces;

public class King extends Piece{

    public King(String color)
    {
        super(color);
    }

    @Override
    public String getImageName()
    {
        return getColor() + "_king.png";
    }
}
