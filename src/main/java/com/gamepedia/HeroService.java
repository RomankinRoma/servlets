package com.gamepedia;

import java.util.ArrayList;
import java.util.List;

public class HeroService {
    public List getHero(HeroType hero){
        List heroInfo = new ArrayList();

        if (hero.equals(HeroType.URSA)){
            heroInfo.add("Name: Ursus");
            heroInfo.add("Attribute: Agility");
        }else if (hero.equals(HeroType.INVOKER)){
            heroInfo.add("Name: Kael");
            heroInfo.add("Attribute: Intelligence");
        }else{
            heroInfo.add("Name: Mogul-khan");
            heroInfo.add("Attribute: Strength");
        }
        return heroInfo;
    }
}
