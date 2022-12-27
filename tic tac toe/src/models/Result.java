package models;

public enum Result {

    PLAYER_1_Won("Player 1 Won", PlayerNumber.PLAYER_1),
    PLAYER_2_Won("Player 2 Won", PlayerNumber.PLAYER_2);

    String message;
    PlayerNumber winner;

    Result(String message, PlayerNumber winner) {
        this.message = message;
        this.winner = winner;
    }

    public String getMessage() {
        return message;
    }

    public PlayerNumber getWinner() {
        return winner;
    }

    public static Result getResultByWinner(PlayerNumber winner) {
        for (Result result : Result.values()){
            if (result.getWinner() == winner)
                return result;
        }
        return null;
    }
}

