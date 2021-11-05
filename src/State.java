import java.util.ArrayList;

public class State {
    static final int ROWLEN=200;
    static final int COLLEN=200;
    static final int DEAD = 0;
    static final int ALIVE = 1;
    int[][] preState = new int[ROWLEN][COLLEN];
    int[][] tempState = new int[ROWLEN][COLLEN];

    //Set prestate to initstate according to the pairs of cell position.
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


    public void aroundActiveCellSum(int row, int col) {}
    public void nextState(){};


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
