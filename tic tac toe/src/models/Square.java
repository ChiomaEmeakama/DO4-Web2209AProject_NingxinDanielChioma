package models;

public enum Square {

    X("X"),
    O("O"),
    Empty("");

    String square;
    private String mark;

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

    public void setMark(String mark) {
        this.mark = mark;
    }
}

