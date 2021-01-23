package com.dabomstew.pkrandom;

import com.dabomstew.pkrandom.constants.ShowdownConstants;
import com.dabomstew.pkrandom.pokemon.Pokemon;
import com.dabomstew.pkrandom.pokemon.Type;

public class ShowdownOutputUtil {
    public static String getShowdownName(Pokemon pkmn) {
        String suffix = "";
        if (pkmn.formeNumber != 0) {
            suffix = ShowdownConstants.getFormeSuffixByBaseForme(pkmn.baseForme.number, pkmn.formeNumber);
        }
        return pkmn.name
                .replaceAll("[ -.’]", "")
                .replaceAll("[♀]", "f")
                .replaceAll("[♂]", "m")
                .toLowerCase() + suffix;
    }

    public static String getShowdownTypeName(Type type) {
        final String initialTypeName = type.toString();
        return initialTypeName.substring(0, 1).toUpperCase()
            + initialTypeName.substring(1, initialTypeName.length()).toLowerCase();
    }
}
