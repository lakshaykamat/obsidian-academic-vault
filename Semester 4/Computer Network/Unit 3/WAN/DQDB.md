# DQDB
Distributed Queue Dual Bus (DQDB), also known as IEEE 802.6, is a networking standard developed for Metropolitan Area Networks (MANs). It aimed to provide high-speed, reliable data transmission over larger geographical areas compared to Local Area Networks (LANs). Here's a breakdown of DQDB:

**Key Features:**

- **Dual Bus Architecture:** DQDB utilizes two unidirectional buses – one for transmitting data in each direction (upstream and downstream). This redundancy offers fault tolerance. If one bus fails, the network can still function using the other.
- **Distributed Queuing:** DQDB employs a distributed queuing mechanism to manage access to the network. Stations (devices) on the network don't compete for access through techniques like Carrier Sense Multiple Access (CSMA/CD) used in Ethernet. Instead, they take turns transmitting data packets in a predetermined order, ensuring fairness and reducing collisions.
- **Token Passing Mechanism:** A special signal called a token circulates on the buses. Only the station holding the token has the right to transmit data. Once a station finishes transmitting, it passes the token to the next station in line. This controlled access prevents data collisions and ensures orderly communication.
- **Connection-Oriented and Connectionless Support:** DQDB can handle both connection-oriented traffic (like voice calls) that requires a guaranteed connection and connectionless traffic (like data packets) where immediate delivery is prioritized.

**Benefits of DQDB:**

- **High Speed:** DQDB offered higher data transmission rates (in the range of 34-55 Mbps) compared to traditional LAN technologies at the time.
- **Reliable Data Delivery:** The combination of dual buses, distributed queuing, and token passing minimizes data collisions and ensures reliable data transfer.
- **Fair Access:** The distributed queuing mechanism guarantees fair access to the network for all connected devices.
- **Supports Different Traffic Types:** DQDB can accommodate both real-time traffic (voice calls) and bursty data traffic efficiently.

**Drawbacks of DQDB:**

- **Limited Adoption:** DQDB faced competition from other emerging technologies like FDDI (Fiber Distributed Data Interface) and wasn't as widely adopted as initially envisioned.
- **Increased Complexity:** The dual bus architecture and token passing mechanism introduce some complexity compared to simpler LAN technologies.
- **Latency:** While DQDB avoids collisions, waiting for the token can introduce some latency (delay) for devices waiting to transmit.

**Current Relevance:**

DQDB is not a dominant technology in modern networks. Higher-speed and more efficient networking solutions like Gigabit Ethernet and ATM (Asynchronous Transfer Mode) have largely replaced it. However, understanding DQDB provides historical context for the evolution of networking technologies and the design principles behind reliable and fair network access methods.