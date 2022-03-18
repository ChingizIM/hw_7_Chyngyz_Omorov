package com.company;

public class Medic extends Hero{


    @Override
    public String applySuperAbility (String superAbility) {
        return  "Medic применил суперспособность суперспособсность" + superAbility;

    }
    private int healPoints;

    public int getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(int healPoints) {
        this.healPoints = healPoints;
    }

    public String increaseExperience(){
        return "Медик вылечил героев на 10%";
    }

    }


