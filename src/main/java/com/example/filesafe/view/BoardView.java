package com.example.filesafe.view;

import com.example.filesafe.model.Board;
import com.example.filesafe.model.pieces.Piece;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class BoardView extends GridPane {

    private static final int TILE_SIZE = 128;  // Tile size matches the image size (128px)
    private final Board board;  // Reference to the board model

    // Define the light and dark green colors
    private static final Color LIGHT_GREEN = Color.rgb(234, 235, 200);
    private static final Color DARK_GREEN = Color.rgb(119, 154, 88);

    public BoardView() {
        this.board = new Board();  // Create the board with initial setup
        this.setPrefSize(8 * TILE_SIZE, 8 * TILE_SIZE);  // Set the total size of the board
        initializeBoardView();  // Render the board and pieces
    }

    // Initialize the board view with alternating tiles and pieces
    private void initializeBoardView() {
        this.getChildren().clear();  // Clear any previous content

        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                // Determine the tile color (light or dark)
                Color tileColor = (row + col) % 2 == 0 ? LIGHT_GREEN : DARK_GREEN;

                // Create a rectangle for the tile
                Rectangle tile = new Rectangle(TILE_SIZE, TILE_SIZE, tileColor);

                // Add the tile to the grid at the correct position
                this.add(tile, col, row);

                // If there's a piece at this position, add it on top of the tile
                Piece piece = board.getPiece(row, col);
                if (piece != null) {
                    addPieceToView(piece, row, col);
                }
            }
        }
    }

    // Add a piece to the view at the given row and column
    private void addPieceToView(Piece piece, int row, int col) {
        // Load the piece image
        Image pieceImage = new Image(getClass().getResourceAsStream("/images/" + piece.getImageName()));

        // Create an ImageView for the piece without scaling
        ImageView pieceView = new ImageView(pieceImage);
        pieceView.setPreserveRatio(true);  // Maintain the image aspect ratio

        // Add the ImageView to the correct position on the grid
        this.add(pieceView, col, row);
    }

    // Public method to reset the board to the initial state
    public void initializeBoard() {
        board.initializeBoard();  // Reset the board model
        initializeBoardView();    // Refresh the view
    }

    // Placeholder for encryption logic (to be implemented)
    public void encryptFile() {
        System.out.println("Encrypting file... (Animation will be added)");
    }

    // Placeholder for decryption logic (to be implemented)
    public void decryptFile() {
        System.out.println("Decrypting file... (Showing moves)");
    }
}
