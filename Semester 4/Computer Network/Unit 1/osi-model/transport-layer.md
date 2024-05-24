## Transport Layer
1. Data Segmentation
2. Flow control
3. Error Detection
The transport layer is the fourth layer of the OSI (Open Systems Interconnection) model, responsible for end-to-end communication and ==ensuring reliable, error-free data transfer between applications on different devices.== It manages data segmentation, flow control, error detection, and retransmission, providing a dependable connection for higher-layer protocols.

### Functions of transport layer
1. Segments and reassembles data for efficient transmission.
2. Enables end-to-end communication between applications on different devices.
3. Regulates data flow to prevent congestion and ensure smooth transmission.
4. Implements error detection and retransmission for data integrity.
5. Manages connection establishment, maintenance, and termination.
6. Utilizes port numbers for identifying specific applications or services.
7. Selects the appropriate transport protocol (e.g., TCP or UDP) based on application requirements.
8. Handles multiplexing for simultaneous communication and demultiplexing to direct data to the correct application.

### Protocols of Transport Layer
1. **TCP (Transmission Control Protocol):** Provides reliable, connection-oriented communication with error recovery.
2. **UDP (User Datagram Protocol):** Offers connectionless, lightweight communication without error recovery.
3. **SCTP (Stream Control Transmission Protocol):** Supports reliable, connection-oriented communication with enhanced features.
4. **RTP (Real-time Transport Protocol):** Manages real-time transmission of audio and video data over networks.
5. **DCCP (Datagram Congestion Control Protocol):** Provides connection-oriented communication with congestion control.
6. **QUIC (Quick UDP Internet Connections):** A modern transport layer protocol designed for low-latency communication.
7. **SPX (Sequenced Packet Exchange):** A transport protocol used in Novell NetWare networks.
8. **NetBEUI (NetBIOS Extended User Interface):** A protocol for communication between computers in a local network.
9. **AppleTalk:** A suite of protocols, including the AppleTalk Transport Protocol, used in Apple networks.
10. **RSVP (Resource Reservation Protocol):** Allows applications to request specific qualities of service from the network.

![](https://static.javatpoint.com/tutorial/computer-network/images/osi-model6.png)