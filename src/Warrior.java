public class Warrior extends Hero{
    @Override
    public String applySuperAbility(String superAbilityType) {
        return "Warrior " + super.applySuperAbility(superAbilityType);
    }
}
