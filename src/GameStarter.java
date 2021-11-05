import java.util.ArrayList;

public class GameStarter {
    // main entry
    public static void main(String[] args) {
        // Build a class can store multi int values pairs (duplication allowed)
        ArrayList<AliveCell> aliveCellsSet = new ArrayList<>();
        // Add the active cell point. for instance: [5,5] [5,6] [6,5] [6,6] [7,5] [7,6]
        aliveCellsSet.add(new AliveCell(5, 5));
        aliveCellsSet.add(new AliveCell(6, 5));
        aliveCellsSet.add(new AliveCell(7, 5));
        aliveCellsSet.add(new AliveCell(5, 6));
        aliveCellsSet.add(new AliveCell(6, 6));
        aliveCellsSet.add(new AliveCell(7, 6));

        //generate 100 round cells change state,
        // the number in the for loop is used to control how many rounds you want
        State state = new State();
        state.setInitState(aliveCellsSet);
        for (int i = 0; i < 100; i++) {
            System.out.printf("the "+(i+1)+ " state out put is: ");
            state.showState();
            state.nextState();
        }
    }
}
