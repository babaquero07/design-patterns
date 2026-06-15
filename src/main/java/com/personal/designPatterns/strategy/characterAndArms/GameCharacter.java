package com.personal.designPatterns.strategy.characterAndArms;

public class GameCharacter {
    private AttackMethod attackMethod;
    private final int power = (int) (Math.random() * 10) + 1;

    public void SetAttackMethod(AttackMethod attackMethod) {
        this.attackMethod = attackMethod;
    }

    public void attack() {
        if(attackMethod == null) {
            this.attackMethod = new DefaultAttack();
        }

        attackMethod.attack(power);
    }
}
