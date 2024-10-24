# Chess PGN Encryption with JavaFX and AWS S3

### A unique encryption tool that converts files into chess PGN format and securely stores them on AWS S3. This project uses **JavaFX** for the user interface and a **custom encryption algorithm** to hide files within chess games.

---

## 📋 Project Overview

This project leverages a **custom encoding algorithm** to convert files (like PDFs, images, or text) into **chess PGN games**. The encrypted PGN files are stored on **AWS S3**, and users can later download and decrypt them back into their original form.

The encryption algorithm dynamically maps **binary data to legal chess moves** at each step of the game, making this a unique and innovative solution.

---

## 🚀 Features

- **Custom Encryption Algorithm**: Encodes binary data into chess moves based on the current game state.
- **Multi-Game Support**: Automatically starts a new game when a game ends or runs out of moves.
- **AWS S3 Integration**: Uploads encrypted PGN files to AWS S3 and downloads them on demand.
- **User-Friendly JavaFX Interface**: Allows users to upload and download files easily.
- **Secure Decryption**: Converts PGN back to the original file format without data loss.

---

## 🛠️ Technologies Used

- **JavaFX**: For the user interface.
- **AWS SDK for Java**: To interact with AWS S3 for file storage.
- **PGN Chess Format**: To store encrypted files as valid chess games.
- **Java**: For core logic and implementation.

---

## 📖 How It Works

### 1. **Encryption (File → PGN)**:

- The user selects a file from their PC.
- The file is converted into **binary chunks**.
- Each binary chunk is mapped to **chess moves** based on the legal moves available.
- The encrypted data is saved as **PGN format**.
- If a game ends, a **"NEW GAME START" marker** is added, and the encoding continues.

### 2. **Decryption (PGN → File)**:

- The user selects a PGN file from AWS S3.
- For each move, the **binary data** is reconstructed based on its index in the list of legal moves.
- When a **"NEW GAME START" marker** is found, the board is reset, and decoding continues.
- The original file is **reconstructed and saved** to the user's PC.

---

## 📋 Usage

### Uploading Files:

1. Click **"Upload File"** in the JavaFX interface.
2. Select a file from your PC.
3. The file will be encrypted and **uploaded as PGN to AWS S3**.

### Downloading Files:

1. Click **"Download File"** in the JavaFX interface.
2. Select a **PGN file from AWS S3**.
3. The PGN will be **decrypted**, and the original file will be saved to your PC.

---

## ⚠️ Known Limitations

- **Large files** may require multiple chess games to complete encoding.
- **Network connectivity** is required for AWS S3 operations.
- **Chess PGN files** must remain intact for correct decryption.

---

## 📧 Contact

For any questions or feedback, please reach out to **Tomer Karniol** at **tomer.karniol@gmail.com**.
