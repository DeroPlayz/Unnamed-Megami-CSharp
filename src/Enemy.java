package src;

public class Enemy extends Entity{

    Enemy(String Name, int Level, int MaxHP, int MaxSP, String Arcana, int Strength, int Magic, int Endurance, int Agility, double PhysicalAffinity, double FireAffinity, double IceAffinity, double ElectricAffinity, double WindAffinity, double LightAffinity, double DarkAffinity) {
        super(Name, Level, MaxHP, MaxSP, Arcana, Strength, Magic, Endurance, Agility, PhysicalAffinity, FireAffinity, IceAffinity, ElectricAffinity, WindAffinity, LightAffinity, DarkAffinity);
    }

    Enemy Pixie = new Enemy(
        "Pixie",
        3,
        18,
        14,
        "Lovers",
        1,
        3,
        2,
        2,
        1,
        1,
        1.5,
        0.5,
        1,
        0.5,
        1.5
    );
    
    Enemy JackFrost = new Enemy(
        "Jack Frost",
        7,
        24,
        12,
        "Magician",
        3,
        3,
        3,
        2,
        1,
        1.5,
        0.5,
        1,
        1,
        1,
        1
    );
}
