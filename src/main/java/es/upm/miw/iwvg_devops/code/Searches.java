package es.upm.miw.iwvg_devops.code;

import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class Searches {

    public Double findFirstDecimalFractionByUserName(String name) {
        return new UsersDatabase().findAll()
                .filter(user -> name.equals(user.getName()))
                .flatMap(user -> user.getFractions().stream()
                        .filter(Objects::nonNull)
                )
                .map(Fraction::decimal)
                .findFirst()
                .orElse(null);
    }

    public Fraction findFractionMultiplicationByUserFamilyName(String familyName){
        Fraction resultFraction = new Fraction(1,1);
         new UsersDatabase().findAll()
                .filter(user -> familyName.equals(user.getFamilyName()))
                .flatMap(user -> user.getFractions().stream()
                        .filter(Objects::nonNull)
                ).forEach(resultFraction::multiply);

        return resultFraction;
    }

    public Stream<Double> findDecimalFractionByUserName(String name){
        return new UsersDatabase().findAll()
                .filter(user -> name.equals(user.getName()))
                .flatMap(user -> user.getFractions()
                        .stream()
                        .filter(Objects::nonNull))
                .map(Fraction::decimal);
    }

    public Fraction findFractionSubtractionByUserName(String name){
        Fraction resultFraction = new Fraction(0,1);

        List<Fraction> fractions = new UsersDatabase().findAll()
                .filter(user -> name.equals(user.getName()))
                .flatMap(user -> user.getFractions().stream()
                        .filter(Objects::nonNull))
                .toList();

        fractions.stream().skip(1).forEach(resultFraction::add);

        fractions.get(0).subtract(resultFraction);

        return fractions.get(0);
    }


}
