package org.launchcode.enumerableplanets.data;

public enum Planet {
    MERCURY("Mercury", 88, 3032),
    VENUS("Venus", 225, 7521),
    EARTH("Earth", 365, 7918),
    MARS("Mars", 687, 4212),
    JUPITER("Jupiter", 4333, 86881),
    SATURN("Saturn", 10759, 72367),
    URANUS("Uranus", 30687, 31518),
    NEPTUNE("Neptune", 60200, 30599);

    private final String name; //The planet's common name
    private final int yearLength; //The average time required for the planet to orbit the sun
                                  //once in Earth days, rounded to the nearest integer.

    private final int diameter; //The approximate diameter of the planet in miles,
                                // rounded to the nearest integer.

    Planet(String name, int yearLength, int diameter) {
        this.name = name;
        this.yearLength = yearLength;
        this.diameter = diameter;
    }

    public String getName() {
        return name;
    }

    public int getYearLength() {
        return yearLength;
    }

    public int getDiameter() {
        return diameter;
    }
}
