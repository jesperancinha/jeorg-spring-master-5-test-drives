package org.jesperancinha.smtd.planets.components;

import org.jesperancinha.console.consolerizer.console.ConsolerizerComposer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

@Component
public class PlanetXSimple {

    @Inject
    private String atmosphere;

    @Autowired
    private String temperature;

    public PlanetXSimple() {
        ConsolerizerComposer.outSpace()
                .yellow("PlanetXSimple constructor")
                .orange("In the constructor we have no info when using FIELD injection")
                .none()
                .orange("Our planet atmosphere is")
                .blue(atmosphere)
                .orange("and the temperature is")
                .blue(temperature)
                .newLine()
                .reset();
    }

    @PostConstruct
    public void postConstruct(){
        ConsolerizerComposer.outSpace()
                .yellow("PlanetXSimple#postConstruct")
                .orange("It is not advised to used FIELD injection. Instead, we should use contructor injection or parameter injection")
                .orange("The reason for this is mostly because we cannot inject immutable instances this way.")
                .none()
                .orange("Our planet atmosphere is")
                .blue(atmosphere)
                .orange("and the temperature is")
                .blue(temperature)
                .newLine()
                .reset();
    }
}
