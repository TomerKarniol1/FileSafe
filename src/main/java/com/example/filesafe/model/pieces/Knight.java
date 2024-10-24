package com.example.filesafe.model.pieces;

public class Knight extends Piece{

    public Knight(String color)
    {
        super(color);
    }

    @Override
    public String getImageName()
    {
        return getColor() + "_knight.png";
    }
}
