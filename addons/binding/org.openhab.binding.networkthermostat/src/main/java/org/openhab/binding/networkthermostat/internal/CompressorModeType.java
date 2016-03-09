package org.openhab.binding.networkthermostat.internal;

import org.eclipse.smarthome.core.types.Command;
import org.eclipse.smarthome.core.types.PrimitiveType;
import org.eclipse.smarthome.core.types.State;

/**
 * This enumeration represents the different mode types of a MAX!Cube heating thermostat.
 * 
 * @author Scott Linton
 */
public enum CompressorModeType implements PrimitiveType,State,Command {
    HEAT,
    COOL;

    @Override
    public String format(String pattern) {
        return String.format(pattern, this.toString());
    }
}