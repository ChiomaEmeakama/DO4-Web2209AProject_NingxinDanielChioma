package models;

public enum Square {

    X("X"),
    O("O"),
    NONE(" ");

    String square;

    Square(String square) {
        this.square = square;
    }

    public String getSquare() {
        return square;
    }

    @Override
    public String toString() {
        return square;
    }

}

