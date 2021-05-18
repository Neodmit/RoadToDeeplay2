import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;

public class GettingCreatureData {
    private static Creature[] creatures;
    private static Creature creature;

    private static Type creaturesArrayType = new TypeToken<Creature[]>() {}.getType();
    private static Gson gson = new Gson();

    //Внёс рассы и их описания в json, на случай, если придётся добавлять новую рассу или менять описание у старой
    public static void gettingCreaturesFromFile(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File(fileName)));
        creatures = gson.fromJson(br, creaturesArrayType);
        br.close();
    }

    public static Creature gettingCreatureData(String race, String fileName) throws IOException {
        gettingCreaturesFromFile(fileName);
        for (Creature temporCreature : creatures) {
            if (temporCreature.getRace().equals(race)) creature = temporCreature;
        }
        return creature;
    }
}
