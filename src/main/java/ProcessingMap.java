public class ProcessingMap {
    public static Integer[][] processingStringToMap(String playingField, Creature creature) {
        Integer[][] map = new Integer[4][4];
        int step = 0;
        if (playingField != null && creature != null) {
            if (playingField != "" && Math.sqrt(playingField.length()) % 1 == 0) {
                for (int i = 0; i <= 3; i++) {
                    for (int j = 0; j <= 3; j++) {
                        if (String.valueOf(playingField.charAt(step)).equals("S")) map[i][j] = creature.getSwampMoveCost();
                        else if (String.valueOf(playingField.charAt(step)).equals("W")) map[i][j] = creature.getWaterMoveCost();
                        else if (String.valueOf(playingField.charAt(step)).equals("T")) map[i][j] = creature.getTreeMoveCost();
                        else if (String.valueOf(playingField.charAt(step)).equals("P")) map[i][j] = creature.getPlainMoveCost();
                        else return null;
                        step++;
                    }
                }
                map[0][0] = 0;
                return map;
            }
        }
        return null;
    }
}
