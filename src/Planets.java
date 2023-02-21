public enum Planets {
    EARTH("Жер – Күн системасындагы планета. "),
    MARS("Марстын диаметри Жердикинен 2 эсеге жакын кичине"),
    SATURN("Сатурндун орточо тыгыздыгы өтө аз болгондуктан ал жеңил газдардан турат деп болжолдонот");

    private String planet;

    Planets(String planet) {
        this.planet = planet;
    }

    public String getPlanet() {
        return planet;
    }

    public void setPlanet(String planet) {
        this.planet = planet;
    }
}
