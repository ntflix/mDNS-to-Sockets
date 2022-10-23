# mDNS to Sockets

This is a simple example of how to use mDNS to:
* advertise a service, or
* discover a service

and then have two processes communicate over a socket with
parameters defined in the service advertisement.

An example with two computers on the same local network:

![Diagram of two computers on the same local network establishing connection after successful mDNS advertisement/discovery](readme/mDNS_Socket_LAN_demo.png)