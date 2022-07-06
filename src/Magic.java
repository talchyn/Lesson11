public class Magic extends Hero {
    @Override
    public String applySuperAbility(String superAbilityType) {
        return "Magic " + super.applySuperAbility(superAbilityType);
    }
}
