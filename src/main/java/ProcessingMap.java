public class ProcessingMap {
    public static Integer[][] processingStringToMap(String playingField, Creature creature) {
        Integer[][] map = new Integer[4][4];
        int step = 0;
        if (playingField != null && creature != null) {
            if (playingField != "" && playingField.length() == 16) {
                for (int i = 0; i <= 3; i++) {
                    for (int j = 0; j <= 3; j++) {
                        if (String.valueOf(playingField.charAt(step)).equals("S")) map[i][j] = creature.getSwamp();
                        else if (String.valueOf(playingField.charAt(step)).equals("W")) map[i][j] = creature.getWater();
                        else if (String.valueOf(playingField.charAt(step)).equals("T")) map[i][j] = creature.getTree();
                        else if (String.valueOf(playingField.charAt(step)).equals("P")) map[i][j] = creature.getPlain();
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
