package com.example.filesafe.model.pieces;

public abstract class Piece {
    private final String color;

    public Piece(String color)
    {
        this.color = color;
    }

    public String getColor(){return this.color;}

    public abstract String getImageName();
}
