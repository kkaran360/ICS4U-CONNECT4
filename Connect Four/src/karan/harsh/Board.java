package karan.harsh;

public class Board {

	private char board[][] = new char[7][7];
	private final char EMPTY = '*';
	private int x, y;
	private boolean playerSwitch, gameEnd, playerAWon, playerBWon;

	public Board() {

	}

	public void setX(int i) {
		this.x = i;
	}

	public void setY(int j) {
		this.y = j;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void makeBoard() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = EMPTY;
			}
		}
	}

	public void setCondition(boolean x) {
		this.playerSwitch = x;
	}

	public boolean getCondition() {
		return playerSwitch;
	}

	public void updateBoard(int i, int j) {
		if (!getCondition()) {
			board[i][j] = 'R';
			setCondition(true);
		} else {
			board[i][j] = 'Y';
			setCondition(false);
		}
	}

	public int getIndex(int i) {
		int index = 6;
		boolean found = false;
		while (!found) {
			if (board[index][i] == EMPTY) {
				found = true;
			} else {
				if (index > 0) {
					index--;
				}
			}
		}
		return index;
	}

	public void printBoard() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void checkWinnerA() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (i >= 3) {
					if (board[i][j] == 'Y' && board[i - 1][j] == 'Y' && board[i - 2][j] == 'Y'
							&& board[i - 3][j] == 'Y') {
						setWinnerA(true);
					}
				}
				if (j <= 3) {
					if (board[i][j] == 'Y' && board[i][j + 1] == 'Y' && board[i][j + 2] == 'Y'
							&& board[i][j + 3] == 'Y') {
						setWinnerA(true);
					}
				}
				if (i <= 3 && j <= 3) {
					if (board[i][j] == 'Y' && board[i + 1][j + 1] == 'Y' && board[i + 2][j + 2] == 'Y'
							&& board[i + 3][j + 3] == 'Y') {
						setWinnerA(true);
					}
				}
				if (i <= 3 && j >= 3) {
					if (board[i][j] == 'Y' && board[i + 1][j - 1] == 'Y' && board[i + 2][j - 2] == 'Y'
							&& board[i + 3][j - 3] == 'Y') {
						setWinnerA(true);
					}
				}
			}
		}
	}

	public void checkWinnerB() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (i >= 3) {
					if (board[i][j] == 'R' && board[i - 1][j] == 'R' && board[i - 2][j] == 'R'
							&& board[i - 3][j] == 'R') {
						setWinnerB(true);
					}
				}
				if (j <= 3) {
					if (board[i][j] == 'R' && board[i][j + 1] == 'R' && board[i][j + 2] == 'R'
							&& board[i][j + 3] == 'R') {
						setWinnerB(true);
					}
				}
				if (i <= 3 && j <= 3) {
					if (board[i][j] == 'R' && board[i + 1][j + 1] == 'R' && board[i + 2][j + 2] == 'R'
							&& board[i + 3][j + 3] == 'R') {
						setWinnerB(true);
					}
				}
				if (i <= 3 && j >= 3) {
					if (board[i][j] == 'R' && board[i + 1][j - 1] == 'R' && board[i + 2][j - 2] == 'R'
							&& board[i + 3][j - 3] == 'R') {
						setWinnerB(true);
					}
				}
			}
		}
	}

	public void setWinnerA(boolean condition) {
		this.playerAWon = condition;
	}

	public void setWinnerB(boolean condition) {
		this.playerBWon = condition;
	}

	public boolean getWinnerA() {
		return playerAWon;
	}

	public boolean getWinnerB() {
		return playerBWon;
	}

	public boolean isEmpty() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == EMPTY) {
					return false;
				}
			}
		}
		return true;
	}
}
