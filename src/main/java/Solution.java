import java.io.IOException;
import java.util.*;

public class Solution {

    public static Integer getResult(String playingField, String race) throws IOException {
        int row = 0, col = 0;
        boolean flagNextCell = true;
        Creature creature = GettingCreatureData.gettingCreatureData(race,
                "C:\\Users\\Dima\\RoadToDeeplay2\\src\\main\\resources\\creatures");
        Integer[][] map = ProcessingMap.processingStringToMap(playingField, creature);

        if (map != null) {
            //Реализация А* алгоритма без припятствий на любом квадратном поле(в следствии, что поле задаётся строкой)
            //из левого верхнего в правый нижний.
            int[][] costs = new int[map.length][map.length];
            Queue<Location> openList = new LinkedList<Location>();
            Location current = new Location(0, 0);
            Location prospective;
            openList.add(current);
            int cost;
            while (!openList.isEmpty()) {
                Iterator<Location> it = openList.iterator();
                while (it.hasNext()) {
                    current = it.next();
                    for (int i = 0; i < 2; i++) {
                        if (flagNextCell) {
                            row = 0;
                            col++;
                            flagNextCell = false;
                        } else {
                            row++;
                            col = 0;
                            flagNextCell = true;
                        }
                        if (current.getRow() + row <=map.length-1 && current.getCol() + col <= map.length-1) {
                            prospective = new Location(current.getRow() + row, current.getCol() + col);
                            cost = costs[current.getRow()][current.getCol()] + map[prospective.getRow()][prospective.getCol()];
                            if (!openList.contains(prospective) && (costs[prospective.getRow()][prospective.getCol()] > cost || costs[prospective.getRow()][prospective.getCol()] == 0)) {
                                openList.add(prospective);
                                costs[prospective.getRow()][prospective.getCol()] = cost;

                            }
                        }
                    }
                    openList.remove(current);
                    break;
                }
            }
            return costs[map.length-1][map.length-1];
        }
        return null;
    }
}
