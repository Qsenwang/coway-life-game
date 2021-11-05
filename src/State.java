public class State {
    static final int ROWLEN=200;
    static final int COLLEN=200;
    static final int DEAD = 0;
    static final int ALIVE = 1;
    int[][] preState = new int[ROWLEN][COLLEN];
    int[][] tempState = new int[ROWLEN][COLLEN];


    public  void setInitstate(){};
    public void aroundActiveCellSum(int row, int col) {}
    public void nextState(){};
    public void showState(){};
}
