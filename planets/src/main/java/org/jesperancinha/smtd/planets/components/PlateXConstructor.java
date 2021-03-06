package org.jesperancinha.smtd.planets.components;

import org.jesperancinha.console.consolerizer.console.ConsolerizerComposer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PlateXConstructor {

    private final String atmosphere;

    @Autowired
    PlateXConstructor(
            final String atmosphere) {
        ConsolerizerComposer.outSpace()
                .yellow("PlateXConstructor constructor")
                .orange("We can also initialize our beans atmosphere")
                .orange("These constructor gets called just after the %s phase and just before the %s phase", "phase1", "phase2")
                .none().orange("The planet's atmosphere is").blue(atmosphere)
                .newLine()
                .reset();

        this.atmosphere = atmosphere;
    }


    @Autowired
    public void setupAtmosphere(final String atmosphere) {
        ConsolerizerComposer.outSpace()
                .yellow("PlateXConstructor#setupAtmosphere method")
                .orange("We get the planet's data via method injection")
                .orange("These methods get initialized just after the %s phase and just before the %s phase", "phase1", "phase2")
                .none().orange("The planet's atmosphere is").blue(atmosphere)
                .newLine()
                .reset();
    }

}
