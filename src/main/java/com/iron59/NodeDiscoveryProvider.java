package com.iron59;

public abstract class NodeDiscoveryProvider {
    private final String serviceName;

    public NodeDiscoveryProvider(String serviceName) {
        this.serviceName = serviceName;
    }

    abstract public void startDiscovery();
}
