package ua.lviv.iot.armament.managers;

import ua.lviv.iot.armament.model.Armament;
import ua.lviv.iot.armament.model.ApartmentType;
import ua.lviv.iot.armament.model.Power;
import ua.lviv.iot.armament.model.User;

import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.Collections;

public class MilitaryManager {
    private List<Armament> armament;
    public MilitaryManager() {
    }
    public MilitaryManager(final List<Armament> armament) {
          this.armament = armament;
    }

    public final List<Armament> sortByPrice(final boolean descending) {
        Comparator<Armament> comparator =

                (Armament obj1, Armament obj2) ->

               Double.compare((obj1.getPrice()),
                    (obj2.getPrice()));

            List<Armament> armamentList = armament;

             armamentList.sort(comparator);

             if (descending) {

              Collections.reverse(armamentList);

            }

            return armamentList;
    }
    public final List<Armament> sortByAmount(final boolean descending) {

        Comparator<Armament> comparator =

            (Armament obj1, Armament obj2) ->

            Integer.compare((obj1.getAmount()), (obj2.getAmount()));

        List<Armament> armamentList = armament;

        armamentList.sort(comparator);

        if (descending) {

            Collections.reverse(armamentList);

        }

        return armamentList;

    }
    public final List<Armament> findType(final ApartmentType type) {

        List<Armament> armamentList = armament;

        List<Armament> findArmamentList = armamentList.stream()

                .filter(armament -> armament.getType() == type)

                .collect(Collectors.toList());

        return findArmamentList;

    }



    public final List<Armament> findPower(final Power power) {

        List<Armament> armamentList = armament;

        List<Armament> findArmamentList = armamentList.stream()

                .filter(armament ->
                   armament.getPower() == power)

                .collect(Collectors.toList());

        return findArmamentList;

    }



    public final List<Armament> findUser(final User user) {

        List<Armament> armamentList = armament;

        List<Armament> findArmamentList = armamentList.stream()

                .filter(armament ->
                    armament.getUser() == user)

                .collect(Collectors.toList());

        return findArmamentList;

}
    public final List<Armament> getArmament() {
        return armament;
    }

    public final void setArmament(final List<Armament> armament) {
        this.armament = armament;
    }
}
