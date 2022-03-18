package com.company;

public class Main {

    public static void main(String[] args) {
        Hero[] heroes = { new Magic(),new Medic(), new Warrior()};
        for (int i = 0; i < heroes.length; i++) {
            hero(heroes[i]);

        }
        }
        public static void hero(Hero hero){

            System.out.println(new Magic().applySuperAbility("Магия"));
            System.out.println(new Medic().applySuperAbility("Лечение"));
            System.out.println(new Warrior().applySuperAbility("Супер Урон"));
            System.out.println(new Medic().increaseExperience());
        }



    }




