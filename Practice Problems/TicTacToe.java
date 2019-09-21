public class TicTacToe {
  public static void main(String args[]) {

    // Declare Winner Function
    static char checkBoard(char[][] game) {
      if (game == null) {
        return '.';
      }
      for (int i = 0; i < 3; i++) {
        if (game[i][0] == game[i][1] && game[i][2] == game[i][1]) {
          if (game[i][0] == 'X') {
            return 'X';
          }
          if (game[i][0] == 'O') {
            return 'O';
          }
        }
        if (game[0][i] == game[1][i] && game[2][i] == game[1][i]) {
          if (game[0][1] == 'X') {
            return 'X';
          }
          if (game[0][1] == 'O') {
            return 'O';
          }
        }
      }
      return '.';
    }
  }
}
