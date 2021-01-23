package com.dabomstew.pkrandom.constants;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShowdownConstants {
    private static List<Integer> speciesWithAlolanForms = Arrays.asList(
            19, 20, 26, 27, 28, 37, 38, 50, 51, 52, 53, 74, 75, 76, 88, 89, 103, 105
    );

    private static final Map<Integer,String> dummyFormeSuffixes = setupDummyFormeSuffixes();
    private static final Map<Integer,Map<Integer,String>> formeSuffixesByBaseForme = setupFormeSuffixesByBaseForme();

    public static String getFormeSuffixByBaseForme(int baseForme, int formNum) {
        return formeSuffixesByBaseForme.getOrDefault(baseForme,dummyFormeSuffixes).getOrDefault(formNum,"");
    }

    private static Map<Integer, Map<Integer,String>> setupFormeSuffixesByBaseForme() {
        Map<Integer,Map<Integer,String>> map = new HashMap<>();

        Map<Integer,String> deoxysMap = new HashMap<>();
        deoxysMap.put(1,"attack");
        deoxysMap.put(2,"defense");
        deoxysMap.put(3,"speed");
        map.put(386,deoxysMap);

        Map<Integer,String> wormadamMap = new HashMap<>();
        wormadamMap.put(1,"sandy");
        wormadamMap.put(2,"trash");
        map.put(413,wormadamMap);

        Map<Integer,String> shayminMap = new HashMap<>();
        shayminMap.put(1,"sky");
        map.put(492,shayminMap);

        Map<Integer,String> giratinaMap = new HashMap<>();
        giratinaMap.put(1,"origin");
        map.put(487,giratinaMap);

        Map<Integer,String> rotomMap = new HashMap<>();
        rotomMap.put(1,"heat");
        rotomMap.put(2,"wash");
        rotomMap.put(3,"frost");
        rotomMap.put(4,"fan");
        rotomMap.put(5,"mow");
        map.put(479,rotomMap);

        Map<Integer,String> castformMap = new HashMap<>();
        castformMap.put(1,"sunny");
        castformMap.put(2,"rainy");
        castformMap.put(3,"snowy");
        map.put(351,castformMap);

        Map<Integer,String> basculinMap = new HashMap<>();
        basculinMap.put(1,"bluestriped");
        map.put(550,basculinMap);

        Map<Integer,String> darmanitanMap = new HashMap<>();
        darmanitanMap.put(1,"zen");
        map.put(555,darmanitanMap);

        Map<Integer,String> meloettaMap = new HashMap<>();
        meloettaMap.put(1,"pirouette");
        map.put(648,meloettaMap);

        Map<Integer,String> kyuremMap = new HashMap<>();
        kyuremMap.put(1,"white");
        kyuremMap.put(2,"black");
        map.put(646,kyuremMap);

        Map<Integer,String> tornadusMap = new HashMap<>();
        tornadusMap.put(1,"therian");
        map.put(641,tornadusMap);

        Map<Integer,String> thundurusMap = new HashMap<>();
        thundurusMap.put(1,"therian");
        map.put(642,thundurusMap);

        Map<Integer,String> landorusMap = new HashMap<>();
        landorusMap.put(1,"therian");
        map.put(645,landorusMap);

        Map<Integer,String> meowsticMap = new HashMap<>();
        meowsticMap.put(1,"f");
        map.put(678,meowsticMap);

        Map<Integer,String> aegislashMap = new HashMap<>();
        aegislashMap.put(1,"blade");
        map.put(681,aegislashMap);

        Map<Integer,String> pumpkabooMap = new HashMap<>();
        pumpkabooMap.put(1,"small");
        pumpkabooMap.put(2,"large");
        pumpkabooMap.put(3,"super");
        map.put(710,pumpkabooMap);

        Map<Integer,String> gourgeistMap = new HashMap<>();
        gourgeistMap.put(1,"small");
        gourgeistMap.put(2,"large");
        gourgeistMap.put(3,"super");
        map.put(711,gourgeistMap);

        Map<Integer,String> floetteMap = new HashMap<>();
        floetteMap.put(5,"eternal");
        map.put(670,floetteMap);

        Map<Integer,String> kyogreMap = new HashMap<>();
        kyogreMap.put(1,"primal");
        map.put(382,kyogreMap);

        Map<Integer,String> groudonMap = new HashMap<>();
        groudonMap.put(1,"primal");
        map.put(383,groudonMap);

        Map<Integer,String> rayquazaMap = new HashMap<>();
        rayquazaMap.put(1,"mega");
        map.put(384,rayquazaMap);

        Map<Integer,String> hoopaMap = new HashMap<>();
        hoopaMap.put(1,"unbound");
        map.put(720,hoopaMap);

        for (Integer species: Gen6Constants.speciesToMegaStoneORAS.keySet()) {
            Map<Integer,String> megaMap = new HashMap<>();
            if (species == 6 || species == 150) {
                megaMap.put(1,"megax");
                megaMap.put(2,"megay");
            } else {
                megaMap.put(1,"mega");
            }
            map.put(species,megaMap);
        }

        Map<Integer,String> wishiwashiMap = new HashMap<>();
        wishiwashiMap.put(1,"school");
        map.put(746,wishiwashiMap);

        Map<Integer,String> oricorioMap = new HashMap<>();
        oricorioMap.put(1,"pompom");
        oricorioMap.put(2,"pau");
        oricorioMap.put(3,"sensu");
        map.put(741,oricorioMap);

        Map<Integer,String> lycanrocMap = new HashMap<>();
        lycanrocMap.put(1,"midnight");
        lycanrocMap.put(2,"dusk");
        map.put(745,lycanrocMap);

        for (int species: speciesWithAlolanForms) {
            Map<Integer,String> alolanMap = new HashMap<>();
            alolanMap.put(1,"alola");
            map.put(species,alolanMap);
        }

        Map<Integer,String> greninjaMap = new HashMap<>();
        greninjaMap.put(2,"ash");
        map.put(658,greninjaMap);

        Map<Integer,String> zygardeMap = new HashMap<>();
        zygardeMap.put(1,"10");
        zygardeMap.put(4,"complete");
        map.put(718,zygardeMap);

        Map<Integer,String> miniorMap = new HashMap<>();
        miniorMap.put(7,"meteor");
        map.put(774,miniorMap);

        Map<Integer,String> necrozmaMap = new HashMap<>();
        necrozmaMap.put(1,"duskmane");
        necrozmaMap.put(2,"dawnwings");
        necrozmaMap.put(3,"ultra");
        map.put(800,necrozmaMap);

        return map;
    }

    private static Map<Integer,String> setupDummyFormeSuffixes() {
        Map<Integer,String> m = new HashMap<>();
        m.put(0,"");
        return m;
    }
}
