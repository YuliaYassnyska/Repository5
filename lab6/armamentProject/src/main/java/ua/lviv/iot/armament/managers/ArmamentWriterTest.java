package ua.lviv.iot.armament.managers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
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

class ArmamentWriterTest {

  private List<Armament> armaments;

  public void setUp() {
    armaments = new ArrayList<>();
  }

  @BeforeEach
  public void beforeEach() {

    armaments = new ArrayList<>();
    armaments.add(new Armament(ApartmentType.PISTOLS, 3000.0, Power.HIGH, Use.ATTACK, User.CIVIL, 3));
    armaments.add(new SniperRifles(ApartmentType.SNIPERDEVISE, 2000.5, Power.MIDDLE, Use.DEFENSE, User.CIVIL, 2, 9, "Mossina-Nagana"));
    armaments.add(new SpecialAutomotiveEquipment(ApartmentType.SNIPERDEVISE, 4500.0, Power.HIGH, Use.ATTACK, User.COLDIER, 1, "8,6×32", ".338 Spectre"));
    armaments.add(new Grenade(ApartmentType.GRENADES, 1500.0, Power.LOW, Use.DEFENSE, User.CIVIL, 4, "Germany", "Flashbang"));
    armaments.add(new Armament(ApartmentType.PISTOLS, 5000.0, Power.MIDDLE, Use.ATTACK, User.COLDIER, 5));
  }

  @Test
  public void testWriteToFile() throws FileNotFoundException, IOException {
    ArmamentWriter.writeToFile(armaments);
    File file = new File("out.csv");
    try (FileInputStream fis = new FileInputStream(file);
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader bufReader = new BufferedReader(isr);) {
    	String line = null;
      String lines = "";
      while ((line = bufReader.readLine()) != null) {
        lines += line + "\n";
      }
      lines = lines.substring(0, lines.length() - 1);
      System.out.println(lines);
      Assertions.assertEquals(
          "type, price, power, use, user, amount\n"
          + "PISTOLS, 3000.0, HIGH, ATTACK, CIVIL, 3\n"
          + "type, price, power, use, user, amount, caliber, kind\n"
          + "SNIPERDEVISE, 2000.5, MIDDLE, DEFENSE, CIVIL, 2, 9, Mossina-Nagana\n"
          + "type, price, power, use, user, amount, modified, name\n"
          + "SNIPERDEVISE, 4500.0, HIGH, ATTACK, COLDIER, 1, 8,6×32, .338 Spectre\n"
          + "type, price, power, use, user, amount, origin, name\n"
          + "GRENADES, 1500.0, LOW, DEFENSE, CIVIL, 4, Germany, Flashbang\n"
          + "type, price, power, use, user, amount\n"
          + "PISTOLS, 5000.0, MIDDLE, ATTACK, COLDIER, 5",lines);
    } finally {
      System.out.println();
    }
  }
}