# Token Passing
Token passing is a channel access method used in local area networks (LANs) to avoid collisions when transmitting data. Unlike CSMA/CD where devices fight for access, token passing ensures orderly communication by using a special message called a token.

Here's how token passing works:

1. **The Token:** Imagine a baton passed around in a relay race. In token passing, a special message called a token circulates among all the devices on the network.
2. **Right to Transmit:** Only the device holding the token has the right to transmit data on the network. It's like having the baton; you can only run when you have it.
3. **Passing the Token:** Once a device finishes transmitting its data (or has no data to send), it passes the token to the next device in a predefined order (often sequential).
4. **No Collisions:** Since only the token holder can transmit, there's no chance of collisions where data gets corrupted. It's like everyone taking turns talking with the baton, ensuring clear communication.

**Benefits of Token Passing:**

- **Guaranteed access:** Devices don't have to compete for access, ensuring predictable and reliable data transmission.
- **Reduced collisions:** No collisions mean no wasted bandwidth and retransmissions, leading to efficient data transfer.
- **Fairness:** All devices get a chance to transmit in a pre-defined order.

**Drawbacks of Token Passing:**

- **Latency:** A device might have to wait for the token to come around before transmitting, even if the network is idle. This can introduce latency compared to CSMA/CD.
- **Overhead:** Maintaining the token and passing it around adds some overhead to the network traffic.
- **Less common:** Token passing is not as widely used as CSMA/CD in modern networks due to the potential for latency issues.

**Examples of Token Passing:**

- **IBM Token Ring:** This was a popular LAN technology in the past that used token passing.
- **Fiber Distributed Data Interface (FDDI):** This protocol also used token passing for high-speed data transmission.

Overall, token passing offers a controlled and collision-free environment for data transmission, but it may introduce some latency. It's a good choice for situations where reliable and predictable data transfer is crucial, but CSMA/CD with its efficiency gains is more dominant in modern networks.