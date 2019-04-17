package Game;

import javax.swing.*;

public class GameBoard extends JFrame {
    static int dimension = 3;  // размерность поля
    static int cellSize = 150; // размер одной клетки
    private char[][] gameField; // матрица игры
    private GameButton[] gameButtons; // массив кнопок

    private Game game; // ссылка на игру

    public GameBoard(Game currentGame) {
        this.game = currentGame;
    }
}
