package ua.lviv.iot.armament.managers;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import ua.lviv.iot.armament.model.ApartmentType;
import ua.lviv.iot.armament.model.Armament;
import ua.lviv.iot.armament.model.Power;
import ua.lviv.iot.armament.model.User;

public class MilitaryManagerImpl implements MilitaryManager {
        private List<Armament> armaments;

        public MilitaryManagerImpl() {
        }
    
        public MilitaryManagerImpl(final List<Armament> armaments) {
            this.armaments = armaments;
        }
    
        @Override
        public void addArmament(final Armament armament) {
        }
   
        interface SearchableCriteria<T> {
           boolean matchCriteria(T criteria);
        }

        public List<Armament> filterSecuritiesByCriteria(final SearchableCriteria<Armament> criteria) {
           return armaments.stream().filter(armament -> criteria.matchCriteria(armament)).collect(Collectors.toList());
        }

        public List<Armament> filterByType(final ApartmentType type) {
           return filterSecuritiesByCriteria(criteria -> criteria.getType().compareTo(type) == 0);
        }

        public List<Armament> filterByPowerEquals(final Power power) {
           return filterSecuritiesByCriteria(criteria -> criteria.getPower().compareTo(power) == 0);
        }

        public List<Armament> filterByUser(final User user) {
           return filterSecuritiesByCriteria(criteria -> criteria.getUser().compareTo(user) == 0);
        }

        public static void sortByPriceAscending(final List<Armament> armaments) {
           Collections.sort(armaments, Comparator.comparing(Armament::getPrice));
        }

        public static void sortByPriceDescending(final List<Armament> armaments) {
           Collections.sort(armaments, Comparator.comparing(Armament::getPrice).reversed());
        }

        public static void sortByAmountAscending(final List<Armament> armaments) {
           Collections.sort(armaments, Comparator.comparing(Armament::getAmount));
        }

        public static void sortByAmountDescending(final List<Armament> armaments) {
           Collections.sort(armaments, Comparator.comparing(Armament::getAmount).reversed());
        }

        public final List<Armament> getArmament() {
           return armaments;
        }

        public final void setArmament(final List<Armament> armaments) {
           this.armaments = armaments;
        }
}
