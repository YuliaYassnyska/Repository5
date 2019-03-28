package ua.lviv.iot.armament.managers;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.armament.model.ApartmentType;
import ua.lviv.iot.armament.model.Armament;
import ua.lviv.iot.armament.model.Grenade;
import ua.lviv.iot.armament.model.Power;
import ua.lviv.iot.armament.model.SniperRifles;
import ua.lviv.iot.armament.model.SpecialAutomotiveEquipment;
import ua.lviv.iot.armament.model.Use;
import ua.lviv.iot.armament.model.User;

public class MilitaryManagerImplTest {
    private List<Armament> armaments;

    private MilitaryManagerImpl militaryManager;
    
    public void setUp() {
        armaments = new ArrayList<>();
    }

    @BeforeEach
    public void beforeEach() {
        armaments = new ArrayList<>();
        armaments.add(new Armament(ApartmentType.PISTOLS, 3000.0, Power.HIGH, Use.ATTACK, User.CIVIL, 3));
        armaments.add(new SniperRifles(ApartmentType.SNIPERDEVISE, 2000.5, Power.MIDDLE, Use.DEFENSE, User.CIVIL, 2, 9, "Mossina-Nagana"));
        armaments.add(new SpecialAutomotiveEquipment(ApartmentType.SNIPERDEVISE, 4500.0, Power.HIGH, Use.ATTACK, User.COLDIER, 1, "8,6�32", ".338 Spectre"));
        armaments.add(new Grenade(ApartmentType.GRENADES, 1500.0, Power.LOW, Use.DEFENSE, User.CIVIL, 4, "Germany", "Flashbang"));
        armaments.add(new Armament(ApartmentType.PISTOLS, 5000.0, Power.MIDDLE, Use.ATTACK, User.COLDIER, 5));
        militaryManager = new MilitaryManagerImpl(armaments);
   }

    @Test
        void testFilterByTypeEquals() {
            Assertions.assertEquals(1, militaryManager.filterByType(ApartmentType.GRENADES).size());
            Assertions.assertEquals(2, militaryManager.filterByType(ApartmentType.SNIPERDEVISE).size());
            Assertions.assertEquals(2, militaryManager.filterByType(ApartmentType.PISTOLS).size());
        }

     @Test
        void testFilterByPowerEquals() {
            Assertions.assertEquals(1, militaryManager.filterByPowerEquals(Power.LOW).size());
            Assertions.assertEquals(2, militaryManager.filterByPowerEquals(Power.MIDDLE).size());
            Assertions.assertEquals(2, militaryManager.filterByPowerEquals(Power.HIGH).size());
        }

     @Test
       void testFilterByUserEquals() {
            Assertions.assertEquals(3, militaryManager.filterByUser(User.CIVIL).size());
            Assertions.assertEquals(2, militaryManager.filterByUser(User.COLDIER).size());
        }

     @Test
       void testSortPriceAscending() {
            MilitaryManagerImpl.sortByPriceAscending(armaments);
            Assertions.assertEquals(1500, armaments.get(0).getPrice());
            Assertions.assertEquals(2000.5, armaments.get(1).getPrice());
       }

     @Test
       void testSortPriceDescending() {
            MilitaryManagerImpl.sortByPriceDescending(armaments);
            Assertions.assertEquals(5000, armaments.get(0).getPrice());
            Assertions.assertEquals(3000, armaments.get(2).getPrice());
       }

      @Test
       void testSortAmountAscending() {
            MilitaryManagerImpl.sortByAmountAscending(armaments);
            Assertions.assertEquals(1, armaments.get(0).getAmount());
       }

      @Test
       void testSortAmountDescending() {
            MilitaryManagerImpl.sortByAmountDescending(armaments);
            Assertions.assertEquals(5, armaments.get(0).getAmount());
       }
}