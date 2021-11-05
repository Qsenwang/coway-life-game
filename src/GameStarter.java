import java.util.ArrayList;

public class GameStarter {
    // main entry
    public static void main(String[] args) {
        //build a class can store multi pair int values( duplication available)
        ArrayList<AliveCell> aliveCellsSet = new ArrayList<>();
        // add the active cell point. for instance: [5,5] [5,6] [6,5] [6,6] [7,5] [7,6]
        aliveCellsSet.add(new AliveCell(5, 5));
        aliveCellsSet.add(new AliveCell(6, 5));
        aliveCellsSet.add(new AliveCell(7, 5));
        aliveCellsSet.add(new AliveCell(5, 6));
        aliveCellsSet.add(new AliveCell(6, 6));
        aliveCellsSet.add(new AliveCell(7, 6));

        //generate 100 round state changing
        State state = new State();
        state.setInitState(aliveCellsSet);
        state.showState();
    }
}
