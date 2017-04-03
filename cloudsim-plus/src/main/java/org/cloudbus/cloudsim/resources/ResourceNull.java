package org.cloudbus.cloudsim.resources;

/**
 * A class that implements the Null Object Design Pattern for {@link Resource}
 * class.
 *
 * @author Manoel Campos da Silva Filho
 * @see Resource#NULL
 */
final class ResourceNull implements Resource {
    @Override public long getAvailableResource() { return 0; }
    @Override public long getAllocatedResource() {
        return 0;
    }
    @Override public boolean isResourceAmountAvailable(long amountToCheck) {
        return false;
    }
    @Override public boolean isFull() {
        return false;
    }
    @Override public long getCapacity() {
        return 0;
    }
}
