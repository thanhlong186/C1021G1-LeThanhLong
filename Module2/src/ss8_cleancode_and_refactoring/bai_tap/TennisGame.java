package ss8_cleancode_and_refactoring.bai_tap;

public class TennisGame {
    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        int tempScore = 0;

        boolean draw = player1Score == player2Score;
        boolean victory = player1Score >= 4 || player2Score >= 4;
        if (victory) return whoWin(player1Score, player2Score);
        if (draw)return getDraw(player1Score);
        String score = getPoint1(player1Score) + "-" + getPoint1(player2Score);
        return score;
        }



    private static String getPoint1(int tempScore) {
        switch(tempScore)
        {
            case 0:
                return "Love";

            case 1:
                return "Fifteen";

            case 2:
                return "Thirty";

            case 3:
                return "Forty";

        }
        return null;
    }

    private static String getDraw(int player1Score) {
        String score;
        switch (player1Score)
        {
            case 0:
                score = "Love-All";
                break;
            case 1:
                score = "Fifteen-All";
                break;
            case 2:
                score = "Thirty-All";
                break;
            case 3:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;

        }
        return score;
    }

    private static String whoWin(int player1Score, int player2Score) {
        String score;
        int minusResult = player1Score - player2Score;
        if (minusResult==1) score ="Advantage player1";
        else if (minusResult ==-1) score ="Advantage player2";
        else if (minusResult>=2) score = "Win for player1";
        else score ="Win for player2";
        return score;
    }
}
