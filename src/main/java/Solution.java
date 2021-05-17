import java.io.IOException;
import java.util.*;

public class Solution {

    public static Integer getResult(String playingField, String race) throws IOException {
        int row = 0, col = 0;
        boolean flag = true;
        Creature creature = GettingCreatureData.gettingCreatureData(race,
                "C:\\Users\\Dima\\RoadToDeeplay2\\src\\main\\resources\\creatures");
        Integer[][] map = ProcessingMap.processingStringToMap(playingField, creature);

        if (map != null) {
            int[][] costs = new int[4][4];
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
                        if (flag) {
                            row = 0;
                            col++;
                            flag = false;
                        } else {
                            row++;
                            col = 0;
                            flag = true;
                        }
                        if (current.getRow() + row <= 3 && current.getCol() + col <= 3) {
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
            return costs[3][3];
        }
        return null;
    }
}
