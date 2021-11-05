import java.util.ArrayList;

public class State {
    static final int ROWLEN=200;
    static final int COLLEN=200;
    static final int DEAD = 0;
    static final int ALIVE = 1;
    int[][] preState = new int[ROWLEN][COLLEN];
    int[][] tempState = new int[ROWLEN][COLLEN];

    //Set prestate to initstate according to the pairs of cells position.
    public int[][] setInitState(ArrayList<AliveCell> aliveCellsSet) {
        for (int i = 0; i < ROWLEN; i++) {
            for (int j = 0; j < COLLEN; j++) {
                preState[i][j] = DEAD;
            }
        }
        for (AliveCell aliveCell : aliveCellsSet) {
            preState[aliveCell.getX()][aliveCell.getY()] = ALIVE;
        }
        return preState;
    }


    //Sum up all the around actived cells in preState. (let-top, top, right-top, let, mid, right,let-bot, bot, right-bot)
    public int aroundActiveCellSum(int row, int col) {
        int sum = 0;
        int r, c;
        for (r = row - 1; r <= row + 1; r++) {
            for (c = col - 1; c <= col + 1; c++) {
                // border situcation
                if (r < 0 || r >= ROWLEN || c < 0 || c >= COLLEN) {
                    continue;
                }
                if (preState[r][c] == ALIVE) {
                    sum++;
                }
            }
        }
        if (preState[row][col] == ALIVE) {
            sum--;
        }
        return sum;
    }


    // Using aoroundActiveCellSum function check each cell condition
    // and according to the game rule record the cells states into the tempState set.
    // then Overwriting the preState with temState, which means after the overwriting,
    // preSate now is the next state of the previous preState
    public int[][] nextState() {
        for (int row = 0; row < ROWLEN; row++) {
            for (int col = 0; col < COLLEN; col++) {
                switch (aroundActiveCellSum(row, col)) {
                    case 2:
                        tempState[row][col] = preState[row][col];
                        break;
                    case 3:
                        tempState[row][col] = ALIVE;
                        break;
                    default:
                        tempState[row][col] = DEAD;
                }
            }
        }
        for (int row = 0; row < ROWLEN; row++) {
            for (int col = 0; col < COLLEN; col++) {
                preState[row][col] = tempState[row][col];
            }
        }
        return preState;
    }


    //Print the state set, output the active cell's position index;
    public void showState(){
        for (int row = 0; row < ROWLEN; row++) {
            for (int col = 0; col < COLLEN; col++) {
                if (preState[row][col] == ALIVE) {
                    System.out.printf("[" + row + "][" + col + "] ");
                }
            }
        }
        System.out.println("");
    };
}
