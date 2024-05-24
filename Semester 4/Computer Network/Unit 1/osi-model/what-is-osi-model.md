# What is OSI Model
The OSI Model is like a ==set of rules that helps computers talk to each other in a standardized way.== It's organized into seven layers, each handling specific tasks, making sure communication between different devices works smoothly.
![](https://media.geeksforgeeks.org/wp-content/uploads/20210220204638/cn1.png)

## 7 Layers
1. [[physical-layer|Physcial Layer]]
2. [[data-link-layer|Data Link Layer]]
3. [[network-layer|Network Layer]]
4. [[transport-layer|Transpot Layer]]
5. [[session-layer|Session Layer]]
6. [[presentation-layer|Presentation Layer]]
7. [[application-layer|Application Layer]]

> **Trick to remember**
> Layer 1 to 7: Please Do Not Throw Sausage Pizza Away
> Layer 7 to 1: A Penguin Said That Nobody Drinks Pepsi


![](https://static.javatpoint.com/tutorial/computer-network/images/osi-model2.png)

| Layer No | Layer Name         | Responsibility                                                                                         | Information Form (Data Unit) | Device or Protocol     |
|----------|--------------------|---------------------------------------------------------------------------------------------------------|-----------------------------|-------------------------|
| 7        | Application Layer  | Identifies the client, synchronizes communication, and provides user interfaces.                      | Message                     | SMTP                    |
| 6        | Presentation Layer | Extracts and manipulates data from the application layer into the required format for transmission.     | Message                     | JPEG, MPEG, GIF         |
| 5        | Session Layer      | Establishes connections, maintains sessions, ensures authentication, and provides security features.   | Message                     | Gateway                 |
| 4        | Transport Layer    | Takes services from the network layer and provides them to the application layer.                         | Segment                     | Firewall               |
| 3        | Network Layer      | Facilitates the transmission of data between hosts located in different networks.                        | Packet                      | Router                  |
| 2        | Data Link Layer     | Ensures node-to-node delivery of messages, framing data into frames.                                      | Frame                       | Switch, Bridge          |
| 1        | Physical Layer      | Establishes physical connections between devices, dealing with raw bits.                                 | Bits                        | Hub, Repeater, Modem, Cables |
