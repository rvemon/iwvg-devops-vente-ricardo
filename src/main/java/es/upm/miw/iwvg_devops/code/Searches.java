package es.upm.miw.iwvg_devops.code;

import org.springframework.boot.web.server.GracefulShutdownCallback;

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
}
