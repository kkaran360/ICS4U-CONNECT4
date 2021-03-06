package karan.harsh;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * 
 * @author Karan Jariwala, Harsh Jariwala
 * @description This class allows the user to play against random AI.
 * @version 3.5
 */
@SuppressWarnings("serial")
public class SingleplayerPanel extends JPanel {
	private JLabel lblCircles[][];
	private JButton btnA, btnB, btnC, btnD, btnE, btnF, btnG;
	private AI ai = new AI ();
	private String userName = "";
	
	/**
	 * Constructor of a SingleplayerPanel Class.
	 */
	public SingleplayerPanel() {
		setPreferredSize(new Dimension(500, 600));
		setLayout(new GridLayout(8, 0, 55, 20));
		setBackground(new Color(27, 179, 245));
		userName = JOptionPane.showInputDialog(null, "Name of Player: ");

		while (userName == null || userName.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Please enter the field with your name");
			userName = JOptionPane.showInputDialog(null, "Name of Player: ");
		}
		JOptionPane.showMessageDialog(null, userName + "will place red chip. \n" + userName + " will be going first.");

		ImageIcon image = new ImageIcon(getClass().getResource("/resources/arrowDown.png"));

		btnA = new JButton(image);
		btnA.setPreferredSize(new Dimension(100, 100));
		btnA.setContentAreaFilled(false);
		add(btnA);

		btnB = new JButton(image);
		btnB.setPreferredSize(new Dimension(100, 100));
		btnB.setContentAreaFilled(false);
		add(btnB);

		btnC = new JButton(image);
		btnC.setPreferredSize(new Dimension(100, 100));
		btnC.setContentAreaFilled(false);
		add(btnC);

		btnD = new JButton(image);
		btnD.setPreferredSize(new Dimension(100, 100));
		btnD.setContentAreaFilled(false);
		add(btnD);

		btnE = new JButton(image);
		btnE.setPreferredSize(new Dimension(100, 100));
		btnE.setContentAreaFilled(false);
		add(btnE);

		btnF = new JButton(image);
		btnF.setPreferredSize(new Dimension(100, 100));
		btnF.setContentAreaFilled(false);
		add(btnF);

		btnG = new JButton(image);
		btnG.setPreferredSize(new Dimension(100, 100));
		btnG.setContentAreaFilled(false);
		add(btnG);

		lblCircles = new JLabel[7][7];
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				lblCircles[i][j] = new JLabel();
				lblCircles[i][j].setIcon(new ImageIcon(getClass().getResource("/resources/whiteChip.png")));
				add(lblCircles[i][j]);
			}
		}
		btnA.addActionListener(new ClickListener());
		btnB.addActionListener(new ClickListener());
		btnC.addActionListener(new ClickListener());
		btnD.addActionListener(new ClickListener());
		btnE.addActionListener(new ClickListener());
		btnF.addActionListener(new ClickListener());
		btnG.addActionListener(new ClickListener());

		ai.makeBoard();

	}
	/**
	 * This method updates the 2d array of JLabel when its AI's turn to drop the chip.	 
	 * @param i
	 * @param j
	 */
	public void updatePlayer(int i, int j) {
		lblCircles[i][j].setIcon(new ImageIcon(getClass().getResource("/resources/redChip.png")));
	}

	/**
	 * This method updates the 2d array of JLabel when its AI's turn to drop the chip.
	 * @param i
	 * @param j
	 */
	public void updateAI(int i, int j) {
		lblCircles[i][j].setIcon(new ImageIcon(getClass().getResource("/resources/yellowChip.png")));

	}

	/**
	 * @author Karan Jaariwala, Harsh Joshi
	 * @description This class is used for receiving clicks on buttons.
	 */
	public class ClickListener implements ActionListener {
		int rowPlayer, colPlayer;
		char playerColor = 'R';

		/**
		 * Handles all the event when buttons are pressed.
		 */
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == btnA) {
				colPlayer = 0;
				rowPlayer = ai.getIndex(colPlayer);
				ai.updateBoard(rowPlayer, colPlayer, playerColor);
				updatePlayer(rowPlayer, colPlayer);
				ai.checkWinnerA();
				ai.checkWinnerB();
				if (!(ai.getWinnerA() || ai.getWinnerB())) {
					ai.move();
					updateAI(ai.getAIX(), ai.getAIY());
				}
				ai.checkWinnerA();
				ai.checkWinnerB();
				if (rowPlayer == 0) {
					btnA.setEnabled(false);
				}
			}
			if (e.getSource() == btnB) {
				colPlayer = 1;
				rowPlayer = ai.getIndex(colPlayer);
				ai.updateBoard(rowPlayer, colPlayer, playerColor);
				updatePlayer(rowPlayer, colPlayer);
				ai.checkWinnerA();
				ai.checkWinnerB();
				if (!(ai.getWinnerA() || ai.getWinnerB())) {
					ai.move();
					updateAI(ai.getAIX(), ai.getAIY());
				}
				ai.checkWinnerA();
				ai.checkWinnerB();
				if (rowPlayer == 0) {
					btnB.setEnabled(false);
				}
			}
			if (e.getSource() == btnC) {
				colPlayer = 2;
				rowPlayer = ai.getIndex(colPlayer);
				ai.updateBoard(rowPlayer, colPlayer, playerColor);
				updatePlayer(rowPlayer, colPlayer);
				ai.checkWinnerA();
				ai.checkWinnerB();
				if (!(ai.getWinnerA() || ai.getWinnerB())) {
					ai.move();
					updateAI(ai.getAIX(), ai.getAIY());
				}
				ai.checkWinnerA();
				ai.checkWinnerB();
				if (rowPlayer == 0) {
					btnC.setEnabled(false);
				}
			}
			if (e.getSource() == btnD) {
				colPlayer = 3;
				rowPlayer = ai.getIndex(colPlayer);
				ai.updateBoard(rowPlayer, colPlayer, playerColor);
				updatePlayer(rowPlayer, colPlayer);
				ai.checkWinnerA();
				ai.checkWinnerB();
				if (!(ai.getWinnerA() || ai.getWinnerB())) {
					ai.move();
					updateAI(ai.getAIX(), ai.getAIY());
				}
				ai.checkWinnerA();
				ai.checkWinnerB();
				if (rowPlayer == 0) {
					btnD.setEnabled(false);
				}
			}
			if (e.getSource() == btnE) {
				colPlayer = 4;
				rowPlayer = ai.getIndex(colPlayer);
				ai.updateBoard(rowPlayer, colPlayer, playerColor);
				updatePlayer(rowPlayer, colPlayer);
				ai.checkWinnerA();
				ai.checkWinnerB();
				if (!(ai.getWinnerA() || ai.getWinnerB())) {
					ai.move();
					updateAI(ai.getAIX(), ai.getAIY());
				}
				ai.checkWinnerA();
				ai.checkWinnerB();
				if (rowPlayer == 0) {
					btnE.setEnabled(false);
				}
			}
			if (e.getSource() == btnF) {
				colPlayer = 5;
				rowPlayer = ai.getIndex(colPlayer);
				ai.updateBoard(rowPlayer, colPlayer, playerColor);
				updatePlayer(rowPlayer, colPlayer);
				ai.checkWinnerA();
				ai.checkWinnerB();
				if (!(ai.getWinnerA() || ai.getWinnerB())) {
					ai.move();
					updateAI(ai.getAIX(), ai.getAIY());
				}
				ai.checkWinnerA();
				ai.checkWinnerB();
				if (rowPlayer == 0) {
					btnF.setEnabled(false);
				}
			}
			if (e.getSource() == btnG) {
				colPlayer = 6;
				rowPlayer = ai.getIndex(colPlayer);
				ai.updateBoard(rowPlayer, colPlayer, playerColor);
				updatePlayer(rowPlayer, colPlayer);
				ai.checkWinnerA();
				ai.checkWinnerB();
				if (!(ai.getWinnerA() || ai.getWinnerB())) {
					ai.move();
					updateAI(ai.getAIX(), ai.getAIY());
				}
				ai.checkWinnerA();
				ai.checkWinnerB();
				if (rowPlayer == 0) {
					btnG.setEnabled(false);
				}
			}

			if (ai.isColumnFull(ai.getAIY())) {
				if (ai.getAIY() == 0) {
					btnA.setEnabled(false);
				} else if ((ai.getAIY() == 1)) {
					btnB.setEnabled(false);
				} else if ((ai.getAIY() == 2)) {
					btnC.setEnabled(false);
				} else if ((ai.getAIY() == 3)) {
					btnD.setEnabled(false);
				} else if ((ai.getAIY() == 4)) {
					btnE.setEnabled(false);
				} else if ((ai.getAIY() == 5)) {
					btnF.setEnabled(false);
				} else if ((ai.getAIY() == 6)) {
					btnG.setEnabled(false);
				}

			}

			if (ai.getWinnerA()) {
				btnA.setEnabled(false);
				btnB.setEnabled(false);
				btnC.setEnabled(false);
				btnD.setEnabled(false);
				btnE.setEnabled(false);
				btnF.setEnabled(false);
				btnG.setEnabled(false);
				JOptionPane.showMessageDialog(null, userName + " wins!");
				int responds = JOptionPane.showConfirmDialog(null, "Do you want to play the game agian?");
				if (responds == 0) {
					new MainPanel();
				} else if (responds == 1) {
					System.exit(0);
				}
				while (responds == 2) {
					responds = JOptionPane.showConfirmDialog(null, "Do you want to play the game agian?");
					if (responds == 0) {
						new MainPanel();
					} else if (responds == 1) {
						System.exit(0);
					}
				}

			} else if (ai.getWinnerB()) {

				btnA.setEnabled(false);
				btnB.setEnabled(false);
				btnC.setEnabled(false);
				btnD.setEnabled(false);
				btnE.setEnabled(false);
				btnF.setEnabled(false);
				btnG.setEnabled(false);
				JOptionPane.showMessageDialog(null, "Computer wins!");
				int responds = JOptionPane.showConfirmDialog(null, "Do you want to play the game agian?");
				if (responds == 0) {
					new MainPanel();
				} else if (responds == 1) {
					System.exit(0);
				}
				while (responds == 2) {
					responds = JOptionPane.showConfirmDialog(null, "Do you want to play the game agian?");
					if (responds == 0) {
						new MainPanel();
					} else if (responds == 1) {
						System.exit(0);
					}
				}
			} else if (ai.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Tie Game!");
				int responds = JOptionPane.showConfirmDialog(null, "Do you want to play the game agian?");
				if (responds == 0) {
					new MainPanel();
				} else if (responds == 1) {
					System.exit(0);
				}
				while (responds == 2) {
					responds = JOptionPane.showConfirmDialog(null, "Do you want to play the game agian?");
					if (responds == 0) {
						new MainPanel();
					} else if (responds == 1) {
						System.exit(0);
					}
				}
			}
		}
	}
}
